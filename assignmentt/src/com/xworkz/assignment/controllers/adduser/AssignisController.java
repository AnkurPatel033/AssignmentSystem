package com.xworkz.assignment.controllers.adduser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.assignment.enumutils.EnumUtils;
import com.xworkz.assignment.exceptions.ServiceException;
import com.xworkz.assignment.services.assignis.AssignisService;

@Controller
public class AssignisController {

	@Autowired
	private AssignisService service;
	
	public AssignisController() {
		System.out.println("Created:"+this.getClass().getSimpleName());
	}
	
	@RequestMapping(value="/assignis",method=RequestMethod.POST)
	public String assignis(@RequestParam long pid,@RequestParam String email,Model model)throws Exception
	{
		System.out.println("invoked assignis() from Controller...");
		System.out.println("Data from assigins:"+pid );
		String[] emails = email.split(",");
	    for (int i=0; i < emails.length; i++)
	    {
	    	//going to check emailId validation
	           System.out.println(emails[i]);
	    }

		try {
			
			service.assignEmail(pid,emails);
			model.addAttribute("success", "Successfully Mail Send..");
			return EnumUtils.Assignis.toString();
		} catch (ServiceException e) {
			System.out.println("from Controller Error:" + e);
			model.addAttribute("success", "Sending Fail...");
			return EnumUtils.Assignis.toString();
		}
		
	}
}
