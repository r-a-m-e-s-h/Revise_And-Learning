package TestNG_Revise;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider_test {
	
	
	
	String[][] data= {
			
			{"Hello","World"},
			{"Hello", "chennai"},
			{"Hello", "kumbakonam"}
	};
	
	@DataProvider
	public String[][] getData()
	{
		return data;
	}
	
	@Test(dataProvider = "getData")
	public void login(String text, String location)
	{
		System.out.println(text+" : "+location);
	}
	

}
