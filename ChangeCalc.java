package projects;

import java.util.Scanner;

import java.math.RoundingMode;
import java.util.Random;
import java.text.*;



public class ChangeCalc {
	
	public static void main(String[] args) {
	
		
		Scanner Scan = new Scanner(System.in);
//	double start = 0.0; 	// starting value
//	double end = 1000.00;	// max value 
//	double random = new Random().nextDouble(); 	//randomly generated number
	double price = 0.0;
//	double price 0.0;; 
//									 (1000 - 0)
//	item - price
	
	double taxprice = 0.00;;
	
	double pocket = 0.00;
	double change = price - pocket ;
	
//	String state;

	
	DecimalFormat pricecents = new DecimalFormat("#.##");
	DecimalFormat changeout = new DecimalFormat(" ");
	
	
	System.out.println("How much money do you have? ");
//	You can't possibly have more than $1000...
	
	pocket = Scan.nextDouble();
	
//	try {
	
	
//	pocket = Scan.nextDouble();
//	}
	
//	catch(InputMismatchException e) {
//		System.out.println("Invalid entry...");
//		System.out.println("Entry must be an integer between 0 and 1000");
//	}
	
	System.out.println("How much does the item cost? ");
	
	price = Scan.nextDouble();
	
	System.out.println("What state do you live in?");
	System.out.println("Eg. NY for New York, NJ for New Jersey, etc \n");
	
//	try {
//	Scanner scan = new Scanner(System.in);
	
	String Stateline = Scan.nextLine();
	
	String State = Stateline.toUpperCase();
	
		
//	================================sales tax code starts here=============================		
	
	
		 if	(State.equals("NEW YORK"))
		taxprice = price * 1.0875; 
	else if (State.equals("ALABAMA"))
		taxprice = price * 1.11;
	else if (State.equals("ARIZONA"))
		taxprice = price * 1.0938;
	else if (State.equals("ARKANSAS"))
		taxprice = price * 1.0943;
	else if (State.equals("ALASKA"))
		taxprice = price * 1.7500;
	else if (State.equals("CALIFORNIA"))
		taxprice = price * 1.0725;
	else if (State.equals("COLORADO"))
		taxprice = price * 1.112;
	else if (State.equals("CONNECTICUT"))
		taxprice = price * 1.063;
	else if (State.equals("DELAWARE"))
		taxprice = price * 1.0000;
	else if (State.equals("FLORIDA"))
		taxprice = price * 1.080;
	else if (State.equals("GEORGIA"))
		taxprice = price * 1.090;
	else if (State.equals("HAWAII"))
		taxprice = price * 1.045;
	else if (State.equals("IDAHO"))
		taxprice = price * 1.090;
	else if (State.equals("ILLINOIS"))
		taxprice = price * 1.110;
	else if (State.equals("INDIANA "))
		taxprice = price * 1.070;
	else if (State.equals("IOWA"))
		taxprice = price * 1.0943;     //==============
	else if (State.equals("KANSAS"))
		taxprice = price * 1.106;
	else if (State.equals("KENTUCKY"))
		taxprice = price * 1.060;
	else if (State.equals("LOUISIANA"))
		taxprice = price * 1.0445;
	else if (State.equals("MAINE"))
		taxprice = price * 1.055;
	else if (State.equals("MARYLAND"))
		taxprice = price * 1.06;
	else if (State.equals("MASSACHUSETTS"))
		taxprice = price * 1.0625;
	else if (State.equals("MICHIGAN"))
		taxprice = price * 1.06;
	else if (State.equals("MINNESOTA"))
		taxprice = price * 1.08375;
	else if (State.equals("MISSISSIPPI"))
		taxprice = price * 1.080;
	else if (State.equals("MISSOURI"))
		taxprice = price * 1.1010;
	else if (State.equals("MONTANA"))
		taxprice = price * 1.000;
	else if (State.equals("NEBRASKA"))
		taxprice = price * 1.075;			//=====>>> CONTINUE
	else if (State.equals("NEVADA"))
		taxprice = price * 1.08265;
	else if (State.equals("NEW HAMPSHIRE"))
		taxprice = price * 1.0000;
	else if (State.equals("NEW JERSEY"))
		taxprice = price * 1.06625;
	else if (State.equals("NEW MEXICO"))
		taxprice = price * 1.009625;
	else if (State.equals("NORTH CAROLINA"))
		taxprice = price * 1.0750;
	else if (State.equals("NORTH DAKOTA"))
		taxprice = price * 1.0850;
	else if (State.equals("OHIO"))
		taxprice = price * 1.0800;
	else if (State.equals("OKLAHOMA"))
		taxprice = price * 1.115;
	else if (State.equals("OREGON"))
		taxprice = price * 1.000;
	else if (State.equals("PENNSYLVANIA"))
		taxprice = price * 1.08;
	else if (State.equals("RHODE ISLAND"))
		taxprice = price * 1.07;
	else if (State.equals("SOUTH CAROLINA"))
		taxprice = price * 1.09;
	else if (State.equals("SOUTH DAKOTA"))
		taxprice = price * 1.0650;
	else if (State.equals("TENNESSEE"))
		taxprice = price * 1.0100;
	else if (State.equals("TEXAS"))
		taxprice = price * 1.0825;
	else if (State.equals("UTAH"))
		taxprice = price * 1.087;
	else if (State.equals("VERMONT"))
		taxprice = price * 1.0700;
	else if (State.equals("VIRGINIA"))
		taxprice = price * 1.0700;
	else if (State.equals("WASHINGTON"))
		taxprice = price * 1.1040;
	else if (State.equals("WEST VIRGINIA"))
		taxprice = price * 1.0700;
	else if (State.equals("WISCONSIN"))
		taxprice = price * 1.0560;
	else if (State.equals("WYOMING"))
		taxprice = price * 1.0600;
	else {System.out.println("Invalid entry...");
		System.out.println("Please enter the state for which you would like to calculate sales...");
	}
		 
		
	
//	}
//	catch(Exception e) {
//		System.out.println("Invalid entry...");
//		System.out.println("Entry must be a valid state entry");
//	}
	
	System.out.println("Because of the sales tax in your state, ");
	System.out.println("your price before taxes is " + pricecents.format(price));
	System.out.println("your new price after taxes is " + pricecents.format(taxprice));
	System.out.println("");
	
	if (taxprice > pocket) {
		System.out.println("The cost of this item is higher than what you have." + pricecents.format(price) + ".");
		System.out.println("Insufficient funds, return to your residence and get more funds.");
	}else { 
		System.out.println("Transaction Complete");
	
	change = pocket - taxprice;
	
	System.out.print("Since you have $" + pricecents.format(pocket));
	System.out.println(" and this item costs $" + pricecents.format(taxprice) + ","); 
	
	System.out.println("$" + pricecents.format(change)
	+ " is your change. You will get back ");
	
	
	changeout.setRoundingMode(RoundingMode.DOWN);
	double hundred = (change / 100.00) ;  	//this divides out the hundreds
	if (hundred > 0.6) {
	System.out.println(changeout.format(hundred) + " hundreds,");
	}double hundred_rm = change % 100.00;
	
	double fifty = hundred_rm / 50.00;	//this divides out the fifties  
	if (fifty > 0.6){
	System.out.println(changeout.format(fifty) + " fifties,");
	}double fifty_rm = hundred_rm % 50.00;	//
	
	double twenty = fifty_rm / 20.0;	//this divides out the twenties
	if (twenty > 0.6){
	System.out.println(changeout.format(twenty) + " twenties,");
	}double twenty_rm = fifty_rm % 20.0;
	
	double ten = twenty_rm / 10.0;	//this divides out the tens
	if (ten > 0.6) {
	System.out.println(changeout.format(ten) + " tens,");
	}double ten_rm = twenty_rm % 10.0;
	
	double five = ten_rm / 5.0;		//this divides out the fives
	if (five > 0.6){
	System.out.println(changeout.format(five) + " fives,");
	}double five_rm = ten_rm % 5.0;
	
	double dollar = five_rm / 1.0;	//this divides out the singles
	if (dollar > 0.6){
	System.out.println(changeout.format(dollar) + " singles,");
	}double dlr_rm = five_rm % 1.0;
	
	double quarter = dlr_rm / 0.25; 	//this divides out the quarters
	if (quarter > 0.6){
	System.out.println(changeout.format(quarter) + " quarters,");
	}double q_rm = dlr_rm % 0.25;		// this will return the remainder after dividing out the quarters
	
	double dime = q_rm / 0.10;			//this divides out the dimes
	if (dime > 0.1){
	System.out.println(changeout.format(dime) + " dimes,");
	}double d_rm = q_rm % 0.10;
	
	double nickel = d_rm / 0.05;		//this divides out the nickels
	if (nickel > 0.1){
	System.out.println(changeout.format(nickel) + " nickels,");
	}double n_rm = d_rm % 0.05;
	
	System.out.println(" and \n" + changeout.format(n_rm) + " pennies."); //returns the pennies
		
	}	
}
	
}

