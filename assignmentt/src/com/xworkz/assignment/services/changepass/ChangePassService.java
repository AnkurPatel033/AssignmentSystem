package com.xworkz.assignment.services.changepass;

import com.xworkz.assignment.exceptions.ServiceException;

public interface ChangePassService {
	
	public String changePassDetails(String newPass,String email) throws ServiceException;

}
