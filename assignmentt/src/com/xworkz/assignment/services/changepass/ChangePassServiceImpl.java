package com.xworkz.assignment.services.changepass;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.assignment.dao.changepass.ChangePassDAO;
import com.xworkz.assignment.email.MailSender;
import com.xworkz.assignment.entities.signup.SignUpEntity;
import com.xworkz.assignment.exceptions.DAOException;
import com.xworkz.assignment.exceptions.ServiceException;
import com.xworkz.assignment.utils.adduser.ValidData;

@Service
public class ChangePassServiceImpl  implements ChangePassService{

	@Autowired
	private ChangePassDAO dao;
	@Autowired
	private ValidData data;
	@Autowired
	private MailSender mailSender;
	
	public ChangePassServiceImpl() {
		System.out.println("Created:"+this.getClass().getSimpleName());
	}

	@Override
	public String changePassDetails(String newpass,String email) throws ServiceException {
		System.out.println("invkode changePassDetails() From Service...");
		boolean check = false;
		check = valid(newpass);
		if (check)
		try {
			System.out.println("Entered New Password is:"+newpass);
             //convert in encryption 
		
			String encpass = Base64.getEncoder().encodeToString(newpass.getBytes("utf-8"));
			System.out.println("encrpted pass in DB:" + encpass);
			SignUpEntity entity=new SignUpEntity();
			entity.setStatus(1);
			System.out.println("change pass mail send..preparation...start..");
			System.out.println("Email for chnage pass:"+entity);
	        mailSender.changePassmailSending(email, newpass, null);  //send mail for change pass
	        System.out.println("change pass mail send..complete..");
			dao.changePassDetails(encpass, email);
		} catch (DAOException | UnsupportedEncodingException e) {
			System.out.println("From Service Class:"+e.getMessage());
			  throw new ServiceException(e.getMessage());
		}
		return "Succesfully from Services..";
	}
	private boolean valid(String newPass) {
		if (newPass!= null) {
			@SuppressWarnings("unused")
			boolean vNewPass = data.isValidNewPass(newPass);
				System.out.println("Valid Data..going to save in DB..");
				return true;
			
		} else 
		{
			System.out.println("Invalid Password Created......");
			return false;
		}

	}


}
