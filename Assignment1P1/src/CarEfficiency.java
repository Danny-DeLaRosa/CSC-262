/**
 * Fuel Efficiency Calculator.
 **/

import java.util.Scanner; // must be imported for user input
public class CarEfficiency {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // User input
		
		// User is prompted and input is stored in following variables
		final int tankCapacity = 20;
		System.out.print("Gallons of gas in tank: ");
		double gallons = in.nextDouble(); 
		System.out.print("Fuel efficiency (in mpg): ");
		double fuelEfficiency = in.nextDouble();
		System.out.print("Price per gallon: ");
		double pricePerGallon = in.nextDouble();
		
		// cost to drive 100 miles
		int miles = 100;
		double drive100 = (miles / fuelEfficiency) * pricePerGallon ;
		System.out.printf("The cost to drive one hundred miles is: $%.2f%n" , drive100);
		
		// how far the car can go with the existing gas in the tank
		int distance = (int) gallons * (int) fuelEfficiency;
		System.out.println("Your car can travel rougly " + distance + " miles with a full tank");
		
		// cost of adding additional gas to the existing amount to fill the tank
		System.out.print("Miles driven: ");
		double trip = in.nextDouble();
		double gasConsumed = trip / fuelEfficiency;
		gallons -= gasConsumed;
		double costToFill = (tankCapacity - gallons) * pricePerGallon;
		System.out.printf("The cost to fill your tank is: $%.2f%n", costToFill);
		
	}

}
