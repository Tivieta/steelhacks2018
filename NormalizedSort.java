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
	List<FoodItem>() foodList = new List<FoodItem>();
	boolean highOrLow = true; //high = 1, low = 0
	NormalizerSort(List<FoodItem> foodList, boolean highOrLow, int limit){
		for(FoodItem f: foodList){
			if( highOrLow && food.getCalories() >= limit ){
				this.foodList.add(f);

			}else if(!highOrLow && food.getCalories() <= limit){

			}
			
		}

	} 
	NormalizerSort(List<FoodItem> foodList, boolean highOrLow){ 

	}

	//
	//x = input value
	//
	double NormalizedValue(String foodName, double x){


	}
}