package com.xworkz.assignment.controllers.adduser;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.assignment.dto.assignupload.AssignUploadDTO;
import com.xworkz.assignment.enumutils.EnumUtils;
import com.xworkz.assignment.exceptions.ServiceException;
import com.xworkz.assignment.services.assignupload.AssignUploadService;

@Controller
@RequestMapping("/")
public class AssignUploadController {

	
	@Autowired
	AssignUploadService service;
	
	public AssignUploadController() {

		System.out.println("Created:" + this.getClass().getSimpleName());
	}

	@RequestMapping(value = "/assignmentUpload", method = RequestMethod.POST)
	public String saveAssignment(AssignUploadDTO dto, Model model) {
		System.out.println("Calling save() from AssignUploadController class..");
       
		MultipartFile file = dto.getFile();
		System.out.println("File Address:" + file);

		try {

			byte[] fileadd = file.getBytes();
			String fileUrl = "D:/" + file.getOriginalFilename();
			BufferedOutputStream bufferedInputStream = new BufferedOutputStream(new FileOutputStream(new File(fileUrl)));
			bufferedInputStream.write(fileadd);
			String fileName = new SimpleDateFormat("yyyy_MM_dd_HH_mm'.zip'").format(new Date());
			System.out.println("File Name:"+fileName);
			System.out.println("File Address:"+fileUrl);
			try {
				
				
				
				service.saveAssignUpload(dto,fileName);
			} catch (ServiceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("DTO is:" + dto);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
         model.addAttribute("msg","File uploaded successfully.");
		/* ${files} uploaded successfully. */

		return EnumUtils.StudentHomeFile.toString();
	}
}
