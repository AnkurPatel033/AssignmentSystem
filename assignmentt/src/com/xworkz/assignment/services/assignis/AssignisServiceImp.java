package com.xworkz.assignment.services.assignis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.assignment.dao.assignis.AssignisDAO;
import com.xworkz.assignment.email.MailSender;
import com.xworkz.assignment.entities.createAssignment.CreateAssignmentEntity;
import com.xworkz.assignment.exceptions.DAOException;
import com.xworkz.assignment.exceptions.ServiceException;

@Service
public class AssignisServiceImp implements AssignisService {
	
	@Autowired
	private AssignisDAO dao;
	@Autowired
	private MailSender mainSender;
	
	public AssignisServiceImp() {
		System.out.println("Created:"+this.getClass().getSimpleName());
	}

	@Override
	public String  assignEmail(Long pidId, String[] email) throws ServiceException, Exception {
		System.out.println("invoked assignEMail from Service..");
		try {			
			System.out.println("Service:"+pidId);
			CreateAssignmentEntity entity=dao.assigniEmail(pidId,email);
			System.out.println("Assigment pin:"+entity);
			//System.out.println(email[0]);
			//System.out.println(email[1]);
			//System.out.println(email[2]);
			mainSender.mailAssigins(entity, email);
		} catch (DAOException e) {
			System.out.println("Exception From Service:" + e.getMessage());
			throw new ServiceException(e.getMessage());
		}	
		return null;
	}
	
	

}
