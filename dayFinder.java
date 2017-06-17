package BirthDay;
import java.util.Calendar;
public class dayFinder {

		  public static String dayOfWeek(int m, int d, int y)
		    { 
		    	checkDate check = new checkDate();
		    	boolean validating = check.checkingDate(m, d, y);
		    	
		    if (validating)
		    {
		    	String dayOfTheWeek = "";
		    	 Calendar calDate = Calendar.getInstance();
		    	 calDate.set(y, m, d);
		 	    
		 	    int dc=calDate.get(Calendar.DAY_OF_WEEK)+4;
		 	    if(dc>7){
		 	    	dc=dc-7;
		 	    }
		    	
		        try{
		        	 if (dc== Calendar.SUNDAY) {
		        	  dayOfTheWeek = "Sunday";
		        	}
		        	else if (dc== Calendar.MONDAY) {
		        	  dayOfTheWeek = "Monday";
		        	}
		        	else if (dc == Calendar.TUESDAY) {
		        	  dayOfTheWeek = "Tueday";
		        	}
		        	else if (dc == Calendar.WEDNESDAY) {
		        	  dayOfTheWeek = "Wednesday";
		        	}
		        	else if (dc == Calendar.THURSDAY) {
		        	  dayOfTheWeek = "Thurday";
		        	}
		        	else if (dc == Calendar.FRIDAY) {
		        	  dayOfTheWeek = "Friday";
		        	}
		        	else if (dc == Calendar.SATURDAY) {
		        	  dayOfTheWeek = "Saturday";
		        	}

		            System.out.println("You were born on " + dayOfTheWeek);
		        }
		        catch(Exception e)
		        {
		            System.out.println("Invalid date was entered");
		        }
		        
		        return dayOfTheWeek;
		    }
		    else {
		    	System.out.println ("Cannot Determine Day of the Week");
		    	return "0";
		    }
		    	
		    }
	}
