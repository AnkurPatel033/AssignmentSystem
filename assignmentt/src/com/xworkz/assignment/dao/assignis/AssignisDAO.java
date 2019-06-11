package com.xworkz.assignment.dao.assignis;

import com.xworkz.assignment.entities.createAssignment.CreateAssignmentEntity;
import com.xworkz.assignment.exceptions.DAOException;

public interface AssignisDAO {

	public CreateAssignmentEntity assigniEmail(Long pidId,String[] emails)throws DAOException;
	
	
}
