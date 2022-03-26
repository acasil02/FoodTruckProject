package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		FoodTruckApp foodTruckApp = new FoodTruckApp();

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// NEEDS WORK
	private void displayMenu() {
		System.out.println("----------------------------------");
		System.out.println("|           Menu                 |");
		System.out.println("|  1: Food Truck List            |");
		System.out.println("|  2: Average Rated Food Trucks  |");
		System.out.println("|  3: Highest Rated Food Trucks  |");
		System.out.println("|           Quit                 |");
		System.out.println("----------------------------------");
	}

	private boolean menuChoice(Scanner sc) {
		boolean keepDisplaying = true;
		while (keepDisplaying) {
			displayMenu();
			int selection = sc.nextInt();
			switch (selection) {

			
			// ENTER FOOD TRUCK LIST VARIABLE, AVERAGE, HIGH, QUIT
			case 1:
				System.out.println("trucks");
				keepDisplaying = false;
				return true;
			case 2:
				System.out.println("Average");
				keepDisplaying = false;
				return true;
			case 3:
				System.out.println("Highest");
				keepDisplaying = false;
				return true;
			default:
				System.out.println("Please enter a valid option");
				break;

			}
		}
		return true;
	}

	public boolean quit(Scanner sc) {
		boolean quit = true;
		System.out.println("Thank you!");
		return quit;
	}

}
// this ones has menu, rating, display trucks