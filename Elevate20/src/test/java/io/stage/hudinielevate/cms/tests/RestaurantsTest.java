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
import io.stage.hudinielevate.cms.pages.RestaurantsPage;

public class RestaurantsTest {

	public BaseClass baseClass;
	public Properties properties;
	public WebDriver driver;
	public LoginPage loginPage;
	public PropertiesPage propertiesPage;
	public RestaurantsPage restaurantsPage;

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
	public void verifyChefCreationTest() {
		loginPage.loginAsUser();
		propertiesPage = loginPage.navigateToPropertiesPage();

		restaurantsPage = propertiesPage.navigateToRestauantPage();
		boolean isChefCreated = restaurantsPage.createChef();
		Assert.assertTrue(isChefCreated);
	}

	@Test(enabled = true, priority = 2)
	public void verifyChefUpdationTest() {
		loginPage.loginAsUser();
		propertiesPage = loginPage.navigateToPropertiesPage();

		restaurantsPage = propertiesPage.navigateToRestauantPage();
		boolean isChefUpdated = restaurantsPage.editChef();
		Assert.assertTrue(isChefUpdated);
	}

	@Test(enabled = true, priority = 3)
	public void verifyChefDeletionTest() {
		loginPage.loginAsUser();
		propertiesPage = loginPage.navigateToPropertiesPage();

		restaurantsPage = propertiesPage.navigateToRestauantPage();
		boolean isChefDeleted = restaurantsPage.deleteChef();
		Assert.assertTrue(isChefDeleted);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}