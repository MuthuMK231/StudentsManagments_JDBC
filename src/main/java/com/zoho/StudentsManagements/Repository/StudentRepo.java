package com.zoho.StudentsManagements.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.zoho.StudentsManagements.Model.StudentLogin;

public class StudentRepo implements RowMapper<StudentLogin> {

	@Override
	public StudentLogin mapRow(ResultSet rs, int rowNum) throws SQLException {
		StudentLogin studentLogin=new StudentLogin();
		studentLogin.setId(rs.getInt("id"));
		studentLogin.setStudentName(rs.getString("student_name"));
		studentLogin.setAge(rs.getInt("age"));
		studentLogin.setBloodGroup(rs.getString("blood_group"));
		return studentLogin;
	}

}
