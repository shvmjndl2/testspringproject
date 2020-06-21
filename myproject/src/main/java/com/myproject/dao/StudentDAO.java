package com.myproject.dao;

import com.reg.entity.Student;
import com.reg.entity.StudentCredential;

public interface StudentDAO {
	public boolean saveStudent(Student student);
	public Student getStudentDetailsByEmailAndPassword(String email,String password);
}
