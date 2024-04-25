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

public class PropertiesTest {

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

	@Test(enabled = true, priority = 1)
	public void verifyGroupCreationTest() {
		loginPage.loginAsSuperAdmin();
		propertiesPage = loginPage.navigateToPropertiesPage();
		boolean isGroupCreated = propertiesPage.createNewGroup();
		Assert.assertTrue(isGroupCreated);
	}

	@Test(enabled = true, priority = 6)
	public void verifyGroupUpdationTest() {
		loginPage.loginAsSuperAdmin();
		propertiesPage = loginPage.navigateToPropertiesPage();
		boolean isGroupUpdated = propertiesPage.editExistingGroup();
		Assert.assertTrue(isGroupUpdated);

	}

	@Test(enabled = true, priority = 9)
	public void verifyGroupDeletionTest() {
		loginPage.loginAsSuperAdmin();
		propertiesPage = loginPage.navigateToPropertiesPage();
		boolean isGroupDeleted = propertiesPage.deleteGroup();
		Assert.assertTrue(isGroupDeleted);
	}

	@Test(enabled = true, priority = 2)
	public void verifyBrandCreationTest() throws InterruptedException {
		loginPage.loginAsSuperAdmin();
		propertiesPage = loginPage.navigateToPropertiesPage();
		boolean isBrandCreated = propertiesPage.createNewBrand();
		Assert.assertTrue(isBrandCreated);
	}

	@Test(enabled = true, priority = 5)
	public void verifyBrandUpdationTest() {
		loginPage.loginAsSuperAdmin();
		propertiesPage = loginPage.navigateToPropertiesPage();
		boolean isBrandUpdated = propertiesPage.editBrand();
		Assert.assertTrue(isBrandUpdated);
	}

	@Test(enabled = true, priority = 8)
	public void verifyBrandDeletionTest() {
		loginPage.loginAsSuperAdmin();
		propertiesPage = loginPage.navigateToPropertiesPage();
		boolean isBrandDeleted = propertiesPage.deleteBrand();
		Assert.assertTrue(isBrandDeleted);
	}

	@Test(enabled = true, priority = 3)
	public void verifyHotelCreationTest() throws InterruptedException {
		loginPage.loginAsSuperAdmin();
		propertiesPage = loginPage.navigateToPropertiesPage();
		boolean isHotelCreated = propertiesPage.createHotel();
		Assert.assertTrue(isHotelCreated);
	}

	@Test(enabled = true, priority = 4)
	public void verifyHotelUpdationTest() throws InterruptedException {
		loginPage.loginAsSuperAdmin();
		propertiesPage = loginPage.navigateToPropertiesPage();
		boolean isHotelUpdated = propertiesPage.editHotel();
		Assert.assertTrue(isHotelUpdated);
	}

	@Test(enabled = true, priority = 7)
	public void verifyHotelDeletionTest() {
		loginPage.loginAsSuperAdmin();
		propertiesPage = loginPage.navigateToPropertiesPage();
		boolean isHotelDeleted = propertiesPage.deleteHotel();
		Assert.assertTrue(isHotelDeleted);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
