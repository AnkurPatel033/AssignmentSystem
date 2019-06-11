package com.xworkz.assignment.dto.assignis;

import java.io.Serializable;


public class AssignisDTO implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7852466871212663802L;
	private int pin;
	private String email;
	
	public AssignisDTO() {
		System.out.println("Created:"+this.getClass().getSimpleName());
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "AssignisDTO [pin=" + pin + ", email=" + email + "]";
	}
	
	

}
