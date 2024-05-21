package com.techlabs.mappings.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.mappings.dto.InstructorDto;
import com.techlabs.mappings.entity.Instructor;
import com.techlabs.mappings.repository.InstructorRepository;

@Service
public class InstructorServiceImpl implements InstructorService{
	
	@Autowired
	private InstructorRepository instructorRepo;

	@Override
	public Instructor save(Instructor instructor) {
		
		return instructorRepo.save(instructor);
	}

	@Override
	public List<Instructor> getAllInstructors() {
		
		return instructorRepo.findAll();
	}

	@Override
	public InstructorDto getInstructor(int instructorid) {
		
		Optional<Instructor> dbInstructor=instructorRepo.findById(instructorid);
		Instructor instructor=null;
		InstructorDto instructorDto=null;
		if(!dbInstructor.isEmpty())
		{
			instructor=dbInstructor.get();
			instructorDto=new InstructorDto();
			instructorDto.setInstructorid(instructor.getInstructorid());
			instructorDto.setInstructorName(instructor.getInstructorName());
		
		}
			
		return instructorDto;
	}

	

}
