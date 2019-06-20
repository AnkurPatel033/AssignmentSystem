package com.xworkz.webservices.controllers.adduser;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.xworkz.assignment.exceptions.ControllerException;
import com.xworkz.assignment.services.createassign.CreateAssignmentService;

@RestController
public class CourseLoadController {
	
	@Autowired
	private CreateAssignmentService service;
	
	public CourseLoadController() {
		System.out.println("Created:"+this.getClass().getSimpleName());
	}
	
	@RequestMapping(value = "/getcourse/", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Object[]>> PinLoad() throws ControllerException, Exception {
		System.out.println("Calling CourseLoadRestController() from RestController...");
		
		List<Object[]> course=service.courseLoad();
		System.out.println("Data  Fetch and receive in Controller:" + course);
	//	new ResponseEntity<CreateAssignmentEntity>(HttpStatus.OK);
		return ResponseEntity.status(HttpStatus.OK).body(course);
		//return null;
	}
	
}
