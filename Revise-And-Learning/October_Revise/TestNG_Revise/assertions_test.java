package TestNG_Revise;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assertions_test {
	
	@Test
	public void test2()
	{
		String txt1 = "hello";
		String txt2 = "world";
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(txt1, txt2);
		
		System.out.println("Im not equal , but its a soft Assert");
				
	}
	
	@Test
	public void test1()
	{
		String txt1 = "hello";
		String txt2 = "world";
		
		Assert.assertEquals(txt1, txt2);
		System.out.println("both texts are equal");
	}
	
	

}
