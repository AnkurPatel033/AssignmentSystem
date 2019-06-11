package com.xworkz.assignment.controllers.adduser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xworkz.assignment.entities.createAssignment.CreateAssignmentEntity;
import com.xworkz.assignment.enumutils.EnumUtils;
import com.xworkz.assignment.exceptions.ControllerException;
import com.xworkz.assignment.exceptions.ServiceException;
import com.xworkz.assignment.services.uploadassignhistory.UploadAssignHistoryService;

@Controller
public class UploadAssignHistoryController {

	@Autowired
	private UploadAssignHistoryService service;

	public UploadAssignHistoryController() {
		System.out.println("Created:" + this.getClass().getSimpleName());
	}

	@RequestMapping(value = "/uploadAssignHistory/", method = RequestMethod.GET)
	public String uploadAssignHistory(Model model) throws ControllerException, Exception {
		System.out.println("invoking uploadAssignHistory() from controller....");

		try {
			CreateAssignmentEntity entity;
			entity = service.uploadAssignHistory();

			if (entity != null) {
				System.out.println("Entity From Service in Controller:" + entity);
				model.addAttribute("Data", entity);
				return EnumUtils.UploadHistory.toString();
			} else {
				model.addAttribute("message", "Record Not Found...");
				return EnumUtils.UploadHistory.toString();
			}
		} catch (ServiceException e) {
			System.out.println("from Controller Error:" + e);
			model.addAttribute("message", "Record Not Found...");
			return EnumUtils.UploadHistory.toString();
		}
	}

}
