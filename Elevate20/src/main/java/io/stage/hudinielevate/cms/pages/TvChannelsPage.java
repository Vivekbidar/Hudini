package io.stage.hudinielevate.cms.pages;

import java.awt.AWTException;
import java.time.Duration;
import java.util.Properties;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.internal.thread.ThreadExecutionException;

import io.stage.hudinielevate.cms.base.BaseClass;
import io.stage.hudinielevate.cms.util.CommonUtil;
import io.stage.hudinielevate.cms.util.ElementActions;
import io.stage.hudinielevate.cms.util.ExcelUtil;

public class TvChannelsPage extends BaseClass{
	public static WebDriver driver;
	public static Properties properties;
	public static ElementActions elementActions;
	public static CommonUtil commonUtil;
	WebDriverWait wait;

	//constructor for maintaining same driver instance
	public TvChannelsPage(WebDriver driver) {
		this.driver = driver;
		elementActions = new ElementActions(driver);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		wait=new WebDriverWait(driver, Duration.ofSeconds(5000));
	}

	//WebElements for navigating Tvchannels page
	private By cmsLnk = By.xpath("//span[text()='CMS']");
	private By tvChannelsLnk = By.xpath("//div[@title='TV Channels']");
	private By addBouquetBtn = By.xpath("//span[text()='Add Bouquet']");

	//WebElements of Bouquet page
	private By bouquetNameTxtBx = By.id("bouquet_name_input");
	private By bouquetCodeTxtBx=By.id("bouquet_code_input");
	private By selectFloorsDpDwnOptions=By.id("select_floor(s)_select");
	private By selectFloorsDpDwnSearchField=By.xpath("//input[@placeholder='Search']");
	private By selectFloorsDpDwnChkBx=By.xpath("//input[@type='checkbox']");
	private By selectRoomsDpDwnOptions=By.id("select_room(s)_select");
	private By selectRoomsDpDwnSearchField=By.xpath("//input[@placeholder='Search']");
	private By selectRoomsDpDwnChkBx=By.xpath("//input[@type='checkbox']");
	private By selectLocationsDpDwnOptions=By.id("select_locations(s)_select");
	private By selectLocationsDpDwnSearchField=By.xpath("//input[@placeholder='Search']");
	private By selectLocationsDpDwnChkBx=By.xpath("//input[@type='checkbox']");
	private By addBtn=By.xpath("//span[text()='Add']");
	private By bouquetCreationToastMessage = By.xpath("//div[text()='Bouquet created successfully']");
	private By bouquetEditToastMessage = By.xpath("//div[text()='Bouquet updated successfully']");
	private By bouquetDeleteToastMessage = By.xpath("//div[text()='Bouquet deleted successfully']");

	//WebElements of category page
	private By categoryTb=By.xpath("//span[text()='Category']");
	private By addCategoryBtn=By.xpath("//span[text()='Add Category']");
	private By categoryNameTxtField=By.id("category_name_input");
	private By categoryCodeTxtField=By.id("category_code_input");
	private By activeChkBx=By.xpath("//input[@type='checkbox']");
	private By categoryCreationToastMessage = By.xpath("//div[text()='Category created successfully']");
	private By categoryEditToastMessage = By.xpath("//div[text()='Category updated successfully']");
	private By categoryDeactivateToastMessage = By.xpath("//div[text()='Category deactivated successfully']");
	private By categoryDeleteToastMessage = By.xpath("//div[text()='Category deleted successfully']");

	//WebElements of channels page
	private By channelsTb=By.xpath("//span[text()='Channels']");
	private By addChannelBtn = By.xpath("//span[text()='Add Channel']");
	private By channelNameTxtField=By.id("channel_name_input");
	private By channelCodeTxtField=By.id("channel_code_input");
	private By selectCategoryDpDwn=By.id("select_category_select");
	private By selectCategoryDpDwnOptionSelected=By.xpath("//ul[@role='listbox']/li");
	private By selectBouquetDpDwnOptions=By.id("select_bouquet(s)_select");
	private By selectBouquetDpDwnSearchField=By.xpath("//input[@placeholder='Search']");
	private By selectBouquetDpDwnChkBx=By.xpath("//input[@placeholder='Search']/../../../..//input[@type='checkbox']");
	private By channelNumberTxtField=By.id("channel_number_input");
	private By selectLanguageDpDwn=By.id("select_language_select");
	private By selectLanguageDpDwnOptionSelected=By.xpath("//ul[@role='listbox']/li");
	private By ipAddressTxtField=By.id("ip_address_input");
	private By portTxtField=By.id("port_input");
	private By nextBtn=By.xpath("//span[text()='Next']");
	private By channelCreationToastMessage = By.xpath("//div[text()='Channel created successfully']");
	private By channelEditToastMessage = By.xpath("//div[text()='Channel updated successfully']");
	private By channelDeactivateToastMessage = By.xpath("//div[text()='Channel deactivated successfully']");
	private By channelDeleteToastMessage = By.xpath("//div[text()='Channel deleted successfully']");

	//Temprovary data
	private By tempOptionSelection=By.xpath("//span[text()='302']/../..//input[@type='checkbox']");
	public By getTempOptionSelection() {
		return tempOptionSelection;
	}

	//common webelements
	private By tvChannelsSearchTxtBx=By.xpath("//input[@type='text']");
	private By ellipsisBtn = By.xpath("//tbody[@class='MuiTableBody-root']//span[@class='MuiButton-label']");

	//webelements for edit scenario
	private By editBtn = By.xpath("//*[text()='Edit']");
	private By updateBtn = By.xpath("//span[text()='Update']");

	//webelements for delete scenario
	private By deleteBtn = By.xpath("//*[text()='Delete']");
	private By confirmDeleteBtn = By.xpath("//span[text()='Delete']");
	private By searchResultTxtForDelete = By.xpath("//p[text()='0-0 of 0']");


	//webelements for deactivate scenarios
	private By deactivateBtn = By.xpath("//*[text()='Deactivate']");
	private By InactiveText=By.xpath("//span[text()='Inactive']");

	//getter and setter methods for navigating Tvchannels page
	public By getCmsLnk() {
		return cmsLnk;
	}
	public void setCmsLnk(By cmsLnk) {
		this.cmsLnk = cmsLnk;
	}
	public By getTvChannelsLnk() {
		return tvChannelsLnk;
	}
	public void setTvChannelsLnk(By tvChannelsLnk) {
		this.tvChannelsLnk = tvChannelsLnk;
	}

	//getter and setter method of bouquet page
	public By getAddBouquetBtn() {
		return addBouquetBtn;
	}
	public void setAddBouquetBtn(By addBouquetBtn) {
		this.addBouquetBtn = addBouquetBtn;
	}
	public By getBouquetNameTxtBx() {
		return bouquetNameTxtBx;
	}
	public void setBouquetNameTxtBx(By bouquetNameTxtBx) {
		this.bouquetNameTxtBx = bouquetNameTxtBx;
	}
	public By getBouquetCodeTxtBx() {
		return bouquetCodeTxtBx;
	}
	public void setBouquetCodeTxtBx(By bouquetCodeTxtBx) {
		this.bouquetCodeTxtBx = bouquetCodeTxtBx;
	}
	public By getSelectFloorsDpDwnOptions() {
		return selectFloorsDpDwnOptions;
	}
	public void setSelectFloorsDpDwnOptions(By selectFloorsDpDwnOptions) {
		this.selectFloorsDpDwnOptions = selectFloorsDpDwnOptions;
	}
	public By getSelectFloorsDpDwnSearchField() {
		return selectFloorsDpDwnSearchField;
	}
	public void setSelectFloorsDpDwnSearchField(By selectFloorsDpDwnSearchField) {
		this.selectFloorsDpDwnSearchField = selectFloorsDpDwnSearchField;
	}
	public By getSelectFloorsDpDwnChkBx() {
		return selectFloorsDpDwnChkBx;
	}
	public void setSelectFloorsDpDwnChkBx(By selectFloorsDpDwnChkBx) {
		this.selectFloorsDpDwnChkBx = selectFloorsDpDwnChkBx;
	}
	public By getSelectRoomsDpDwnOptions() {
		return selectRoomsDpDwnOptions;
	}
	public void setSelectRoomsDpDwnOptions(By selectRoomsDpDwnOptions) {
		this.selectRoomsDpDwnOptions = selectRoomsDpDwnOptions;
	}
	public By getSelectLocationsDpDwnOptions() {
		return selectLocationsDpDwnOptions;
	}
	public void setSelectLocationsDpDwnOptions(By selectLocationsDpDwnOptions) {
		this.selectLocationsDpDwnOptions = selectLocationsDpDwnOptions;
	}
	public By getAddBtn() {
		return addBtn;
	}
	public void setAddBtn(By addBtn) {
		this.addBtn = addBtn;
	}
	public By getSelectRoomsDpDwnSearchField() {
		return selectRoomsDpDwnSearchField;
	}

	public void setSelectRoomsDpDwnSearchField(By selectRoomsDpDwnSearchField) {
		this.selectRoomsDpDwnSearchField = selectRoomsDpDwnSearchField;
	}

	public By getSelectRoomsDpDwnChkBx() {
		return selectRoomsDpDwnChkBx;
	}

	public void setSelectRoomsDpDwnChkBx(By selectRoomsDpDwnChkBx) {
		this.selectRoomsDpDwnChkBx = selectRoomsDpDwnChkBx;
	}
	public By getSelectLocationsDpDwnSearchField() {
		return selectLocationsDpDwnSearchField;
	}

	public void setSelectLocationsDpDwnSearchField(By selectLocationsDpDwnSearchField) {
		this.selectLocationsDpDwnSearchField = selectLocationsDpDwnSearchField;
	}

	public By getSelectLocationsDpDwnChkBx() {
		return selectLocationsDpDwnChkBx;
	}

	public void setSelectLocationsDpDwnChkBx(By selectLocationsDpDwnChkBx) {
		this.selectLocationsDpDwnChkBx = selectLocationsDpDwnChkBx;
	}

	//getter and setter methods of category page
	public By getCategoryTb() {
		return categoryTb;
	}
	public void setCategoryTb(By categoryTb) {
		this.categoryTb = categoryTb;
	}
	public By getAddCategoryBtn() {
		return addCategoryBtn;
	}

	public void setAddCategoryBtn(By addCategoryBtn) {
		this.addCategoryBtn = addCategoryBtn;
	}
	public By getCategoryNameTxtField() {
		return categoryNameTxtField;
	}
	public void setCategoryNameTxtField(By categoryNameTxtField) {
		this.categoryNameTxtField = categoryNameTxtField;
	}
	public By getCategoryCodeTxtField() {
		return categoryCodeTxtField;
	}
	public void setCategoryCodeTxtField(By categoryCodeTxtField) {
		this.categoryCodeTxtField = categoryCodeTxtField;
	}
	public By getActiveChkBx() {
		return activeChkBx;
	}
	public void setActiveChkBx(By activeChkBx) {
		this.activeChkBx = activeChkBx;
	}
	public By getCategoryCreationToastMessage() {
		return categoryCreationToastMessage;
	}
	public void setCategoryCreationToastMessage(By categoryCreationToastMessage) {
		this.categoryCreationToastMessage = categoryCreationToastMessage;
	}
	public By getCategoryEditToastMessage() {
		return categoryEditToastMessage;
	}
	public void setCategoryEditToastMessage(By categoryEditToastMessage) {
		this.categoryEditToastMessage = categoryEditToastMessage;
	}
	public By getcategoryDeactivateToastMessage() {
		return categoryDeactivateToastMessage;
	}
	public void setcategoryDeactivateToastMessage(By categoryActivateToastMessage) {
		this.categoryDeactivateToastMessage = categoryActivateToastMessage;
	}
	public By getCategoryDeleteToastMessage() {
		return categoryDeleteToastMessage;
	}
	public void setCategoryDeleteToastMessage(By categoryDeleteToastMessage) {
		this.categoryDeleteToastMessage = categoryDeleteToastMessage;
	}

	//getter and setter method of channel page
	public By getChannelsTb() {
		return channelsTb;
	}
	public void setChannelsTb(By channelsTb) {
		this.channelsTb = channelsTb;
	}
	public By getAddChannelBtn() {
		return addChannelBtn;
	}
	public void setAddChannelBtn(By addChannelBtn) {
		this.addChannelBtn = addChannelBtn;
	}
	public By getChannelNameTxtField() {
		return channelNameTxtField;
	}
	public void setChannelNameTxtField(By channelNameTxtField) {
		this.channelNameTxtField = channelNameTxtField;
	}
	public By getChannelCodeTxtField() {
		return channelCodeTxtField;
	}
	public void setChannelCodeTxtField(By channelCodeTxtField) {
		this.channelCodeTxtField = channelCodeTxtField;
	}
	public By getSelectCategoryDpDwn() {
		return selectCategoryDpDwn;
	}
	public void setSelectCategoryDpDwn(By selectCategoryDpDwn) {
		this.selectCategoryDpDwn = selectCategoryDpDwn;
	}
	public By getSelectCategoryDpDwnOptionSelected() {
		return selectCategoryDpDwnOptionSelected;
	}
	public void setSelectCategoryDpDwnOptionSelected(By selectCategoryDpDwnOptionSelected) {
		this.selectCategoryDpDwnOptionSelected = selectCategoryDpDwnOptionSelected;
	}
	public By getSelectBouquetDpDwnOptions() {
		return selectBouquetDpDwnOptions;
	}
	public void setSelectBouquetDpDwnOptions(By selectBouquetDpDwnOptions) {
		this.selectBouquetDpDwnOptions = selectBouquetDpDwnOptions;
	}
	public By getSelectBouquetDpDwnSearchField() {
		return selectBouquetDpDwnSearchField;
	}
	public void setSelectBouquetDpDwnSearchField(By selectBouquetDpDwnSearchField) {
		this.selectBouquetDpDwnSearchField = selectBouquetDpDwnSearchField;
	}
	public By getSelectBouquetDpDwnChkBx() {
		return selectBouquetDpDwnChkBx;
	}
	public void setSelectBouquetDpDwnChkBx(By selectBouquetDpDwnChkBx) {
		this.selectBouquetDpDwnChkBx = selectBouquetDpDwnChkBx;
	}
	public By getChannelNumberTxtField() {
		return channelNumberTxtField;
	}
	public void setChannelNumberTxtField(By channelNumberTxtField) {
		this.channelNumberTxtField = channelNumberTxtField;
	}
	public By getSelectLanguageDpDwn() {
		return selectLanguageDpDwn;
	}
	public void setSelectLanguageDpDwn(By selectLanguageDpDwn) {
		this.selectLanguageDpDwn = selectLanguageDpDwn;
	}
	public By getSelectLanguageDpDwnOptionSelected() {
		return selectLanguageDpDwnOptionSelected;
	}
	public void setSelectLanguageDpDwnOptionSelected(By selectLanguageDpDwnOptionSelected) {
		this.selectLanguageDpDwnOptionSelected = selectLanguageDpDwnOptionSelected;
	}
	public By getIpAddressTxtField() {
		return ipAddressTxtField;
	}
	public void setIpAddressTxtField(By ipAddressTxtField) {
		this.ipAddressTxtField = ipAddressTxtField;
	}
	public By getPortTxtField() {
		return portTxtField;
	}
	public void setPortTxtField(By portTxtField) {
		this.portTxtField = portTxtField;
	}
	public By getNextBtn() {
		return nextBtn;
	}
	public void setNextBtn(By nextBtn) {
		this.nextBtn = nextBtn;
	}
	public By getChannelCreationToastMessage() {
		return channelCreationToastMessage;
	}
	public void setChannelCreationToastMessage(By channelCreationToastMessage) {
		this.channelCreationToastMessage = channelCreationToastMessage;
	}
	public By getChannelEditToastMessage() {
		return channelEditToastMessage;
	}
	public void setChannelEditToastMessage(By channelEditToastMessage) {
		this.channelEditToastMessage = channelEditToastMessage;
	}
	public By getChannelDeactivateToastMessage() {
		return channelDeactivateToastMessage;
	}
	public void setChannelDeactivateToastMessage(By channelDeactivateToastMessage) {
		this.channelDeactivateToastMessage = channelDeactivateToastMessage;
	}
	public By getChannelDeleteToastMessage() {
		return channelDeleteToastMessage;
	}
	public void setChannelDeleteToastMessage(By channelDeleteToastMessage) {
		this.channelDeleteToastMessage = channelDeleteToastMessage;
	}

	//getter and setter methods for common webelements
	public By getTvChannelsSearchTxtBx() {
		return tvChannelsSearchTxtBx;
	}
	public void setTvChannelsSearchTxtBx(By tvChannelsSearchTxtBx) {
		this.tvChannelsSearchTxtBx = tvChannelsSearchTxtBx;
	}
	public By getEllipsisBtn() {
		return ellipsisBtn;
	}
	public void setEllipsisBtn(By ellipsisBtn) {
		this.ellipsisBtn = ellipsisBtn;
	}
	public By getBouquetCreationToastMessage() {
		return bouquetCreationToastMessage;
	}
	public void setBouquetCreationToastMessage(By bouquetCreationToastMessage) {
		this.bouquetCreationToastMessage = bouquetCreationToastMessage;
	}

	//getter and setter methods for edit scenario
	public By getEditBtn() {
		return editBtn;
	}
	public void setEditBtn(By editBtn) {
		this.editBtn = editBtn;
	}
	public By getUpdateBtn() {
		return updateBtn;
	}
	public void setUpdateBtn(By updateBtn) {
		this.updateBtn = updateBtn;
	}
	public By getBouquetEditToastMessage() {
		return bouquetEditToastMessage;
	}
	public void setBouquetEditToastMessage(By bouquetEditToastMessage) {
		this.bouquetEditToastMessage = bouquetEditToastMessage;
	}

	//getter and setter methods for delete scenario
	public By getDeleteBtn() {
		return deleteBtn;
	}
	public void setDeleteBtn(By deleteBtn) {
		this.deleteBtn = deleteBtn;
	}
	public By getConfirmDeleteBtn() {
		return confirmDeleteBtn;
	}
	public void setConfirmDeleteBtn(By confirmDeleteBtn) {
		this.confirmDeleteBtn = confirmDeleteBtn;
	}
	public By getSearchResultTxtForDelete() {
		return searchResultTxtForDelete;
	}
	public void setSearchResultTxtForDelete(By searchResultTxtForDelete) {
		this.searchResultTxtForDelete = searchResultTxtForDelete;
	}
	public By getBouquetDeleteToastMessage() {
		return bouquetDeleteToastMessage;
	}
	public void setBouquetDeleteToastMessage(By bouquetDeleteToastMessage) {
		this.bouquetDeleteToastMessage = bouquetDeleteToastMessage;
	}

	//getter and setter methods for deactivate scenario
	public By getDeactivateBtn() {
		return deactivateBtn;
	}
	public void setDeactivateBtn(By deactivateBtn) {
		this.deactivateBtn = deactivateBtn;
	}

	public By getInactiveText() {
		return InactiveText;
	}
	public void setInactiveText(By inactiveText) {
		InactiveText = inactiveText;
	}

	//Bouquets Creation
	//navigating to Tvchannels page
	public void navigateToTvChannelsPage() {
		elementActions.clickOnElement(getCmsLnk());
		elementActions.clickOnElement(getTvChannelsLnk());
	}

	//Creating New Bouquets
	public boolean createNewBouquet() {
		elementActions.clickOnElement(getAddBouquetBtn());
		elementActions.sendKeysElement(getBouquetNameTxtBx(), ExcelUtil.fetchData("TvChannels", 1, 0));
		elementActions.sendKeysElement(getBouquetCodeTxtBx(), ExcelUtil.fetchData("TvChannels", 1, 1));
		elementActions.clickOnElement(getSelectFloorsDpDwnOptions());
		elementActions.sendKeysElement(getSelectFloorsDpDwnSearchField(), ExcelUtil.fetchData("TvChannels", 1, 2));
		elementActions.clickOnElement(getSelectFloorsDpDwnChkBx());
		try {
			elementActions.closePopup();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		elementActions.clickOnElement(getSelectRoomsDpDwnOptions());
		elementActions.clickOnElement(getTempOptionSelection());
		try {
			elementActions.closePopup();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		elementActions.clickOnElement(getSelectLocationsDpDwnOptions());
		elementActions.sendKeysElement(getSelectRoomsDpDwnSearchField(), ExcelUtil.fetchData("TvChannels", 1, 4));
		elementActions.clickOnElement(getSelectRoomsDpDwnChkBx());
		try {
			elementActions.closePopup();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		elementActions.clickOnElement(getAddBtn());
		boolean isNewBouquetsCreated = elementActions.checkIfElementIsPresent(getBouquetCreationToastMessage());
		return isNewBouquetsCreated;
	}

	//edit created Bouquets
	public boolean editBouquet() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elementActions.sendKeysElement(getTvChannelsSearchTxtBx(), ExcelUtil.fetchData("TvChannels", 1, 0));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elementActions.clickOnElement(getEllipsisBtn());
		elementActions.clickOnElement(getEditBtn());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elementActions.clearData(getBouquetNameTxtBx());
		elementActions.clearData(getBouquetCodeTxtBx());
		elementActions.clickOnElement(getSelectFloorsDpDwnOptions());
		elementActions.clickOnElement(getSelectFloorsDpDwnChkBx());
		try {
			elementActions.closePopup();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		elementActions.clickOnElement(getSelectLocationsDpDwnOptions());
		elementActions.clickOnElement(getSelectLocationsDpDwnChkBx());
		try {
			elementActions.closePopup();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		elementActions.sendKeysElement(getBouquetNameTxtBx(), ExcelUtil.fetchData("TvChannels", 2, 0));
		elementActions.sendKeysElement(getBouquetCodeTxtBx(), ExcelUtil.fetchData("TvChannels", 2, 1));
		elementActions.clickOnElement(getSelectFloorsDpDwnOptions());
		elementActions.sendKeysElement(getSelectFloorsDpDwnSearchField(), ExcelUtil.fetchData("TvChannels", 2, 2));
		elementActions.clickOnElement(getSelectFloorsDpDwnChkBx());
		try {
			elementActions.closePopup();
		} catch (AWTException e) {
			e.printStackTrace();
		}

		elementActions.clickOnElement(getSelectRoomsDpDwnOptions());
		elementActions.clickOnElement(getTempOptionSelection());
		try {
			elementActions.closePopup();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		elementActions.clickOnElement(getSelectLocationsDpDwnOptions());
		elementActions.sendKeysElement(getSelectLocationsDpDwnSearchField(), ExcelUtil.fetchData("TvChannels", 2, 4));
		elementActions.clickOnElement(getSelectLocationsDpDwnChkBx());
		try {
			elementActions.closePopup();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		elementActions.clickOnElement(getUpdateBtn());
		boolean isBouquetsEdited = elementActions.checkIfElementIsPresent(getBouquetEditToastMessage());
		return isBouquetsEdited;
	}

	//Delete created Bouquets
	public boolean deleteBouquet() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elementActions.sendKeysElement(getTvChannelsSearchTxtBx(), ExcelUtil.fetchData("TvChannels", 2, 0));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elementActions.clickOnElement(getEllipsisBtn());
		elementActions.clickOnElement(getDeleteBtn());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elementActions.clickOnElement(getConfirmDeleteBtn());
		boolean isBouquetsDeleted = elementActions.checkIfElementIsPresent(getBouquetDeleteToastMessage());
		return isBouquetsDeleted;

	}

	//Creating New Category
	public boolean createNewCategory() {
		elementActions.clickOnElement(getCategoryTb());
		elementActions.clickOnElement(getAddCategoryBtn());
		elementActions.sendKeysElement(getCategoryNameTxtField(), ExcelUtil.fetchData("TvChannels", 1, 5));
		elementActions.sendKeysElement(getCategoryCodeTxtField(), ExcelUtil.fetchData("TvChannels", 1, 6));
		elementActions.clickOnElement(getActiveChkBx());
		elementActions.clickOnElement(getAddBtn());
		boolean isCategoryCreated = elementActions.checkIfElementIsPresent(getCategoryCreationToastMessage());
		return isCategoryCreated;
	}

	//Deactivating Category
	public boolean deactivateCategory() {
		elementActions.clickOnElement(getCategoryTb());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elementActions.sendKeysElement(getTvChannelsSearchTxtBx(), ExcelUtil.fetchData("TvChannels", 2, 5));
		elementActions.clickOnElement(getEllipsisBtn());
		elementActions.clickOnElement(getDeactivateBtn());
		boolean isCategoryDeactivated = elementActions.checkIfElementIsPresent(getcategoryDeactivateToastMessage());
		return isCategoryDeactivated;
	}

	//Edit category
	public boolean editCategory() {
		elementActions.clickOnElement(getCategoryTb());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elementActions.sendKeysElement(getTvChannelsSearchTxtBx(), ExcelUtil.fetchData("TvChannels", 1, 5));
		elementActions.clickOnElement(getEllipsisBtn());
		elementActions.clickOnElement(getEditBtn());
		elementActions.clearData(getCategoryNameTxtField());
		elementActions.clearData(getCategoryCodeTxtField());
		elementActions.clickOnElement(getActiveChkBx());
		elementActions.sendKeysElement(getCategoryNameTxtField(), ExcelUtil.fetchData("TvChannels", 2, 5));
		elementActions.sendKeysElement(getCategoryCodeTxtField(), ExcelUtil.fetchData("TvChannels", 2, 6));
		elementActions.clickOnElement(getActiveChkBx());
		elementActions.clickOnElement(getUpdateBtn());
		boolean isCategoryEdited = elementActions.checkIfElementIsPresent(getCategoryEditToastMessage());
		return isCategoryEdited;
	}

	//Delete Category
	public boolean deleteCategory() {
		elementActions.clickOnElement(getCategoryTb());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elementActions.sendKeysElement(getTvChannelsSearchTxtBx(), ExcelUtil.fetchData("TvChannels", 2, 5));
		elementActions.clickOnElement(getEllipsisBtn());
		elementActions.clickOnElement(getDeleteBtn());
		elementActions.clickOnElement(getConfirmDeleteBtn());
		boolean isCategoryDeleted = elementActions.checkIfElementIsPresent(getCategoryDeleteToastMessage());
		return isCategoryDeleted;
	}

	//Create Channels
	public boolean createNewChannels() {
		elementActions.clickOnElement(getChannelsTb());
		elementActions.clickOnElement(getAddChannelBtn());
		elementActions.sendKeysElement(getChannelNameTxtField(), ExcelUtil.fetchData("TvChannels", 1, 7));
		elementActions.sendKeysElement(getChannelCodeTxtField(), ExcelUtil.fetchData("TvChannels", 1, 8));
		elementActions.clickOnElement(getSelectCategoryDpDwn());
		elementActions.selectDropdownOption(getSelectCategoryDpDwnOptionSelected(), ExcelUtil.fetchData("TvChannels", 2, 5));
		elementActions.clickOnElement(getSelectBouquetDpDwnOptions());
		elementActions.sendKeysElement(getSelectBouquetDpDwnSearchField(), ExcelUtil.fetchData("TvChannels", 2, 0));
		elementActions.clickOnElement(getSelectBouquetDpDwnChkBx());
		try {
			elementActions.closePopup();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		elementActions.sendKeysElement(getChannelNumberTxtField(), ExcelUtil.fetchData("TvChannels", 1, 9));
		elementActions.clickOnElement(getSelectLanguageDpDwn());
		elementActions.selectDropdownOption(getSelectLanguageDpDwnOptionSelected(), ExcelUtil.fetchData("TvChannels", 1, 10));
		elementActions.sendKeysElement(getIpAddressTxtField(), ExcelUtil.fetchData("TvChannels", 1, 11));
		elementActions.sendKeysElement(getPortTxtField(), ExcelUtil.fetchData("TvChannels", 1, 12));
		elementActions.clickOnElement(getNextBtn());
		elementActions.clickOnElement(getAddBtn());
		boolean isChannelCreated = elementActions.checkIfElementIsPresent(getChannelCreationToastMessage());
		return isChannelCreated;
	}

	//deactivate channels
	public boolean deactivateChannels() {

		elementActions.clickOnElement(getChannelsTb());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elementActions.sendKeysElement(getTvChannelsSearchTxtBx(), ExcelUtil.fetchData("TvChannels", 2, 7));

		elementActions.clickOnElement(getEllipsisBtn());
		elementActions.clickOnElement(getDeactivateBtn());
		boolean isChannelDeactivated = elementActions.checkIfElementIsPresent(getChannelDeactivateToastMessage());
		return isChannelDeactivated;
	}

	//edit channels
	public boolean editChannels() {
		elementActions.clickOnElement(getChannelsTb());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elementActions.sendKeysElement(getTvChannelsSearchTxtBx(), ExcelUtil.fetchData("TvChannels", 1, 7));
		elementActions.clickOnElement(getEllipsisBtn());
		elementActions.clickOnElement(getEditBtn());
		elementActions.clearData(getChannelNameTxtField());
		elementActions.clearData(getChannelCodeTxtField());
		elementActions.clearData(getChannelNumberTxtField());
		elementActions.clearData(getIpAddressTxtField());
		elementActions.clearData(getPortTxtField());
		elementActions.sendKeysElement(getChannelNameTxtField(), ExcelUtil.fetchData("TvChannels", 2, 7));
		elementActions.sendKeysElement(getChannelCodeTxtField(), ExcelUtil.fetchData("TvChannels", 2, 8));
		elementActions.clickOnElement(getSelectCategoryDpDwn());
		elementActions.selectDropdownOption(getSelectCategoryDpDwnOptionSelected(), ExcelUtil.fetchData("TvChannels", 2, 5));
		elementActions.sendKeysElement(getChannelNumberTxtField(), ExcelUtil.fetchData("TvChannels", 2, 9));
		elementActions.clickOnElement(getSelectLanguageDpDwn());
		elementActions.selectDropdownOption(getSelectLanguageDpDwnOptionSelected(), ExcelUtil.fetchData("TvChannels", 2, 10));
		elementActions.sendKeysElement(getIpAddressTxtField(), ExcelUtil.fetchData("TvChannels", 2, 11));
		elementActions.sendKeysElement(getPortTxtField(), ExcelUtil.fetchData("TvChannels", 2, 12));
		elementActions.clickOnElement(getNextBtn());
		elementActions.clickOnElement(getUpdateBtn());
		boolean isChannelEdited = elementActions.checkIfElementIsPresent(getChannelEditToastMessage());
		return isChannelEdited;	
	}

	//delete channels
	public boolean deleteChannels() {
		elementActions.clickOnElement(getChannelsTb());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elementActions.sendKeysElement(getTvChannelsSearchTxtBx(), ExcelUtil.fetchData("TvChannels", 2, 7));
		elementActions.clickOnElement(getEllipsisBtn());
		elementActions.clickOnElement(getDeleteBtn());
		elementActions.clickOnElement(getConfirmDeleteBtn());
		boolean isChannelDeleted = elementActions.checkIfElementIsPresent(getChannelDeleteToastMessage());
		return isChannelDeleted;
	}
}