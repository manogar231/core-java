package com.springlearn.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springlearn.entity.Student;
import com.springlearn.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository StudentRepository;
	
	public Student savestudents(Student savedstudents) {
		
		Student student =new Student();
		
		student.setName(savedstudents.getName());
		student.setDept(savedstudents.getDept());
		return StudentRepository.save(savedstudents);
		
	}
	  
	 public Optional<Student> findStudentById(int id){
		 Student student =StudentRepository.findStudentById(id);
		 
		 return Optional.ofNullable(student);
	 }
}
