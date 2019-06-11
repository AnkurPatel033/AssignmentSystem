package com.xworkz.assignment.controllers.adduser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.assignment.enumutils.EnumUtils;
import com.xworkz.assignment.exceptions.ControllerException;
import com.xworkz.assignment.exceptions.ServiceException;
import com.xworkz.assignment.services.changepass.ChangePassService;

@Controller
public class ChangePassController {

	@Autowired
	private ChangePassService service;

	public ChangePassController() {
		System.out.println("Created:" + this.getClass().getSimpleName());
	}

	@RequestMapping(value = "/ChangeSetting", method = RequestMethod.POST)
	public String changePassDetails(@RequestParam String npass,@RequestParam String email, Model model)
			throws ControllerException {
		System.out.println("invoked changePassDetails()...");
		model.addAttribute("email",email);//do comming from Session
        
        
		try {
			service.changePassDetails(npass,email);
			model.addAttribute("message", "Sucessfully Password Changed..");
			return EnumUtils.ChangeSetting.toString();
		} catch (ServiceException e) {
			System.out.println("From Controller:" + e.getMessage());
			throw new ControllerException(e.getMessage());
		}

		
	}

}
