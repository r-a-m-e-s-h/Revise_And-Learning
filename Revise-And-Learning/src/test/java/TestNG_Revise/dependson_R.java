package TestNG_Revise;

import org.testng.annotations.Test;

public class dependson_R {

	@Test
	public void test1()
	{
		System.out.println("test 1");
	}

	@Test(enabled = false)
	public void test2()
	{
		System.out.println(" test 2");
	}

	@Test(dependsOnMethods="test2")
	public void test3() 
	{
		System.out.println(" test 3");
	}



}
