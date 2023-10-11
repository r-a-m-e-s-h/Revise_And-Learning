package TestNG_Revise;

import org.testng.annotations.Test;

public class timesout {
	
	@Test
	public void test1()
	{
		System.out.println("hello 1");
	}
	@Test(timeOut=5000)
	public void test2()
	{
		System.out.println("hello 2");
	}

}
