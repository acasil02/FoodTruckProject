package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	private static int nextTruckId;
	private String name;
	private String foodType;
	private double rating;
	private int idGenerator = 1;
	private int truckId;

	
	
	public FoodTruck() {
	}

	public FoodTruck(String name, String foodType, double rating) {
		this.name = name;
		this.foodType = foodType;
		this.rating = rating;
		this.truckId = idGenerator;
		idGenerator++;
		
	}

	public static int getNextTruckId() {
		return nextTruckId;
	}

	public static void setNextTruckId(int nextTruckId) {
		FoodTruck.nextTruckId = nextTruckId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}
	
	public String toString() {
		return "FoodTruck [name = " + name + ", foodType = " + foodType +
				", rating = " + rating + ", truckId = " + truckId
				+ "]";
	}

	

}
