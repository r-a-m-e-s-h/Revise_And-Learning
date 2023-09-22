package interview_Questions;

import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class always_run {
	
	
	
	@Test(timeOut = 3000,expectedExceptions =ThreadTimeoutException.class )
	public void test1() throws InterruptedException
	{
		Thread.sleep(4000);
		System.out.println("im going to wait");
	}
	
	@Test(dependsOnMethods = "test1")
	public void test2()
	{
		System.out.println("im depend on test1");
	}
	@Test(timeOut = 3000)
	public void test3() throws InterruptedException
	{
		Thread.sleep(4000);
		System.out.println("im going to wait");
	}
	@Test(dependsOnMethods = "test3")
	public void test4() throws InterruptedException
	{
		Thread.sleep(4000);
		System.out.println("im going to wait");
	}




}
