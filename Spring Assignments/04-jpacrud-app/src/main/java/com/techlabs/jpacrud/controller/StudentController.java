package com.techlabs.jpacrud.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techlabs.jpacrud.entity.Student;
import com.techlabs.jpacrud.error.StudentErrorResponse;
import com.techlabs.jpacrud.exception.StudentNotFoundException;
import com.techlabs.jpacrud.service.StudentService;

@RestController
@RequestMapping("/studentapp")
@CrossOrigin("*")
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	@GetMapping("/students")
	public ResponseEntity<List<Student>> getAllStudents(@RequestParam Map<String,String> params)	
	{
	  Page<Student> studentPage=null;
	  int pagenumber=0;
	  int pagesize=1;
	  
	  if(params.isEmpty())
		  studentPage=studentService.getStudentsPageWise(0, studentService.getAllStudents().size());
	  else
	  {
		  
		  if(params.containsKey("pagenumber"))
			  pagenumber=Integer.parseInt(params.get("pagenumber"));
		  
		  if(params.containsKey("pagesize"))
			  pagesize=Integer.parseInt(params.get("pagesize"));
		  
		  if(params.containsKey("pagenumber") && params.containsKey("pagesize"))
			  studentPage=studentService.getStudentsPageWise(pagenumber, pagesize);
		  
		  if(params.containsKey("name"))
			  studentPage=studentService.getStudentByName(pagenumber,pagesize,params.get("name"));
			  
	  }
	  
	
	  HttpHeaders headers=new HttpHeaders();
	  headers.set("X-Total-Count", String.valueOf(studentPage.getTotalElements()));
	  
	  if(studentPage.getTotalElements()==0)
		  throw new StudentNotFoundException();
	  
	  return ResponseEntity.ok().body(studentPage.getContent());
	  //return ResponseEntity.ok().headers(headers).body(studentPage.getContent());
	}

	
	@GetMapping("/students/{rollnumber}")
	public Student getStudentsByRno(@PathVariable int rollnumber)	
	{
	  return studentService.getStudent(rollnumber);
	}
	
//	@GetMapping("/students")
//	public Page<Student> getStudents(@RequestParam int pagenumber, @RequestParam int pagesize)
//	
//	{
//	  return studentService.getStudentsPageWise(pagenumber, pagesize);
//	}
	

//	@GetMapping("/students/{name}")
//	public List<Student> getStudents(@PathVariable String name)
//	{
//	  return studentService.getStudentByName(name);
//	}
	
	
	@PostMapping("/students")
	public Student addStudent(@RequestBody Student student)
	{
	
		return studentService.save(student);
		
	}
	
	@PutMapping("/students")
	public Student updateStudent(@RequestBody Student student)
	{
		return studentService.update(student);
		
	}
	
	
	@DeleteMapping("/students/{rollnumber}")
	public void deleteStudent(@PathVariable(name="rollnumber") int rollnumber)
	{
		 studentService.delete(rollnumber);
		
	}
	
	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleStudentNotFoundException(StudentNotFoundException exception)
	{
		
		StudentErrorResponse error=new StudentErrorResponse(HttpStatus.NOT_FOUND.value(),exception.getMessage(), System.currentTimeMillis());
	    return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
	}
	
	

}
