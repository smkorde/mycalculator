/**
 * 
 */
package com.ms.calc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author Sudhir_Korde
 *
 */
public class SQLInjection {

	/**
	 * @param args
	 */
	public void insert(String name) {
		StringBuilder query = new StringBuilder();
		ResultSet resultSet = null;
		query.append("select * from user u where u.name in (" + name + ")");
		try {
			Connection connection = getConnection();
			Statement statement = connection.createStatement();
			resultSet = statement.executeQuery(query.toString());
		} catch (Exception e) {
		}
	}

	private static Connection getConnection() {
		return null;
	}

}
