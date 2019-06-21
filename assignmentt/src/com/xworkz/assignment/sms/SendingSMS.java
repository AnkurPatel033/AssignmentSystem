package com.xworkz.assignment.sms;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class SendingSMS {
	
	
	public String sendPin()
	{
	 try {
         URL url = new URL("https://smsapi.engineeringtgr.com/send/?Mobile=9737514349&Password=xxxxxx&Message=test&To=xxxxxxxxxx&Key=xxxxxxxxxxxxxx");
         URLConnection urlcon = url.openConnection();
         InputStream stream = urlcon.getInputStream();
         int i;
         String response="";
         while ((i = stream.read()) != -1)
         {
             response+=(char)i;
         }
         if(response.contains("success")){
             System.out.println("Successfully send SMS");
             //your code when message send success
         }else{
             System.out.println(response);
             //your code when message not send
         }
     } catch (IOException e)
	 {
         System.out.println(e.getMessage());
     }
	return null;
	}
}