package com.ms.calc;

import java.beans.XMLDecoder;
import java.io.InputStream;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class StaticCodeExample {
	 private static final Log LOG = LogFactory.getLog(StaticCodeExample.class);
	 
	// Unused field
	public int abc;

	private String ip = "127.0.0.1";

	@Override
	public void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	public void test() {
		String userDAta=null;
		String access=null;
	       LOG.info("Request authenticateuser " +userDAta );
	       LOG.info("Access Tocken"+access);
	       
		InputStream in = null;
		XMLDecoder xmlDecoder = new XMLDecoder(in);

		String[] field = { "a", "b", "c", "s", "e" };

		// concatenates strings using + in a loop
		String s = "";
		for (int i = 0; i < field.length; ++i) {
			s = s + field[i];
		}

		System.out.println(ip);

	}
}
