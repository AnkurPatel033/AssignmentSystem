package com.xworkz.webservices.dao.adduser;

import com.xworkz.assignment.exceptions.DAOException;

public interface CheckUserExistDAO {

	
	public int checkUserExist(String email) throws DAOException;
	
}
