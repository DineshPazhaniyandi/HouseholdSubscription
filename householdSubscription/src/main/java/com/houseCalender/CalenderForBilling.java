package com.houseCalender;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.householdSubscription.data.SubscriptionData;

/** 
 * 
 * This class used for Calendar to get weekdays count , Saturday count and Sunday count for billing.
 * 
 * */

public class CalenderForBilling {
	
public static int sundayInMonth() throws Exception {
	 SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	 SubscriptionData dateValue = new SubscriptionData();
    
	
		 String dateInString = dateValue.getStartDate();
	     Date startDate= sdf.parse(dateInString);
		
		String dateInString2 = dateValue.getEndDate();
	     Date endDate = sdf.parse(dateInString2);
	     
		
		Calendar startCal = Calendar.getInstance();
	      startCal.setTime(startDate);

	      Calendar endCal = Calendar.getInstance();
	      endCal.setTime(endDate);

	      int sundayCount = 0;

	      if (startCal.getTimeInMillis() > endCal.getTimeInMillis())
	      {
	        startCal.setTime(endDate);
	        endCal.setTime(startDate);
	      }

	      while (startCal.getTimeInMillis() <= endCal.getTimeInMillis()) {
	    	    if (startCal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {

	    	    	sundayCount++;
	    	    }

	    	    startCal.add(Calendar.DAY_OF_MONTH, 1);
	    	}
	      
	      return sundayCount;
	    
		
	}
	




	public static int saturdayInMonth() throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		 SubscriptionData dateValue = new SubscriptionData();
	    
		
			 String dateInString = dateValue.getStartDate();
		     Date startDate= sdf.parse(dateInString);
			
			String dateInString2 = dateValue.getEndDate();
		     Date endDate = sdf.parse(dateInString2);
		
		Calendar startCal = Calendar.getInstance();
	      startCal.setTime(startDate);

	      Calendar endCal = Calendar.getInstance();
	      endCal.setTime(endDate);

	      int saturdayCount = 0;

	      if (startCal.getTimeInMillis() > endCal.getTimeInMillis())
	      {
	        startCal.setTime(endDate);
	        endCal.setTime(startDate);
	      }

	      while (startCal.getTimeInMillis() <= endCal.getTimeInMillis()) {
	    	    if (startCal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {

	    	    	saturdayCount++;
	    	    }

	    	    startCal.add(Calendar.DAY_OF_MONTH, 1);
	    	}
	      
	      return saturdayCount;
	}




	public static int weekdaysInMonth() throws Exception
	{
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		 SubscriptionData dateValue = new SubscriptionData();
	    
		
			 String dateInString = dateValue.getStartDate();
		     Date startDate= sdf.parse(dateInString);
			
			String dateInString2 = dateValue.getEndDate();
		     Date endDate = sdf.parse(dateInString2);
		
		Calendar startCal = Calendar.getInstance();
	      startCal.setTime(startDate);

	      Calendar endCal = Calendar.getInstance();
	      endCal.setTime(endDate);

	      int workDaysCount = 0;

	      if (startCal.getTimeInMillis() > endCal.getTimeInMillis())
	      {
	        startCal.setTime(endDate);
	        endCal.setTime(startDate);
	      }

	      while (startCal.getTimeInMillis() <= endCal.getTimeInMillis()) {
	    	    if (startCal.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY &&
	    	        startCal.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY) {

	    	    	workDaysCount++;
	    	    }

	    	    startCal.add(Calendar.DAY_OF_MONTH, 1);
	    	}
	      
	      return workDaysCount;
	    
		
	}

}
