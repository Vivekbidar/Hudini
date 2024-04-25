package io.stage.hudinielevate.cms.listeners;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import io.stage.hudinielevate.cms.base.BaseClass;
import io.stage.hudinielevate.cms.util.ExtentReporterNG;

public class Listeners extends BaseClass implements ITestListener {

	WebDriver driver;
	ExtentReports extent = ExtentReporterNG.extentReportGenerator();
	ExtentTest test;
	private static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>();

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName() + " execution started");
		test = extent.createTest(result.getMethod().getMethodName());
		extentTest.set(test);

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName() + "--Passed");
		String logText = "<b>" + "TEST CASE PASSED" + "</b>";
		Markup m = MarkupHelper.createLabel(logText, ExtentColor.GREEN);
		test.pass(m);

	}

	@Override
	public void onTestFailure(ITestResult result) {

		WebDriver driver = null;
		extentTest.get().fail(result.getThrowable());
		Object testInstance = result.getInstance();
		Class cs = result.getTestClass().getRealClass();

		try {
			driver = (WebDriver) cs.getDeclaredField("driver").get(testInstance);
			extentTest.get().addScreenCaptureFromPath(getScreenshotPath(result.getMethod().getMethodName(), driver),
					result.getMethod().getMethodName());

			String logText = "<b>" + "TEST CASE FAILED" + "</b>";
			Markup m = MarkupHelper.createLabel(logText, ExtentColor.RED);
			test.fail(m);

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName() + "--Skipped");

		String logText = "<b>" + "TEST CASE SKIPPED" + "</b>";
		Markup m = MarkupHelper.createLabel(logText, ExtentColor.YELLOW);
		test.skip(m);


	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test execution started");

	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test execution completed");
		extent.flush();

	}
}