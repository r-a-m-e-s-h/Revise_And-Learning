package interview_Questions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_and_Verify {
	
	
	
	
	@Test
	public void test()
	{
		//Assert.assertEquals(false, true);
		System.out.println("hello");
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(false, true);
		System.out.println("helloooooooooooooooooooo");
		
	}

}
