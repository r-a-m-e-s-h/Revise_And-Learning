package TestNG_Revise;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assertions_R {

	
	
	@Test 
	public void testAssert()
	{
		String txt1 = "hello";
		String txt2 = "HelloWorld";
		
		// Soft-Assert(verification)
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(txt1, txt2);
		System.out.println("This is soft assert ");
		
		//Hard-Assert(validate)
		Assert.assertEquals(txt1, txt2);
		System.out.println("Assert True");
		
		
				
		
		
		
	}
	
	
}
