package com.xworkz.assignment.services.adduser;

import java.io.UnsupportedEncodingException;

import com.xworkz.assignment.dto.signup.SignUpDTO;
import com.xworkz.assignment.exceptions.ServiceException;

public interface AddUserDetailsService{

	public int addUserDetailsSave(SignUpDTO dto) throws ServiceException, UnsupportedEncodingException, Exception;
}
