package com.Stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<People> Peoples=getperson();
		
     //getting male list
		
		  List<People> maleList=Peoples.stream()
		  .filter(People->People.getgender().equals(Gender.MALE))
		  .collect(Collectors.toList());
		  maleList.forEach(System.out::println);
				
	//getting female list			
		List<People> femaleList=Peoples.stream()				
	   	.filter(People->People.getgender().equals(Gender.FEMALE))
	    .collect(Collectors.toList());					
		femaleList.forEach(System.out::println);
	//sorting the age 
		List<People> sortList= Peoples.stream()
		.sorted(Comparator.comparing(People::getage))
		.collect(Collectors.toList());
		sortList.forEach(System.out::println);
   //maximum age
		Peoples.stream()
				.max(Comparator.comparing(People::getage))
				.ifPresent(System.out::println);
   //minimum age 	
		Peoples.stream()
		       .min(Comparator.comparing(People::getage))
	           .ifPresent(System.out::println);
	}

	private static List<People> getperson(){
		return List.of(
			new People("jhon",27,Gender.MALE),
			new People("peter", 24, Gender.MALE),
			new People("selina", 23, Gender.FEMALE),
			new People("victor", 34, Gender.MALE),
			new People("morgan", 44, Gender.MALE),
			new People("June", 34,Gender.FEMALE),
			new People("grace", 30, Gender.FEMALE),
			new People("charli",13,Gender.FEMALE)
			

		);
		
		
	}
	
	
}
