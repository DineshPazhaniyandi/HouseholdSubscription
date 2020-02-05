package com.householdSubscription.books;

import com.houseCalender.CalenderForBilling;
import com.householdSubscription.data.SubscriptionData;


/** 
 * 
 * This class implements Interface methods from Newspaper to define the logic. 
 * 
 * */

public class NewspaperType implements Newspaper {
	
	SubscriptionData data = new SubscriptionData();
	double monthlyPrice;
	
	
	/** 
	 * 
	 * This method validate type of newspaper and its price, then it return the amount for month.
	 * 
	 * */
	public double newspaper(String paperA) throws Exception {
		
		
		
		if (paperA.equalsIgnoreCase(data.getNewsPaperA())) {
			
			double monthlyPrice = data.getToiWeekdayPrice() * CalenderForBilling.weekdaysInMonth()  + data.getToiSaturdayPrice() * CalenderForBilling.saturdayInMonth()  + data.getToiSundayPrice() *  CalenderForBilling.sundayInMonth();
			return monthlyPrice;	
		}
		
		
		else if(paperA.equalsIgnoreCase(data.getNewsPaperB())) {
			double monthlyPrice = data.getHinduWeekdayPrice() * CalenderForBilling.weekdaysInMonth() + data.getHinduSaturdayPrice() * CalenderForBilling.saturdayInMonth()+ data.getHinduSundayPrice() *  CalenderForBilling.sundayInMonth();
			return monthlyPrice;
		}
		else if(paperA.equalsIgnoreCase(data.getNewsPaperC())) {
			double monthlyPrice = data.getEtWeekdayPrice() * CalenderForBilling.weekdaysInMonth()+ data.getEtSaturdayPrice() * CalenderForBilling.saturdayInMonth() + data.getEtSundayPrice() * CalenderForBilling.sundayInMonth();
			return monthlyPrice;
		}
		else if(paperA.equalsIgnoreCase(data.getNewsPaperD())) {
			double monthlyPrice = data.getBmWeekdayPrice() * CalenderForBilling.weekdaysInMonth()+ data.getBmSaturdayPrice() * CalenderForBilling.saturdayInMonth() + data.getBmSundayPrice() * CalenderForBilling.sundayInMonth();
			return monthlyPrice;
		}
		else if(paperA.equalsIgnoreCase(data.getNewsPaperE())) {
			double monthlyPrice = data.getHtWeekdayPrice() * CalenderForBilling.weekdaysInMonth() + data.getHtSaturdayPrice() * CalenderForBilling.saturdayInMonth() + data.getHtSundayPrice() * CalenderForBilling.sundayInMonth();
			return monthlyPrice;
		}
		else {
			return 0;
		}
		
	
	
	}
	
}
