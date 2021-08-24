package foodEstimator;

public class foodEstimatorService {
	
	public double estimateFood(int num_small, int num_med, int num_large, double last_month_remaining) throws Exception {
		double food_to_be_ordered = -1.0;
		
		final int small_dog_needs = 10;
		final int medium_dog_needs = 20;
		final int large_dog_needs = 30;
		
		/*
		//The number of dogs should not be less than 0; if the number of dogs is < 0 then the function should gracefully handle the error
		if(num_small < 0 || num_med < 0 || num_large < 0 || last_month_remaining < 0){
			throw new Exception("number of dogs should not be less than 0");			
			} */
		
		//The shelter can hold at most 30 dogs only, so the sum of all sized dogs should not exceed 30.
		if(num_small+num_med+num_large > 30) {
			throw new Exception("number of all dogs should not be greater than 30");			
			}
		
		int all_dogs_need = (num_small * small_dog_needs) + (num_med*medium_dog_needs) + (num_large*large_dog_needs);
		double gross_food_to_be_ordered = all_dogs_need - last_month_remaining;
		//Add at least 20% more to feed all the dogs in the shelter for the month
		food_to_be_ordered = gross_food_to_be_ordered + (gross_food_to_be_ordered * 20/100);
		
		return food_to_be_ordered;		
		
	}

	public static void main(String[] args) throws Exception {
		foodEstimatorService obj = new foodEstimatorService();
		double example_case = obj.estimateFood(5,0,7,17.0);
		System.out.println("Food to be orderd for the example case:"+ example_case+" lbs");		
		
		/*double error_case = obj.estimateFood(-1,3,7,17.0);
		System.out.println("Food to be orderd for the error case1:"+ error_case+" lbs"); */
		
		double edge_case1 = obj.estimateFood(5,3,0,17.0); 
		System.out.println("Food to be orderd for the edge case1:"+ edge_case1+" lbs");		
		
	
		/*double error_case2 = obj.estimateFood(30,3,7,17.0);
		System.out.println("Food to be orderd for the error case1:"+ error_case2+" lbs"); */

	}

}
