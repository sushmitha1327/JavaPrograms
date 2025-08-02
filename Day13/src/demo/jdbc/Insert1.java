package demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Insert1 {
	
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			String url="jdbc:mysql://localhost:3306/jdbc2";
			String userName="root";
			String pasword="root";
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter icecreamid");
			int id=sc.nextInt();
			System.out.println("Enter icecreamname");
			String name=sc.next();
			System.out.println("Enter icecreambrand");
			String brand=sc.next();
			System.out.println("Enter icecreamprice");
			double price=sc.nextDouble();
			System.out.println("Enter icecreamflavour");
			String flavour=sc.next();
			
			String query="insert into icecream values("+id+",'"+ name+"','"+ brand+"','"+ price+"','"+ flavour+"')";
			 Class.forName("com.mysql.cj.jdbc.Driver");
				
				Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc2","root","root");
//				Statement statement=connection.createStatement();
//				statement.execute(query);
//				connection.close();
				PreparedStatement preparedStatement=connection.prepareStatement("insert into icecream values(?,?,?,?,?)");
				 preparedStatement.setInt(1, id);
				 preparedStatement.setString(2, name);
				 preparedStatement.setString(3, brand);
				 preparedStatement.setDouble(4, price);
				 preparedStatement.setString(5, flavour);
				 
				 preparedStatement.execute();
				 connection.close();
				System.out.println("successfully inserted  in database");
			
			
			
		}
	}
