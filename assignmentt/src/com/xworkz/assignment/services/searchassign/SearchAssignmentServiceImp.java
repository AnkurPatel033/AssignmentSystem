package com.xworkz.assignment.services.searchassign;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.assignment.dao.searchassign.SearchAssignmentDAO;
import com.xworkz.assignment.entities.createAssignment.CreateAssignmentEntity;
import com.xworkz.assignment.exceptions.DAOException;
import com.xworkz.assignment.exceptions.ServiceException;

@Service
public class SearchAssignmentServiceImp implements SearchAssigmentService {

	@Autowired
	private SearchAssignmentDAO dao;

	public SearchAssignmentServiceImp() {
		System.out.println("Created:" + this.getClass().getSimpleName());
	}

	@Override
	public CreateAssignmentEntity searchAssign(String pid) throws ServiceException {

		System.out.println("invoked searchAssign() from Service...");
		CreateAssignmentEntity entity;

		try {
			entity = dao.searchAssign(pid);
			System.out.println("Entity return From DAO in service is:"+entity);
			return entity;
		} catch (DAOException e) {
			System.out.println("From Service Class:" + e.getMessage());
			throw new ServiceException(e.getMessage());
		}

	}

}
