package com.xworkz.webservices.controllers.adduser;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.xworkz.assignment.dao.signInuser.SignInUserDetailsDAO;
import com.xworkz.assignment.exceptions.ControllerException;

@RestController
public class PinLoadController {
	
	@Autowired
	private SignInUserDetailsDAO dao;
	
	public PinLoadController() {
		System.out.println("Created:"+this.getClass().getSimpleName());
	}
	
	@RequestMapping(value = "/getpin/", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Object[]>> PinLoad() throws ControllerException, Exception {
		System.out.println("Calling PinLoadRestController() from RestController...");
		
		List<Object[]> pin=dao.pinLoad();
		System.out.println("Data  Fetch and receive in Controller:" + pin);
	//	new ResponseEntity<CreateAssignmentEntity>(HttpStatus.OK);
		return ResponseEntity.status(HttpStatus.OK).body(pin);
	}
	
}
