package com.techlabs.lists;

import java.util.Comparator;

public class StudentsByRollNumber implements Comparator<Student>{

	@Override
	public int compare(Student student1, Student student2) {
	
		if(student1.getRollnumber()>student2.getRollnumber())
			return 1;
		if(student1.getRollnumber()<student2.getRollnumber())
			return -1;
		else
			return 0;
	}

}
