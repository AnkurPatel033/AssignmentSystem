package com.xworkz.assignment.services.assignupload;

import com.xworkz.assignment.dto.assignupload.AssignUploadDTO;
import com.xworkz.assignment.exceptions.ServiceException;

public interface AssignUploadService {

	
	public void saveAssignUpload(AssignUploadDTO entity,String path) throws ServiceException; 
	
}
