package demo.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbcdemo2 {

		 public static void main(String[] args) throws ClassNotFoundException, SQLException {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","root");
				Statement statement=connection.createStatement();
				statement.execute("create database jdbc2");
				connection.close();
				System.out.println("successfully schema created in database");
	}
	}