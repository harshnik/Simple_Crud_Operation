package crud_operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteQuery {
	public static void main(String[] args) {
		try {
			
			// Step 1 : Load and register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Step 2 : Create Connect
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_db", "root", "root");
			
			Statement stmt= con.createStatement();
			String DeleteEmployeeQuery= "delete from employee where empno=1258 ";
			
			int i = stmt.executeUpdate(DeleteEmployeeQuery);
			
			if (i==1) {
				System.out.println("Table Updated...........");
			} else {
				System.out.println("Table not updated...........");
			}
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
