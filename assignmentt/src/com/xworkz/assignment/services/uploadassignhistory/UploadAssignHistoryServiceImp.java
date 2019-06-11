package com.xworkz.assignment.services.uploadassignhistory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.assignment.dao.uploadassignhistory.UploadAssignHistoryDAO;
import com.xworkz.assignment.entities.createAssignment.CreateAssignmentEntity;
import com.xworkz.assignment.exceptions.DAOException;
import com.xworkz.assignment.exceptions.ServiceException;

@Service
public class UploadAssignHistoryServiceImp implements UploadAssignHistoryService {

	@Autowired
	private UploadAssignHistoryDAO dao;
	
	public UploadAssignHistoryServiceImp() {
		System.out.println("Created:"+this.getClass().getSimpleName());
	}
	
	
	@Override
	public CreateAssignmentEntity uploadAssignHistory() throws ServiceException {
		System.out.println("invoked uploadAssignHistory() from Service...");
		try {
			CreateAssignmentEntity entity=dao.uploadAssignHistory();
			System.out.println("Object 1:"+obj);
			
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return entity;
	}

}
