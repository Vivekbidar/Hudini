package io.stage.hudinielevate.cms.pages;

import java.awt.AWTException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.stage.hudinielevate.cms.util.CommonUtil;
import io.stage.hudinielevate.cms.util.ElementActions;

public class DesignConfigsPage {
	public static WebDriver driver;
	public static Properties properties;
	public static ElementActions elementActions;
	public static CommonUtil commonUtil;
	WebDriverWait wait;
	Actions actions;
	//constructor for maintaining same driver instance
	public DesignConfigsPage(WebDriver driver) {
		this.driver = driver;
		elementActions = new ElementActions(driver);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		wait=new WebDriverWait(driver, Duration.ofSeconds(5000));
		actions = new Actions(driver);

	}

	//Webelements for navigating design configs page
	private By designConfigsLnk=By.xpath("//div[@title='Design Configs']");


	//Webelements for pages module
	private By pageTb = By.xpath("//span[text()='Pages']");
	private By addPageBtn = By.xpath("//span[text()='Add Page']");
	private By nameTxtBx = By.id("name_input");
	private By addBtn = By.xpath("//span[text()='Add']");
	private By searchMenuTxtBx = By.xpath("//input[@type='text']");
	private By ellipsisBtn = By.xpath("(//button[@aria-controls='simple-menu']/span)[1]");
	private By deleteOption = By.xpath("(//li[@role='menuitem'])[3]");
	private By oneOfOneResultsTxt = By.xpath("//p[text()='1-1 of 1']");
	private By deleteConfirmationBtn = By.xpath("//span[text()='Delete']");
	private By editOption = By.xpath("(//li[@role='menuitem'])[1]");
	private By updateBtn = By.xpath("//span[text()='Update']");
	private By zeroResultsTxt = By.xpath("//p[text()='0-0 of 0']");
	private By pageNameTxt = By.xpath("(//tbody[@class='MuiTableBody-root']/tr/td)[1]");
	private By addComponentBtn = By.xpath("//button[@type='submit']");

	//Webelements for banners module
	private By bannersDpDwn = By.xpath("(//span[@class='MuiIconButton-label'])[3]");
	private By heroBanner1BComponent = By.xpath("//div[text()='1B - Hero Banner, H1, CTA']");
	private By targetLocationArea = By.xpath("//div[@class='droppable page-builder-space']");
	private By h1TitleTxtBx = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/input[1]");
	private By imageUploadButton = By.xpath("//div[@class='d-flex align-items-center img-select justify-content-center']");////*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeLarge']
	private By collapse1BHeroBanner = By.xpath("//div[@data-rbd-drag-handle-draggable-id='HERO_BANNER_W_CTA_0']//div[text()='1B - Hero Banner, H1, CTA']");


	//getter and setter methods for design configs page
	public By getDesignConfigsLnk() {
		return designConfigsLnk;
	}
	public void setDesignConfigsLnk(By designConfigsLnk) {
		this.designConfigsLnk = designConfigsLnk;
	}

	//getter and setter methods for pages module
	public By getPageTb() {
		return pageTb;
	}
	public void setPageTb(By pageTb) {
		this.pageTb = pageTb;
	}
	public By getAddPageBtn() {
		return addPageBtn;
	}
	public void setAddPageBtn(By addPageBtn) {
		this.addPageBtn = addPageBtn;
	}
	public By getNameTxtBx() {
		return nameTxtBx;
	}
	public void setNameTxtBx(By nameTxtBx) {
		this.nameTxtBx = nameTxtBx;
	}
	public By getAddBtn() {
		return addBtn;
	}
	public void setAddBtn(By addBtn) {
		this.addBtn = addBtn;
	}
	public By getSearchMenuTxtBx() {
		return searchMenuTxtBx;
	}
	public void setSearchMenuTxtBx(By searchMenuTxtBx) {
		this.searchMenuTxtBx = searchMenuTxtBx;
	}
	public By getEllipsisBtn() {
		return ellipsisBtn;
	}
	public void setEllipsisBtn(By ellipsisBtn) {
		this.ellipsisBtn = ellipsisBtn;
	}
	public By getDeleteOption() {
		return deleteOption;
	}
	public void setDeleteOption(By deleteOption) {
		this.deleteOption = deleteOption;
	}
	public By getoneOfOneResultsTxt() {
		return oneOfOneResultsTxt;
	}
	public void setoneOfOneResultsTxt(By statusTxt) {
		this.oneOfOneResultsTxt = statusTxt;
	}
	public By getDeleteConfirmationBtn() {
		return deleteConfirmationBtn;
	}
	public void setDeleteConfirmationBtn(By deleteConfirmationBtn) {
		this.deleteConfirmationBtn = deleteConfirmationBtn;
	}
	public By getEditOption() {
		return editOption;
	}
	public void setEditOption(By editOption) {
		this.editOption = editOption;
	}
	public By getUpdateBtn() {
		return updateBtn;
	}
	public void setUpdateBtn(By updateBtn) {
		this.updateBtn = updateBtn;
	}
	public By getZeroResultsTxt() {
		return zeroResultsTxt;
	}
	public void setZeroResultsTxt(By zeroResultsTxt) {
		this.zeroResultsTxt = zeroResultsTxt;
	}
	public By getPageNameTxt() {
		return pageNameTxt;
	}
	public void setPageNameTxt(By pageNameTxt) {
		this.pageNameTxt = pageNameTxt;
	}
	public By getAddComponentBtn() {
		return addComponentBtn;
	}
	public void setAddComponentBtn(By addComponentBtn) {
		this.addComponentBtn = addComponentBtn;
	}

	public void navigateToDesignConfigPage() {
		elementActions.clickOnElement(getDesignConfigsLnk());
	}

	//getter and setter methods for banner module
	public By getBannersDpDwn() {
		return bannersDpDwn;
	}
	public void setBannersDpDwn(By bannersDpDwn) {
		this.bannersDpDwn = bannersDpDwn;
	}
	public By getHeroBanner1BComponent() {
		return heroBanner1BComponent;
	}
	public void setHeroBanner1BComponent(By heroBanner1BComponent) {
		this.heroBanner1BComponent = heroBanner1BComponent;
	}
	public By getTargetLocationArea() {
		return targetLocationArea;
	}
	public void setTargetLocationArea(By targetLocationArea) {
		this.targetLocationArea = targetLocationArea;
	}
	public By getH1TitleTxtBx() {
		return h1TitleTxtBx;
	}
	public void setH1TitleTxtBx(By h1TitleTxtBx) {
		this.h1TitleTxtBx = h1TitleTxtBx;
	}
	public By getImageUploadButton() {
		return imageUploadButton;
	}
	public void setImageUploadButton(By imageUploadButton) {
		this.imageUploadButton = imageUploadButton;
	}
	public By getCollapse1BHeroBanner() {
		return collapse1BHeroBanner;
	}
	public void setCollapse1BHeroBanner(By collapse1bHeroBanner) {
		collapse1BHeroBanner = collapse1bHeroBanner;
	}

	public boolean createPage() {
		elementActions.clickOnElement(getPageTb());
		elementActions.clickOnElement(getAddPageBtn());
		elementActions.sendKeysElement(getNameTxtBx(), "pageForTesting");
		elementActions.clickOnElement(getAddBtn());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elementActions.sendKeysElement(getSearchMenuTxtBx(), "pageForTesting");
		boolean isPageCreated = elementActions.checkIfElementIsPresent(getoneOfOneResultsTxt());
		return isPageCreated;
	}

	public void addComponentsInAPage() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elementActions.sendKeysElement(getSearchMenuTxtBx(), "pageForTesting");
		elementActions.clickOnElement(getPageNameTxt());
		elementActions.clickOnElement(getAddComponentBtn());
		elementActions.scrollAndClick(getBannersDpDwn());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elementActions.dragAndDropElement(getHeroBanner1BComponent(), getTargetLocationArea());
//		elementActions.clickOnElement(By.xpath("//*[@class='MuiSvgIcon-root library-drawer-cancel']"));
		elementActions.sendKeysElement(getH1TitleTxtBx(), "B1Banner H1Title");
		elementActions.scrollAndClick(getImageUploadButton());
		try {
			elementActions.uploadImage();
		} catch (AWTException e) {

			e.printStackTrace();
		}
		elementActions.clickOnElement(getCollapse1BHeroBanner());


	}
}
