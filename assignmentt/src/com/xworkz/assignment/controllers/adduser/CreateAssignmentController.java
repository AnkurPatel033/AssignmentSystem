package com.xworkz.assignment.controllers.adduser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xworkz.assignment.dto.createAssignment.CreateAssignmentDTO;
import com.xworkz.assignment.enumutils.EnumUtils;
import com.xworkz.assignment.exceptions.ControllerException;
import com.xworkz.assignment.exceptions.ServiceException;
import com.xworkz.assignment.services.createassign.CreateAssignmentService;

@Controller
public class CreateAssignmentController {

	@Autowired
	private CreateAssignmentService service;
	
	public CreateAssignmentController() {

		System.out.println("Created:" + this.getClass().getSimpleName());

	}

	@RequestMapping(value="/createAssignment",method=RequestMethod.POST)
	public String createAssignment(CreateAssignmentDTO dto,Model model ) throws ControllerException
	{
		
		System.out.println("Create Assignment Method Calling:"+dto);
		try {
			Long pin=service.createAssignment(dto, null);
			model.addAttribute("success","Sucessfully Assignment Created:"+pin);
			
		} catch (ServiceException e) {
			System.out.println("Exception From Controller:"+e.getMessage());
			throw new ControllerException(e.getMessage());
		}
		return EnumUtils.CreateAssignment.toString();
	}
	
	
	
}
