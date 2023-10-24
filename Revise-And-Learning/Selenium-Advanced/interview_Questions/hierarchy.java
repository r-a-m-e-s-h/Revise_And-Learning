package interview_Questions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class hierarchy {


	@BeforeSuite
	public void test1()
	{
		System.out.println("This is test 1");
	}
	@BeforeTest
	public void test2()
	{
		System.out.println("This is test 2");
	}
	@BeforeClass
	public void test3()
	{
		System.out.println("This is test 3");
	}
	@BeforeMethod
	public void test4()
	{
		System.out.println("I'm Before method----This is test 4");
	}
	@Test
	public void test5()
	{
		System.out.println("This is test 5");
	}
	@Test
	public void version2()
	{
		System.out.println("im test version - 2");
	}
	
	@AfterMethod
	public void test6()
	{
		System.out.println("Im Aftr method----This is test 6");
	}
	@AfterClass
	public void test7()
	{
		System.out.println("This is test 7");
	}
	@AfterTest
	public void test8()
	{
		System.out.println("This is test8");
	}
	@AfterSuite
	public void test9()
	{
		System.out.println("This is test9");
	}
	








}
