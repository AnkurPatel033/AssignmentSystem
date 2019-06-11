package com.xworkz.assignment.services.signInuser;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.assignment.dao.signInuser.SignInUserDetailsDAO;
import com.xworkz.assignment.entities.signup.SignUpEntity;
import com.xworkz.assignment.exceptions.DAOException;
import com.xworkz.assignment.exceptions.ServiceException;
import com.xworkz.assignment.utils.adduser.ValidData;

@Service
public class SignInUserServiceImpl implements SignInUserService {

	@Autowired
	private ValidData data;
	@Autowired
	private SignInUserDetailsDAO dao;
	
	public SignUpEntity signInDetails(String email, String pass) throws ServiceException  {
		System.out.println("Calling signInUserDetails from Service()...");
		boolean check = false;
		check = valid(email, pass);
		// String encryptpass
		SignUpEntity entity;
		/* try { */
		if (check) {
			try {
				System.out.println("Eneterd Pass is:" + pass);

				// decrept pass
				String encpass = Base64.getEncoder().encodeToString(pass.getBytes("utf-8"));
				System.out.println("encrpted pass in DB:" + encpass);
				
				entity = dao.signInUserDetailsCheck(email, encpass);
				if (entity!=null)
				{
				System.out.println("Going to DAO:and return entity is:" + entity);
				return entity;
				}
			} catch (DAOException | UnsupportedEncodingException e) {
				System.out.println(e.getMessage());
				throw new ServiceException(e.getMessage());
			}
		}
     return null;
	}

	private boolean valid(String email, String pass) {
		System.out.println("Cheking for login validation...");
		if (email != null && pass != null) {

			boolean vEmail = data.isValidEmail(email);
			boolean vPass = data.isValidPass(pass);

			if (vEmail && vPass) {
				System.out.println("Valid Credential..going to SignIn Applications..");
				return true;
			}

		} else {
			System.out.println("Invalid Credential Found...");
			return false;
		}
		return false;
	}

}
