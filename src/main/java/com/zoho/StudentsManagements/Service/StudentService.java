package com.zoho.StudentsManagements.Service;

import java.util.List;

import com.zoho.StudentsManagements.Model.StudentLogin;

public interface StudentService {
	public  void createstudentdetails(StudentLogin studentLogin) throws Exception;
	public void deletestudent(int id) throws Exception;
	public void updatestudent(StudentLogin studentLogin) throws Exception;
	public StudentLogin getstudent(Integer id) throws Exception;
	public  List<StudentLogin>getallstudent()throws Exception;
}
