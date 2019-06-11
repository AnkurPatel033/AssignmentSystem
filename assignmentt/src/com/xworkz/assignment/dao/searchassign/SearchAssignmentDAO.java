package com.xworkz.assignment.dao.searchassign;

import com.xworkz.assignment.entities.createAssignment.CreateAssignmentEntity;
import com.xworkz.assignment.exceptions.DAOException;

public interface SearchAssignmentDAO {

	public CreateAssignmentEntity searchAssign(String pid) throws DAOException;
}
