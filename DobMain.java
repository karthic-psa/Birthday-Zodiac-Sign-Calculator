package BirthDay;

import java.io.*;
import java.util.*;
import java.text.*;

public class DobMain {
	
	
	public static void main(String args[]) {
	
		// Prompt the user to enter his/her Date of Birth to check and verify.
		System.out.println("Enter Date Of Birth in the format mm/dd/yyyy");
		SimpleDateFormat dob = new SimpleDateFormat("mm/dd/yyyy");
		Scanner data = new Scanner(System.in);
	    String DateInput=data.nextLine();  
	    int month = 0;
	    int day = 0;
	    int year = 0;
	    try {
	    	String date[]= DateInput.split("/");
	        month=Integer.parseInt(date[0]);
	        day=Integer.parseInt(date[1]);
	        year=Integer.parseInt(date[2]);
	    }
    catch(Exception e){
	    	System.out.println("Exception found" + e);
	    }
        Calendar calDate = Calendar.getInstance();
	    calDate.set(year, month, day);
	    checkDate check = new checkDate();
	    boolean validating = check.checkingDate(month, day, year);
	    System.out.println("Date is valid: " + validating);
	    dayFinder dow = new dayFinder();
	    dow.dayOfWeek(month, day, year);
	    zodiacSign z = new zodiacSign();
	    String zodiac = z.zodaicSign(month, day);
	    System.out.println("Your Zodiac sign is:" + zodiac);
	    	
  	
		}
}

