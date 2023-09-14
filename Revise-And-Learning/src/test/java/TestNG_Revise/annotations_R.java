package TestNG_Revise;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotations_R {
	
	
	@BeforeSuite
	public void test1()
	{
		System.out.println("This is Befire suite 1");
	}
	
	@BeforeTest
	public void test2()
	{
		System.out.println(" This is Before Test 2");
	}
	
	@BeforeClass
	public void test3()
	{
		System.out.println("This is Before class 3");
	}
	
	@BeforeMethod
	public void test4()
	{
		System.out.println("This is before method 4");
	}
	
	@Test
	public void test5()
	{
		System.out.println("This is Test 5");
	}
	
	@AfterMethod
	public void test6()
	{
		System.out.println("This is after Method 6");
	}
	
	@AfterClass
	public void test7()
	{
		System.out.println("This is after class 7");
	}
	
	@AfterTest
	public void test8()
	{
		System.out.println("This is after test 8");
	}
	
	@AfterSuite
	public void test9()
	{
		System.out.println("This after suite 9");
	}
	
	
	
	
	
	
	
	

}
