package com.zoho.StudentsManagements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.zoho.StudentsManagements.Controller.StudentController;
import com.zoho.StudentsManagements.Model.StudentLogin;

@SpringBootApplication
public class StudentsManagementsApplication  implements CommandLineRunner{
	@Autowired
	private StudentController studentController;
	

	public static void main(String[] args) {
		SpringApplication.run(StudentsManagementsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//addStudent();
		//deleteStudent();
		//updateStudent();
		//getStudent();
		
	}
	public void addStudent() throws Exception{
		try {
			
			StudentLogin studentLogin=new StudentLogin();
			studentLogin.setId(51);
			studentLogin.setStudentName("Saravanan");
			studentLogin.setAge(20);
			studentLogin.setBloodGroup("O");
			studentController.createstudentdetails(studentLogin);
			System.out.println("Add Successfully");
		}catch (Exception e) {
			throw e;
		}
	}
	public void deleteStudent() throws Exception{
		try {
			studentController.deletestudent(51);
			System.out.println("deleted Successfully");
		}catch (Exception e) {
			throw e;
		}
	}
	public void updateStudent() throws Exception{
		StudentLogin studentLogin=new StudentLogin();
		studentLogin.setId(51);
		studentLogin.setStudentName("Muthu");
		studentLogin.setAge(22);
		studentLogin.setBloodGroup("A+ve");
		try {
			studentController.updatestudent(studentLogin);
			System.out.println("update Successfully");
		}catch (Exception e) {
			throw e;
		}
}
	public void getStudent() throws Exception{
		
		
		
		try {
			StudentLogin studentlogin=studentController.getstudent(51);
			
			System.out.println(studentlogin.getId());
			System.out.println(studentlogin.getStudentName());
			System.out.println(studentlogin.getAge());
			System.out.println(studentlogin.getBloodGroup());
		}catch (Exception e) {
			throw e;
		}
}
public void getallStudent() throws Exception{
		
		
		
		try {
			StudentLogin studentlogin=studentController.getstudent(51);
			
			System.out.println(studentlogin.getId());
			System.out.println(studentlogin.getStudentName());
			System.out.println(studentlogin.getAge());
			System.out.println(studentlogin.getBloodGroup());
		}catch (Exception e) {
			throw e;
		}
}
}