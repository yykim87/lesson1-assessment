package Lesson1_assessment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Lesson1Assessment {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/amazon";
		String username = "root";
		String password = "root";
		String query = "SELECT DISTINCT BRAND FROM PRODUCTS;";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Connection con = DriverManager.getConnection(dbUrl, username, password);
			Statement statement = con.createStatement();
			ResultSet result = statement.executeQuery(query);

			while(result.next()) {
				String ProductData ="";
				for (int i = 1; i <=1; i++) {
					ProductData += result.getString(i) + ":";
				}
				System.out.println(ProductData);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
}
