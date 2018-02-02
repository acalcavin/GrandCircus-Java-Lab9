import java.util.ArrayList;
import java.util.Scanner;

/*
 *  Andrew Calabro-Cavin
 *  Hold details about cars in a Car class
 *  use ArrayList
 *  format output using printf
 *  use ValidatorCar class
 */

public class CarApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String make;
		String model;
		int year;
		double price;
				 
		System.out.println("Welcome to the Grand Circus Motors admin console!\n");
		
		int numberOfCars = ValidatorCar.getInt(scan, "How many cars will you be entering? ");
		
		
		// use an ArrayList to hold the cars
		ArrayList<Car> inventory = new ArrayList<Car>();
		
		// cycle through ArrayList. For each index, create Car object, populate the object with input values
		// use ValidatorCar class to prompt user, validate, return value
		for (int i = 0; i < numberOfCars; i++) {
			
			make = ValidatorCar.getString(scan, "Please enter Car #" + (i+1) + " make: ");
			
			model = ValidatorCar.getString(scan, "Please enter Car #" + (i+1) + " model: ");
			
			year = ValidatorCar.getInt(scan, "Please enter Car #" + (i+1) + " year: ", 1900, 2018);
			
			price = ValidatorCar.getDouble(scan, "Please enter Car #" + (i+1) + " price: ");
			
			inventory.add(new Car(make, model, year, price));
			System.out.println();
			
		}
	
		System.out.println("Current Inventory: ");
						
		// use a for loop to cycle through array, print out each car object's values
		for (int i = 0; i < inventory.size(); i++) {
			String makeP = inventory.get(i).getMake();
			String modelP = inventory.get(i).getModel();
			int yearP = inventory.get(i).getYear();
			double priceP = inventory.get(i).getPrice();
			
			System.out.printf("%-12s%-12s%-12s$%-12.2f\n", makeP, modelP, yearP, priceP);
		}
				
	}

}
