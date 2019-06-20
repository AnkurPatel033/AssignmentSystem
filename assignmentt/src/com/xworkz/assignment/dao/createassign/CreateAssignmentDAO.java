package com.xworkz.assignment.dao.createassign;

import java.util.List;

import com.xworkz.assignment.entities.createAssignment.CreateAssignmentEntity;
import com.xworkz.assignment.exceptions.DAOException;
import com.xworkz.assignment.exceptions.ServiceException;

public interface CreateAssignmentDAO {
	
	
	public void createAssignment(CreateAssignmentEntity entity) throws DAOException;
	 public List<Object[]> courseLoad() throws DAOException;
	 public List<Object> topicLoad(int id) throws DAOException;

}
