package com.mkj.gtest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mkj.gtest.entity.Student;
@Service
public interface StudentService {
       public List<Student> getAllStudents() throws Exception;
       public List<Student> getAllStudentsByStream() throws Exception;
       public List<Student> getAllStudentsByMarks(int r1,int r2) throws Exception;
       public Student getStudentByName(String Name) throws Exception;
       public Student getStudentByRollNumber(int rollNum) throws Exception;
       
       
}
