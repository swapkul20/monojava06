package com.techlabs.mappings.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.mappings.entity.Course;
import com.techlabs.mappings.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseRepository courseRepo;

	@Override
	public Course getCourse(int courseId) {
		// TODO Auto-generated method stub
		return courseRepo.findById(courseId).get();
	}

}
