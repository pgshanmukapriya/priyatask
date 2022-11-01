package com.mkj.gtest.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.mkj.gtest.entity.Student;
@Component
public class UserDatabase {
	

	public List<Student> allStudents = new ArrayList<>();
	public List<Student> getStudentByStream = new ArrayList<>();
	public List<Student> getAllStudentsByMarks=new ArrayList<>();

	 UserDatabase() {

		 System.out.println(" inside user database");
		 
		 Student s1= new Student("pri", 101, 85, "IT");
		 Student s2= new Student("Raj", 102, 92, "CS");
		 Student s3= new Student("Ji", 103, 66, "ECE");
		 
		 allStudents.add(s1);
		 allStudents.add(s2);
		 allStudents.add(s3);
		 
		 Student s4= new Student(null, 0, 0, "C");
		 Student s5= new Student(null, 0, 0, "C++");
		 Student s6= new Student(null, 0, 0, "Java");
		 getStudentByStream.add(s4);
		 getStudentByStream.add(s5);
		 getStudentByStream.add(s6);
		 
		 Student s7= new Student(null, 0, 60, null);
		 Student s8= new Student(null, 0, 60, null);
		 Student s9= new Student(null, 0, 60, null);
		 getAllStudentsByMarks.add(s7);
		 getAllStudentsByMarks.add(s8);
		 getAllStudentsByMarks.add(s9);
		 
		 
		 
		 
	 }


	public List<Student> getAllStudents() {
		return allStudents;
	}


	public void setAllStudents(List<Student> allStudents) {
		this.allStudents = allStudents;
	}


	public List<Student> getGetStudentByStream() {
		return getStudentByStream;
	}


	public void setGetStudentByStream(List<Student> getStudentByStream) {
		this.getStudentByStream = getStudentByStream;
	}


	public List<Student> getGetAllStudentsByMarks() {
		return getAllStudentsByMarks;
	}


	public void setGetAllStudentsByMarks(List<Student> getAllStudentsByMarks) {
		this.getAllStudentsByMarks = getAllStudentsByMarks;
	}




}
