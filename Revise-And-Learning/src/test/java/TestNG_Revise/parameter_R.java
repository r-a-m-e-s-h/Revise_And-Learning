package TestNG_Revise;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter_R {
	
	
	
	
	@Test()
	@Parameters("Text")
	public void test1(String txt)
	{
		System.out.println("The name from the testNg.xml file is : "+txt);
	}
	

}
