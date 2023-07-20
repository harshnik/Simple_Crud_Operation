package crud_operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateAll {
	public static void main(String [] args) throws SQLException, ClassNotFoundException{
		
			Scanner sc = new Scanner(System.in);
			// Step 1 : Load and register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
					
			// Step 2 : Create Connect
			String url = "jdbc:mysql://localhost:3306/emp_db";
			String user = "root";
			String pass = "root";
			Connection con = DriverManager.getConnection(url, user, pass);
			
		try{	
			int s;
			    do{
				    System.out.println("(1) For Update ENAME :");
				    System.out.println("(2) For Update JOB :");
				    System.out.println("(3) For Update HIREDATE :");
				    System.out.println("(4) For Update SALARY :");
				    System.out.println("(5) For Update DEPTNO :");
				    
				    System.out.println("Enter Your Choice :");
				    int n = sc.nextInt();
				    switch(n)
				        {

				           case 1:
					            
					        	// UPDATE ENAME FROM EMPLOYEE TABLE
				        	   
					        	System.out.println("Enter Employee id to update :");
					       		int empno2 = sc.nextInt();
					       		System.out.println("Enter ENAME to update :");
					       		String ename = sc.next();
					       		
					       		String updateEmployeeEnameQuery= "update employee set ename = '"+ename+"' where empno="+empno2;
					       		
					       		Statement stmt2= con.createStatement();
								int i2 = stmt2.executeUpdate(updateEmployeeEnameQuery);
								
								if (i2==1) {
									System.out.println("ENAME Updated...........");
								} else {
									System.out.println("ENAME not updated...........");
								}
								break;
								
				           case 2:
					            
					        	// UPDATE JOB FROM EMPLOYEE TABLE
				        	   
					        	System.out.println("Enter Employee id to update :");
					       		int empno3 = sc.nextInt();
					       		System.out.println("Enter ENAME to update :");
					       		String job = sc.next();
					       		
					       		String updateEmployeeJobQuery= "update employee set job = '"+job+"' where empno="+empno3;
					       		
					       		Statement stmt3= con.createStatement();
								int i3 = stmt3.executeUpdate(updateEmployeeJobQuery);
								
								if (i3==1) {
									System.out.println("JOB Updated...........");
								} else {
									System.out.println("JOB not updated...........");
								}
								break;
				           
				           case 3:
					            
					        	// UPDATE HIREDATE FROM EMPLOYEE TABLE
				        	   
					        	System.out.println("Enter Employee id to update :");
					       		int empno4 = sc.nextInt();
					       		System.out.println("Enter ENAME to update :");
					       		String hiredate = sc.next();
					       		
					       		String updateEmployeeHiredateQuery= "update employee set hiredate = "+hiredate+" where empno="+empno4;
					       		
					       		Statement stmt4= con.createStatement();
								int i4 = stmt4.executeUpdate(updateEmployeeHiredateQuery);
								
								if (i4==1) {
									System.out.println("HIREDATE Updated...........");
								} else {
									System.out.println("HIREDATE not updated...........");
								}
								break;
				           
				           case 4:
					            
					        	// UPDATE SALARY FROM EMPLOYEE TABLE
					        	System.out.println("Enter Employee id to update :");
					       		int empno = sc.nextInt();
					       		System.out.println("Enter Salary to update :");
					       		int sal = sc.nextInt();
					       		
					       		String updateEmployeeSalQuery= "update employee  set sal = "+sal+" where empno="+empno;
					       		
					       		Statement stmt= con.createStatement();
								int i = stmt.executeUpdate(updateEmployeeSalQuery);
								
								if (i==1) {
									System.out.println("Salary Updated...........");
								} else {
									System.out.println("Salary not updated...........");
								}
					            break;
								
				           case 5:
					            
					        	// UPDATE DEPTNO FROM EMPLOYEE TABLE
				        	   
					        	System.out.println("Enter Employee id to update :");
					       		int empno5 = sc.nextInt();
					       		System.out.println("Enter ENAME to update :");
					       		String deptno = sc.next();
					       		
					       		String updateEmployeeDeptnoQuery= "update employee set deptno = "+deptno+" where empno="+empno5;
					       		
					       		Statement stmt5= con.createStatement();
								int i5 = stmt5.executeUpdate(updateEmployeeDeptnoQuery);
								
								if (i5==1) {
									System.out.println("DEPTNO Updated...........");
								} else {
									System.out.println("DEPTNO not updated...........");
								}
								break;
				            
				            default:
				            System.out.println("----------- Enter Valid Option ---------------");
				        }
				        System.out.println("Press 1 to continue or any other character to stop");
				        s = sc.nextInt();
			       }
			    	while(s == 1);
			        System.out.println("------------ Program Ends -------------");
			        
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
