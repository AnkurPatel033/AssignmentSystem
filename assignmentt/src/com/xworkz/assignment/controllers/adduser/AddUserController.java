package com.xworkz.assignment.controllers.adduser;

//commite first
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xworkz.assignment.dto.signup.SignUpDTO;
import com.xworkz.assignment.enumutils.EnumUtils;
import com.xworkz.assignment.exceptions.ControllerException;
import com.xworkz.assignment.exceptions.ServiceException;
import com.xworkz.assignment.services.adduser.AddUserDetailsService;
import com.xworkz.assignment.sms.SendingSMS;

@Controller
@RequestMapping("/")
public class AddUserController {

	@Autowired
	private AddUserDetailsService service;
	@Autowired
	private SendingSMS sendingSMS;

	public AddUserController() {
		System.out.println("Created:" + this.getClass().getSimpleName());
	}

	@RequestMapping(value = "/signUp", method = RequestMethod.POST)
	public String signUpUserDetails(SignUpDTO dto, Model model) throws ControllerException, Exception {
		System.out.println("Calling signUpDetails() from Controller...");
		System.out.println("DTO:" + dto);
		sendingSMS.sending();
		try {
			service.addUserDetailsSave(dto);

			model.addAttribute("message", "Successfully SignUp..Check ur Mail for Password...");
			return EnumUtils.SignIn.toString();
		} catch (ServiceException e) {
			System.out.println("from Controller Error:" + e);
			model.addAttribute("message", "SignUp Fail...");
			return EnumUtils.SignUp.toString();
		}

	}
	

}
