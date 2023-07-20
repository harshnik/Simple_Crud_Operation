package crud_operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.cj.jdbc.Driver;

public class FetchRecords {
	public static void main(String[] args) throws ClassNotFoundException{
		try {
				// Class.forName("com.mysql.cj.jdbc.Driver");
				
				//Register Driver
				Driver dr = new Driver();
				DriverManager.registerDriver(dr);
			
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_db", "root", "root");
						
				Statement stmt= con.createStatement();
				
				ResultSet rs = stmt.executeQuery("select * from employee;");
				
				System.out.println("EMPNO " + "\t" + "ENAME" +  "\t" +  "JOB" + "\t" + "HIREDATE" + "\t" + 
						"SAL" + "\t" + "DEPTNO");
				
				System.out.println("---------------------------------------------------------");
				
				while (rs.next()) 
				{
	                System.out.print(rs.getInt(1) + "\t");
	                System.out.print(rs.getString(3) + "\t");
	                System.out.print(rs.getString(3) + "\t");
	                System.out.print(rs.getDate(4) + "\t");
	                System.out.print(rs.getInt(5) + "\t");
	                System.out.println(rs.getInt(6) + "\t");
	            }
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
