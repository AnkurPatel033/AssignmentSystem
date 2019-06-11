package com.xworkz.assignment.services.searchassign;

import com.xworkz.assignment.entities.createAssignment.CreateAssignmentEntity;
import com.xworkz.assignment.exceptions.ServiceException;

public interface SearchAssigmentService {

	public CreateAssignmentEntity searchAssign(String pid) throws ServiceException;
	
}
