import java.util.ArrayList;

public class FoodDatabase {
	private ArrayList<FoodItem> database;
	
	public ArrayList<FoodItem> createBase(){
		//Order: name, restaurant, cost, protein, carb, calorie, sodium, fat
		
		database.add(new FoodItem("Big Mac", "McDonald's", 3.99, 24, 47, 530, 960, 27));
		database.add(new FoodItem("Chicken McNuggets (4 Pc)", "McDonald's", 1.99, 9, 12, 190, 360, 12));
		database.add(new FoodItem("McChicken", "McDonald's", 1.29, 9, 12, 190, 360, 12));
		database.add(new FoodItem("Medium French Fries", "McDonald's", 1.79, 4, 44, 510, 190, 16));
		database.add(new FoodItem("Ranch Snack Wrap (Crispy)", "McDonald's", 1.69, 15, 32, 360, 810, 20));
		
		return database;
		
	}

}
