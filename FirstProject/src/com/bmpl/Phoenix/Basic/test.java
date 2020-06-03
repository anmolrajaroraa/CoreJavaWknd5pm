package com.bmpl.Phoenix.Basic;

public class test {

	public static void main(String[] args) {
		
		try{
			int balance = 10000;
		
			int amountToWithdraw = 11000;
			
			if(balance < amountToWithdraw) {
				throw new Exception();
			}
		}
		catch(Exception e) {
			System.out.println("error..");
		}
		
		System.out.println("Here's your receipt...");

	}

}
