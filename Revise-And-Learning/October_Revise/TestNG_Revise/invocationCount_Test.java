package TestNG_Revise;

import org.testng.annotations.Test;

public class invocationCount_Test {
	
	
	
	@Test
	public void test1()
	{
		System.out.println("i'm 1");
	}
	
	@Test(invocationCount = 5)
	public void test2()
	{
		System.out.println("i'm 2");
	}
	

}
