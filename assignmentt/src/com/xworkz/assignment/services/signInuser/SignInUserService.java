package com.xworkz.assignment.services.signInuser;

import com.xworkz.assignment.entities.signup.SignUpEntity;
import com.xworkz.assignment.exceptions.ServiceException;

public interface SignInUserService{

	public SignUpEntity  signInDetails(String ename,String pass) throws ServiceException;
}
