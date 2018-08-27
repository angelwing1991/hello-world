package com.customlistener.zhao.listenerUsage;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.ITestContext;

/**
 * Created by wwh on 17/2/13.
 */
public class customListener implements ITestListener{

    public void onTestStart(ITestResult result) {
        System.out.println("Test started running" + result.getMethod().getMethodName() +
                "at:"+result.getStartMillis());
    }


    public void onTestSuccess(ITestResult result) {
        System.out.println("Result success");
    }


    public void onTestFailure(ITestResult result) {
        System.out.println("Result failure");
    }


    public void onTestSkipped(ITestResult result) {
        System.out.println("Result skip");
    }


    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("Result fail but with success percentage");
    }


    public void onStart(ITestContext context) {
        System.out.println("now start test");
    }


    public void onFinish(ITestContext context) {
        System.out.println("now finish test");
    }
}