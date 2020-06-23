package com.ms.calc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/CalculateServlet")  
public class CalculateServlet extends HttpServlet
{
double res;

public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
{
PrintWriter out = response.getWriter();
//out.println(“hello”);
String n1 = request.getParameter("no1");
String n2 = request.getParameter("no2");
String opt = request.getParameter("opt");
if(opt.equals("p")){
 res=new Calculater().doAdd(Integer.parseInt(n1),Integer.parseInt(n2));
out.println(res);}
else if(opt.equals("m")){
	 res=new Calculater().doSub(Integer.parseInt(n1),Integer.parseInt(n2));
	 out.println(res);}
else if(opt.equals("mul")){
	 res=new Calculater().doMul(Integer.parseInt(n1),Integer.parseInt(n2));
	 out.println(res);}
else if(opt.equals("d")){
	 res=new Calculater().doDiv(Integer.parseInt(n1),Integer.parseInt(n2));
	 out.println(res);
}else {
	
	out.println("Unable to perform operation '" + opt +"' because no operation with that name is active!");
}

}

public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
{
doPost(request,response);
}

}
