package com.householdSubscription.books;

import com.householdSubscription.data.SubscriptionData;

public class NewspaperType implements Newspaper {
	
	SubscriptionData data = new SubscriptionData();
	double monthlyPrice;
	public double newspaper(String paperA) {
		
		
		
		if (paperA.equalsIgnoreCase(data.getNewsPaperA())) {
			
			double monthlyPrice = data.getToiWeekdayPrice() + data.getToiSaturdayPrice() + data.getToiSundayPrice();
			return monthlyPrice;	
		}
		
		
		else if(paperA.equalsIgnoreCase(data.getNewsPaperB())) {
			double monthlyPrice = data.getHinduWeekdayPrice() + data.getHinduSaturdayPrice() + data.getHinduSundayPrice();
			return monthlyPrice;
		}
		else if(paperA.equalsIgnoreCase(data.getNewsPaperC())) {
			double monthlyPrice = data.getEtWeekdayPrice()+ data.getEtSaturdayPrice() + data.getEtSundayPrice();
			return monthlyPrice;
		}
		else if(paperA.equalsIgnoreCase(data.getNewsPaperD())) {
			double monthlyPrice = data.getBmWeekdayPrice()+ data.getBmSaturdayPrice() + data.getBmSundayPrice();
			return monthlyPrice;
		}
		else if(paperA.equalsIgnoreCase(data.getNewsPaperE())) {
			double monthlyPrice = data.getHtWeekdayPrice()+ data.getHtSaturdayPrice()+ data.getHtSundayPrice();
			return monthlyPrice;
		}
		else {
			return 0;
		}
		
	
	
	}
	
	public void newspaper(String paperA,String paperB) {
		
		
		
	}
	
	public void newspaper(String paperA,String paperB,String paperC ) {
		
	}
	
	public void newspaper(String paperA,String paperB,String paperC, String paperD ) {
		
	}
	
	public void newspaper(String paperA,String paperB,String paperC, String paperD,String paperE ) {
		
	}

}
