package com.zoho.StudentsManagements.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.zoho.StudentsManagements.Model.StudentLogin;
import com.zoho.StudentsManagements.Service.StudentService;

@Controller
public class StudentController {
	@Autowired

	private StudentService studentService;

	public void createstudentdetails(StudentLogin studentLogin) throws Exception{
		studentService.createstudentdetails(studentLogin);
	}
	public void deletestudent(Integer id)throws Exception{
		studentService.deletestudent(id);
	}
	public void updatestudent(StudentLogin studentLogin)throws Exception{
		studentService.updatestudent(studentLogin);
}
	public StudentLogin getstudent(Integer id) throws Exception {
		
		return studentService.getstudent(id);
}
public List<StudentLogin> getallstudent() throws Exception {
		
		return studentService.getallstudent();
}
}