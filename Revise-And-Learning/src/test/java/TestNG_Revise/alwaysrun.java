package TestNG_Revise;

import org.testng.annotations.Test;

public class alwaysrun {
	
	@Test(enabled=false)
	public void test1() 
	{
			
		System.out.println("Hello world");
		
	}
	
	@Test(dependsOnMethods = "test1" ,alwaysRun = true)
	public void test2() 
	{
			
		System.out.println("Hello world");
		
	}

}
