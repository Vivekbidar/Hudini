package io.stage.hudinielevate.cms.tests;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.stage.hudinielevate.cms.base.BaseClass;
import io.stage.hudinielevate.cms.util.ElementActions;
import io.stage.hudinielevate.cms.util.ExcelUtil;

public class DesignConfigsPage1 extends BaseClass {

	public static WebDriver driver;
	public static Properties properties;
	ElementActions elementActions;

	// Pages:
	private By pageTb = By.xpath("//span[text()='Pages']");
	private By addPageBtn = By.xpath("//span[text()='Add Page']");
	private By nameTxtBx = By.id("name_input");
	private By addBtn = By.xpath("//span[text()='Add']");
	private By searchMenuTxtBx = By.xpath("//input[@type='text']");
	private By ellipsisBtn = By.xpath("(//button[@aria-controls='simple-menu']/span)[1]");
	private By deleteOption = By.xpath("(//li[@role='menuitem'])[3]");
	private By statusTxt = By.xpath("//table[@aria-label='simple table']/tbody/tr/td[4]/div/div/span");
	private By deleteConfirmationBtn = By.xpath("//span[text()='Delete']");
	private By editOption = By.xpath("(//li[@role='menuitem'])[1]");
	private By updateBtn = By.xpath("//span[text()='Update']");
	private By zeroResultsTxt = By.xpath("//p[text()='0-0 of 0']");
	private By pageNameTxt = By.xpath("(//tbody[@class='MuiTableBody-root']/tr/td)[1]");
	private By addComponentBtn = By.xpath("(//span[@class='MuiButton-label'])[4]");

	// Basic Component:

	private By elevate7ListComponentHeaderTxt = By.xpath("(//div[text()='7 - List Component'])[1]");
	private By target1 = By.xpath("//div[text()='Drag & Drop component here']");
	private By paddingTopTxtBx = By.id("padding_top_input");
	private By paddingBottomTxtBx = By.id("padding_bottom_input");
	private By textTypeDpDwnOptions = By.id("text_type_select");
	private By textTypeDpDwnOptionSelected = By.xpath("//ul[@aria-labelledby='text_type_label']/li");
	private By inputTextTxtBx = By.id("input_text_input");
	private By basicComponentOption = By.xpath("//div[@id='basicComponentcontent']//div[@draggable='true']");
	private By collapseBasicComponentSection = By.xpath("(//span[@class='MuiIconButton-label'])[2]");
	private By expandElevateComponentSection = By.xpath("(//span[@class='MuiIconButton-label'])[8]");

	private By elevate7ListComponent = By.xpath("(//div[@id='elevate-componentcontent']//div[@draggable='true'])[1]");
	private By targetLocationArea = By.xpath("//div[@draggable='false']");

	// a. 7 - List Component:
	private By hotelModuleDpDwnOptions = By.id("hotel_module_select");
	private By hotelModuleDpDwnOptionSelected = By.xpath("//ul[@aria-labelledby='hotel_module_label']/li");
	private By hotelCompendiumDpDwnOptions = By
			.xpath("(//div[@aria-labelledby='hotel_module_label hotel_module_select'])[2]");
	private By hotelCompendiumDpDwnOptionSelected = By.xpath("//ul[@aria-labelledby='hotel_module_label']/li");
	private By redirectToInAppPageDpDwnOptions = By
			.xpath("(//div[@aria-labelledby='hotel_module_label hotel_module_select'])[3]");
	private By redirectToInAppPageDpDwnOptionSelected = By.xpath("//ul[@aria-labelledby='hotel_module_label']/li");

	public By getElevate7ListComponentHeaderTxt() {
		return elevate7ListComponentHeaderTxt;
	}

	public void setElevate7ListComponentHeaderTxt(By elevate7ListComponentHeaderTxt) {
		this.elevate7ListComponentHeaderTxt = elevate7ListComponentHeaderTxt;
	}

	public By getTargetLocationArea() {
		return targetLocationArea;
	}

	public void setTargetLocationArea(By targetLocationArea) {
		this.targetLocationArea = targetLocationArea;
	}

	public By getElevate7ListComponent() {
		return elevate7ListComponent;
	}

	public void setElevate7ListComponent(By elevate7ListComponent) {
		this.elevate7ListComponent = elevate7ListComponent;
	}

	public By getHotelModuleDpDwnOptions() {
		return hotelModuleDpDwnOptions;
	}

	public void setHotelModuleDpDwnOptions(By hotelModuleDpDwnOptions) {
		this.hotelModuleDpDwnOptions = hotelModuleDpDwnOptions;
	}

	public By getHotelModuleDpDwnOptionSelected() {
		return hotelModuleDpDwnOptionSelected;
	}

	public void setHotelModuleDpDwnOptionSelected(By hotelModuleDpDwnOptionSelected) {
		this.hotelModuleDpDwnOptionSelected = hotelModuleDpDwnOptionSelected;
	}

	public By getHotelCompendiumDpDwnOptions() {
		return hotelCompendiumDpDwnOptions;
	}

	public void setHotelCompendiumDpDwnOptions(By hotelCompendiumDpDwnOptions) {
		this.hotelCompendiumDpDwnOptions = hotelCompendiumDpDwnOptions;
	}

	public By getHotelCompendiumDpDwnOptionSelected() {
		return hotelCompendiumDpDwnOptionSelected;
	}

	public void setHotelCompendiumDpDwnOptionSelected(By hotelCompendiumDpDwnOptionSelected) {
		this.hotelCompendiumDpDwnOptionSelected = hotelCompendiumDpDwnOptionSelected;
	}

	public By getRedirectToInAppPageDpDwnOptions() {
		return redirectToInAppPageDpDwnOptions;
	}

	public void setRedirectToInAppPageDpDwnOptions(By redirectToInAppPageDpDwnOptions) {
		this.redirectToInAppPageDpDwnOptions = redirectToInAppPageDpDwnOptions;
	}

	public By getRedirectToInAppPageDpDwnOptionSelected() {
		return redirectToInAppPageDpDwnOptionSelected;
	}

	public void setRedirectToInAppPageDpDwnOptionSelected(By redirectToInAppPageDpDwnOptionSelected) {
		this.redirectToInAppPageDpDwnOptionSelected = redirectToInAppPageDpDwnOptionSelected;
	}

	public By getExpandElevateComponentSection() {
		return expandElevateComponentSection;
	}

	public void setExpandElevateComponentSection(By expandElevateComponentSection) {
		this.expandElevateComponentSection = expandElevateComponentSection;
	}

	public By getCollapseBasicComponentSection() {
		return collapseBasicComponentSection;
	}

	public void setCollapseBasicComponentSection(By collapseBasicComponentSection) {
		this.collapseBasicComponentSection = collapseBasicComponentSection;
	}

	public By getBasicComponentOption() {
		return basicComponentOption;
	}

	public void setBasicComponentOption(By basicComponentOption) {
		this.basicComponentOption = basicComponentOption;
	}

	public By getTarget1() {
		return target1;
	}

	public void setTarget1(By target1) {
		this.target1 = target1;
	}

	public By getPaddingTopTxtBx() {
		return paddingTopTxtBx;
	}

	public void setPaddingTopTxtBx(By paddingTopTxtBx) {
		this.paddingTopTxtBx = paddingTopTxtBx;
	}

	public By getPaddingBottomTxtBx() {
		return paddingBottomTxtBx;
	}

	public void setPaddingBottomTxtBx(By paddingBottomTxtBx) {
		this.paddingBottomTxtBx = paddingBottomTxtBx;
	}

	public By getTextTypeDpDwnOptions() {
		return textTypeDpDwnOptions;
	}

	public void setTextTypeDpDwnOptions(By textTypeDpDwnOptions) {
		this.textTypeDpDwnOptions = textTypeDpDwnOptions;
	}

	public By getTextTypeDpDwnOptionSelected() {
		return textTypeDpDwnOptionSelected;
	}

	public void setTextTypeDpDwnOptionSelected(By textTypeDpDwnOptionSelected) {
		this.textTypeDpDwnOptionSelected = textTypeDpDwnOptionSelected;
	}

	public By getInputTextTxtBx() {
		return inputTextTxtBx;
	}

	public void setInputTextTxtBx(By inputTextTxtBx) {
		this.inputTextTxtBx = inputTextTxtBx;
	}

	public By getAddComponentBtn() {
		return addComponentBtn;
	}

	public void setAddComponentBtn(By addComponentBtn) {
		this.addComponentBtn = addComponentBtn;
	}

	public By getPageNameTxt() {
		return pageNameTxt;
	}

	public void setPageNameTxt(By pageNameTxt) {
		this.pageNameTxt = pageNameTxt;
	}

	public By getZeroResultsTxt() {
		return zeroResultsTxt;
	}

	public void setZeroResultsTxt(By zeroResultsTxt) {
		this.zeroResultsTxt = zeroResultsTxt;
	}

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

	public By getStatusTxt() {
		return statusTxt;
	}

	public void setStatusTxt(By statusTxt) {
		this.statusTxt = statusTxt;
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

	public DesignConfigsPage1(WebDriver driver) {
		this.driver = driver;
		elementActions = new ElementActions(driver);

	}

	public boolean createPage() {

		elementActions.clickOnElement(getPageTb());
		elementActions.clickOnElement(getAddPageBtn());

		elementActions.sendKeysElement(getNameTxtBx(), ExcelUtil.fetchData("DesignConfigs_Pages", 1, 0));
		elementActions.clickOnElement(getAddBtn());

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// To verify if the page is created successfully

		elementActions.sendKeysElement(getSearchMenuTxtBx(), ExcelUtil.fetchData("DesignConfigs_Pages", 1, 0));

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String pageStatus = elementActions.getText(getStatusTxt());

		Assert.assertEquals(pageStatus, ExcelUtil.fetchData("DesignConfigs_Pages", 1, 1));
		boolean isPageCreated = elementActions.checkIfElementIsPresent(getEllipsisBtn());
		return isPageCreated;
	}

	@Test
	public boolean updatePage() {

		elementActions.sendKeysElement(getSearchMenuTxtBx(), ExcelUtil.fetchData("DesignConfigs_Pages", 1, 0));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		elementActions.clickOnElement(getEllipsisBtn());
		elementActions.clickOnElement(getEditOption());

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		elementActions.clearData(getNameTxtBx());
		elementActions.sendKeysElement(getNameTxtBx(), ExcelUtil.fetchData("DesignConfigs_Pages", 2, 0));

		elementActions.clickOnElement(getUpdateBtn());

		// To verify if the page is updated successfully
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		elementActions.sendKeysElement(getSearchMenuTxtBx(), ExcelUtil.fetchData("DesignConfigs_Pages", 2, 0));

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// String pageStatus = elementActions.getText(getStatusTxt());

		boolean isPageUpdated = elementActions.checkIfElementIsPresent(getEllipsisBtn());
		return isPageUpdated;

	}

	public boolean deletePage() {
		elementActions.sendKeysElement(getSearchMenuTxtBx(), ExcelUtil.fetchData("DesignConfigs_Pages", 2, 0));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		elementActions.clickOnElement(getEllipsisBtn());
		elementActions.clickOnElement(getDeleteOption());

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		elementActions.clickOnElement(getDeleteConfirmationBtn());

		// Verify if the page is deleted successfully

		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		elementActions.sendKeysElement(getSearchMenuTxtBx(), ExcelUtil.fetchData("DesignConfigs_Pages", 2, 0));

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		boolean isPageDeleted = elementActions.checkIfElementIsPresent(getZeroResultsTxt());
		return isPageDeleted;

	}

	public void addComponentsInAPage() {

		System.out.println("Top=" + ExcelUtil.fetchData("DC_Component", 2, 0));
		/*
		 * elementActions.clickOnElement(getPageTb());
		 * elementActions.clickOnElement(getAddPageBtn());
		 * 
		 * elementActions.sendKeysElement(getNameTxtBx(),
		 * ExcelUtil.fetchData("DesignConfigs_Pages", 1, 0));
		 * elementActions.clickOnElement(getAddBtn());
		 * 
		 * try { Thread.sleep(6000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */

		elementActions.sendKeysElement(getSearchMenuTxtBx(), ExcelUtil.fetchData("DesignConfigs_Pages", 1, 0));

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		elementActions.clickOnElement(getPageNameTxt());

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		elementActions.clickOnElement(getAddComponentBtn());

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		elementActions.dragAndDropElement(getBasicComponentOption(), getTarget1());

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		elementActions.clearData(getPaddingTopTxtBx());
		elementActions.sendKeysElement(getPaddingTopTxtBx(), ExcelUtil.fetchData("DC_Component", 2, 0));

		elementActions.clearData(getPaddingBottomTxtBx());
		elementActions.sendKeysElement(getPaddingBottomTxtBx(), ExcelUtil.fetchData("DC_Component", 2, 1));

		elementActions.clickOnElement(getTextTypeDpDwnOptions());
		elementActions.selectDropdownOption(getTextTypeDpDwnOptionSelected(),
				ExcelUtil.fetchData("DC_Component", 2, 2));

		elementActions.clearData(getInputTextTxtBx());
		elementActions.sendKeysElement(getInputTextTxtBx(), ExcelUtil.fetchData("DC_Component", 2, 3));

		elementActions.clickOnElement(getCollapseBasicComponentSection());

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		createElevate7ListComponent();

	}

	public void createElevate7ListComponent() {
		elementActions.scrollAndClick(getExpandElevateComponentSection());

		elementActions.clickOnElement(getExpandElevateComponentSection());

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		elementActions.dragAndDropElement(getElevate7ListComponent(), getTargetLocationArea());

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		elementActions.scrollAndClick(getElevate7ListComponentHeaderTxt());

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		elementActions.scrollAndClick(getHotelModuleDpDwnOptions());

		try {
			elementActions.clickOnElement(getHotelModuleDpDwnOptions());
			elementActions.selectDropdownOption(getHotelModuleDpDwnOptionSelected(),
					ExcelUtil.fetchData("DC_Component", 6, 0));
		} catch (StaleElementReferenceException se1) {

		}

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		elementActions.scrollAndClick(getHotelCompendiumDpDwnOptions());

		try {
			elementActions.clickOnElement(getHotelCompendiumDpDwnOptions());
			elementActions.selectDropdownOption(getHotelCompendiumDpDwnOptionSelected(),
					ExcelUtil.fetchData("DC_Component", 6, 1));
		} catch (StaleElementReferenceException se2) {

		}

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			elementActions.clickOnElement(getRedirectToInAppPageDpDwnOptions());
			elementActions.selectDropdownOption(getRedirectToInAppPageDpDwnOptionSelected(),
					ExcelUtil.fetchData("DC_Component", 6, 2));
		} catch (StaleElementReferenceException se3) {

		}

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void createElevate7DetailPageComponent()
	{
		
	}
}
