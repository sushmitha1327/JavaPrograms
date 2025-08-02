package demo.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
 
public class CreateTable2 {

		public static void main(String[] args) throws ClassNotFoundException, SQLException {
	  	  Class.forName("com.mysql.cj.jdbc.Driver");
				
				Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc2","root","root");
				Statement statement=connection.createStatement();
				statement.execute("create table icecream(icecreamid int primary key,icecreamname varchar(30),icecreambrand varchar(45),icecreamprice double,icecreamflavour varchar(35))");
		               	 
						 
				connection.close();
				System.out.println("successfully table created in database");
		}
	}
