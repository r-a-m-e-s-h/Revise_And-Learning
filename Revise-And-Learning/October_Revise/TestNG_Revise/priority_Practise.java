package TestNG_Revise;

import org.testng.annotations.Test;

public class priority_Practise {
	
	
	@Test(priority=1)
	public void test1()
	{
				
		System.out.println("This is priority1 ");
		
	}
	@Test(priority=2)
	public void test2()
	{
		System.out.println("this is priority 2");
	}
	@Test
	public void test3()
	{
		System.out.println("priority not given here");
	}
	@Test(priority=0)
	public void test4()
	{
		System.out.println("This is zero priority");
	}
	@Test(priority=-1)
	public void test5()
	{
		System.out.println("This is -1 prioriyty");
	}

}
