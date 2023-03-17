package com.springlearn.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.springlearn.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	@Query("selectc c from students c where c.id=:id")
	Student findStudentById(int id);
	
}
