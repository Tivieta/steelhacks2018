//package com.example.android.justjava;

public class FoodItem {
	
	private String name;
	private String restaurant = "Generic Restaurant";
	private double cost;
	private int proteinAmount;
	private int carbAmount;
	private int calorieAmount;
	private int sodiumAmount;
	private int totalFat;
	
	public FoodItem(String name, double cost, int protein, int carb, int calorie, int sodium, int fat)
	{
		this.name = name;
		this.cost = cost;
		this.proteinAmount = protein;
		this.carbAmount = carb;
		this.calorieAmount = calorie;
		this.sodiumAmount = sodium;
		this.totalFat = fat;
	}
	
	public String getName(){
		return name;
	}
	
	public double getCost(){
		return cost;
	}
	
	public int getProtein(){
		return proteinAmount;
	}
	
	public int getCarbs(){
		return carbAmount;
	}
	
	public int getCalories(){
		return calorieAmount;
	}
	
	public int getSodium(){
		return sodiumAmount;
	}
	
	public int getFat(){
		return totalFat;
	}

	public String toString(){

		return String.format("Food Name: %s/nCalories: %d/nProtein: %d/nCarbs: %d/nFat: %d/nFrom Restaurant: %s/n", name, calorieAmount, proteinAmount, 
		carbAmount, totalFat, restaurant);
	}
	
}
