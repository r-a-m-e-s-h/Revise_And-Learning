package TestNG_Revise;

import org.testng.annotations.Test;

public class priority_R {
	
	
	@Test(priority=0)
	public void test0()
	{
		System.out.println("Im Zeroth priority");
	}
	
	
	@Test(priority = 1)
	public void test1()
	{
		System.out.println("Im the test1");
	}
	@Test(priority=2)
	public void test2()
	{
		System.out.println("Im test 2");
	}
	@Test
	public void test3()
	{
		System.out.println("im test test3 normal ");
	}
	@Test(priority=-1)
	public void test1minus()
	{
		System.out.println("im minus test1");
	}
	@Test(priority=-5)
	public void test5minus()
	{
		System.out.println("im minus test5");
	}

}
