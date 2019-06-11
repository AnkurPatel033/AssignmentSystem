package com.xworkz.assignment.dao.signInuser;

import java.util.List;

import com.xworkz.assignment.entities.createAssignment.CreateAssignmentEntity;
import com.xworkz.assignment.entities.signup.SignUpEntity;
import com.xworkz.assignment.exceptions.DAOException;

public interface SignInUserDetailsDAO  {

	public SignUpEntity signInUserDetailsCheck(String email,String pass) throws DAOException;
	
	public List<Object[]> pinLoad() throws DAOException;
	
}
