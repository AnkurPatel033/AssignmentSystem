package com.xworkz.assignment.dao.assignupload;

import com.xworkz.assignment.entities.assignupload.AssignUploadEntity;
import com.xworkz.assignment.exceptions.DAOException;

public interface AssignUploadDAO {

	public void saveAssignUpload(AssignUploadEntity entity)throws DAOException;
}
