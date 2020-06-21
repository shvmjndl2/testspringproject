package com.myproject.service;

import com.reg.entity.Student;
import com.reg.entity.StudentCredential;

public interface StudentService {
	public abstract Student validateStudentCredential(String email,	String password);
	public abstract boolean registerStudent(Student student);

}