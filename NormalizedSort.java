import java.util.*;
class NormalizedSort{
	// normalizes food values
	// can only take items that are of type 
	// 
	/*
	 * x = input
	 * a = min of scale
	 * b = max of scale 
	 * A = min of data
	 * B = max of data 
	 */
	double a = 0;
	double b = 1;
	double A = 0;
	double B = 0;

	TreeMap<FoodItem, Double> foodList = new TreeMap<FoodItem, Double>();
	boolean highOrLow = true; //high = 1, low = 0
	TreeMap<FoodItem, Double> NormalizerSort(TreeMap<FoodItem, Double> foodList, int hOrL, int limit){ // for calories
		if(hOrL== 2){
			highOrLow = true;
		}else if(hOrL== 1){
			highOrLow = false;
		}else{
			System.err.printf("invalid int for high or low");
			//System.exit(0);
		}
		for(FoodItem f: foodList.keySet()){
			if( highOrLow && f.getCalories() >= limit ){
				this.foodList.put(f, NormalizedValue(foodList.get(f)));


			}else if(!highOrLow && f.getCalories() <= limit){
				this.foodList.put(f, NormalizedValue(foodList.get(f)));

			}			
		}
		return foodList;
	} 	

	TreeMap<FoodItem, Double> NormalizerSort(TreeMap<FoodItem, Double> foodList, int hOrL, double costLimit){ // for cost
		if(hOrL== 2){
			highOrLow = true;
		}else if(hOrL== 1){
			highOrLow = false;
		}else{
			System.err.printf("invalid int for high or low");
			System.exit(0);
		}
		for(FoodItem f: foodList.keySet()){
			if( highOrLow && f.getCost() >= costLimit ){
				this.foodList.put(f, NormalizedValue(foodList.get(f)));

			}else if(!highOrLow && f.getCost() <= costLimit){
				this.foodList.put(f, NormalizedValue(foodList.get(f)));

			}			
		}

		return foodList;
	} 


	TreeMap<FoodItem, Double> NormalizedSort(TreeMap<FoodItem, Double> foodList, String hOrL){ 
		if(hOrL.equals("high")){
			highOrLow = true;
		}else if(hOrL.equals("low")){
			highOrLow = true;
		}else{
			System.err.printf("invalid string for high or low");
			System.exit(0);
		}
	}



	//
	//x = input value
	//
	double NormalizedValue(int x){
		return (double) ((a+(x-A)*(b-a))/(B-A));

	}
	double NormalizedValue(double x){
		return (double) ((a+(x-A)*(b-a))/(B-A));

	}


	public static void main(String args[]){
		FoodItem burger = new FoodItem("Bob's Burger", 6.5, 26, 0, 271, 440, 18);
		FoodItem crushOrange = new FoodItem("Crush Orange", 1.0, 0, 43, 160, 70, 0);
		FoodItem cookies = new FoodItem("Grandma's Cookies", 3.0, 0, 30, 30, 10, 15);
		FoodItem iceCream = new FoodItem("Ice Cream", 3.50, 2, 13, 120, 45, 7);



		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Cost maximum:  ");
		double costMax = scanner.nextDouble();
		
		System.out.print("\nProtein - High (2), Low (1), n/a (0): ");
		int proteinChoice = scanner.nextInt();
		
		System.out.print("\nCarbs - High (2), Low (1), n/a (0): ");
		int carbChoice = scanner.nextInt();
		
		System.out.print("\nCalorie - High (2), Low (1), n/a (0): ");
		int calorieChoice = scanner.nextInt();
		
		ArrayList<FoodItem> foodItems = new ArrayList<FoodItem>();

		foodItems.add(burger);
		foodItems.add(crushOrange);
		foodItems.add(cookies);
		foodItems.add(iceCream);

		TreeMap cost = new TreeMap<FoodItem, Double>();
		TreeMap protein = new TreeMap<FoodItem, Double>();
		TreeMap carbs = new TreeMap<FoodItem, Double>();
		TreeMap calories = new TreeMap<FoodItem, Double>();
		for(FoodItem f: foodItems){
			cost.put(f, f.getCost());
			if(proteinChoice != 0){ protein.put(f, f.getProtein()); }
			if(carbChoice != 0 ){ carbs.put(f, f.getCarbs()); }
			if(calorieChoice != 0 ){ calories.put(f, f.getCalories()); }
		}
		if(protein.size() !=0){
			NormalizedSort weightedProtein = new NormalizerSort()
		}
		//NormalizedSort




	}
}