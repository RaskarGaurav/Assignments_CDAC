package jdbc;
import java.sql.*;

public class Test_Connection {

	public static void main(String[] args) {
		//Client Code
		
		//Step 1: Connection
		Connection con = JavaDBConn.getDbConnection(); 
		
		//Step 2: Write Query
		String query = "SELECT * FROM emp;";
		
		//Step 3: Associate SQL with connection
		//create statement
		try {
			
			Statement stmnt=con.createStatement();
	//IMP   //Use Statement when query is static
			
			
	//IMP   //Use PreparedStatement when query is Dynamic
			//E.g.
			//String query1 = "SELECT * FROM ?"; //Question Mark used to make it Dynamic
			//PreparedStatement prStmnt = con.prepareStatement(query1);
			//prStmnt.setString(1, "EMP");
			//ResultSet rSet = prStmnt.executeQuery();
			
			
			//Step 4 : Execute sql
			//SELECT-> Reading - use Statement "executeQuery()" & assign it to dType "ResultSet"
			//INSERT,UPDATE,DELETE - use Statement "executeUpdate()" & assign it to dType "ResultSet"
			ResultSet rSet = stmnt.executeQuery(query);
			
			//Show 5 : Show Retrived Data
			//iterate till end of file
			
			System.out.println("EMPNO\tENAME\tJOB\t\tMGR\tHIREDATE\tSAL\tCOMM\tDEPTNO");
			System.out.println("------------------------------------------------------------------------------------------------------");
			while(rSet.next()) {
				 //EMPNO 
				
				System.out.println(rSet.getInt(1)+"\t"+rSet.getString(2)+"\t"+String.format("%-9s",rSet.getString(3))+"\t"+
						rSet.getInt(4)+"\t"+rSet.getString(5)+"\t"+String.format("%-6s",rSet.getDouble(6))+"\t"+rSet.getDouble(7)+
						"\t"+rSet.getInt(8));
			}
			
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
	}

}
