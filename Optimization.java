import java.util.Scanner;
import java.util.ArrayList;

public class Optimization {
	public static void main(String[] args){
		//Order: cost, protein, carb, calorie, sodium (in mg), fat
		FoodItem burger = new FoodItem("Bob's Burger", 6.5, 26, 0, 271, 440, 18);
		FoodItem crushOrange = new FoodItem("Crush Orange", 1.0, 0, 43, 160, 70, 0);
		FoodItem cookies = new FoodItem("Grandma's Cookies", 3.0, 0, 30, 30, 10, 15);
		FoodItem iceCream = new FoodItem("Ice Cream", 3.50, 2, 13, 120, 45, 7);
		
		ArrayList<FoodItem> foodItems = new ArrayList<FoodItem>();
		foodItems.add(burger);
		foodItems.add(crushOrange);
		foodItems.add(cookies);
		foodItems.add(iceCream);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Cost maximum:  ");
		double costMax = scanner.nextDouble();
		
		System.out.print("\nProtein - High (2), Low (1), n/a (0): ");
		int proteinChoice = scanner.nextInt();
		
		System.out.print("\nCarbs - High (2), Low (1), n/a (0): ");
		int carbChoice = scanner.nextInt();
		
		System.out.print("\nCalorie - High (2), Low (1), n/a (0): ");
		int calorieChoice = scanner.nextInt();
		
		NormalizedSort protein = new NormalizedSort(foodItems,"high");

		//FoodItem optimalChoice = optimize(foodItems, costMax, proteinChoice, carbChoice, calorieChoice);
		

		System.out.println("The best food option is: " + optimalChoice.getName());
		
	}
	
	public static FoodItem optimize(ArrayList<FoodItem> list, double costMax, int proteinChoice, int carbChoice, int calorieChoice){
		FoodItem optimal = null;
		
		ArrayList<Integer> proteinList = new ArrayList<Integer>();
		ArrayList<Integer> carbList = new ArrayList<Integer>();
		ArrayList<Integer> calorieList = new ArrayList<Integer>();
		
		for(FoodItem item : list){
			if(item.getCost() > costMax)
				continue;
			
			if(proteinChoice > 0){
				proteinList.add(item.getProtein());
			}
			
			if(carbChoice > 0){
				carbList.add(item.getCarbs());
			}
			 
			if(calorieChoice > 0){
				calorieList.add(item.getCalories());
			}
			
		} // end for each loop
		
		return optimal;
	}
	
	public static ArrayList<Integer> sort(ArrayList<Integer> list, int choice){
		
	}
	
	

}
