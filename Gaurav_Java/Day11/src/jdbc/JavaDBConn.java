package jdbc;

import java.sql.*;

public class JavaDBConn {

	public static Connection getDbConnection() {
		//Reflection:
		try {
			//Step 1: Load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("------Driver Loaded--------");
			
			//Step 2: create conn sith db
			String conUrl = "jdbc:mysql://localhost:3306/iacsd0924";
			
			//user DriverManager to get connected with (conUrl , HostName, PassWd)
			Connection dbCon = DriverManager.getConnection(conUrl, "root","root123");
			
			System.out.println("--------Connection Establish----------");
			
			return dbCon;
			
			
		} catch (Exception e) {
			
			System.err.println(e.getLocalizedMessage());
		}
		return null;
		

	}

}
