package interview_Questions;

import org.testng.annotations.Test;

public class invocation_count {
	
	
	
	
	@Test(invocationCount = 5)
	public void test()
	{
		System.out.println("Hello world");
	}

}
