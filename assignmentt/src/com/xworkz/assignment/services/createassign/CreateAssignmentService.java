
package com.xworkz.assignment.services.createassign;

import javax.servlet.http.HttpServletRequest;

import com.xworkz.assignment.dto.createAssignment.CreateAssignmentDTO;
import com.xworkz.assignment.exceptions.ServiceException;

public interface CreateAssignmentService {

	
	public Long createAssignment(CreateAssignmentDTO dto,HttpServletRequest request)throws ServiceException;
	
}
