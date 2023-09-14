package TestNG_Revise;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;


public class listeners_R implements ITestListener{


	public void onTestStart(ITestResult result) {
		// not implemented
		System.out.println("testcase is started");
	}

	/**
	 * Invoked each time a test succeeds.

	 */
	public void onTestSuccess(ITestResult result) {
		// not implemented
		System.out.println("testcase is success");

	}

	/**
	 * Invoked each time a test fails.

	 */
	public void onTestFailure(ITestResult result) {
		// not implemented
		System.out.println("testcase is failed");
	}

	/**
	 * Invoked each time a test is skipped.
	 *
	 * @param result <code>ITestResult</code> containing information about the run test
	 * @see ITestResult#SKIP
	 */
	public void onTestSkipped(ITestResult result) {
		// not implemented
		System.out.println("testcase is skipped");
	}

	/**
	 * Invoked each time a method fails but has been annotated with successPercentage and this failure
	 * still keeps it within the success percentage requested.

	 */
	public  void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// not implemented
		System.out.println("testcase failed with passing percentage ");
	}

	/**
	 * Invoked each time a test fails due to a timeout.

	 */
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("testcase failed with timeout");

	}

	/**
	 * Invoked before running all the test methods belonging to the classes inside the &lt;test&gt;
	 * tag and calling all their Configuration methods.

	 */
	public void onStart(ITestContext context) {
		// not implemented
		System.out.println("This is step for starting");
	}

	public  void onFinish(ITestContext context)
	{
		System.out.println("This is the last step");
	}


}
