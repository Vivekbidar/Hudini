package io.stage.hudinielevate.cms.pages;

import java.awt.AWTException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.stage.hudinielevate.cms.base.BaseClass;
import io.stage.hudinielevate.cms.util.CommonUtil;
import io.stage.hudinielevate.cms.util.ElementActions;
import io.stage.hudinielevate.cms.util.ExcelUtil;

public class ActivityCalendarPage extends BaseClass{
	public static WebDriver driver;
	public static Properties properties;
	public static ElementActions elementActions;
	public static CommonUtil commonUtil;
	WebDriverWait wait;
	Actions actions;
	//constructor for maintaining same driver instance
	public ActivityCalendarPage(WebDriver driver) {
		this.driver = driver;
		elementActions = new ElementActions(driver);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		wait=new WebDriverWait(driver, Duration.ofSeconds(5000));
		actions = new Actions(driver);
	}

	//WebElements for navigating Tvchannels page
	private By cmsLnk=By.xpath("//span[text()='CMS']");
	private By activityCalendarLnk=By.xpath("//div[@title='Activity Calendar']");

	//Webelements of create new activity page
	private By addActivityBtn=By.xpath("//span[text()='Add Activity']");
	private By activityNameTxtBx=By.xpath("//input[@id='name_input']");
	private By activityTypeDpDwnOptions=By.id("type_select");
	private By activityAddnewBtn=By.xpath("//u[text()=' + Add New']");
	private By activityEnterTypeNameTxtBx=By.xpath("//input[@placeholder='Enter Type Name']");
	private By activityConfirmBtn=By.xpath("//u[text()=' Confirm']");
	private By activityTypeChkBx=By.xpath("//li[.//span[contains(text(), 'Z')]]//input[@type='checkbox']");
	private By activityDescriptionTxtBx=By.xpath("//textarea[@id='description_input']");
	private By nextBtn=By.xpath("//span[text()='Next']");
	private By activityColorCodeTxtBx=By.xpath("//input[@id='color_code_(hex)_input']");
	private By browseBtn = By.xpath("//span[text()='Browse']");
	private By imageUploadBtn = By.xpath("//input[@value='image']");
	private By addBtn=By.xpath("//span[text()='Add']");
	private By ellipsisBtn= By.xpath("//*[@class='MuiSvgIcon-root showpopupInner']");
	private By verifyingActivityCalendarText= By.xpath("//div[text()='1 activity']");

	//webelements of filter related actions
	private By filterDpDwn=By.xpath("//span[text()='Filter']");
	private By filterTypeDpDwn=By.xpath("//li[text()='Type']");
	private By filterTypeChkBx=By.xpath("//li[.//span[contains(text(), 'Z')]]//input[@type='checkbox']");
	private By aprilText=By.xpath("//div[text()='Month View']");

	//webelements for activate activity scenarios
	private By activeBtn=By.xpath("//*[text()='Activate']");

	//webelements for edit activity scenarios
	private By editBtn=By.xpath("//*[text()='Edit']");
	private By activityDeleteBtn=By.xpath("//li[.//span[contains(text(), 'Z')]]//*[@data-testid='DeleteForeverIcon']");
	private By activityTypeChkBxForEdit=By.xpath("(//li[.//span[contains(text(), 'Z')]]//input[@type='checkbox'])[2]");
	private By updateBtn=By.xpath("//span[text()='Update']");

	//webelements for delete activity scenarios
	private By deleteBtn=By.xpath("//*[text()='Delete']");
	private By verifyingActivityCalendarDeleteText=By.xpath("//div[text()='0 activity']");


	//getter setter methods for navigating activity calendar page
	public By getCmsLnk() {
		return cmsLnk;
	}
	public void setCmsLnk(By cmsLnk) {
		this.cmsLnk = cmsLnk;
	}
	public By getActivityCalendarLnk() {
		return activityCalendarLnk;
	}
	public void setActivityCalendarLnk(By activityCalendarLnk) {
		this.activityCalendarLnk = activityCalendarLnk;
	}

	//getter setter methods for create new activity page
	public By getAddActivityBtn() {
		return addActivityBtn;
	}
	public void setAddActivityBtn(By addActivityBtn) {
		this.addActivityBtn = addActivityBtn;
	}
	public By getActivityNameTxtBx() {
		return activityNameTxtBx;
	}
	public void setActivityNameTxtBx(By activityNameTxtBx) {
		this.activityNameTxtBx = activityNameTxtBx;
	}
	public By getActivityTypeDpDwnOptions() {
		return activityTypeDpDwnOptions;
	}
	public void setActivityTypeDpDwnOptions(By activityTypeDpDwnOptions) {
		this.activityTypeDpDwnOptions = activityTypeDpDwnOptions;
	}
	public By getActivityAddnewBtn() {
		return activityAddnewBtn;
	}
	public void setActivityAddnewBtn(By activityAddnewBtn) {
		this.activityAddnewBtn = activityAddnewBtn;
	}
	public By getActivityEnterTypeNameTxtBx() {
		return activityEnterTypeNameTxtBx;
	}
	public void setActivityEnterTypeNameTxtBx(By activityEnterTypeNameTxtBx) {
		this.activityEnterTypeNameTxtBx = activityEnterTypeNameTxtBx;
	}
	public By getActivityConfirmBtn() {
		return activityConfirmBtn;
	}
	public void setActivityConfirmBtn(By activityConfirmBtn) {
		this.activityConfirmBtn = activityConfirmBtn;
	}
	public By getActivityTypeChkBx() {
		return activityTypeChkBx;
	}
	public void setActivityTypeChkBx(By activityTypeChkBx) {
		this.activityTypeChkBx = activityTypeChkBx;
	}
	public By getActivityDescriptionTxtBx() {
		return activityDescriptionTxtBx;
	}
	public void setActivityDescriptionTxtBx(By activityDescriptionTxtBx) {
		this.activityDescriptionTxtBx = activityDescriptionTxtBx;
	}
	public By getNextBtn() {
		return nextBtn;
	}
	public void setNextBtn(By nextBtn) {
		this.nextBtn = nextBtn;
	}
	public By getActivityColorCodeTxtBx() {
		return activityColorCodeTxtBx;
	}
	public void setActivityColorCodeTxtBx(By activityColorCodeTxtBx) {
		this.activityColorCodeTxtBx = activityColorCodeTxtBx;
	}
	public By getImageUploadBtn() {
		return imageUploadBtn;
	}
	public void setImageUploadBtn(By imageUploadBtn) {
		this.imageUploadBtn = imageUploadBtn;
	}

	public By getBrowseBtn() {
		return browseBtn;
	}
	public void setBrowseBtn(By browseBtn) {
		this.browseBtn = browseBtn;
	}
	public By getAddBtn() {
		return addBtn;
	}
	public void setAddBtn(By addBtn) {
		this.addBtn = addBtn;
	}
	public By getEllipsisBtn() {
		return ellipsisBtn;
	}
	public void setEllipsisBtn(By ellipsisBtn) {
		this.ellipsisBtn = ellipsisBtn;
	}

	//getter setter related to filter related actions
	public By getFilterDpDwn() {
		return filterDpDwn;
	}
	public void setFilterDpDwn(By filterDpDwn) {
		this.filterDpDwn = filterDpDwn;
	}
	public By getFilterTypeDpDwn() {
		return filterTypeDpDwn;
	}
	public void setFilterTypeDpDwn(By filterTypeDpDwn) {
		this.filterTypeDpDwn = filterTypeDpDwn;
	}
	public By getFilterTypeChkBx() {
		return filterTypeChkBx;
	}
	public void setFilterTypeChkBx(By filterTypeChkBx) {
		this.filterTypeChkBx = filterTypeChkBx;
	}
	public By getAprilText() {
		return aprilText;
	}
	public void setAprilText(By aprilText) {
		this.aprilText = aprilText;
	}
	public By getverifyingActivityCalendarText() {
		return verifyingActivityCalendarText;
	}
	public void setverifyingActivityCalendarText(By verifyingActivityCreation) {
		this.verifyingActivityCalendarText = verifyingActivityCreation;
	}

	//getter and setter method for activate activity scenarios
	public By getActiveBtn() {
		return activeBtn;
	}
	public void setActiveBtn(By activeBtn) {
		this.activeBtn = activeBtn;
	}

	//getter and setter method for edit activity scenarios
	public By getEditBtn() {
		return editBtn;
	}
	public void setEditBtn(By editBtn) {
		this.editBtn = editBtn;
	}
	public By getActivityDeleteBtn() {
		return activityDeleteBtn;
	}
	public void setActivityDeleteBtn(By activityDeleteBtn) {
		this.activityDeleteBtn = activityDeleteBtn;
	}
	public By getActivityTypeChkBxForEdit() {
		return activityTypeChkBxForEdit;
	}
	public void setActivityTypeChkBxForEdit(By activityTypeChkBxForEdit) {
		this.activityTypeChkBxForEdit = activityTypeChkBxForEdit;
	}
	public By getUpdateBtn() {
		return updateBtn;
	}
	public void setUpdateBtn(By updateBtn) {
		this.updateBtn = updateBtn;
	}

	//getter and setter method for delete activity scenarios
	public By getDeleteBtn() {
		return deleteBtn;
	}
	public void setDeleteBtn(By deleteBtn) {
		this.deleteBtn = deleteBtn;
	}

	public By getVerifyingActivityCalendarDeleteText() {
		return verifyingActivityCalendarDeleteText;
	}
	public void setVerifyingActivityCalendarDeleteText(By verifyingActivityCalendarDeleteText) {
		this.verifyingActivityCalendarDeleteText = verifyingActivityCalendarDeleteText;
	}

	//New Activity Creation
	//navigating to Activity Calendar page
	public void navigateToActivityCalendarPage() {
		elementActions.clickOnElement(getCmsLnk());
		elementActions.clickOnElement(getActivityCalendarLnk());
	}

	//Creating new activity calendar
	public boolean createNewActivityCalendar() {
		elementActions.clickOnElement(getAddActivityBtn());
		elementActions.sendKeysElement(getActivityNameTxtBx(), ExcelUtil.fetchData("ActivityCalendar", 1, 0));
		elementActions.clickOnElement(getActivityTypeDpDwnOptions());
		elementActions.clickOnElement(getActivityAddnewBtn());
		elementActions.sendKeysElement(getActivityEnterTypeNameTxtBx(), ExcelUtil.fetchData("ActivityCalendar", 1, 1));
		elementActions.clickOnElement(getActivityConfirmBtn());
		elementActions.clickOnElement(getActivityTypeChkBx());
		try {
			elementActions.closePopup();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		elementActions.sendKeysElement(getActivityDescriptionTxtBx(), ExcelUtil.fetchData("ActivityCalendar", 1, 2));
		elementActions.clickOnElement(getNextBtn());
		elementActions.clickOnElement(getNextBtn());
		elementActions.clickOnElement(getImageUploadBtn());
		elementActions.clickOnElement(getBrowseBtn());
		try {
			elementActions.uploadImage();
		} catch (AWTException e) {

			e.printStackTrace();
		}
		elementActions.clickOnElement(getNextBtn());
		elementActions.clickOnElement(getBrowseBtn());
		try {
			elementActions.uploadImage();
		} catch (AWTException e) {

			e.printStackTrace();
		}
		elementActions.clickOnElement(getAddBtn());
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		elementActions.clickOnElement(getFilterDpDwn());
		elementActions.clickOnElement(getFilterTypeDpDwn());
		elementActions.clickOnElement(getFilterTypeChkBx());
		try {
			elementActions.closePopup();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		actions.doubleClick().perform();
		boolean isActivityCreated = elementActions.checkIfElementIsPresent(getverifyingActivityCalendarText());
		return isActivityCreated;
	}

	//activate created activity
	public boolean activatingActivityCalendar() {
		elementActions.clickOnElement(getFilterDpDwn());
		elementActions.clickOnElement(getFilterTypeDpDwn());
		elementActions.clickOnElement(getFilterTypeChkBx());
		try {
			elementActions.closePopup();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		actions.doubleClick().perform();
		elementActions.clickOnElement(getEllipsisBtn());
		elementActions.clickOnElement(getActiveBtn());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elementActions.clickOnElement(getFilterDpDwn());
		elementActions.clickOnElement(getFilterTypeDpDwn());
		elementActions.clickOnElement(getFilterTypeChkBx());
		try {
			elementActions.closePopup();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		actions.doubleClick().perform();
		boolean isActivityActivated = elementActions.checkIfElementIsPresent(getverifyingActivityCalendarText());
		return isActivityActivated;
	}

	//edit activity calendar
	public boolean editActivityCalendar() {
		elementActions.clickOnElement(getFilterDpDwn());
		elementActions.clickOnElement(getFilterTypeDpDwn());
		elementActions.clickOnElement(getFilterTypeChkBx());
		try {
			elementActions.closePopup();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		actions.doubleClick().perform();
		elementActions.clickOnElement(getEllipsisBtn());
		elementActions.clickOnElement(getEditBtn());
		elementActions.clearData(getActivityNameTxtBx());
	 	elementActions.clickOnElement(getActivityTypeDpDwnOptions());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		elementActions.clickOnElement(getActivityDeleteBtn());
		try {
			elementActions.closePopup();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		elementActions.clearData(getActivityDescriptionTxtBx());
		elementActions.sendKeysElement(getActivityNameTxtBx(), ExcelUtil.fetchData("ActivityCalendar", 2, 0));
		elementActions.clickOnElement(getActivityTypeDpDwnOptions());
		elementActions.clickOnElement(getActivityAddnewBtn());
		elementActions.sendKeysElement(getActivityEnterTypeNameTxtBx(), ExcelUtil.fetchData("ActivityCalendar", 2, 1));
		elementActions.clickOnElement(getActivityConfirmBtn());
		elementActions.clickOnElement(getActivityTypeChkBxForEdit());
		try {
			elementActions.closePopup();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		elementActions.sendKeysElement(getActivityDescriptionTxtBx(), ExcelUtil.fetchData("ActivityCalendar", 2, 2));
		elementActions.clickOnElement(getNextBtn());
		elementActions.clickOnElement(getNextBtn());
		elementActions.clickOnElement(getImageUploadBtn());
		elementActions.clickOnElement(getBrowseBtn());
		try {
			elementActions.uploadImage();
		} catch (AWTException e) {

			e.printStackTrace();
		}
		elementActions.clickOnElement(getNextBtn());
		elementActions.clickOnElement(getBrowseBtn());
		try {
			elementActions.uploadImage();
		} catch (AWTException e) {

			e.printStackTrace();
		}
		elementActions.clickOnElement(getUpdateBtn());
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		elementActions.clickOnElement(getFilterDpDwn());
		elementActions.clickOnElement(getFilterTypeDpDwn());
		elementActions.clickOnElement(getFilterTypeChkBx());
		try {
			elementActions.closePopup();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		actions.doubleClick().perform();
		boolean isActivityEdited = elementActions.checkIfElementIsPresent(getverifyingActivityCalendarText());
		return isActivityEdited;
	}

	//Delete activity calendar
	public boolean deleteActivityCalendar() {
		elementActions.clickOnElement(getFilterDpDwn());
		elementActions.clickOnElement(getFilterTypeDpDwn());
		elementActions.clickOnElement(getFilterTypeChkBx());
		try {
			elementActions.closePopup();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		actions.doubleClick().perform();
		elementActions.clickOnElement(getEllipsisBtn());
		elementActions.clickOnElement(getDeleteBtn());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elementActions.clickOnElement(getFilterDpDwn());
		elementActions.clickOnElement(getFilterTypeDpDwn());
		elementActions.clickOnElement(getFilterTypeChkBx());
		try {
			elementActions.closePopup();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		actions.doubleClick().perform();
		boolean isActivityDeleted = elementActions.checkIfElementIsPresent(getVerifyingActivityCalendarDeleteText());
		return isActivityDeleted;
	}
}
