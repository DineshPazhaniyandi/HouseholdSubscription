package com.householdSubscription.controller;

import com.householdSubscription.books.Newspaper;
import com.householdSubscription.books.NewspaperType;

public class SubscriptionBooksPeriodicalController {
	
	public void type(String subscriiptionType) {
		
		if(subscriiptionType instanceof String)  {
			
			double returnValue;
			
			Newspaper paperType=new NewspaperType();
			returnValue = paperType.newspaper(subscriiptionType);	
			
			System.out.println("TOI Monthly Expenses: "+returnValue);
		}
		
		else {
			System.out.println("Invalid Selection or Error");
		}
		
	}

	
	
	
	
	
	
	
}
