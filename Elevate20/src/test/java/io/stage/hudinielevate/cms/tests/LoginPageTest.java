package io.stage.hudinielevate.cms.tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.stage.hudinielevate.cms.base.BaseClass;
import io.stage.hudinielevate.cms.pages.LoginPage;
import io.stage.hudinielevate.cms.pages.PropertiesPage;

public class LoginPageTest{

	public BaseClass baseClass;
	public Properties properties;
	public WebDriver driver;
	public LoginPage loginPage;
	public PropertiesPage propertiesPage;

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

	@Test
	public void verifyHudiniLogoDisplayTest() throws InterruptedException {

		// System.out.println("Dummy call");
		String pageTitle = driver.getTitle();
		System.out.println("login page title=" + pageTitle);
		// boolean isTitleMatching = loginPage.getLoginPageTitle("Hudini CMS");
		Assert.assertEquals("Hudini CMS", pageTitle);
	}
	
	@Test(enabled=true)
	public void verifyLoginAsSuperAdminTest()
	{
		loginPage.loginAsSuperAdmin();
		loginPage.navigateToPropertiesPage();
	}

	/**
	@Test(enabled=false)
	public void createGroupTest() {
		propertiesGroupsPage = loginPage.loginAsSuperAdmin();
		boolean value = propertiesGroupsPage.createGroup();
		Assert.assertTrue(value);
	}

	
	 * @Test public void loginTest() { addPropertyDetailsPage =
	 *       loginPage.loginTest(); homePage =
	 *       addPropertyDetailsPage.navigateToHomePage();
	 *       Assert.assertTrue(homePage.isDashboardDisplayed());
	 * 
	 *       }
	 */

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
