package interview_Questions;

import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class expected_execpetiom {
	
	
	
	@Test(timeOut = 3000,expectedExceptions =ThreadTimeoutException.class )
	public void test1() throws InterruptedException
	{
		Thread.sleep(4000);
		System.out.println("im going to wait");
	}


}
//org.testng.internal.thread.ThreadTimeoutException: Method interview_Questions.timeouts.test1() didn't finish within the time-out 3000
