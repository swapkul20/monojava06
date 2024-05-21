package com.techlabs.mappings.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techlabs.mappings.dto.InstructorDto;
import com.techlabs.mappings.entity.Instructor;
import com.techlabs.mappings.service.InstructorService;

@RestController
@RequestMapping("/studentapp")
public class InstructorController {
	
	@Autowired
	private InstructorService instructorService;
	
	@PostMapping("/instructors")
	public ResponseEntity<Instructor> addInstructor(@RequestBody Instructor instructor)
	{
		return ResponseEntity.ok(instructorService.save(instructor));
	}
	
	@GetMapping("/instructors")
	public ResponseEntity<List<Instructor>> getInstructors()
	{
		return ResponseEntity.ok(instructorService.getAllInstructors());
	}
	
	@GetMapping("/instructors/{instructorid}")
	public ResponseEntity<InstructorDto> getInstructor(@PathVariable int instructorid)
	{
		return ResponseEntity.ok(instructorService.getInstructor(instructorid));
	}
	
	

}
