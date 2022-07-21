package ITestListner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

public class ListnerMain implements ITestListener{

	public void onTestStart(ITestResult result) {
				System.out.println("Test case start :"+result.getName());		

	}

	public void onTestSuccess(ITestResult result) {
				System.out.println("Test case success :"+result.getName());		

	}

	public void onTestFailure(ITestResult result) {
				System.out.println(" Test case Fail:"+result.getName());		

	}

	public void onTestSkipped(ITestResult result) {
		System.out.println(" Test case Skip :"+result.getName());		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
				System.out.println("Test case fail but pass % :"+result.getName());		

	}

	public void onTestFailedWithTimeout(ITestResult result) {
				System.out.println("Test case fail with TimeOut :"+result.getName());		

	}

	public void onStart(ITestContext context) {
				System.out.println("Test case onstart :"+context.getName());		

	}

	public void onFinish(ITestContext context) {
				System.out.println(" Test case onFinish:"+context.getName());		

	}

}