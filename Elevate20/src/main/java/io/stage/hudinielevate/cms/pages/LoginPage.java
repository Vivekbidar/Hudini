package io.stage.hudinielevate.cms.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.stage.hudinielevate.cms.base.BaseClass;
import io.stage.hudinielevate.cms.util.ElementActions;

public class LoginPage extends BaseClass {

	public static WebDriver driver;
	public static Properties properties;
	ElementActions elementActions;

	public LoginPage(WebDriver driver, Properties properties) {
		this.driver = driver;
		this.properties = properties;
		elementActions = new ElementActions(driver);

	}

	private By emailTxtBx = By.id("email");
	private By passwordTxtBx = By.id("password");
	private By loginBtn = By.xpath("//span[contains(text(),'LOGIN')]");

	private By step1NavigationBtn = By
			.xpath("//img[@src='/assets/img/first-time-logged-in-walkthrough/step-one-continue-btn-icon.png']");
	private By step2NavigationBtn = By
			.xpath("//img[@src='/assets/img/first-time-logged-in-walkthrough/step-two-continue-btn-icon.png']");
	private By step3NavigationBtn = By
			.xpath("//img[@src='/assets/img/first-time-logged-in-walkthrough/step-three-continue-btn-icon.png']");

	
	
	public By getEmailTxtBx() {
		return emailTxtBx;
	}

	public void setEmailTxtBx(By emailTxtBx) {
		this.emailTxtBx = emailTxtBx;
	}

	public By getPasswordTxtBx() {
		return passwordTxtBx;
	}

	public void setPasswordTxtBx(By passwordTxtBx) {
		this.passwordTxtBx = passwordTxtBx;
	}

	public By getLoginBtn() {
		return loginBtn;
	}

	public void setLoginBtn(By loginBtn) {
		this.loginBtn = loginBtn;
	}

	public By getStep1NavigationBtn() {
		return step1NavigationBtn;
	}

	public void setStep1NavigationBtn(By step1NavigationBtn) {
		this.step1NavigationBtn = step1NavigationBtn;
	}

	public By getStep2NavigationBtn() {
		return step2NavigationBtn;
	}

	public void setStep2NavigationBtn(By step2NavigationBtn) {
		this.step2NavigationBtn = step2NavigationBtn;
	}

	public By getStep3NavigationBtn() {
		return step3NavigationBtn;
	}

	public void setStep3NavigationBtn(By step3NavigationBtn) {
		this.step3NavigationBtn = step3NavigationBtn;
	}

	public PropertiesPage navigateToPropertiesPage() {
		elementActions.navigateToPage(getStep1NavigationBtn());
		elementActions.navigateToPage(getStep2NavigationBtn());
		elementActions.navigateToPage(getStep3NavigationBtn());

		return new PropertiesPage(driver);
	}

	// Login page methods:

	public boolean getLoginPageTitle(String pageTitle) {
		boolean loginPageTitle = elementActions.getPageTitle(pageTitle);
		return loginPageTitle;

	}

	public void loginAsSuperAdmin() {
		System.out.println("Username value=" + properties.getProperty("superadminusername"));
		System.out.println("Password value=" + properties.getProperty("superadminpassword"));
		elementActions.sendKeysElement(getEmailTxtBx(), properties.getProperty("superadminusername"));
		elementActions.sendKeysElement(getPasswordTxtBx(), properties.getProperty("superadminpassword"));
		elementActions.clickOnElement(getLoginBtn());
		// return new PropertiesGroupsPage(driver);

	}

	public PropertiesPage loginAsUser() {
		System.out.println("Username value=" + properties.getProperty("username"));
		System.out.println("Password value=" + properties.getProperty("password"));
		elementActions.sendKeysElement(getEmailTxtBx(), properties.getProperty("username"));
		elementActions.sendKeysElement(getPasswordTxtBx(), properties.getProperty("password"));
		elementActions.clickOnElement(getLoginBtn());
		return new PropertiesPage(driver);

	}

	/*
	 * public AddPropertyDetailsPage loginTest() {
	 * System.out.println("Username value="+properties.getProperty("username"));
	 * System.out.println("Password value="+properties.getProperty("password"));
	 * elementActions.sendKeysElement(getEmailTxtBx(),properties.getProperty(
	 * "username"));
	 * elementActions.sendKeysElement(getPasswordTxtBx(),properties.getProperty(
	 * "password")); elementActions.clickOnElement(getLoginBtn()); return new
	 * AddPropertyDetailsPage(driver);
	 * 
	 * }
	 */

	/*
	 * public AddPropertyDetailsPage superAdminLoginTest() {
	 * elementActions.sendKeysElement(getEmailTxtBx(),
	 * properties.getProperty("superadminusername"));
	 * elementActions.sendKeysElement(getPasswordTxtBx(),
	 * properties.getProperty("superadminpassword"));
	 * elementActions.clickOnElement(getLoginBtn());
	 * 
	 * return new AddPropertyDetailsPage(driver);
	 * 
	 * }
	 */

}
