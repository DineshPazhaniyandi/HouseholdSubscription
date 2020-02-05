package com.householdSubscription.view;

import com.householdSubscription.controller.SubscriptionBooksPeriodicalController;

/** 
 * 
 * This class is view layer which gets info from user for Household newspaper subscription.
 * 
 * */
public class SubscriptionInfo {

	public static void main(String[] args) throws Exception {
		
		double totalPrice =0.0;
        SubscriptionBooksPeriodicalController ref =new SubscriptionBooksPeriodicalController();
		
		String paperSelect ="toi";
		
		totalPrice = ref.newsPapertype(paperSelect);
		
		if(totalPrice != 0) {
		
		System.out.println("******Household Subscription Info******");
		
		
		System.out.println("Paper subscribed for month is: "+ paperSelect);
		
		System.out.println("Total Price for month is: "+ totalPrice);
		
		
		System.out.println("******Thanks for subscription******");
		
		}
		else {
			System.out.println("Kindly provide valid input or some exception occured");
		}
		
		
		
		

	}

}
