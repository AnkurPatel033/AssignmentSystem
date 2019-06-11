package com.xworkz.webservices.dao.assigni;

import org.springframework.stereotype.Repository;

@Repository
public class PinLoadDAOImp implements PinLoadDAO {

	
	
	public PinLoadDAOImp() {
		System.out.println("Created:"+this.getClass().getSimpleName());
	}
	
	@Override
	public void getAllPin() {
		System.out.println("Calling from getAllPin() from Rest DAO... ");
	}

}
