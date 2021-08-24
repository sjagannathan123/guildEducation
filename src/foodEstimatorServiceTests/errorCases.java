package foodEstimatorServiceTests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import foodEstimator.foodEstimatorService;

public class errorCases {
	foodEstimatorService obj = null;
	double food;
	
	@BeforeMethod
	public void setUp() {
		obj = new foodEstimatorService();		
	}
	
	@Test(expectedExceptions = Exception.class)
	public void num_small_dogs_is_negative() throws Exception {
		food = obj.estimateFood(-1,3,7,17);
	}
	
	@Test(expectedExceptions = Exception.class)
	public void num_med_dogs_is_negative() throws Exception {
		food = obj.estimateFood(5,-3,7,17);
	}
	
	@Test(expectedExceptions = Exception.class)
	public void num_large_dogs_is_negative() throws Exception {
		food = obj.estimateFood(5,3,-7,17);
	}
	
	@Test(expectedExceptions = Exception.class)
	public void num_last_month_remaining_is_negative() throws Exception {
		food = obj.estimateFood(5,3,7,-17);
	}
	
	@Test()
	public void total_number_of_dogs_exceeds_max() {
		try {
			food = obj.estimateFood(30,3,7,17);
		} catch (Exception e) {
			Assert.assertEquals(e.getMessage(),"number of all dogs should not be greater than 30");
		}			
	}
	
	@Test()
	public void number_of_small_dogs_exceeds_max() {
		try {
			food = obj.estimateFood(150,0,0,0);
		} catch (Exception e) {
			Assert.assertEquals(e.getMessage(),"number of all dogs should not be greater than 30");
		}			
	}
	
	@Test()
	public void number_of_med_dogs_exceeds_max() {
		try {
			food = obj.estimateFood(0,200,0,0);
		} catch (Exception e) {
			Assert.assertEquals(e.getMessage(),"number of all dogs should not be greater than 30");
		}			
	}
	
	@Test()
	public void number_of_large_dogs_exceeds_max() {
		try {
			food = obj.estimateFood(0,0,50,0);
		} catch (Exception e) {
			Assert.assertEquals(e.getMessage(),"number of all dogs should not be greater than 30");
		}			
	}
}

