package com.springlearn.entity;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

//import lombok.Data;
//its POJO class 

@Entity
@Data
@Table(name="students")
public class Student {
     @Id
     @Column(name= "id")
	private int id;
     @Column(name="Name")
	private String name;
     @Column(name="Dept")
	private String dept;
     
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
     
   
}
