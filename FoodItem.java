
public class FoodItem {
	
	private String name;
	private double cost;
	private int proteinAmount;
	private int carbAmount;
	private int calorieAmount;
	private int sodiumAmount;
	private int totalFat;
	
	public FoodItem(String name, double cost, int protein, int carb, int calorie, int sodium, int fat){
		proteinAmount = protein;
		carbAmount = carb;
		calorieAmount = calorie;
		sodiumAmount = sodium;
		totalFat = fat;
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
	
}
