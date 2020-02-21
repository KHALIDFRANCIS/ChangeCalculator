package projects;

import java.util.Scanner;

import java.math.RoundingMode;
//import java.util.Random;
import java.text.*;

public class ChangeCalc {
	
	public static void main(String[] args) {
	
		
		Scanner Scan = new Scanner(System.in);

	double price = 0.0;
	
	double taxprice = 0.00;;
	
	double pocket = 0.00;
	double change = price - pocket ;
	
	String State = ".";
	String Stateline = ".";

	
	DecimalFormat pricecents = new DecimalFormat("#.##");
	DecimalFormat changeout = new DecimalFormat(" ");
	
	
	System.out.println("How much money do you have? ");
//	You can't possibly have more than $1000...
	
	pocket = Scan.nextDouble();
	
	
	System.out.println("How much does the item cost? ");
	
	price = Scan.nextDouble();
	
	System.out.println("What state do you live in?");
	System.out.println("Eg. NY for New York, NJ for New Jersey, etc \n");
	
//	try {
	Scanner Statename = new Scanner(System.in);
	
	Stateline = Statename.nextLine();
	
	State = Stateline.toUpperCase();
	
		
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
	
//			================================sales tax code ends here=============================	
		 
	System.out.println("Because of the sales tax in your state, ");
	System.out.println("your price before taxes is " + pricecents.format(price));
	System.out.println("your new price after taxes is " + pricecents.format(taxprice));
	System.out.println("");
	
	if (taxprice > pocket) {
		System.out.println("The cost of this item is " + pricecents.format(taxprice) + ".");
		System.out.println("Insufficient funds, return to your residence and get more funds.");
	}else { 
		System.out.println("Transaction Complete");
	
	change = pocket - taxprice;
	
	System.out.print("Since you have $" + pricecents.format(pocket));
	System.out.println(" and this item costs $" + pricecents.format(taxprice) + ","); 
	
	System.out.println("$" + pricecents.format(change) + " is your change. You will get back: ");
	
	
	changeout.setRoundingMode(RoundingMode.DOWN);  // this changeout method will round down the decimal value to just 
	
	
	double hundred = (change / 100.00) ;  	//this divides out the hundreds
	if (hundred < 0.99) {	//if there is no hundreds to be given as change
	System.out.print("");
	}
	if (hundred > 0.99 && hundred < 1.99) {	//if there is only one hundred to be given as change
	System.out.println(changeout.format(hundred) + " hundred dollar bill,");	
	} 
	if (hundred > 1.99) {						//if there is 2 or more hundreds to be given as change
	System.out.println(changeout.format(hundred) + " hundreds dollar bills,");	
	}
	double hundred_rm = change % 100.00;
	
	
	double fifty = (hundred_rm / 50.00);  	//this divides out the fifties
	if (fifty < 0.99) {	//if there is no fifties to be given as change
	System.out.print("");
	}
	if (fifty > 0.99 && fifty < 1.99) {	//if there is only one fifty to be given as change
	System.out.println(changeout.format(fifty) + " fifty dollar bill,");	
	} 
	double fifty_rm = hundred_rm % 50.00;
	
	
	double twenty = (fifty_rm / 20.0);  	//this divides out the twenties
	if (twenty < 0.99) {	//if there is no twenties to be given as change
	System.out.print("");
	}
	if (twenty > 0.99 && twenty < 1.99) {	//if there is only one twenty to be given as change
	System.out.println(changeout.format(twenty) + " twenty dollar bill,");	
	} 
	if (twenty > 1.99 && twenty < 4.99) {						//if there is 2 or more twenties to be given as change
	System.out.println(changeout.format(twenty) + " twenty dollar bills,"); // maximum of 4 can be given back before they add up to the next highest increment	
	}
	double twenty_rm = fifty_rm % 20.0;
	

	double ten = twenty_rm / 10.0;  	//this divides out the tens with the same logic as the fifties function
	if (ten < 0.99) {	//if there is no tens to be given as change
	System.out.print("");
	}
	if (ten > 0.99 && ten < 1.99) {	//if there is only one ten to be given as change
	System.out.println(changeout.format(ten) + " ten dollar bill,");	
	} 
	double ten_rm = twenty_rm % 10.0;
	
	
	double five = ten_rm / 5.0;		//this divides out the fives with the same logic as the fifties function
	if (five < 0.99) {	//if there is no fives to be given as change
	System.out.print("");
	}
	if (five > 0.99 && five < 1.99) {	//if there is only one five to be given as change
	System.out.println(changeout.format(five) + " five dollar bill,");	
	} 
	double five_rm = ten_rm % 5.0;
	
	
	double dollar = five_rm / 1.0;	//this divides out the singles
	if (dollar < 0.99) {	//if there is no singles to be given as change
	System.out.print("");
	}
	if (dollar > 0.99 && dollar < 1.99) {	//if there is only one dollar to be given as change
	System.out.println(changeout.format(dollar) + " single,");	
	} 
	if (dollar > 1.99 && dollar < 4.99) {						//if there is 2 or more singles to be given as change
	System.out.println(changeout.format(dollar) + " singles,");	// maximum of 4 can be given back before they add up to the next highest increment
	}
	double dlr_rm = five_rm % 1.0;
//	System.out.println(dlr_rm);
	
	
	double quarter = dlr_rm / 0.25;	
	if (quarter < 0.99) {	
	System.out.print("");
	}
	if (quarter > 0.99 && quarter < 1.99) {	
	System.out.println(changeout.format(quarter) + " quarter,");	
	} 
	if (quarter > 1.99 && quarter < 3.99) {						
	System.out.println(changeout.format(quarter) + " quarters,");	
	}
	double q_rm = dlr_rm % 0.25;
	
	
	double dime = q_rm / 0.10;	
	if (dime < 0.99) {	
	System.out.print("");
	}
	if (dime > 0.99 && dime < 1.99) {	
	System.out.println(changeout.format(dime) + " dime,");	
	} 
	if (dime > 1.99 && dime < 9.99) {						
	System.out.println(changeout.format(dime) + " dimes,");	
	}
	double d_rm = q_rm % 0.10;
	
	
	double nickel = d_rm / 0.05;	
	if (nickel < 0.99) {	
	System.out.print("");
	}
	if (nickel > 0.99 && nickel < 1.99) {	
	System.out.println(changeout.format(nickel) + " nickel,");	
	} 
	if (nickel > 1.99 && nickel < 4.99) {						
	System.out.println(changeout.format(nickel) + " nickels,");	
	}
	double n_rm = (d_rm % 0.05) * 100.00;
	 
//	n_rm ++;
	System.out.println(pricecents.format(n_rm));
	
	  	
	if (n_rm < 0.99) {	
	System.out.print("");
	}
	if (n_rm > 0.99 && n_rm < 1.99) {	
	System.out.println(changeout.format(n_rm) + " penny,");	
	} 
	if (n_rm > 1.99 && n_rm < 4.99) {						
	System.out.println(changeout.format(n_rm) + " pennies,"); 
	}
	
		
	}	
}
	
}

