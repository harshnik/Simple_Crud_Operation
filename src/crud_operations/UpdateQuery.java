package crud_operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateQuery {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Employee id to update :");
		int empno = sc.nextInt();
		System.out.println("Enter Salary to update :");
		int sal = sc.nextInt();
		
		try {
			
			// Step 1 : Load and register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Step 2 : Create Connect
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_db", "root", "root");

			// Step 3 : Create Statement

			Statement stmt= con.createStatement();
			String updateEmployeeSalQuery= "update employee  set sal = "+sal+" where empno="+empno;

			// Step 4 : Execute Statement
	
			int i = stmt.executeUpdate(updateEmployeeSalQuery);
			
			if (i==1) {
				System.out.println("Salary Updated...........");
			} else {
				System.out.println("Salary not updated...........");
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}

// CTRL+SHIFT+O : delete unusable import keyword and write usable import keyword
// Execute update method : it is present inside statement interface which is used to execute delete or update query.
// when given id in where clause is present execute method will return 1 else 0.