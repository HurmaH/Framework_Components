import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class JDBCconnect {
	
	public static void main(String[] args) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		//connect to mysql
		//url = "jdbc:mysql://"+host+":"+port+"/databasename"
		//String dbClass = "com.mysql.jdbc.Driver";
		//Class.forName("com.mysql.jdbc.Driver");
		//Class.forName("com.mysql.jdbc.Driver").newInstance();
		//System.out.println("Driver JDBC loaded!");
//		String JdbcURL = "jdbc:mysql://localhost:3306/mybusiness?" + "autoReconnect=true&useSSL=false";
//	    String Username = "root";
//	    String password = "root";
//	    Connection con = null;
//	      try {
//	         con = DriverManager.getConnection(JdbcURL, Username, password);
//	         System.out.println("Your JDBC URL is as follows:" + JdbcURL);
//	      } catch (Exception exec) {
//	         exec.printStackTrace();
//	      }
		
		Connection con = DriverManager.getConnection("jdbc:mysql://hostname:3306/qadbt?autoReconnect=true&useSSL=false", "root", "1234");
		
		//give a route by using statement
		Statement state = con.createStatement();
		
		ResultSet result = state.executeQuery("select * from EmployeeInfo where name = 'sofiya'");
		//result is kind of array there fore pointer will be moved:
	
		while(result.next()) { //if first index is available increment one
			
			System.out.println(result.getString("age"));
			System.out.println(result.getString("location"));
		}
	}

}
