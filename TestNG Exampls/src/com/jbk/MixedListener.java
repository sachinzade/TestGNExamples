package com.jbk;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MixedListener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Login Test Starts");

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Login Successfully");

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("LogIn not Possible");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(" Test case Skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Mixed Test Starts");

	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Mixed Test Ends");
	}

}
