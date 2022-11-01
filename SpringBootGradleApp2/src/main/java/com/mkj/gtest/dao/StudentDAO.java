package com.mkj.gtest.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mkj.gtest.entity.Student;
@Repository
public interface StudentDAO {
	public List<Student> getAllStudents() throws Exception;
    public List<Student> getAllStudentsByStream() throws Exception;
    public List<Student> getAllStudentsByMarks(int r1,int r2) throws Exception;
    public Student getStudentByName(String Name) throws Exception;
    public Student getStudentByRollNumber(int rollNum) throws Exception;
    

}
