package com.xworkz.assignment.services.createassign;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.assignment.dao.createassign.CreateAssignmentDAO;
import com.xworkz.assignment.dto.createAssignment.CreateAssignmentDTO;
import com.xworkz.assignment.email.MailSender;
import com.xworkz.assignment.entities.createAssignment.CreateAssignmentEntity;
import com.xworkz.assignment.entities.signup.SignUpEntity;
import com.xworkz.assignment.exceptions.DAOException;
import com.xworkz.assignment.exceptions.ServiceException;
import com.xworkz.assignment.utils.adduser.RandomGenerator;

@Service
public class CreateAssignmentServiceImp implements CreateAssignmentService {

	@Autowired
	private CreateAssignmentDAO dao;
	@Autowired
	private RandomGenerator random;
	@Autowired
	private MailSender mailSender;

	public CreateAssignmentServiceImp() {
		System.out.println("Created:" + this.getClass().getSimpleName());
	}

	@Override
	public Long createAssignment(CreateAssignmentDTO dto,HttpServletRequest request) throws ServiceException {

		System.out.println("Create AssignmentServiceImp() Calling");

		CreateAssignmentEntity entity1 = new CreateAssignmentEntity();
		entity1.setCourse(dto.getCourse());
		entity1.setTopic(dto.getTopic());
		entity1.setDesc(dto.getDesc());
		entity1.setDate(dto.getDate());
		entity1.setUploadType(dto.getUploadType());

	    //Generate random Pin no. and save in entity
		Long pin = random.genearteAssignmentNumber(entity1);
		entity1.setPin(pin);
		System.out.println("Entity value:"+entity1);
		
		/*SignUpEntity entity2 = new SignUpEntity();
		System.out.println("old entity:"+entity2);
		*/
		//email assignment pin number to assignee
     	/*String email=(String) request.getAttribute("userName");
		System.out.println("Seesion email:"+email);
		mailSender.mailAssignmentPin(entity1, entity2, pin);
		*/
		try {

			dao.createAssignment(entity1);
		} catch (DAOException e) {
			System.out.println("Exception From Service:" + e.getMessage());
			throw new ServiceException(e.getMessage());
		}
		return pin;

	}

}
