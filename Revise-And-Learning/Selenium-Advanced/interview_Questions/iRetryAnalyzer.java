package interview_Questions;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;


public class iRetryAnalyzer implements IRetryAnalyzer {

	int failedCount=0;
	int limit=4;
	

	@Override
	public boolean retry(ITestResult result) {
		if(failedCount<limit)
		{
			failedCount=failedCount+1;
			return true;		
		}
		return false;

		
	}
	
	

}
