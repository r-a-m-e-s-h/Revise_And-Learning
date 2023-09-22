package interview_Questions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class failed_TestCases {
	
	
	
	@Test(retryAnalyzer = iRetryAnalyzer.class)
	public void testcase1()
	{
		Assert.assertEquals(false, true);
	}
	
	
	@Test
	public void testcase2()
	{
		Assert.assertEquals(true, false);
	}

}
