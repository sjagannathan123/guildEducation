package foodEstimatorServiceTests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import foodEstimator.foodEstimatorService;

public class casesNotCoveredInACs {
	
	foodEstimatorService obj = null;
	double food;
	
	@BeforeMethod
	public void setUp() {
		obj = new foodEstimatorService();		
	}
	
	@Test
	public void last_month_remaining_is_more_than_needed() throws Exception {
		food = obj.estimateFood(1,0,0,17);
		Assert.assertEquals(food, 0);
	}

}
