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
		
		database.add(new FoodItem("Black Forest Ham (6 inch)", "Subway", 3.75, 18, 46, 290, 800, 5));
		database.add(new FoodItem("Black Forest Ham (Footlong)", "Subway", 5.50, 36, 92, 580, 1600, 10));
		database.add(new FoodItem("Meatball Marinara (6 inch)", "Subway", 3.75, 20, 53, 460, 1090, 18));
		database.add(new FoodItem("Meatball Marinara (Footlong)", "Subway", 5.50, 40, 106, 920, 2180, 36));
		database.add(new FoodItem("Italian B.M.T. (6 inch)", "Subway", 4.25, 19, 43, 390, 1330, 17));
		database.add(new FoodItem("Italian B.M.T. (Footlong)", "Subway", 6.75, 38, 86, 780, 2660, 34));
		
		
		
		return database;
		
	}

}
