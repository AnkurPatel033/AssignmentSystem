package com.xworkz.assignment.services.assignupload;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.assignment.dao.assignupload.AssignUploadDAO;
import com.xworkz.assignment.dto.assignupload.AssignUploadDTO;
import com.xworkz.assignment.entities.assignupload.AssignUploadEntity;
import com.xworkz.assignment.exceptions.DAOException;
import com.xworkz.assignment.exceptions.ServiceException;

@Service
public class AssignUploadServiceImpl implements AssignUploadService {

	@Autowired
	private AssignUploadDAO dao;

	public AssignUploadServiceImpl() {
		System.out.println("Created:" + this.getClass().getSimpleName());
	}

	@Override
	public void saveAssignUpload(AssignUploadDTO dto, String path) throws ServiceException {

		System.out.println("invoked saveAssignUpload() from service..");

		System.out.println("Data in Service is:" + dto);

		AssignUploadEntity entity = new AssignUploadEntity();
		entity.setPin(dto.getPin());
		entity.setcNo(dto.getcNo());
		entity.setEmail(dto.getEmail());
		entity.setUrl(dto.getUrl());
		entity.setFile(path);
		try {
			dao.saveAssignUpload(entity);
		} catch (DAOException e) {
			e.printStackTrace();
			throw new ServiceException(e.getMessage());
		}
		System.out.println("Data in Service is:" + entity);

	}

}
