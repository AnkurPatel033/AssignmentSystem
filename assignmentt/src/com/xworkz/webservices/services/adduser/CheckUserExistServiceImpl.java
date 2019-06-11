package com.xworkz.webservices.services.adduser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.assignment.entities.signup.SignUpEntity;
import com.xworkz.assignment.exceptions.DAOException;
import com.xworkz.assignment.exceptions.ServiceException;
import com.xworkz.assignment.utils.adduser.ValidData;
import com.xworkz.webservices.dao.adduser.CheckUserExistDAO;

@Service
public class CheckUserExistServiceImpl implements CheckUserExistService {

	@Autowired
	private ValidData data;
	@Autowired
	private CheckUserExistDAO dao;

	public CheckUserExistServiceImpl() {
		System.out.println("created:" + this.getClass().getSimpleName());
	}

	@Override
	public int checkUserExist(String email) throws ServiceException {
		System.out.println("Calling CheckUserExist() from Service()...");
		System.out.println("Data in service:" + email);
		boolean check = false;
		check = valid(email);
		if (check)
			try {
				System.out.println("Your Valid Email is:" + email);
				SignUpEntity entity = new SignUpEntity();
				entity.setEmail(email);
				int i=dao.checkUserExist(email);
				return i;
			} catch (DAOException e) {
				System.out.println("Exception From Service:" + e.getMessage());
				throw new ServiceException(e.getMessage());
			}
      return 0;
	}

	private boolean valid(String email) {
		System.out.println("Cheking for Email Validation...");
		if (email != null) {

			boolean vEmail = data.isValidEmail(email);
			if (vEmail) {
				System.out.println("Valid Formate..");
				return true;
			}

		} else {
			System.out.println("Invalid Formate...");
			return false;
		}
		return false;
	}

}
