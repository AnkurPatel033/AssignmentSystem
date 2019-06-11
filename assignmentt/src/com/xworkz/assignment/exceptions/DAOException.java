package com.xworkz.assignment.exceptions;

public class DAOException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5063818878811775605L;

	public DAOException(String msg) {
		super(msg);
		System.out.println("DAO Exception Occured..");
	}
	

}
