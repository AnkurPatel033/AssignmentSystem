package com.xworkz.assignment.controllers.adduser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.assignment.entities.createAssignment.CreateAssignmentEntity;
import com.xworkz.assignment.enumutils.EnumUtils;
import com.xworkz.assignment.exceptions.ControllerException;
import com.xworkz.assignment.exceptions.ServiceException;
import com.xworkz.assignment.services.searchassign.SearchAssigmentService;

@Controller
public class SearchAssignmentController {

	@Autowired
	private SearchAssigmentService service;
	
	public SearchAssignmentController() {
		System.out.println("Created:"+this.getClass().getSimpleName());
	}
	
	@RequestMapping(value="/searchAssign",method=RequestMethod.POST)
	public String serachAssign(@RequestParam String pid, Model model ) throws ControllerException, Exception
	{
		System.out.println("invoking seachAssin() from controller....");
		System.out.println("Pin is:"+pid);
		try {
			CreateAssignmentEntity entity;
			entity=service.searchAssign(pid);
		
			if(entity!=null){
			System.out.println("Entity From Service in Controller:"+entity);
			model.addAttribute("Data",entity);
			return EnumUtils.Search.toString();
			}else
			{
				model.addAttribute("message", "Record Not Found...");
				return EnumUtils.Search.toString();
			}
		} catch (ServiceException e) {
			System.out.println("from Controller Error:" + e);
			model.addAttribute("message", "Record Not Found...");
			return EnumUtils.Search.toString();
		}
	}
	
}
