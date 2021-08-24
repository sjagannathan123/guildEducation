package foodEstimatorServiceTests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import foodEstimator.foodEstimatorService;

public class edgeCases {

	foodEstimatorService obj = null;
	double food;
	
	@BeforeMethod
	public void setUp() {
		obj = new foodEstimatorService();		
	}
	
	@Test
	public void num_small_dogs_is_zero() throws Exception {
		food = obj.estimateFood(0,3,7,17.0);
		Assert.assertEquals(food, 303.6);
	}
	
	@Test
	public void num_med_dogs_is_zero() throws Exception {
		food = obj.estimateFood(5,0,7,17.0);
		Assert.assertEquals(food, 291.6);
	}
	
	@Test
	public void num_large_dogs_is_zero() throws Exception {
		food = obj.estimateFood(5,3,0,17.0);
		Assert.assertEquals(food, 111.6);
	}
	
	@Test
	public void all_nums_zero() throws Exception {
		food = obj.estimateFood(0,0,0,0);
		Assert.assertEquals(food, 0);
	}
	
	@Test
	public void num_small_dogs_is_max() throws Exception {
		food = obj.estimateFood(30,0,0,0);
		Assert.assertEquals(food, 360);
	}
	
	@Test
	public void num_med_dogs_is_max() throws Exception {
		food = obj.estimateFood(0,30,0,0);
		Assert.assertEquals(food, 720);
	}
	
	@Test
	public void num_large_dogs_is_max() throws Exception {
		food = obj.estimateFood(0,0,30,0);
		Assert.assertEquals(food, 1080);
	}
}
