package TestNG_Revise;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class alwaysRun_test {
	
	
	
	
	
	String[][]data= {
			{"Hello","world"} ,
			{"hello", "chennai"},
			{"hello","kumbakonam"}
	};
	
	@DataProvider
	public String[][] getdata()
	{
		return data;
	}
	
	@Test(enabled=false)
	public void test1()
	{
		System.out.println("hello");
	}
	@Test(dependsOnMethods = "test1",alwaysRun = true)
	public void test2()
	{
		System.out.println("hello1");
	}

}
