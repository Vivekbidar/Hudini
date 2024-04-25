package io.stage.hudinielevate.cms.pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import io.stage.hudinielevate.cms.base.BaseClass;
import io.stage.hudinielevate.cms.util.ElementActions;

import java.awt.AWTException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.stage.hudinielevate.cms.base.BaseClass;
import io.stage.hudinielevate.cms.util.ElementActions;
import io.stage.hudinielevate.cms.util.ExcelUtil;

public class UsersAndTeamsPage extends BaseClass {

	public static WebDriver driver;
	public static Properties properties;
	ElementActions elementActions;

	public UsersAndTeamsPage(WebDriver driver, Properties properties) {
		this.driver = driver;
		this.properties = properties;
		elementActions = new ElementActions(driver);
	}
	
	private By inviteNewBtn = By.xpath("//span[text()='Invite New']");
	private By selectGroupDropDwnOptions = By.id("group_select");
	private By selectGroupOptionSelected = By.xpath("//ul[@aria-labelledby='group_label']//li");
	private By selectBrandDropDwnOptions = By.id("brand(s)_select");
	private By selectBrandOptionSelected = By.xpath("//div[@class='MuiListItemIcon-root']//input[@type='checkbox']");
	private By selectHotelDropDwnOptions = By.id("hotel(s)_select");
	private By selectHotelOptionSelected = By.xpath("//div[@class='MuiListItemIcon-root']//input[@type='checkbox']");
	private By emailTxtBx = By.id("email_input");
	private By firstNameTxtBx = By.id("first_name_input-label");
	private By lastNameTxtBx = By.id("last_name_input");
	private By employeeIDTxtBx = By.id("enter_employee_id_input");
	private By phoneNumberTxtBx = By.name("phone");
	private By nextBtn = By.xpath("//span[text()='Next'");

	private By selectRoleDropDwnOptions = By.id("role(s)_select");
	private By selectRoleOptionSelected = By.xpath("//span[@class='MuiIconButton-label']//input[@type='checkbox']");
	private By sendInviteBtn = By.xpath("//span[text()='Send Invite']");

	public By getInviteNewBtn() {
		return inviteNewBtn;
	}
	public void setInviteNewBtn(By inviteNewBtn) {
		this.inviteNewBtn = inviteNewBtn;
	}
	public By getSelectGroupDropDwnOptions() {
		return selectGroupDropDwnOptions;
	}
	public void setSelectGroupDropDwnOptions(By selectGroupDropDwnOptions) {
		this.selectGroupDropDwnOptions = selectGroupDropDwnOptions;
	}
	public By getSelectGroupOptionSelected() {
		return selectGroupOptionSelected;
	}
	public void setSelectGroupOptionSelected(By selectGroupOptionSelected) {
		this.selectGroupOptionSelected = selectGroupOptionSelected;
	}
	public By getSelectBrandDropDwnOptions() {
		return selectBrandDropDwnOptions;
	}
	public void setSelectBrandDropDwnOptions(By selectBrandDropDwnOptions) {
		this.selectBrandDropDwnOptions = selectBrandDropDwnOptions;
	}
	public By getSelectBrandOptionSelected() {
		return selectBrandOptionSelected;
	}
	public void setSelectBrandOptionSelected(By selectBrandOptionSelected) {
		this.selectBrandOptionSelected = selectBrandOptionSelected;
	}
	public By getSelectHotelDropDwnOptions() {
		return selectHotelDropDwnOptions;
	}
	public void setSelectHotelDropDwnOptions(By selectHotelDropDwnOptions) {
		this.selectHotelDropDwnOptions = selectHotelDropDwnOptions;
	}
	public By getSelectHotelOptionSelected() {
		return selectHotelOptionSelected;
	}
	public void setSelectHotelOptionSelected(By selectHotelOptionSelected) {
		this.selectHotelOptionSelected = selectHotelOptionSelected;
	}
	public By getEmailTxtBx() {
		return emailTxtBx;
	}
	public void setEmailTxtBx(By emailTxtBx) {
		this.emailTxtBx = emailTxtBx;
	}
	public By getFirstNameTxtBx() {
		return firstNameTxtBx;
	}
	public void setFirstNameTxtBx(By firstNameTxtBx) {
		this.firstNameTxtBx = firstNameTxtBx;
	}
	public By getLastNameTxtBx() {
		return lastNameTxtBx;
	}
	public void setLastNameTxtBx(By lastNameTxtBx) {
		this.lastNameTxtBx = lastNameTxtBx;
	}
	public By getEmployeeIDTxtBx() {
		return employeeIDTxtBx;
	}
	public void setEmployeeIDTxtBx(By employeeIDTxtBx) {
		this.employeeIDTxtBx = employeeIDTxtBx;
	}
	public By getPhoneNumberTxtBx() {
		return phoneNumberTxtBx;
	}
	public void setPhoneNumberTxtBx(By phoneNumberTxtBx) {
		this.phoneNumberTxtBx = phoneNumberTxtBx;
	}
	public By getNextBtn() {
		return nextBtn;
	}
	public void setNextBtn(By nextBtn) {
		this.nextBtn = nextBtn;
	}
	public By getSelectRoleDropDwnOptions() {
		return selectRoleDropDwnOptions;
	}
	public void setSelectRoleDropDwnOptions(By selectRoleDropDwnOptions) {
		this.selectRoleDropDwnOptions = selectRoleDropDwnOptions;
	}
	public By getSelectRoleOptionSelected() {
		return selectRoleOptionSelected;
	}
	public void setSelectRoleOptionSelected(By selectRoleOptionSelected) {
		this.selectRoleOptionSelected = selectRoleOptionSelected;
	}
	public By getSendInviteBtn() {
		return sendInviteBtn;
	}
	public void setSendInviteBtn(By sendInviteBtn) {
		this.sendInviteBtn = sendInviteBtn;
	}

	
}
