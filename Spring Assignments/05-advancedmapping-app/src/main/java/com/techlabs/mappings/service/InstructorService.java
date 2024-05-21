package com.techlabs.mappings.service;

import java.util.List;

import com.techlabs.mappings.dto.InstructorDto;
import com.techlabs.mappings.entity.Instructor;

public interface InstructorService {
	
	Instructor save(Instructor instructor);
	List<Instructor> getAllInstructors();
	
	InstructorDto getInstructor(int instructorid);
	

}
