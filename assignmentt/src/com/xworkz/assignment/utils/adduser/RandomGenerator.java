package com.xworkz.assignment.utils.adduser;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Component;

import com.xworkz.assignment.entities.createAssignment.CreateAssignmentEntity;  

@Component
public class RandomGenerator {  

	String number = "123467890";
	char sy[] = { ':', '?', '/', '%', '#', '@', '^', '&', ';' };
	String ch = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRTUVWXYZ";
	
	public String geneartePass()
	{
		// generate random pass/string
		String randomChar = RandomStringUtils.random(4, ch);
		String symbol = RandomStringUtils.random(1, sy);
		String no = RandomStringUtils.random(3, number);

		String randpass = randomChar + symbol + no;
		
		return randpass;
	}
	public Long genearteAssignmentNumber(CreateAssignmentEntity entity)
	{
		// generate random pass/string
		String randomNumber = RandomStringUtils.random(4, number);	
		Long randomNo=Long.parseLong(randomNumber);
		return randomNo;
	}
	
	
}