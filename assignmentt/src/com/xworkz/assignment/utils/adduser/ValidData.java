package com.xworkz.assignment.utils.adduser;

import org.springframework.stereotype.Component;

@Component
public class ValidData {

	@SuppressWarnings("unused")
	public boolean isValidFname(String fName) {
		if (!fName.isEmpty() || fName != null || (fName.length() >= 4 && fName.length() <= 50)) {
			System.out.println("First Name is Valid");
			return true;
		} else
		{
		   System.out.println("First Name is Invalid");
			return false;
		}

	}

	@SuppressWarnings("unused")
	public boolean isValidLname(String lName) {
		if (!lName.isEmpty() || lName != null || (lName.length() >= 4 && lName.length() <= 50)) {
			System.out.println("Last Name is Valid");
			return true;
		} else {
			System.out.println("Last Name is Invalid");
			return false;
		}

	}

	@SuppressWarnings("unused")
	public boolean isValidEmail(String email) {
		if (!email.isEmpty() || email != null) {
			System.out.println("Email is Valid");
			return true;
		} else {
			System.out.println("Email is Invalid");
			return false;
		}
	}

	public boolean isValidCcode(int cCode) {

		if (cCode != 0) {
			System.out.println("Country Code is Valid");
			return true;
		} else {
			System.out.println("Country Code is Invalid");
			return false;
		}
	}

	public boolean isValidcNo(long cNo) {

		if (cNo != 0 || (cNo >=1  && cNo <= 10)) {
			System.out.println("Contact No is Valid");
			return true;
		} else {
			System.out.println("Contact No is Invalid");
			return false;
		}
	}
	@SuppressWarnings("unused")
	public boolean isValidPass(String pass) {

		if (!pass.isEmpty() || pass != null) {
			System.out.println("Password is Valid");
			return true;
		} else {
			System.out.println("Password is Invalid");
			return false;
		}	}
	
	@SuppressWarnings("unused")
	public boolean isValidNewPass(String NewPass) {
		if (!NewPass.isEmpty() || NewPass != null || (NewPass.length() >= 4 && NewPass.length() <= 8)) {
			System.out.println("Valid Password..");
			return true;
		} else
		{
		   System.out.println("Invalid Pass...try Different..");
			return false;
		}

	}

}
