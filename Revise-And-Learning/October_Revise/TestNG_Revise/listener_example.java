package TestNG_Revise;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;


public class listener_example  implements ITestListener{


	public void onTestStart(ITestResult result) {

		System.out.println("Im ontestStart");
	}


	public  void onTestSuccess(ITestResult result) {
		// 
		System.out.println("Im on test success");
	}


	public void onTestFailure(ITestResult result) {
		System.out.println("Im on test failure");
	}


	public void onTestSkipped(ITestResult result) {
		System.out.println("Im on test skipped");
	}


	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Im on test failure");
	}


	public  void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("on test failed with timeout");
	}



	public void onStart(ITestContext context) {
		System.out.println("Im on start");
	}


	public void onFinish(ITestContext context) {
		System.out.println("Im on finish");
	}




}
