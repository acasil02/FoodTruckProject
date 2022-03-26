package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		FoodTruckApp foodTruckApp = new FoodTruckApp();
		FoodTruck[] foodTrucks = new FoodTruck[5];
		foodTruckApp.beginApp(foodTrucks, sc);
	}

	private void beginApp(FoodTruck[] foodTrucks, Scanner sc) {
		foodTrucks = createTrucks(foodTrucks, sc);
		menuChoice(foodTrucks, sc);
	}

	private FoodTruck[] createTrucks(FoodTruck[] foodTrucks, Scanner sc) {
		Scanner input = sc;
		System.out.println("Welcome to the Best Food Truck App!");
		System.out.println("Lets get started creating your food trucks!");

		for (int i = 0; i <= foodTrucks.length; i++) {
			System.out.println("Enter a name for you food truck: ");
			String foodTruckName = input.nextLine();
			if (foodTruckName.equals("quit")) {
				break;
			}
			System.out.println("What food type will you serve?");
			String foodTruckType = input.nextLine();
			System.out.println("What rating is the food truck?");
			double foodTruckRating = input.nextDouble();
			input.nextLine();
			foodTrucks[i] = new FoodTruck(foodTruckName, foodTruckType, foodTruckRating);
			System.out.println("Food Truck has been created!");
		}
		return foodTrucks;
	}

	private void displayMenu() {
		System.out.println("----------------------------------");
		System.out.println("|           Menu                 |");
		System.out.println("|  1: Food Truck List            |");
		System.out.println("|  2: Average Rated Food Trucks  |");
		System.out.println("|  3: Highest Rated Food Trucks  |");
		System.out.println("|  4: Quit                       |");
		System.out.println("----------------------------------");
	}

	private boolean menuChoice(FoodTruck[] foodTrucks, Scanner sc) {
		Scanner menuInput = sc;
		boolean keepDisplaying = true;
		while (keepDisplaying) {
			displayMenu();
			int selection = menuInput.nextInt();
			switch (selection) {
			case 1:
				displayAllFoodTrucks(foodTrucks);
				break;
			case 2:
				getAverageRating(foodTrucks);
				break;
			case 3:
				getHighestRating(foodTrucks);
				break;
			case 4:
				System.out.println("Exiting, Thank you!");
				return false;
			default:
				System.out.println("Please enter a valid option. Enter 1-4");
				break;
			}
		}
		return keepDisplaying;
	}

	private void displayAllFoodTrucks(FoodTruck[] foodTrucks) {
		for (int i = 0; i < foodTrucks.length; i++) {
			if (foodTrucks[i] != null) {
				System.out.println(foodTrucks[i].toString());
			}
		}
	}

	private void getAverageRating(FoodTruck[] foodTrucks) {
		double ratingTotal = 0.0;
		int amountOfFoodTrucks = 0;
		for (int i = 0; i < foodTrucks.length; i++) {
			if (foodTrucks[i] != null) {
				ratingTotal += foodTrucks[i].getRating();
				amountOfFoodTrucks++;
			}
		}
		double averageRating = ratingTotal / amountOfFoodTrucks;
		System.out.println("The average rating for all trucks is: " + averageRating);
	}

	private void getHighestRating(FoodTruck[] foodTrucks) {
		double highestRating = 0;
		int highestTruckIndex = 0;
		for (int i = 0; i < foodTrucks.length; i++) {
			if (foodTrucks[i] != null && foodTrucks[i].getRating() > highestRating) {
				highestRating = foodTrucks[i].getRating();
				highestTruckIndex = i;
			}
		}
		System.out.println(foodTrucks[highestTruckIndex].toString());
	}
}
