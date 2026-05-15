package jdbc;

//import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.*;


public class Jdbccon {

	public static void main(String[] args) {
		String url= "jdbc:mysql://localhost:3306/test";
		String user="vinay";
		String password="vinay";
		//Class.forName("com.mysql.cj.jdbc.Driver");
		try {
			Connection con = DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("connection established successfully");

		//con.close();

	}

}
