package com.jsp.Jdbc_PreparedStatementCrud.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.cj.protocol.Resultset;

public class ProductDisplayController {
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
			String displayQuery = "select * from product";
			PreparedStatement  preparedStatement = con.prepareStatement(displayQuery);
			
			// Step 4: Execute Query
			ResultSet resultset = preparedStatement.executeQuery();
			
			System.out.println("PRODUCTID " + "\t" + "PRODUCTNAME" +  "\t" +  "PRODUCTPRICE" + "\t" + "PRODUCTCOLOR" + "\t");
			
			while(resultset.next()) {
				int id = resultset.getInt("productid");
				String name = resultset.getString("productname");
				double price = resultset.getDouble("productprice");
				String color = resultset.getString("productcolor");
				
				System.out.println("id"+id + "\t");
				System.out.println("name"+name + "\t");
				System.out.println("price"+price + "\t");
				System.out.println("color"+color + "\t");
			}
			
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
