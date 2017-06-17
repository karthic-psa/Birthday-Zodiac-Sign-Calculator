package BirthDay;

public class checkDate {
	public static boolean checkingDate(int m, int d, int y)
    {
    	boolean val=true;
   	try{
       boolean leapYear=false;
          
       if (d>=1 && d<=31 && m>=1 && m<=12) {
       if((y % 100 != 0) && (y % 4 == 0)||(y % 400 == 0))
       {
            leapYear=true;
       }
       
       if(leapYear==true && m==2)
    {
        if(d>29)
          return false;
    }
    else if(leapYear==false && m==2)
    {
        if(d>28)
          return false;
    }

    
       if(m==4||m==6||m==9||m==11)
           {
               if(d>30)
                   return false;
           }
           else if(m==1||m==3||m==5||m==7||m==8||m==10||m==12)
           {
               if(d>31)
                   return false;
           }
       }
   	
   	else {
   		return false;
   	}
   	}
   	catch(Exception e){
    	System.out.println("Exception found" + e);
    	System.out.println("Invalid date was entered");
    }
	return val;  
    
}
}
