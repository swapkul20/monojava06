package com.techlabs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DbConnection {
	
	private static DbConnection dbConnection;
	private static Connection connection;
	private static Statement statement;
	private static PreparedStatement preparedstatement;
	private ResultSet resultSet;
	
	private DbConnection()
	{
	
	}
	
	public static DbConnection getDbConnection()
	{
		if(dbConnection==null)
			dbConnection=new DbConnection();
		return dbConnection;
	}
	
	void connect()
	{
		try
		{
	
		   Class.forName("com.mysql.cj.jdbc.Driver");		   
		   connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb1","root","root");
		   System.out.println("Connection established successfully ");		   
		 }
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static Statement getStatement() throws SQLException
	{
		if(statement==null)
			statement=connection.createStatement();	
		return statement;
	}
	

	void displayAllStudents()
	{
		   try
		   {
		   statement=DbConnection.getStatement();		   
		   resultSet=statement.executeQuery("select * from student");		   
		   while(resultSet.next())
		   {
			   System.out.println(resultSet.getInt("rollnumber")+"\t"+resultSet.getString("name")+"\t"+resultSet.getString("age"));
		   }		   
		   resultSet.close();
		
		   }
		   catch(Exception e)
		   {
			   System.out.println(e);
		   }
	}
	
	void addStudent()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a roll number");
		int rno=scanner.nextInt();
		System.out.println("Enter a name");
		String name=scanner.next();
		
		System.out.println("Enter age");
		int age=scanner.nextInt();
		
		try {
			preparedstatement=connection.prepareStatement("insert into student values(?,?,?)");
			preparedstatement.setInt(1,rno);
			preparedstatement.setString(2, name);
			preparedstatement.setInt(3, age);
			preparedstatement.executeUpdate();
			System.out.println("Record is inserted");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	void updateStudent() 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a roll number to update");
		int rno=scanner.nextInt();
		System.out.println("Enter age to update");
		int age=scanner.nextInt();
		try {
			preparedstatement=connection.prepareStatement("update student set age=? where rollnumber=?");
			preparedstatement.setInt(1, age);
			preparedstatement.setInt(2, rno);
			preparedstatement.executeUpdate();
			System.out.println("Record is updated");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
