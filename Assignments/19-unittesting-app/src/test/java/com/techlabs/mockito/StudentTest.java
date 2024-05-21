package com.techlabs.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import org.mockito.Mockito;


class StudentTest {
	
	IStudentService service=Mockito.mock(IStudentService.class);
	


	@Test
	void testGetAverageMarks() {

		
		Student student=new Student(service);
		
		Mockito.when(service.getTotalMarks()).thenReturn(100);
		Mockito.when(service.getTotalStudents()).thenReturn(20);
		
		assertEquals(5.0, student.getAverageMarks());
		
	}

}
