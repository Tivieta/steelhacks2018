import java.util.*;
class NormalizerSort{
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
	double b = Double.MAX_VALUE;
	double A = 0;
	double B = Double.MAX_VALUE;
	TreeMap<FoodItem, Double> foodList = new TreeMap<FoodItem, Double>();
	boolean highOrLow = true; //high = 1, low = 0
	Set<FoodItem> NormalizerSort(TreeMap<FoodItem, Double> foodList, String hOrL, int limit){ // for calories
		if(hOrL.equals("high")){
			highOrLow = true;
		}else if(hOrL.equals("low")){
			highOrLow = false;
		}else{
			System.err.printf("invalid string for high or low");
			System.exit(0);
		}
		for(FoodItem f: foodList.keySet()){
			if( highOrLow && f.getCalories() >= limit ){
				this.foodList.put(f, NormalizedValue(f));

			}else if(!highOrLow && f.getCalories() <= limit){
				this.foodList.put(f, NormalizedValue(f));

			}			
		}
		return foodList.keySet();
	} 	

	Set<FoodItem> NormalizerSort(TreeMap<FoodItem, Double> foodList, String hOrL, double costLimit){ // for calories
		if(hOrL.equals("high")){
			highOrLow = true;
		}else if(hOrL.equals("low")){
			highOrLow = false;
		}else{
			System.err.printf("invalid string for high or low");
			System.exit(0);
		}
		for(FoodItem f: foodList.keySet()){
			if( highOrLow && f.getCost() >= costLimit ){
				this.foodList.put(f, NormalizedValue(f));

			}else if(!highOrLow && f.getCost() <= costLimit){
				this.foodList.put(f, NormalizedValue(f));

			}			
		}

	} 


	NormalizerSort(TreeMap<FoodItem, Double> foodList, String hOrL){ 
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
	double NormalizedValue(FoodItem f){
		return a;

	}
}