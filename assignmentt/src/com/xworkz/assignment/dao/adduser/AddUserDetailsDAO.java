package com.xworkz.assignment.dao.adduser;

import com.xworkz.assignment.entities.signup.SignUpEntity;
import com.xworkz.assignment.exceptions.DAOException;

public interface AddUserDetailsDAO {

	
	public void addUserDetailsSave(SignUpEntity entity) throws DAOException;
	
}
