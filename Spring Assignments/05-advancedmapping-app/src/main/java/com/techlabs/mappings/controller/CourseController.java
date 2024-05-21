package com.techlabs.mappings.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techlabs.mappings.entity.Course;
import com.techlabs.mappings.service.CourseService;

@RestController
@RequestMapping("/studentapp")
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/courses/{courseid}")
	public ResponseEntity<Course> getCourse(@PathVariable int courseid)
	{
		return ResponseEntity.ok(courseService.getCourse(courseid));
	}

}
