package TestNG_Revise;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter {

	@Test
	@Parameters({"text1","text2"})
	public void test1(String txt1,String txt2)
	{
		
		System.out.println(txt1 +":" +txt2);
		
	}

}
