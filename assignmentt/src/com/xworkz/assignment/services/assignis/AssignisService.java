package com.xworkz.assignment.services.assignis;

import com.xworkz.assignment.exceptions.ServiceException;

public interface AssignisService {

	public String assignEmail(Long pidId,String[] email) throws ServiceException, Exception ;
}
