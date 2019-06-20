package com.xworkz.webservices.controllers.adduser;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.xworkz.assignment.exceptions.ControllerException;
import com.xworkz.assignment.services.createassign.CreateAssignmentService;

@RestController
public class TopicLoadController {

	@Autowired
	private CreateAssignmentService service;
	
	
	public TopicLoadController() {
		System.out.println("Created:"+this.getClass().getSimpleName());
	}
	
	
	@RequestMapping(value = "/gettopic/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Object>> TopicLoad(@PathVariable int id) throws ControllerException, Exception {
		System.out.println("Calling TopicLoadRestController() from RestController...:"+id);
		
        List<Object> topic=service.topicLoad(id);
		System.out.println("Data  Fetch and receive in Controller:"+topic );
	
      	return ResponseEntity.status(HttpStatus.OK).body(topic);

		
	}
	
	
}
