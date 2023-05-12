package dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLConnectionExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//For all database connections below set of lines are needed
		// If u r using mysql data use mysql in Class.forName method
		// If u r using oracle data use oracle in Class.forName method
		
		// jdbc = java data base connectivity
		
		
		//Mentioning the db we are using (MySQL)
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// Connection class is mainly for connecting to database
		Connection connection = DriverManager
				// without authentication
				.getConnection("jdbc:mysql://root@localhost/selenium");
		
				// with authentication
		        // .getConnection("jdbc:mysql://localhost::3306/selenium","username","password");
		
				Statement statement =  connection.createStatement();
				
				ResultSet result =   statement.executeQuery("SELECT * FROM mit_friends");
				
				while(result.next())
				{
					System.out.println("Name : "+ result.getString(1));
					System.out.println("Age : "+ result.getInt(3));
				}
	}

}
