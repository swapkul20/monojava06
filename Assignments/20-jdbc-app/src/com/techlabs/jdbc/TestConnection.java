package com.techlabs.jdbc;

public class TestConnection {

	public static void main(String[] args) {
		
	
		
		DbConnection connection=DbConnection.getDbConnection();
		connection.connect();
		connection.displayAllStudents();
		connection.addStudent();
		connection.displayAllStudents();
 		connection.updateStudent();
		connection.displayAllStudents();

	}

}
