package com.springlearn.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springlearn.entity.Student;

@RestController
public class StudentControl {
     
	/*
	 * private static Map< String ,Student> studentRepo =new HashMap<>();
	 * 
	 * static {
	 * 
	 * Student peter=new Student(); peter.setId("1"); peter.setName("PETER");
	 * peter.setDept("EEE");
	 * 
	 * studentRepo.put(peter.getId(), peter);
	 * 
	 * Student mag=new Student(); mag.setId("2"); mag.setName("MAG Griffen");
	 * mag.setDept("MEC"); studentRepo.put(mag.getId(), mag);
	 * 
	 * Student stewi=new Student(); stewi.setId("3");
	 * stewi.setName("STEWI Griffen"); stewi.setDept("ITI");
	 * studentRepo.put(stewi.getId(), stewi);
	 * 
	 * }
	 */
	 @RequestMapping(value = "/student")
	   public ResponseEntity<Object> getStudent() {
	      return new ResponseEntity<>(Student.class, HttpStatus.OK);
}
/*
 * @RequestMapping(value ="/student{/id}") public ResponseEntity<Object>
 * updateStudent(){
 * 
 * return new ResponseEntity<>(studentRepo.values().getClass(),HttpStatus.OK); }
 */ 
}