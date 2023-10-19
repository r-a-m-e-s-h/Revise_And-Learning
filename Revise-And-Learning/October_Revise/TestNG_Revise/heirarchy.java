package TestNG_Revise;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.nio.file.spi.FileSystemProvider;

import org.testng.annotations.*;

public class heirarchy {
	
	@BeforeSuite
	public void test1()
	{
		System.out.println("Im before suite ");
	}
	@BeforeTest
	public void test2()
	{
		System.out.println("Im before Test ");
	}
	@BeforeClass
	public void test3()
	{
		System.out.println("Im before class ");
	}
	@BeforeMethod
	public void test4()
	{
		System.out.println("Im before method ");
	}
	@Test
	public void test5()
	{
		System.out.println("Im  at test 1 ");
	}
	@Test
	public void test10()
	{
		System.out.println("Im at test 2");
	}
	@AfterMethod
	public void test6()
	{
		System.out.println("Im After Method ");
	}
	@AfterClass
	public void test7()
	{
		System.out.println("Im After class ");
	}
	@AfterTest
	public void test8()
	{
		System.out.println("Im After test ");
	}
	@AfterSuite
	public void test9()
	{
		System.out.println("Im After suite ");
	}
	
	

}
