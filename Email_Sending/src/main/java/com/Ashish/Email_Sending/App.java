package com.Ashish.Email_Sending;

import com.sourceEmail.GEmailSender;

public class App 
{
    public static void main( String[] args )
    {
	    GEmailSender gEmailSender = new GEmailSender();
	    String to = "akchaurasia4g@gmail.com";
		String from = "goluchaurasiya4256@gmail.com";
		String text = "Sending Email using Gmail";
		String subject = "This is a Example email send using gmail and java.";
		boolean b = gEmailSender.sendEmail(to, from, subject, text);
		if(b) {
			System.out.println("Email is send Successfully.");
		}
		else {
			System.out.println("There is problem in sending Email.");
		}
	}
}
