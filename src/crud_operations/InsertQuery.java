package crud_operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertQuery {
	public static void main(String[] args) {

		try {

			// Step 1 : Load and register the driver
				Class.forName("com.mysql.cj.jdbc.Driver");
						
			// Step 2 : Create Connect
				String url = "jdbc:mysql://localhost:3306/emp_db";
				String user = "root";
				String pass = "root";
				Connection con = DriverManager.getConnection(url, user, pass);

			// Inserting Data into database

			PreparedStatement st = con
					.prepareStatement("insert into employee values (1258,'SCOTT','SALESMAN','1981-12-11',1200,30)");

			int i = st.executeUpdate();

			if (i > 0) {
				System.out.println("Query executed...........");
			} else {
				System.out.println("Query not executed...........");
			}

			// Inserting Data into database

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}

