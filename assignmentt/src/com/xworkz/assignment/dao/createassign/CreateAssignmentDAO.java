package com.xworkz.assignment.dao.createassign;

import com.xworkz.assignment.entities.createAssignment.CreateAssignmentEntity;
import com.xworkz.assignment.exceptions.DAOException;

public interface CreateAssignmentDAO {
	
	
	public void createAssignment(CreateAssignmentEntity entity) throws DAOException;

}
