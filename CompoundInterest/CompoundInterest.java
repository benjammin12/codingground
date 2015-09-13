import java.util.Scanner;

// Author: Ben Xerri
// Objective: Get  user principal and rate 
// Calculate user amount after 24 months

public class CompoundInterest {


	public static void main(String [] args) {


			double principal;
			double amount;
			double rate;

			Scanner input = new Scanner(System.in);

			System.out.print("Enter the principal: " );

			principal = input.nextDouble();

			System.out.print("Enter rate: ");

			rate = input.nextDouble();
	
			for (int month = 1; month <= 24; month ++) {

				amount = principal*Math.pow(1 + rate, month);

				System.out.println("Amount month " + month + ": " + amount);
				System.out.println("Total revenue: " + (amount - principal));
			}



	}



}