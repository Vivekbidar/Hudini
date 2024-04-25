package io.stage.hudinielevate.cms.pages;

import java.awt.AWTException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.stage.hudinielevate.cms.base.BaseClass;
import io.stage.hudinielevate.cms.util.ElementActions;
import io.stage.hudinielevate.cms.util.ExcelUtil;

public class PropertiesPage extends BaseClass {

	public static WebDriver driver;
	public static Properties properties;
	ElementActions elementActions;

	public PropertiesPage(WebDriver driver) {
		this.driver = driver;
		elementActions = new ElementActions(driver);

	}
	
	private By brandsTab = By.xpath("//span[text()='Brands']");
	private By hotelsTab = By.xpath("//span[text()='Hotels']");

	private By dashboardHdrTxt = By.xpath("//h4[contains(text(),'Dashboard')]");
	// Group Creation:
	private By addGroupBtn = By.xpath("//span[contains(text(),'Add Group')]");
	private By groupNameTxtBx = By.id("group_name_input");
	private By groupCodeTxtBx = By.id("group_code_input");
	private By groupEmailIDTxtBx = By.id("group_email_id_input");
	private By groupDigitalKeyTxtBx = By.id("digital_key_input");
	private By groupDescriptionTxtBx = By.id("description_input");
	private By addBtn = By.xpath("//button[@type='submit']");
	private By searchGroupTxtBx = By.xpath("//div/input[@type='text']");
	private By ellipsisBtn = By.xpath("//tbody[@class='MuiTableBody-root']//span[@class='MuiButton-label']");
	private By editGroupBtn = By.xpath("(//li[@role='menuitem'])[1]");
	private By deleteGroupBtn = By.xpath("(//li[@role='menuitem'])[3]");
	private By confirmGroupDeleteBtn = By.xpath("//span[text()='Delete']");
	private By groupDeletionChkTxt = By.xpath("//p[text()='0-0 of 0']");

	// Brand Creation:
	private By addBrandBtn = By.xpath("//span[text()='Add Brand']");
	private By hotelGroupDrpDwn = By.id("select_hotel_group_select");
	private By hotelGroupOptions = By.xpath("//ul[@aria-labelledby='select_hotel_group_label']/li");
	private By brandNameTxtBx = By.id("brand_name_input");
	private By brandCodeTxtBx = By.id("brand_code_input");
	private By brandDescriptionTxtBx = By.id("description_input");
	private By nextBtn2 = By.xpath("//span[text()='Next']");
	private By browseBtn = By.xpath("//span[text()='Browse']");
	private By saveBtn = By.xpath("//span[text()='Save']");
	private By updateBtn = By.xpath("//span[text()='Update']");
	private By searchBrandTxtBx = By.xpath("//input[@type='text']");

	// Hotel Creation:
	private By addHotelBtn = By.xpath("//span[text()='Add Hotel']");
	private By selectHotelGroupDpDown = By.xpath("//div[@id='hotel_group_select']");
	private By hotelGroupOption = By.xpath("//ul[@aria-labelledby='hotel_group_label']/li");
	private By selectBrandDrpDwn = By.xpath("//div[@id='brand_select']");
	private By selectBrandOption = By.xpath("//ul[@aria-labelledby='brand_label']/li");
	private By hotelNameTxtBx = By.id("hotel_name_input");
	private By hotelCodeTxtBx = By.id("hotel_code_input");
	private By hotelDescriptionTxtBx = By.id("description_input");
	private By currencyOptions = By.id("currency_select");
	private By currentOptionSelected = By.xpath("//ul[@aria-labelledby='currency_label']/li");
	private By phoneNumberTxtBx = By.xpath("//input[@type='tel']");
	private By travelTypeDropdown = By.id("travel_type_select");
	private By travelTypeOption = By.xpath("//div[@class='MuiListItemText-root']/span");
	private By travelOptionChkBx = By.xpath("//div[@class='MuiListItemIcon-root']/span");
	private By interestsDropdown = By.id("interests_select");
	private By interestsOption = By.xpath("//div[@class='MuiListItemText-root']/span");
	private By interestsChkBx = By
			.xpath("//ul[@aria-labelledby='interests_label']/li[@role='option']//input[@type='checkbox']");
	private By nextBtn = By.xpath("//span[text()='Next']");
	private By addressLine1TxtBx = By.id("address_line_1_input");
	private By addressLine2TxtBx = By.id("address_line_2_input");
	private By countryDropdown = By.id("country_select");
	private By countryOption = By.xpath("//ul[@aria-labelledby='country_label']/li");
	private By stateTxtBx = By.id("state_input");
	private By pincodeTxtBx = By.id("postal_code_input");
	private By cityTxtBx = By.id("city_input");
	private By latitudeTxtBx = By.id("latitude_input");
	private By longitudeTxtBx = By.id("longitude_input");
	private By areaTxtBx = By.id("area_input");
	private By timezoneTxtBx = By.id("timezone_input");
	private By nextBtn3 = By.xpath("//span[text()='Next']");
	private By browsePDFDocument = By.xpath("//span[text()='Browser']");
	private By urlTxtBx = By.id("document-url");
	private By nextBtn4 = By.xpath("//span[text()='Next']");
	private By informationDropdown = By.id("information_type_select");
	private By informationDropdownOption = By.xpath("//ul[@aria-labelledby='information_type_label']/li");
	private By emailTitleTxtBx = By.id("add_email_title_input");
	private By emailDisplayTitleTxtBx = By.id("display_title_input");
	private By emailTxtBx2 = By.id("email_input");
	private By nextBtn5 = By.xpath("//span[text()='Next']");
	private By highlightFeaturesOptionA = By.xpath("//span[text()='Wellness']");
	private By highlightFeaturesOptionB = By.xpath("//span[text()='Internet']");
	private By highlightFeaturesOptionC = By.xpath("//span[text()='Coffee Machine']");
	private By nextBtn6 = By.xpath("//span[text()='Next']");
	private By browseImage = By.xpath("//span[text()='Browse']");
	private By finalAddBtn = By.xpath("//span[text()='Add']");
	private By searchHotelTxtBx = By.xpath("//input[@type='text']");
	private By deleteHotelBtn = By.xpath("(//li[@role='menuitem'])[3]");
	private By confirmHotelDeleteBtn = By.xpath("//span[text()='Delete']");
	private By hotelDeletionChkTxt = By.xpath("//p[text()='0-0 of 0']");
	private By editHotelBtn = By.xpath("(//li[@role='menuitem'])[1]");
	private By zeroResultsTxt = By.xpath("//p[text()='0-0 of 0']");
	private By saveBtn2 = By.xpath("//span[text()='Save']");
	private By updateBtn2 = By.xpath("//span[text()='Update']");
	private By addBtn2 = By.xpath("//span[text()='Add']");
	
	private By hotelMenuLnk = By.xpath("//span[text()='Hotel']");
	private By restaurantsMenuLnk = By.xpath("//span[text()='Restaurants']");
	
	public By getHotelMenuLnk() {
		return hotelMenuLnk;
	}

	public void setHotelMenuLnk(By hotelMenuLnk) {
		this.hotelMenuLnk = hotelMenuLnk;
	}
	
	public By getRestaurantsMenuLnk() {
		return restaurantsMenuLnk;
	}

	public void setRestaurantsMenuLnk(By restaurantsMenuLnk) {
		this.restaurantsMenuLnk = restaurantsMenuLnk;
	}	

	public By getAddBtn2() {
		return addBtn2;
	}

	public void setAddBtn2(By addBtn2) {
		this.addBtn2 = addBtn2;
	}

	public By getSaveBtn2() {
		return saveBtn2;
	}

	public void setSaveBtn2(By saveBtn2) {
		this.saveBtn2 = saveBtn2;
	}

	public By getUpdateBtn2() {
		return updateBtn2;
	}

	public void setUpdateBtn2(By updateBtn2) {
		this.updateBtn2 = updateBtn2;
	}

	public By getEditHotelBtn() {
		return editHotelBtn;
	}

	public void setEditHotelBtn(By editHotelBtn) {
		this.editHotelBtn = editHotelBtn;
	}

	public By getZeroResultsTxt() {
		return zeroResultsTxt;
	}

	public void setZeroResultsTxt(By zeroResultsTxt) {
		this.zeroResultsTxt = zeroResultsTxt;
	}

	public By getHotelDeletionChkTxt() {
		return hotelDeletionChkTxt;
	}

	public void setHotelDeletionChkTxt(By hotelDeletionChkTxt) {
		this.hotelDeletionChkTxt = hotelDeletionChkTxt;
	}

	public By getConfirmHotelDeleteBtn() {
		return confirmHotelDeleteBtn;
	}

	public void setconfirmHotelDeleteBtn(By confirmHotelDeleteBtn) {
		this.confirmHotelDeleteBtn = confirmHotelDeleteBtn;
	}

	public By getBrandsTab() {
		return brandsTab;
	}

	public void setBrandsTab(By brandsTab) {
		this.brandsTab = brandsTab;
	}

	public By getDeleteHotelBtn() {
		return deleteHotelBtn;
	}

	public void setDeleteHotelBtn(By deleteHotelBtn) {
		this.deleteHotelBtn = deleteHotelBtn;
	}

	public By getSearchHotelTxtBx() {
		return searchHotelTxtBx;
	}

	public void setSearchHotelTxtBx(By searchHotelTxtBx) {
		this.searchHotelTxtBx = searchHotelTxtBx;
	}

	public By getSearchBrandTxtBx() {
		return searchBrandTxtBx;
	}

	public void setSearchBrandTxtBx(By searchBrandTxtBx) {
		this.searchBrandTxtBx = searchBrandTxtBx;
	}

	public By getHotelsTab() {
		return hotelsTab;
	}

	public void setHotelsTab(By hotelsTab) {
		this.hotelsTab = hotelsTab;
	}

	public By getDashboardHdrTxt() {
		return dashboardHdrTxt;
	}

	public void setDashboardHdrTxt(By dashboardHdrTxt) {
		this.dashboardHdrTxt = dashboardHdrTxt;
	}

	public By getAddGroupBtn() {
		return addGroupBtn;
	}

	public void setAddGroupBtn(By addGroupBtn) {
		this.addGroupBtn = addGroupBtn;
	}

	public By getGroupNameTxtBx() {
		return groupNameTxtBx;
	}

	public void setGroupNameTxtBx(By groupNameTxtBx) {
		this.groupNameTxtBx = groupNameTxtBx;
	}

	public By getGroupCodeTxtBx() {
		return groupCodeTxtBx;
	}

	public void setGroupCodeTxtBx(By groupCodeTxtBx) {
		this.groupCodeTxtBx = groupCodeTxtBx;
	}

	public By getGroupEmailIDTxtBx() {
		return groupEmailIDTxtBx;
	}

	public void setGroupEmailIDTxtBx(By groupEmailIDTxtBx) {
		this.groupEmailIDTxtBx = groupEmailIDTxtBx;
	}

	public By getGroupDigitalKeyTxtBx() {
		return groupDigitalKeyTxtBx;
	}

	public void setGroupDigitalKeyTxtBx(By groupDigitalKeyTxtBx) {
		this.groupDigitalKeyTxtBx = groupDigitalKeyTxtBx;
	}

	public By getGroupDescriptionTxtBx() {
		return groupDescriptionTxtBx;
	}

	public void setGroupDescriptionTxtBx(By groupDescriptionTxtBx) {
		this.groupDescriptionTxtBx = groupDescriptionTxtBx;
	}

	public By getAddBtn() {
		return addBtn;
	}

	public void setAddBtn(By addBtn) {
		this.addBtn = addBtn;
	}

	public By getSearchGroupTxtBx() {
		return searchGroupTxtBx;
	}

	public void setSearchGroupTxtBx(By searchGroupTxtBx) {
		this.searchGroupTxtBx = searchGroupTxtBx;
	}

	public By getEllipsisBtn() {
		return ellipsisBtn;
	}

	public void setEllipsisBtn(By ellipsisBtn) {
		this.ellipsisBtn = ellipsisBtn;
	}

	public By getEditGroupBtn() {
		return editGroupBtn;
	}

	public void setEditGroupBtn(By editGroupBtn) {
		this.editGroupBtn = editGroupBtn;
	}

	public By getDeleteGroupBtn() {
		return deleteGroupBtn;
	}

	public void setDeleteGroupBtn(By deleteGroupBtn) {
		this.deleteGroupBtn = deleteGroupBtn;
	}

	public By getConfirmGroupDeleteBtn() {
		return confirmGroupDeleteBtn;
	}

	public void setConfirmGroupDeleteBtn(By confirmGroupDeleteBtn) {
		this.confirmGroupDeleteBtn = confirmGroupDeleteBtn;
	}

	public By getGroupDeletionChkTxt() {
		return groupDeletionChkTxt;
	}

	public void setGroupDeletionChkTxt(By groupDeletionChkTxt) {
		this.groupDeletionChkTxt = groupDeletionChkTxt;
	}

	public By getAddBrandBtn() {
		return addBrandBtn;
	}

	public void setAddBrandBtn(By addBrandBtn) {
		this.addBrandBtn = addBrandBtn;
	}

	public By getHotelGroupDrpDwn() {
		return hotelGroupDrpDwn;
	}

	public void setHotelGroupDrpDwn(By hotelGroupDrpDwn) {
		this.hotelGroupDrpDwn = hotelGroupDrpDwn;
	}

	public By getHotelGroupOptions() {
		return hotelGroupOptions;
	}

	public void setHotelGroupOptions(By hotelGroupOptions) {
		this.hotelGroupOptions = hotelGroupOptions;
	}

	public By getBrandNameTxtBx() {
		return brandNameTxtBx;
	}

	public void setBrandNameTxtBx(By brandNameTxtBx) {
		this.brandNameTxtBx = brandNameTxtBx;
	}

	public By getBrandCodeTxtBx() {
		return brandCodeTxtBx;
	}

	public void setBrandCodeTxtBx(By brandCodeTxtBx) {
		this.brandCodeTxtBx = brandCodeTxtBx;
	}

	public By getBrandDescriptionTxtBx() {
		return brandDescriptionTxtBx;
	}

	public void setBrandDescrptionTxtBx(By brandDescriptionTxtBx) {
		this.brandDescriptionTxtBx = brandDescriptionTxtBx;
	}

	public By getNextBtn2() {
		return nextBtn2;
	}

	public void setNextBtn2(By nextBtn2) {
		this.nextBtn2 = nextBtn2;
	}

	public By getBrowseBtn() {
		return browseBtn;
	}

	public void setBrowseBtn(By browseBtn) {
		this.browseBtn = browseBtn;
	}

	public By getSaveBtn() {
		return saveBtn;
	}

	public void setSaveBtn(By saveBtn) {
		this.saveBtn = saveBtn;
	}

	public By getUpdateBtn() {
		return updateBtn;
	}

	public void setUpdateBtn(By updateBtn) {
		this.updateBtn = updateBtn;
	}

	public By getAddHotelBtn() {
		return addHotelBtn;
	}

	public void setAddHotelBtn(By addHotelBtn) {
		this.addHotelBtn = addHotelBtn;
	}

	public By getSelectHotelGroupDpDown() {
		return selectHotelGroupDpDown;
	}

	public void setSelectHotelGroupDpDown(By selectHotelGroupDpDown) {
		this.selectHotelGroupDpDown = selectHotelGroupDpDown;
	}

	public By getHotelGroupOption() {
		return hotelGroupOption;
	}

	public void setHotelGroupOption(By hotelGroupOption) {
		this.hotelGroupOption = hotelGroupOption;
	}

	public By getSelectBrandDrpDwn() {
		return selectBrandDrpDwn;
	}

	public void setSelectBrandDrpDwn(By selectBrandDrpDwn) {
		this.selectBrandDrpDwn = selectBrandDrpDwn;
	}

	public By getSelectBrandOption() {
		return selectBrandOption;
	}

	public void setSelectBrandOption(By selectBrandOption) {
		this.selectBrandOption = selectBrandOption;
	}

	public By getHotelNameTxtBx() {
		return hotelNameTxtBx;
	}

	public void setHotelNameTxtBx(By hotelNameTxtBx) {
		this.hotelNameTxtBx = hotelNameTxtBx;
	}

	public By getHotelCodeTxtBx() {
		return hotelCodeTxtBx;
	}

	public void setHotelCodeTxtBx(By hotelCodeTxtBx) {
		this.hotelCodeTxtBx = hotelCodeTxtBx;
	}

	public By getHotelDescriptionTxtBx() {
		return hotelDescriptionTxtBx;
	}

	public void setHotelDescriptionTxtBx(By hotelDescriptionTxtBx) {
		this.hotelDescriptionTxtBx = hotelDescriptionTxtBx;
	}

	public By getCurrencyOptions() {
		return currencyOptions;
	}

	public void setCurrencyOptions(By currencyOptions) {
		this.currencyOptions = currencyOptions;
	}

	public By getCurrentOptionSelected() {
		return currentOptionSelected;
	}

	public void setCurrentOptionSelected(By currentOptionSelected) {
		this.currentOptionSelected = currentOptionSelected;
	}

	public By getPhoneNumberTxtBx() {
		return phoneNumberTxtBx;
	}

	public void setPhoneNumberTxtBx(By phoneNumberTxtBx) {
		this.phoneNumberTxtBx = phoneNumberTxtBx;
	}

	public By getTravelTypeDropdown() {
		return travelTypeDropdown;
	}

	public void setTravelTypeDropdown(By travelTypeDropdown) {
		this.travelTypeDropdown = travelTypeDropdown;
	}

	public By getTravelTypeOption() {
		return travelTypeOption;
	}

	public void setTravelTypeOption(By travelTypeOption) {
		this.travelTypeOption = travelTypeOption;
	}

	public By getTravelOptionChkBx() {
		return travelOptionChkBx;
	}

	public void setTravelOptionChkBx(By travelOptionChkBx) {
		this.travelOptionChkBx = travelOptionChkBx;
	}

	public By getInterestsDropdown() {
		return interestsDropdown;
	}

	public void setInterestsDropdown(By interestsDropdown) {
		this.interestsDropdown = interestsDropdown;
	}

	public By getInterestsOption() {
		return interestsOption;
	}

	public void setInterestsOption(By interestsOption) {
		this.interestsOption = interestsOption;
	}

	public By getInterestsChkBx() {
		return interestsChkBx;
	}

	public void setInterestsChkBx(By interestsChkBx) {
		this.interestsChkBx = interestsChkBx;
	}

	public By getNextBtn() {
		return nextBtn;
	}

	public void setNextBtn(By nextBtn) {
		this.nextBtn = nextBtn;
	}

	public By getAddressLine1TxtBx() {
		return addressLine1TxtBx;
	}

	public void setAddressLine1TxtBx(By addressLine1TxtBx) {
		this.addressLine1TxtBx = addressLine1TxtBx;
	}

	public By getAddressLine2TxtBx() {
		return addressLine2TxtBx;
	}

	public void setAddressLine2TxtBx(By addressLine2TxtBx) {
		this.addressLine2TxtBx = addressLine2TxtBx;
	}

	public By getCountryDropdown() {
		return countryDropdown;
	}

	public void setCountryDropdown(By countryDropdown) {
		this.countryDropdown = countryDropdown;
	}

	public By getCountryOption() {
		return countryOption;
	}

	public void setCountryOption(By countryOption) {
		this.countryOption = countryOption;
	}

	public By getStateTxtBx() {
		return stateTxtBx;
	}

	public void setStateTxtBx(By stateTxtBx) {
		this.stateTxtBx = stateTxtBx;
	}

	public By getPincodeTxtBx() {
		return pincodeTxtBx;
	}

	public void setPincodeTxtBx(By pincodeTxtBx) {
		this.pincodeTxtBx = pincodeTxtBx;
	}

	public By getCityTxtBx() {
		return cityTxtBx;
	}

	public void setCityTxtBx(By cityTxtBx) {
		this.cityTxtBx = cityTxtBx;
	}

	public By getLatitudeTxtBx() {
		return latitudeTxtBx;
	}

	public void setLatitudeTxtBx(By latitudeTxtBx) {
		this.latitudeTxtBx = latitudeTxtBx;
	}

	public By getLongitudeTxtBx() {
		return longitudeTxtBx;
	}

	public void setLongitudeTxtBx(By longitudeTxtBx) {
		this.longitudeTxtBx = longitudeTxtBx;
	}

	public By getAreaTxtBx() {
		return areaTxtBx;
	}

	public void setAreaTxtBx(By areaTxtBx) {
		this.areaTxtBx = areaTxtBx;
	}

	public By getTimezoneTxtBx() {
		return timezoneTxtBx;
	}

	public void setTimezoneTxtBx(By timezoneTxtBx) {
		this.timezoneTxtBx = timezoneTxtBx;
	}

	public By getNextBtn3() {
		return nextBtn3;
	}

	public void setNextBtn3(By nextBtn3) {
		this.nextBtn3 = nextBtn3;
	}

	public By getBrowsePDFDocument() {
		return browsePDFDocument;
	}

	public void setBrowsePDFDocument(By browsePDFDocument) {
		this.browsePDFDocument = browsePDFDocument;
	}

	public By getUrlTxtBx() {
		return urlTxtBx;
	}

	public void setUrlTxtBx(By urlTxtBx) {
		this.urlTxtBx = urlTxtBx;
	}

	public By getNextBtn4() {
		return nextBtn4;
	}

	public void setNextBtn4(By nextBtn4) {
		this.nextBtn4 = nextBtn4;
	}

	public By getInformationDropdown() {
		return informationDropdown;
	}

	public void setInformationDropdown(By informationDropdown) {
		this.informationDropdown = informationDropdown;
	}

	public By getInformationDropdownOption() {
		return informationDropdownOption;
	}

	public void setInformationDropdownOption(By informationDropdownOption) {
		this.informationDropdownOption = informationDropdownOption;
	}

	public By getEmailTitleTxtBx() {
		return emailTitleTxtBx;
	}

	public void setEmailTitleTxtBx(By emailTitleTxtBx) {
		this.emailTitleTxtBx = emailTitleTxtBx;
	}

	public By getEmailDisplayTitleTxtBx() {
		return emailDisplayTitleTxtBx;
	}

	public void setEmailDisplayTitleTxtBx(By emailDisplayTitleTxtBx) {
		this.emailDisplayTitleTxtBx = emailDisplayTitleTxtBx;
	}

	public By getEmailTxtBx2() {
		return emailTxtBx2;
	}

	public void setEmailTxtBx2(By emailTxtBx2) {
		this.emailTxtBx2 = emailTxtBx2;
	}

	public By getNextBtn5() {
		return nextBtn5;
	}

	public void setNextBtn5(By nextBtn5) {
		this.nextBtn5 = nextBtn5;
	}

	public By getHighlightFeaturesOptionA() {
		return highlightFeaturesOptionA;
	}

	public void setHighlightFeaturesOptionA(By highlightFeaturesOptionA) {
		this.highlightFeaturesOptionA = highlightFeaturesOptionA;
	}

	public By getHighlightFeaturesOptionB() {
		return highlightFeaturesOptionB;
	}

	public void setHighlightFeaturesOptionB(By highlightFeaturesOptionB) {
		this.highlightFeaturesOptionB = highlightFeaturesOptionB;
	}

	public By getHighlightFeaturesOptionC() {
		return highlightFeaturesOptionC;
	}

	public void setHighlightFeaturesOptionC(By highlightFeaturesOptionC) {
		this.highlightFeaturesOptionC = highlightFeaturesOptionC;
	}

	public By getNextBtn6() {
		return nextBtn6;
	}

	public void setNextBtn6(By nextBtn6) {
		this.nextBtn6 = nextBtn6;
	}

	public By getBrowseImage() {
		return browseImage;
	}

	public void setBrowseImage(By browseImage) {
		this.browseImage = browseImage;
	}

	public By getFinalAddBtn() {
		return finalAddBtn;
	}

	public void setFinalAddBtn(By finalAddBtn) {
		this.finalAddBtn = finalAddBtn;
	}

	public boolean createGroup() {
		boolean isAddGroupBtnPresent = elementActions.checkIfElementIsPresent(getAddGroupBtn());
		return isAddGroupBtnPresent;

	}

	public boolean createNewGroup() {
		elementActions.clickOnElement(getAddGroupBtn());
		elementActions.sendKeysElement(getGroupNameTxtBx(), ExcelUtil.fetchData("Group", 1, 0));
		elementActions.sendKeysElement(getGroupCodeTxtBx(), ExcelUtil.fetchData("Group", 1, 1));
		elementActions.sendKeysElement(getGroupEmailIDTxtBx(), ExcelUtil.fetchData("Group", 1, 2));
		elementActions.sendKeysElement(getGroupDigitalKeyTxtBx(), ExcelUtil.fetchData("Group", 1, 3));
		elementActions.sendKeysElement(getGroupDescriptionTxtBx(), ExcelUtil.fetchData("Group", 1, 4));

		elementActions.clickOnElement(getAddBtn());

		// Code to verify if the group is created successfully
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		elementActions.sendKeysElement(getSearchGroupTxtBx(), ExcelUtil.fetchData("Group", 1, 0));

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean isGroupCreated = elementActions.checkIfElementIsPresent(getEllipsisBtn());
		return isGroupCreated;

	}

	public boolean editExistingGroup() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		elementActions.sendKeysElement(getSearchGroupTxtBx(), ExcelUtil.fetchData("Group", 1, 0));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		elementActions.clickOnElement(getEllipsisBtn());
		elementActions.clickOnElement(getEditGroupBtn());

		System.out.println("Group name=" + elementActions.getText(getGroupNameTxtBx()));
		System.out.println("Group code=" + elementActions.getText(getGroupCodeTxtBx()));
		System.out.println("Group email ID=" + elementActions.getText(getGroupEmailIDTxtBx()));
		System.out.println("Group digital key=" + elementActions.getText(getGroupDigitalKeyTxtBx()));
		System.out.println("Group description=" + elementActions.getText(getGroupDescriptionTxtBx()));

		elementActions.clearData(getGroupNameTxtBx());
		elementActions.clearData(getGroupCodeTxtBx());
		elementActions.clearData(getGroupEmailIDTxtBx());
		elementActions.clearData(getGroupDigitalKeyTxtBx());
		elementActions.clearData(getGroupDescriptionTxtBx());

		elementActions.sendKeysElement(getGroupNameTxtBx(), ExcelUtil.fetchData("Group", 2, 0));
		elementActions.sendKeysElement(getGroupCodeTxtBx(), ExcelUtil.fetchData("Group", 2, 1));
		elementActions.sendKeysElement(getGroupEmailIDTxtBx(), ExcelUtil.fetchData("Group", 2, 2));
		elementActions.sendKeysElement(getGroupDigitalKeyTxtBx(), ExcelUtil.fetchData("Group", 2, 3));
		elementActions.sendKeysElement(getGroupDescriptionTxtBx(), ExcelUtil.fetchData("Group", 2, 4));

		elementActions.clickOnElement(getUpdateBtn());

		// Code to verify if the group is updated successfully
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		elementActions.sendKeysElement(getSearchGroupTxtBx(), ExcelUtil.fetchData("Group", 2, 0));

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean isGroupUpdated = elementActions.checkIfElementIsPresent(getEllipsisBtn());
		return isGroupUpdated;

	}

	public boolean deleteGroup() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		elementActions.sendKeysElement(getSearchGroupTxtBx(), ExcelUtil.fetchData("Group", 2, 0));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		elementActions.clickOnElement(getEllipsisBtn());
		elementActions.clickOnElement(getDeleteGroupBtn());

		elementActions.clickOnElement(getConfirmGroupDeleteBtn());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*
		 * elementActions.sendKeysElement(getSearchGroupTxtBx(),
		 * ExcelUtil.fetchData("Group", 2, 0));
		 * 
		 * try { Thread.sleep(2000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */

		// elementActions.checkIfElementIsPresent(getGroupDeletionChkTxt());

		// Code to verify if the group is deleted successfully
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		elementActions.sendKeysElement(getSearchGroupTxtBx(), ExcelUtil.fetchData("Group", 2, 0));

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean isGroupDeleted = elementActions.checkIfElementIsPresent(getZeroResultsTxt());
		return isGroupDeleted;

	}

	public boolean createNewBrand() throws InterruptedException {

		elementActions.clickOnElement(getBrandsTab());
		elementActions.clickOnElement(getAddBrandBtn());

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		System.out.println("Group to be selected=" + ExcelUtil.fetchData("Brand", 1, 0));

		Thread.sleep(2000);

		elementActions.sendKeysElement(getBrandNameTxtBx(), ExcelUtil.fetchData("Brand", 1, 1));
		elementActions.sendKeysElement(getBrandCodeTxtBx(), ExcelUtil.fetchData("Brand", 1, 2));
		elementActions.sendKeysElement(getBrandDescriptionTxtBx(), ExcelUtil.fetchData("Brand", 1, 3));

		try {
			// Thread.sleep(2000);
			elementActions.clickOnElement(getHotelGroupDrpDwn());
			Thread.sleep(3000);
			elementActions.selectDropdownOption(getHotelGroupOptions(), ExcelUtil.fetchData("Brand", 1, 0));
		} catch (StaleElementReferenceException se) {
			elementActions.clickOnElement(getNextBtn2());
			elementActions.clickOnElement(getBrowseBtn());
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			elementActions.uploadImage();
		} catch (AWTException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}
		elementActions.clickOnElement(getSaveBtn2());

		// Code to verify if the brand is created successfully
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		elementActions.sendKeysElement(getSearchBrandTxtBx(), ExcelUtil.fetchData("Brand", 1, 1));

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean isBrandCreated = elementActions.checkIfElementIsPresent(getEllipsisBtn());
		return isBrandCreated;

	}

	public boolean editBrand() {
		elementActions.clickOnElement(getBrandsTab());

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		elementActions.sendKeysElement(getSearchBrandTxtBx(), ExcelUtil.fetchData("Brand", 1, 1));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		elementActions.clickOnElement(getEllipsisBtn());
		elementActions.clickOnElement(getEditGroupBtn());

		elementActions.clearData(getBrandNameTxtBx());
		elementActions.clearData(getBrandCodeTxtBx());
		elementActions.clearData(getBrandDescriptionTxtBx());

		elementActions.sendKeysElement(getBrandNameTxtBx(), ExcelUtil.fetchData("Brand", 2, 1));
		elementActions.sendKeysElement(getBrandCodeTxtBx(), ExcelUtil.fetchData("Brand", 2, 2));
		elementActions.sendKeysElement(getBrandDescriptionTxtBx(), ExcelUtil.fetchData("Brand", 2, 3));
		elementActions.clickOnElement(getNextBtn2());
		elementActions.clickOnElement(getBrowseBtn());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			elementActions.uploadImage();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		elementActions.clickOnElement(getUpdateBtn2());

		// Code to verify if the brand is updated successfully
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		elementActions.sendKeysElement(getSearchBrandTxtBx(), ExcelUtil.fetchData("Brand", 2, 1));

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean isBrandUpdated = elementActions.checkIfElementIsPresent(getEllipsisBtn());
		return isBrandUpdated;

	}

	public boolean deleteBrand() {
		elementActions.clickOnElement(getBrandsTab());

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		elementActions.sendKeysElement(getSearchGroupTxtBx(), ExcelUtil.fetchData("Brand", 2, 1));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		elementActions.clickOnElement(getEllipsisBtn());
		elementActions.clickOnElement(getDeleteGroupBtn());

		elementActions.clickOnElement(getConfirmGroupDeleteBtn());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*
		 * elementActions.sendKeysElement(getSearchGroupTxtBx(),
		 * ExcelUtil.fetchData("Brand", 1, 1) + " updated");
		 * 
		 * try { Thread.sleep(2000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 * 
		 * elementActions.checkIfElementIsPresent(getGroupDeletionChkTxt());
		 */

		// Code to verify if the brand is deleted successfully

		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		elementActions.sendKeysElement(getSearchBrandTxtBx(), ExcelUtil.fetchData("Brand", 2, 1));

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean isBrandDeleted = elementActions.checkIfElementIsPresent(getZeroResultsTxt());
		return isBrandDeleted;

	}

	public boolean createHotel() throws InterruptedException {

		elementActions.clickOnElement(getHotelsTab());
		elementActions.clickOnElement(getAddHotelBtn());
		try {
			elementActions.clickOnElement(getSelectHotelGroupDpDown());
			Thread.sleep(3000);

			System.out.println("Group to be selected=" + ExcelUtil.fetchData("Hotel", 1, 0));

			elementActions.selectDropdownOption(getHotelGroupOption(), ExcelUtil.fetchData("Hotel", 1, 0));

		} catch (StaleElementReferenceException se) {

			elementActions.sendKeysElement(getHotelNameTxtBx(), ExcelUtil.fetchData("Hotel", 1, 2));

			elementActions.clickOnElement(getSelectBrandDrpDwn());
			Thread.sleep(3000);
			elementActions.selectDropdownOption(getSelectBrandOption(), ExcelUtil.fetchData("Hotel", 1, 1));

			// elementActions.sendKeysElement(getHotelNameTxtBx(),
			// ExcelUtil.fetchData("Hotel", 1, 0));

			elementActions.navigateToPage(getHotelCodeTxtBx());

			// elementActions.selectDropdownOption(getHotelGroupOption(),
			// ExcelUtil.fetchData("Group", 1, 0) + " --- " + ExcelUtil.fetchData("Group",
			// 1, 1));

			elementActions.sendKeysElement(getHotelCodeTxtBx(), ExcelUtil.fetchData("Hotel", 1, 3));
			elementActions.sendKeysElement(getHotelDescriptionTxtBx(), ExcelUtil.fetchData("Hotel", 1, 4));

			elementActions.clickOnElement(getCurrencyOptions());

			try {
				elementActions.selectDropdownOption(getCurrentOptionSelected(), ExcelUtil.fetchData("Hotel", 1, 5));
			} catch (StaleElementReferenceException se3) {
				elementActions.sendKeysElement(getPhoneNumberTxtBx(), ExcelUtil.fetchData("Hotel", 1, 6));

				elementActions.clickOnElement(getTravelTypeDropdown());

				elementActions.selectAllCheckBoxes(getTravelOptionChkBx());

				Thread.sleep(3000);

				try {
					elementActions.closePopup();
				} catch (AWTException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				// Thread.sleep(2000);

				elementActions.clickOnElement(getInterestsDropdown());

				elementActions.selectAllCheckBoxes(getInterestsChkBx());

				Thread.sleep(3000);

				try {
					elementActions.closePopup();
				} catch (AWTException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				elementActions.clickOnElement(getNextBtn());

				elementActions.sendKeysElement(getAddressLine1TxtBx(), ExcelUtil.fetchData("Hotel", 1, 12));

				elementActions.clickOnElement(getCountryDropdown());

				try {
					elementActions.selectDropdownOption(getCountryOption(), ExcelUtil.fetchData("Hotel", 1, 13));
				} catch (StaleElementReferenceException se4) {
					// elementActions.sendKeysElement(getPhoneNumberTxtBx(),
					// ExcelUtil.fetchData("Hotel", 1, 4));

					elementActions.sendKeysElement(getStateTxtBx(), ExcelUtil.fetchData("Hotel", 1, 14));
					elementActions.sendKeysElement(getPincodeTxtBx(), ExcelUtil.fetchData("Hotel", 1, 15));
					elementActions.sendKeysElement(getCityTxtBx(), ExcelUtil.fetchData("Hotel", 1, 16));
					elementActions.sendKeysElement(getAreaTxtBx(), ExcelUtil.fetchData("Hotel", 1, 17));
					elementActions.sendKeysElement(getTimezoneTxtBx(), ExcelUtil.fetchData("Hotel", 1, 18));

					elementActions.clickOnElement(getNextBtn());
					elementActions.clickOnElement(getNextBtn());
					elementActions.clickOnElement(getNextBtn());
					elementActions.clickOnElement(getNextBtn());
					elementActions.clickOnElement(getNextBtn());
					elementActions.clickOnElement(getBrowseImage());

					try {
						elementActions.uploadImage();
					} catch (AWTException e) { // TODO Auto-generated catch block
						e.printStackTrace();
					}

					elementActions.clickOnElement(getAddBtn2());

				}

			}
		}

		// Code to verify if the hotel is created successfully
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		elementActions.sendKeysElement(getSearchHotelTxtBx(), ExcelUtil.fetchData("Hotel", 1, 2));

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean isHotelCreated = elementActions.checkIfElementIsPresent(getEllipsisBtn());
		return isHotelCreated;

	}

	public boolean editHotel() {

		elementActions.clickOnElement(getHotelsTab());

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		elementActions.sendKeysElement(getSearchHotelTxtBx(), ExcelUtil.fetchData("Hotel", 1, 2));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		elementActions.clickOnElement(getEllipsisBtn());
		elementActions.clickOnElement(getEditHotelBtn());

		elementActions.clearData(getHotelNameTxtBx());
		elementActions.sendKeysElement(getHotelNameTxtBx(), ExcelUtil.fetchData("Hotel", 2, 2));
		elementActions.navigateToPage(getHotelCodeTxtBx());

		elementActions.clearData(getHotelCodeTxtBx());
		elementActions.sendKeysElement(getHotelCodeTxtBx(), ExcelUtil.fetchData("Hotel", 2, 3));

		elementActions.clearData(getHotelDescriptionTxtBx());
		elementActions.sendKeysElement(getHotelDescriptionTxtBx(), ExcelUtil.fetchData("Hotel", 2, 4));

		elementActions.clickOnElement(getNextBtn());
		elementActions.clickOnElement(getNextBtn());
		elementActions.clickOnElement(getNextBtn());
		elementActions.clickOnElement(getNextBtn());
		elementActions.clickOnElement(getNextBtn());
		elementActions.clickOnElement(getNextBtn());
		elementActions.clickOnElement(getUpdateBtn2());

		// Code to verify if the hotel is updated successfully
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		elementActions.sendKeysElement(getSearchHotelTxtBx(), ExcelUtil.fetchData("Hotel", 2, 2));

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean isHotelUpdated = elementActions.checkIfElementIsPresent(getEllipsisBtn());
		return isHotelUpdated;

	}

	public boolean deleteHotel() {

		elementActions.clickOnElement(getHotelsTab());

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		elementActions.sendKeysElement(getSearchGroupTxtBx(), ExcelUtil.fetchData("Hotel", 2, 2));
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		elementActions.clickOnElement(getEllipsisBtn());
		elementActions.clickOnElement(getDeleteHotelBtn());

		elementActions.clickOnElement(getConfirmGroupDeleteBtn());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Code to verify if the hotel is deleted successfully
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		elementActions.sendKeysElement(getSearchHotelTxtBx(), ExcelUtil.fetchData("Hotel", 2, 2));

		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean isHotelDeleted = elementActions.checkIfElementIsPresent(getZeroResultsTxt());
		return isHotelDeleted;

	}
	
	
	public RestaurantsPage navigateToRestauantPage()
	{
		elementActions.navigateToPage(getHotelMenuLnk());
		elementActions.navigateToPage(getRestaurantsMenuLnk());
		
		return new RestaurantsPage(driver);
	}

}
