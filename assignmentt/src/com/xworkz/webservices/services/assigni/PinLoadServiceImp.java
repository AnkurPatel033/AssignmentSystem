package com.xworkz.webservices.services.assigni;

import org.springframework.stereotype.Service;

@Service
public class PinLoadServiceImp implements PinLoadService {

	/*@Autowired
	private PinLoadDAO dao;*/
	
	public PinLoadServiceImp() {
		System.out.println("Created:"+this.getClass().getSimpleName());
	}
	
	@Override
	public void getAllPin() {
		System.out.println("Calling GetAllPin() from Rest Service..");
		/*dao.getAllPin();*/

	}

}
