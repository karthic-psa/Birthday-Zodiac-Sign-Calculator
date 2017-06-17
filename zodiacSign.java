package BirthDay;

public class zodiacSign {
	 public static String zodaicSign(int m, int d) {
	    	
	    	String zodiac = "";
	    	try{
	    	if      ((m == 12 && d >= 22 && d <= 31) || (m ==  1 && d >= 1 && d <= 19))
	            zodiac="Capricorn";
	        else if ((m ==  1 && d >= 20 && d <= 31) || (m ==  2 && d >= 1 && d <= 17))
	        	zodiac="Aquarius";
	        else if ((m ==  2 && d >= 18 && d <= 29) || (m ==  3 && d >= 1 && d <= 19))
	        	zodiac="Pisces";
	        else if ((m ==  3 && d >= 20 && d <= 31) || (m ==  4 && d >= 1 && d <= 19))
	        	zodiac="Aries";
	        else if ((m ==  4 && d >= 20 && d <= 30) || (m ==  5 && d >= 1 && d <= 20))
	        	zodiac="Taurus";
	        else if ((m ==  5 && d >= 21 && d <= 31) || (m ==  6 && d >= 1 && d <= 20))
	        	zodiac="Gemini";
	        else if ((m ==  6 && d >= 21 && d <= 30) || (m ==  7 && d >= 1 && d <= 22))
	        	zodiac="Cancer";
	        else if ((m ==  7 && d >= 23 && d <= 31) || (m ==  8 && d >= 1 && d <= 22))
	        	zodiac="Leo";
	        else if ((m ==  8 && d >= 23 && d <= 31) || (m ==  9 && d >= 1 && d <= 22))
	        	zodiac="Virgo";
	        else if ((m ==  9 && d >= 23 && d <= 30) || (m == 10 && d >= 1 && d <= 22))
	            zodiac="Libra";
	        else if ((m == 10 && d >= 23 && d <= 31) || (m == 11 && d >= 1 && d <= 21))
	        	zodiac="Scorpio";
	        else if ((m == 11 && d >= 22 && d <= 30) || (m == 12 && d >= 1 && d <= 21))
	        	zodiac="Sagittarius";
	        else
	        	zodiac="Date not valid. Please check the date you entered";
	    	}
	    	catch(Exception e)
	        {
	            System.out.println("Invalid Date");
	        }
			return zodiac;
	    	
	    }

	}
