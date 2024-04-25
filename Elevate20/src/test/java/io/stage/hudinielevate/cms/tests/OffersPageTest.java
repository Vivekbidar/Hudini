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
import io.stage.hudinielevate.cms.pages.OffersPage;
import io.stage.hudinielevate.cms.pages.PropertiesPage;
import io.stage.hudinielevate.cms.pages.RestaurantsPage;

public class OffersPageTest {

	public BaseClass baseClass;
	public Properties properties;
	public WebDriver driver;
	public LoginPage loginPage;
	public PropertiesPage propertiesPage;
	public OffersPage offersPage;

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
	public void verifyOffersCreationTest() {
		loginPage.loginAsUser();
		propertiesPage = loginPage.navigateToPropertiesPage();
		offersPage=new OffersPage(driver);
		offersPage.NavigateToOffersPage();
		Boolean isOfferCreated = offersPage.CreateNewOffer();
		Assert.assertTrue(isOfferCreated, "Offer is not created");
	}

	@Test (enabled = true, priority = 5)
	public void verifyOfferIsDeactivated() {
		loginPage.loginAsUser();
		propertiesPage = loginPage.navigateToPropertiesPage();
		offersPage=new OffersPage(driver);
		offersPage.NavigateToOffersPage();
		boolean isOfferDeactivated = offersPage.DeactivatingCreatedOffer();
		Assert.assertTrue(isOfferDeactivated, "Offer is not deactivated");
	}

	@Test(enabled = true,priority = 6)
	public void verifyOfferIsDeleted() {
		loginPage.loginAsUser();
		propertiesPage = loginPage.navigateToPropertiesPage();
		offersPage=new OffersPage(driver);
		offersPage.NavigateToOffersPage();
		boolean isOfferDeleted = offersPage.DeletingTheCreatedOffer();
		Assert.assertTrue(isOfferDeleted, "Offer is not deleted");
	}
	@Test(enabled = true,priority = 2)
	public void VerifyOffersCardCreation() {
		loginPage.loginAsUser();
		propertiesPage = loginPage.navigateToPropertiesPage();
		offersPage=new OffersPage(driver);
		offersPage.NavigateToOffersPage();
		boolean isOfferCardCreated = offersPage.CreateNewOfferCard();
		Assert.assertTrue(isOfferCardCreated, "OfferCard is not created");

	}
	@Test(enabled = true,priority = 3)
	public void verifyOffersCardIsDeactivated() {
		loginPage.loginAsUser();
		propertiesPage = loginPage.navigateToPropertiesPage();
		offersPage=new OffersPage(driver);
		offersPage.NavigateToOffersPage();
		boolean isOfferCardDeactivated = offersPage.DeactivateCreatedOfferCard();
		Assert.assertTrue(isOfferCardDeactivated, "OfferCard is not deactivated");
	}
	@Test(enabled = true,priority = 4)
	public void verifyOfferCardIsDeleted() {
		loginPage.loginAsUser();
		propertiesPage = loginPage.navigateToPropertiesPage();
		offersPage=new OffersPage(driver);
		offersPage.NavigateToOffersPage();
		boolean isOfferCardDeleted = offersPage.DeletingTheCreatedOfferCard();
		Assert.assertTrue(isOfferCardDeleted, "OfferCard is not deleted");
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}


