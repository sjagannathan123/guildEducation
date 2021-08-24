package foodEstimatorServiceTests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import foodEstimator.foodEstimatorService;

public class positiveTestCases {
	
	foodEstimatorService obj = null;
	double food;
	
	@BeforeMethod
	public void setUp() {
		obj = new foodEstimatorService();		
	}
	
	@Test
	public void exampleCase() throws Exception {
		food = obj.estimateFood(5,3,7,17);
		Assert.assertEquals(food, 363.6);
	}
	
	@Test
	public void last_month_remaining_as_decimal() throws Exception {
		food = obj.estimateFood(5,3,7,17.5);
		Assert.assertEquals(food, 363.0);
	}
	
	@Test
	public void total_number_of_dogs_equal_to_30() throws Exception {
		food = obj.estimateFood(15,13,2,20);
		Assert.assertEquals(food, 540);
	}	
	
	@Test
	public void last_month_remaining_is_zero() throws Exception {
		food = obj.estimateFood(1,1,1,0);
		Assert.assertEquals(food, 72.0);
	}		

}

