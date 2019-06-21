package com.xworkz.assignment.sms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.stereotype.Service;
import java.util.Random;
@Service
public class SendingSMS {
	public String sending() {
		System.out.println("invoked SMS Application..");
		try {
			// Construct data
			String apiKey = "apikey=" + "GidHDwFlt0A-iRLWMOFiDa7poDz5ccuWZaxs6bSWvi";
			
			Random rand=new Random(9999);
			
			long OTP=rand.nextInt();
			
			String message = "&message=" + "Hey Ankur Your OTP:"+OTP;
			String sender = "&sender=" + "X-workz_AMS";
			String numbers = "&numbers=" + "919737514379";
			
			// Send data
			HttpURLConnection conn = (HttpURLConnection) new URL("https://api.textlocal.in/send/?").openConnection();
			String data = apiKey + numbers + message + sender;
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Length", Integer.toString(data.length()));
			conn.getOutputStream().write(data.getBytes("UTF-8"));
			final BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			final StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = rd.readLine()) != null) {
				stringBuffer.append(line);
			}
			rd.close();
			System.out.println("OTP send sucessfully..");
			return stringBuffer.toString();
		} catch (Exception e) {
			System.out.println("Error SMS "+e);
			return "Error "+e;
		}
	}
}
	