package TestNG_Revise;

import org.testng.annotations.Test;

public class groups {
	
	
	
	
	@Test(groups = {"group 1"})
	public void test1()
	{
		System.out.println("Im group 1");
	}
	@Test(groups= {"group 2"})
	public void test2()
	{
		System.out.println("im group 2");
	}
	@Test(groups= {"group 1"})
	public void test3()
	{
		System.out.println("im group 1");
	}
	@Test(groups= {"group 2"})
	public void test4()
	{
		System.out.println("im group 2");
	}

}
