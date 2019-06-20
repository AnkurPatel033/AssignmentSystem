package com.xworkz.webservices.controllers.adduser;

import java.io.IOException;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckSessionController {

	public CheckSessionController() {
		System.out.println("Created:" + this.getClass().getSimpleName());
	}

	@RequestMapping(value = "/checkSession/", method = RequestMethod.GET)
	public boolean CheckSessionValidOrNot(HttpServletRequest request) throws ServletException, IOException {
		System.out.println("Calling CheckSessionValidOrNot()  from RestController...");

		HttpSession session = request.getSession(false);

		System.out.println("User:" + session.getAttribute("UserEntity"));

		
		boolean sess=false;
		if (session.getAttribute("UserEntity") == null)
		{
	      sess=true;
		}
		return sess;
	}
}