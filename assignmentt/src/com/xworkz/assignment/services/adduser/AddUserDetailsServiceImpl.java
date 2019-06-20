package com.xworkz.assignment.services.adduser;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twilio.Twilio;
import com.twilio.base.ResourceSet;
import com.twilio.rest.chat.v1.service.channel.Message;
import com.twilio.type.PhoneNumber;
import com.xworkz.assignment.dao.adduser.AddUserDetailsDAO;
import com.xworkz.assignment.dto.signup.SignUpDTO;
import com.xworkz.assignment.email.MailSender;
import com.xworkz.assignment.entities.signup.SignUpEntity;
import com.xworkz.assignment.exceptions.DAOException;
import com.xworkz.assignment.exceptions.ServiceException;
import com.xworkz.assignment.utils.adduser.RandomGenerator;
import com.xworkz.assignment.utils.adduser.ValidData;

@Service
public class AddUserDetailsServiceImpl implements AddUserDetailsService {

	@Autowired
	private ValidData data;
	@Autowired
	private AddUserDetailsDAO dao;
	@Autowired
	private MailSender mailSender;
	@Autowired
	private RandomGenerator  random;

	public AddUserDetailsServiceImpl() {
		System.out.println("created:" + this.getClass().getSimpleName());
	}

	@Override
	public int addUserDetailsSave(SignUpDTO dto) throws ServiceException, Exception {
		System.out.println("Calling adduserDetailSave() from Service()...");
		System.out.println("Data in service:" + dto);
		boolean check = false;
		check = valid(dto);
		if (check)
			try {
				String firstName = dto.getFname();
				String lastName = dto.getLname();
				String email = dto.getEmail();
				int cCode = dto.getCode();
				long cNo = dto.getCno();
				Long ccode = new Long(cCode);

				String fno = Long.toString(ccode) + Long.toString(cNo);

				long contactNo = Long.parseLong(fno);

				// generate random password
			/*	String randomChar = RandomStringUtils.random(4, ch);
				String symbol = RandomStringUtils.random(1, sy);
				String no = RandomStringUtils.random(3, number);

				String randpass = randomChar + symbol + no;*/
				String randpass=random.geneartePass();
				System.out.println("Your Generate Random Password:" + randpass);

				// store pass in NonReadable form in DB

				String encrptPass;

				encrptPass = Base64.getEncoder().encodeToString(randpass.getBytes("utf-8"));

				System.out.println("encrpted pass in DB:" + encrptPass);
				SignUpEntity entity = new SignUpEntity();
				entity.setFname(firstName);
				entity.setLname(lastName);
				entity.setEmail(email);
				entity.setPhNo(contactNo);
				entity.setPass(encrptPass); // save your encrpt pass
				dao.addUserDetailsSave(entity);
				mailSender.mailSending(entity, randpass);
			} catch (DAOException e) {
				System.out.println("Exception From Service:" + e.getMessage());
				throw new ServiceException(e.getMessage());
			}
		return 0;
	}

	private boolean valid(SignUpDTO dto) {
		System.out.println("Cheking for validation...");
		if (dto != null) {
			boolean vFname = data.isValidFname(dto.getFname());
			boolean vLanme = data.isValidLname(dto.getLname());
			boolean vEmail = data.isValidEmail(dto.getEmail());
			boolean vCcode = data.isValidCcode(dto.getCode());
			boolean cCnumber = data.isValidcNo(dto.getCno());

			if (vFname && vLanme && vEmail && vCcode && cCnumber) {
				System.out.println("Valid Data..going to save in DB..");
				return true;
			}

		} else {
			System.out.println("Invalid Data Found...");
			return false;
		}
		return false;
	}
	/*public String sendMsg()
	{
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
		Message message = Message.creator(new PhoneNumber("+12225559999"),new PhoneNumber("+919737514379"),"Sample Twilio SMS using Java")
		.create();
		
		ResourceSet messages = Message.reader().read();
		for (Message message : messages) {
		    System.out.println(message.getSid() + " : " + message.getStatus());
		}
	}
*/
}
