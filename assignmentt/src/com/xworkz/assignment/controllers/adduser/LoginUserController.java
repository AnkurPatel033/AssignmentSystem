package com.xworkz.assignment.controllers.adduser;


import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.assignment.entities.signup.SignUpEntity;
import com.xworkz.assignment.enumutils.EnumUtils;
import com.xworkz.assignment.exceptions.ControllerException;
import com.xworkz.assignment.exceptions.ServiceException;
import com.xworkz.assignment.services.signInuser.SignInUserService;

@Controller
@RequestMapping("/")
public class LoginUserController{

	@Autowired
	private SignInUserService service;

	public LoginUserController() {

		System.out.println("Created:" + this.getClass().getSimpleName());
	}

	@RequestMapping(value = "/signIn", method = RequestMethod.POST)
	public String signInDetails(@RequestParam String email, @RequestParam String pwd, Model model,HttpServletRequest request)
			throws ControllerException {
		System.out.println("Calling SignIn()..from LoginUSerController()...");
		System.out.println("Email:" + email + "" + "and Password:" + pwd);
		SignUpEntity success;
		try {
			System.out.println("Comming..........................");
			success = service.signInDetails(email, pwd);

			if (success != null) 
			{
				// create Session here...
					
				HttpSession session = request.getSession();//Creating a session
				session.setAttribute("userEntity", success);
				request.setAttribute("userName", success.getFname());//setting session attribute
				session.setMaxInactiveInterval(60*5);//300seconde
				
				if (success.getStatus() == 1) {
					System.out.println("SignIn Sucessfully.." + request.getAttribute("userName"));
					model.addAttribute("email", email);
					return EnumUtils.Home.toString();
				} else if (success.getStatus() == 0) {// first time user
					System.out.println("Change Your Password " + request.getAttribute("userName"));
					model.addAttribute("email", email);
					return EnumUtils.ChangeSetting.toString();
				}
			} else {
				System.out.println("Invalid Credential..try again...");
				model.addAttribute("message", "Invalid Credential..try again......");
				return EnumUtils.SignIn.toString();
			}
		} catch (ServiceException e) {
			System.out.println(e.getMessage());
			throw new ControllerException(e.getMessage());
		}
		return EnumUtils.SignIn.toString();
		
	}
	
	@RequestMapping("/signOut")
	public String logOut(HttpServletRequest request)
	{
		System.out.println("invoked SignOut method.....");
		
		HttpSession session=request.getSession(false);

        if(session!=null)
         {
          session.invalidate();
          System.out.println("UserName after Session TimeOut:"+request.getAttribute("userName"));
         }
		return EnumUtils.SignIn.toString();
	}

}
