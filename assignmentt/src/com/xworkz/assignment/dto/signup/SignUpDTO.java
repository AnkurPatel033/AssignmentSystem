package com.xworkz.assignment.dto.signup;

import java.io.Serializable;

public class SignUpDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2029884926500769922L;
	private String fname;
	private String lname;
	private String email;
	private int code;
	private long cno;
	

	public SignUpDTO() {
    
		System.out.println("Created:"+this.getClass().getSimpleName());

	}
	
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public long getCno() {
		return cno;
	}

	public void setCno(long cno) {
		this.cno = cno;
	}

	@Override
	public String toString() {
		return "SignUpDTO [fname=" + fname + ", lname=" + lname + ", email=" + email + ", code=" + code + ", cno=" + cno
				+ "]";
	}

	
	

}
