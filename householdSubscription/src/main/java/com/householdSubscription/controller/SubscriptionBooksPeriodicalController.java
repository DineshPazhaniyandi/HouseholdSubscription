package com.householdSubscription.controller;

import com.householdSubscription.books.Newspaper;
import com.householdSubscription.books.NewspaperType;

/** 
 * 
 * This class act as controller from View layer for household subscription, right now Newspaper. 
 * In future if we add Diary product then it will take to diary based an input.
 * 
 * */

public class SubscriptionBooksPeriodicalController {
	
	/** 
	 * 
	 * This method check data from user is not empty
	 * 
	 * */
	
	public double newsPapertype(String subscriiptionType) throws Exception {
		double returnValue =0;
		
		if(subscriiptionType instanceof String)  {
			
			
			
			Newspaper paperType=new NewspaperType();
			returnValue = paperType.newspaper(subscriiptionType);	
			
			return returnValue;
			
			
		}
		
		else {
			
			return returnValue ;
		}
		
	}
	
}
