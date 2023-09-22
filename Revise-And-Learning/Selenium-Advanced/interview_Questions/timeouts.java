package interview_Questions;

import org.testng.annotations.Test;

public class timeouts {
	
	
	@Test(invocationCount = 5)
	public void test()
	{
		System.out.println("Hello world");
	}
	
}
