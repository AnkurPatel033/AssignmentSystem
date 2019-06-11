package com.xworkz.assignment.services.uploadassignhistory;

import com.xworkz.assignment.entities.createAssignment.CreateAssignmentEntity;
import com.xworkz.assignment.exceptions.ServiceException;

public interface UploadAssignHistoryService {

	public CreateAssignmentEntity uploadAssignHistory()throws ServiceException;
	
}
