package io.stage.hudinielevate.cms.tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.stage.hudinielevate.cms.base.BaseClass;
import io.stage.hudinielevate.cms.pages.ActivityCalendarPage;
import io.stage.hudinielevate.cms.pages.LoginPage;
import io.stage.hudinielevate.cms.pages.PropertiesPage;
//Note:-Activity calender activity type is hardcoded so delete the "type" every time before running the script

public class ActivityCalendarPageTest {
	public BaseClass baseClass;
	public Properties properties;
	public WebDriver driver;
	public LoginPage loginPage;
	public PropertiesPage propertiesPage;
	public ActivityCalendarPage activityCalendarPage;

	@BeforeMethod
	@Parameters("browserName")
	public void setUp(String browserName) {

		System.out.println("Browser name=" + browserName);

		baseClass = new BaseClass();
		properties = baseClass.initializeProperties();
		driver = baseClass.initializeBrowser(properties);
		System.out.println("Driver=" + driver);
		driver.get(properties.getProperty("appURL"));
		System.out.println("App URL=" + driver.getCurrentUrl());
		System.out.println(properties.getProperty("username"));
		System.out.println(properties.getProperty("password"));
		System.out.println(properties.getProperty("superadminusername"));
		System.out.println(properties.getProperty("superadminpassword"));
		loginPage = new LoginPage(driver, properties);
	}
	@Test(enabled = true, priority = 1)
	public void VerifyNewActivityCalendarCreationTest() {
		loginPage.loginAsUser();
		propertiesPage = loginPage.navigateToPropertiesPage();
		activityCalendarPage=new ActivityCalendarPage(driver);
		activityCalendarPage.navigateToActivityCalendarPage();
		boolean isActivityCreated = activityCalendarPage.createNewActivityCalendar();
		Assert.assertTrue(isActivityCreated," New activity is not created");
	}

	@Test(enabled = true, priority = 2)
	public void VerifyNewActivityActivateTest() {
		loginPage.loginAsUser();
		propertiesPage = loginPage.navigateToPropertiesPage();
		activityCalendarPage=new ActivityCalendarPage(driver);
		activityCalendarPage.navigateToActivityCalendarPage();
		boolean isActivityActivated = activityCalendarPage.activatingActivityCalendar();
		Assert.assertTrue(isActivityActivated," New activity is not activated");
	}

	@Test(enabled = true, priority = 3)
	public void VerifyNewActivityEditTest() {
		loginPage.loginAsUser();
		propertiesPage = loginPage.navigateToPropertiesPage();
		activityCalendarPage=new ActivityCalendarPage(driver);
		activityCalendarPage.navigateToActivityCalendarPage();
		boolean isActivityEdited = activityCalendarPage.editActivityCalendar();
		Assert.assertTrue(isActivityEdited," New activity is not edited");
	}

	@Test(enabled = true, priority = 4)
	public void VerifyNewActivityDeleteTest() {
		loginPage.loginAsUser();
		propertiesPage = loginPage.navigateToPropertiesPage();
		activityCalendarPage=new ActivityCalendarPage(driver);
		activityCalendarPage.navigateToActivityCalendarPage();
		boolean isActivityDeleted = activityCalendarPage.deleteActivityCalendar();
		Assert.assertTrue(isActivityDeleted," New activity is not deleted");
	}

		@AfterMethod
		public void tearDown() {
			driver.quit();
		}

}
