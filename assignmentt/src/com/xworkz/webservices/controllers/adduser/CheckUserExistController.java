package com.xworkz.webservices.controllers.adduser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.xworkz.assignment.enumutils.EnumUtils;
import com.xworkz.assignment.exceptions.ControllerException;
import com.xworkz.webservices.services.adduser.CheckUserExistService;

@RestController
public class CheckUserExistController {

	@Autowired
	private CheckUserExistService service;


	public CheckUserExistController() {
		System.out.println("Rest Controller Created:" + this.getClass().getSimpleName());
	}

	@RequestMapping(value = "/email/{email}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Integer> checkUserExist(@PathVariable String email, Model model) throws ControllerException, Exception {
		System.out.println("Calling signUpDetailsRestController() from RestController...");
		System.out.println("Email:" + email);
		int i = service.checkUserExist(email);
		System.out.println("Match Found..." + i);
		return new ResponseEntity<>(i,HttpStatus.OK);
	}
}
