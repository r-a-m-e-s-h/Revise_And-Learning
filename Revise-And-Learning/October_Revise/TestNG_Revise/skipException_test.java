package TestNG_Revise;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class skipException_test {


	@Test()
	public void test1()
	{
		int a = 0,b=0;
		int c=a+b;
		System.out.println(c); 
		
		System.out.println("skip exception");
		
		throw new SkipException("this is skip exception");


	}
	@Test(enabled=false)
	public void test2()
	{
		System.out.println("enabled  = false");
	}
	
	@Test(enabled=true)
	public void test3()
	{
		System.out.println("enabled = true");
	}

}
