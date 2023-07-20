package com.jsp.Jdbc_PreparedStatementCrud.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductInsertController {
	public static void main(String[] args) {

		try {
			// Step 1 : Load and register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Step 2 : Create Connect
			String url = "jdbc:mysql://localhost:3306/jdbc_preparedstatement";
			String user = "root";
			String pass = "root";
			Connection con = DriverManager.getConnection(url, user, pass);

			// Step 3: Create Statement

			PreparedStatement st = con.prepareStatement("Insert into product values (103,'Oppo',8000,'Purple')");

			// Step 4: Execute Query

			int i = st.executeUpdate();

			if (i > 0) {
				System.out.println("Query executed...........");
			} else {
				System.out.println("Query not executed...........");
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}
}
