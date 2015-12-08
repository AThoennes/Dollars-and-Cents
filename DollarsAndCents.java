/*
 * By: Alexander Thoennes
 * September 14, 2015
 * 
 * This program asks the user to enter a number of pennies,
 * nickels, dimes, and quarters. It then calculates the 
 * amount of money you have in US dollars.
 */

import java.util.Scanner;
public class DollarsAndCents {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args){
		// The following constants are the values of each coin
		final int PENNY_VALUE = 1;
		final int NICKEL_VALUE = 5;
		final int DIME_VALUE = 10;
		final int QUARTER_VALUE = 25;
		final int DOLLAR_VALUE = 100;
		
		// Declare the variables that contain the amount of each coin
		int pennyAmt, nickelAmt, dimeAmt, quarterAmt, totalAmount, totalDollars, totalChange;
		
		// ask for pennies
		pennyAmt = getIntFromUser("Enter the number of pennies: ");
		
		//ask for nickels
		nickelAmt = getIntFromUser("Enter the number of nickels: ");
		
		//ask for dimes
		dimeAmt = getIntFromUser("Enter the number of dimes: ");
		
		//ask for quarters
		quarterAmt = getIntFromUser("Enter the number of quarters: ");
		
		//now calculate
		totalAmount = (pennyAmt*PENNY_VALUE) + (nickelAmt*NICKEL_VALUE) + (dimeAmt*DIME_VALUE) + (quarterAmt*QUARTER_VALUE);
		totalDollars = totalAmount/DOLLAR_VALUE;
		totalChange = totalAmount%DOLLAR_VALUE;
		
		//finally display all the amounts
		System.out.println("\nPennies: " + pennyAmt);
		System.out.println("Nickels: " + nickelAmt);
		System.out.println("Dimes: " + dimeAmt);
		System.out.println("Quarters: " + quarterAmt);
		System.out.println("\nIn total, you have $" + totalDollars + "." + totalChange);
	}
	
	   /*
	    * This method takes in a String prompt to be printed
	    * then reads in the number the user enters
	    */
	   private static int getIntFromUser(String prompt)
	   {
	      System.out.print(prompt);    // Prompt user to enter input value
	      return input.nextInt();   // Read and return user's response
	   }


}
