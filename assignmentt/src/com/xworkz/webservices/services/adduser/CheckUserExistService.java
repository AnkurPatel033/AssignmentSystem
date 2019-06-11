package com.xworkz.webservices.services.adduser;

import com.xworkz.assignment.exceptions.ServiceException;

public interface CheckUserExistService{

	public int checkUserExist(String email) throws ServiceException;
}
