package com.techlabs.mockito;

public class Student {
	
	IStudentService service;
	
	
	
	public Student(IStudentService service) {
		super();
		this.service = service;
	}



	double getAverageMarks()
	{
		return service.getTotalMarks()/service.getTotalStudents();
	}

}
