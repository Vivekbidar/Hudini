package io.stage.hudinielevate.cms.pages;

import java.awt.AWTException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

import io.stage.hudinielevate.cms.base.BaseClass;
import io.stage.hudinielevate.cms.util.ElementActions;
import io.stage.hudinielevate.cms.util.ExcelUtil;

public class RestaurantsPage extends BaseClass {

	public static WebDriver driver;
	public static Properties properties;
	ElementActions elementActions;

	public RestaurantsPage(WebDriver driver) {
		this.driver = driver;
		elementActions = new ElementActions(driver);

	}

	private By restaurantsInfoTab = By.xpath("//span[text()='Info']");
	private By searchRestaurantBtn = By.xpath("//label[text()='Search']");
	private By addRestaurantBtn = By.xpath("//span[text()='Add Restaurant']");
	private By hotelNameTxtBx1 = By.id("name_input");
	private By hotelCodeTxtBx = By.id("code_input");
	private By hotelTypeDpDownOptions = By.id("type_select");
	private By hotelTypeSelectedOption = By.xpath("//ul[@role='listbox']/li");
	private By hotelAwardsTxtBx = By.id("awards_input");
	private By hotelPrimaryCuisineDpDownOptions = By.id("primary_cuisine_select");
	private By hotelPrimaryCuisineSelectedOption = By.xpath("//ul[@aria-labelledby='primary_cuisine_label']/li");
	private By hotelSecondaryCuisineDpDownOptions = By.xpath("");
	private By hotelSecondaryCuisineSelectedOption = By.xpath("");
	private By hotelVenueIDTxtBx = By.id("venue_group_id_input");
	private By hotelIsActiveChkBx = By.xpath("//input[@type='checkbox']");
	private By hotelDescriptionTxtBx = By.id("description_input");
	private By hotelAdditionalInfoTxtBx = By.id("additional_information_input");
	private By restaurantSearchTxtBx = By.xpath("//label[text()='Search']");
	private By searchResultTxt = By.xpath("//p[text()='1-1 of 1']");
	private By chefSearchTxtBx = By.xpath("//div/input[@type='text']");
	private By browseBtn = By.xpath("//span[text()='Browse']");
	private By emailIdTxtBx = By.id("email_id_input");
	private By phoneNumberTxtBx = By.id("phone_number_input");
	private By ellipsisBtn = By.xpath("//tbody[@class='MuiTableBody-root']//span[@class='MuiButton-label']");

	// MENU IS ALWAYS SET TO INACTIVE
	private By hotelLabelNameTxtBx = By.id("enter_label_name_input");
	private By hotelLabelValueTxtBx = By.id("field_value_input");
	private By hotelLabelAddBtn = By.xpath("//span[text()='Add']");
	private By next1Btn = By.xpath("//span[text()='Next']");
	private By availabilityTimeAddBtn = By.xpath("//span[text()='Add']");
	private By next2Btn = By.xpath("//span[text()='Next']");
	private By hotelEmailIDTxtBx = By.id("email_id_input");
	private By hotelNameTxtBx2 = By.name("phone");
	private By next3Btn = By.xpath("//span[text()='Next']");
	private By hotelLocationAddressLine1TxtBx = By.id("address_line_1_input");
	private By hotelLocationAddressLine2TxtBx = By.id("address_line_2_input");
	private By hotelLocationCountryDpDownOptions = By.id("country_select");
	private By hotelLocationCountrySelectedOption = By.xpath("//ul[@aria-labelledby='country_label']/li");
	private By hotelLocationStateTxtBx = By.id("state_input");
	private By hotelLocationPinCodeTxtBx = By.id("postal_code_input");
	private By hotelLocationCityTxtBx = By.id("city_input");
	private By hotelLocationTimezoneTxtBx = By.id("time_zone_input");
	private By next4Btn1 = By.xpath("//span[text()='Next']");
	private By next4Btn2 = By.xpath("//span[text()='Next']");
	private By browseBtn1 = By.xpath("//span[text()='Browse']");
	private By addBtn1 = By.xpath("//span[text()='Add']");
	private By ellipsisBtn1 = By.xpath("//tbody[@class='MuiTableBody-root']//span[@class='MuiButton-label']");
	private By editBtn = By.xpath("(//li[@role='menuitem'])[2]");
	private By deactivateBtn = By.xpath("(//li[@role='menuitem'])[1]");
	private By deleteBtn = By.xpath("(//li[@role='menuitem'])[4]");
	private By confirmDeleteBtn = By.xpath("//span[text()='Delete']");

	// ========================================================================
	// Restaurant->Chef:
	private By restaurantsChefTab = By.xpath("//span[text()='Chef']");
	private By addChefBtn = By.xpath("//span[text()='Add Chef']");
	private By searchChefBtn = By.xpath("//label[text()='Search']");
	private By selectRestaurantDpDownOptions = By.id("restaurant_select");
	private By selectRestaurantOption = By.xpath("//ul[@aria-labelledby='restaurant_label']/li");
	private By chefNameTxtBx = By.id("name_input");
	private By designationTxtBx = By.id("designation_input");
	private By specializationTxtBx = By.id("specialisation_input");
	private By signatureDishTxtBx = By.id("signature_dish_input");
	private By chefDescriptionTxtBx = By.id("description_input");
	private By next4Btn3 = By.xpath("//span[text()='Next']");
	private By browseBtn2 = By.xpath("//span[text()='Browse']");
	private By addBtn2 = By.xpath("//span[text()='Add']");
	private By ellipsisBtn2 = By.xpath("//tbody[@class='MuiTableBody-root']//span[@class='MuiButton-label']");
	private By editChefBtn = By.xpath("(//li[@role='menuitem'])[1]");
	private By deleteChefBtn = By.xpath("(//li[@role='menuitem'])[3]");
	private By updateBtn = By.xpath("//span[text()='Update']");

	// Hotel-> Restaurants-> Info:
	private By accessRestaurantsMenuBarBtn = By.xpath("//div[@title='Restaurants']//span[text()='Restaurants']");

	public By getChefSearchTxtBx() {
		return chefSearchTxtBx;
	}

	public void setChefSearchTxtBx(By chefSearchTxtBx) {
		this.chefSearchTxtBx = chefSearchTxtBx;
	}

	public By getEllipsisBtn() {
		return ellipsisBtn;
	}

	public void setEllipsisBtn(By ellipsisBtn) {
		this.ellipsisBtn = ellipsisBtn;
	}

	public By getPhoneNumberTxtBx() {
		return phoneNumberTxtBx;
	}

	public void setPhoneNumberTxtBx(By phoneNumberTxtBx) {
		this.phoneNumberTxtBx = phoneNumberTxtBx;
	}

	public By getBrowseBtn() {
		return browseBtn;
	}

	public void setBrowseBtn(By browseBtn) {
		this.browseBtn = browseBtn;
	}

	public By getEmailIdTxtBx() {
		return emailIdTxtBx;
	}

	public void setEmailIdTxtBx(By emailIdTxtBx) {
		this.emailIdTxtBx = emailIdTxtBx;
	}

	public By getSearchResultTxt() {
		return searchResultTxt;
	}

	public void setSearchResultTxt(By searchResultTxt) {
		this.searchResultTxt = searchResultTxt;
	}

	public By getRestaurantSearchTxtBx() {
		return restaurantSearchTxtBx;
	}

	public void setRestaurantSearchTxtBx(By restaurantSearchTxtBx) {
		this.restaurantSearchTxtBx = restaurantSearchTxtBx;
	}

	public By getUpdateBtn() {
		return updateBtn;
	}

	public void setUpdateBtn(By updateBtn) {
		this.updateBtn = updateBtn;
	}

	public ElementActions getElementActions() {
		return elementActions;
	}

	public void setElementActions(ElementActions elementActions) {
		this.elementActions = elementActions;
	}

	public By getConfirmDeleteBtn() {
		return confirmDeleteBtn;
	}

	public void setConfirmDeleteBtn(By confirmDeleteBtn) {
		this.confirmDeleteBtn = confirmDeleteBtn;
	}

	public By getAccessRestaurantsMenuBarBtn() {
		return accessRestaurantsMenuBarBtn;
	}

	public void setAccessRestaurantsMenuBarBtn(By accessRestaurantsMenuBarBtn) {
		this.accessRestaurantsMenuBarBtn = accessRestaurantsMenuBarBtn;
	}

	public By getRestaurantsInfoTab() {
		return restaurantsInfoTab;
	}

	public By getHotelLocationCountryDpDownOptions() {
		return hotelLocationCountryDpDownOptions;
	}

	public void setHotelLocationCountryDpDownOptions(By hotelLocationCountryDpDownOptions) {
		this.hotelLocationCountryDpDownOptions = hotelLocationCountryDpDownOptions;
	}

	public By getHotelLocationTimezoneTxtBx() {
		return hotelLocationTimezoneTxtBx;
	}

	public void setHotelLocationTimezoneTxtBx(By hotelLocationTimezoneTxtBx) {
		this.hotelLocationTimezoneTxtBx = hotelLocationTimezoneTxtBx;
	}

	public By getHotelLocationCountrySelectedOption() {
		return hotelLocationCountrySelectedOption;
	}

	public void setHotelLocationCountrySelectedOption(By hotelLocationCountrySelectedOption) {
		this.hotelLocationCountrySelectedOption = hotelLocationCountrySelectedOption;
	}

	public void setRestaurantsInfoTab(By restaurantsInfoTab) {
		this.restaurantsInfoTab = restaurantsInfoTab;
	}

	public By getSearchRestaurantBtn() {
		return searchRestaurantBtn;
	}

	public void setSearchRestaurantBtn(By searchRestaurantBtn) {
		this.searchRestaurantBtn = searchRestaurantBtn;
	}

	public By getAddRestaurantBtn() {
		return addRestaurantBtn;
	}

	public void setAddRestaurantBtn(By addRestaurantBtn) {
		this.addRestaurantBtn = addRestaurantBtn;
	}

	public By getHotelNameTxtBx1() {
		return hotelNameTxtBx1;
	}

	public void setHotelNameTxtBx1(By hotelNameTxtBx1) {
		this.hotelNameTxtBx1 = hotelNameTxtBx1;
	}

	public By getHotelCodeTxtBx() {
		return hotelCodeTxtBx;
	}

	public void setHotelCodeTxtBx(By hotelCodeTxtBx) {
		this.hotelCodeTxtBx = hotelCodeTxtBx;
	}

	public By getHotelTypeDpDownOptions() {
		return hotelTypeDpDownOptions;
	}

	public void setHotelTypeDpDownOptions(By hotelTypeDpDownOptions) {
		this.hotelTypeDpDownOptions = hotelTypeDpDownOptions;
	}

	public By getHotelTypeSelectedOption() {
		return hotelTypeSelectedOption;
	}

	public void setHotelTypeSelectedOption(By hotelTypeSelectedOption) {
		this.hotelTypeSelectedOption = hotelTypeSelectedOption;
	}

	public By getHotelAwardsTxtBx() {
		return hotelAwardsTxtBx;
	}

	public void setHotelAwardsTxtBx(By hotelAwardsTxtBx) {
		this.hotelAwardsTxtBx = hotelAwardsTxtBx;
	}

	public By getHotelPrimaryCuisineDpDownOptions() {
		return hotelPrimaryCuisineDpDownOptions;
	}

	public void setHotelPrimaryCuisineDpDownOptions(By hotelPrimaryCuisineDpDownOptions) {
		this.hotelPrimaryCuisineDpDownOptions = hotelPrimaryCuisineDpDownOptions;
	}

	public By getHotelPrimaryCuisineSelectedOption() {
		return hotelPrimaryCuisineSelectedOption;
	}

	public void setHotelPrimaryCuisineSelectedOption(By hotelPrimaryCuisineSelectedOption) {
		this.hotelPrimaryCuisineSelectedOption = hotelPrimaryCuisineSelectedOption;
	}

	public By getHotelSecondaryCuisineDpDownOptions() {
		return hotelSecondaryCuisineDpDownOptions;
	}

	public void setHotelSecondaryCuisineDpDownOptions(By hotelSecondaryCuisineDpDownOptions) {
		this.hotelSecondaryCuisineDpDownOptions = hotelSecondaryCuisineDpDownOptions;
	}

	public By getHotelSecondaryCuisineSelectedOption() {
		return hotelSecondaryCuisineSelectedOption;
	}

	public void setHotelSecondaryCuisineSelectedOption(By hotelSecondaryCuisineSelectedOption) {
		this.hotelSecondaryCuisineSelectedOption = hotelSecondaryCuisineSelectedOption;
	}

	public By getHotelVenueIDTxtBx() {
		return hotelVenueIDTxtBx;
	}

	public void setHotelVenueIDTxtBx(By hotelVenueIDTxtBx) {
		this.hotelVenueIDTxtBx = hotelVenueIDTxtBx;
	}

	public By getHotelIsActiveChkBx() {
		return hotelIsActiveChkBx;
	}

	public void setHotelIsActiveChkBx(By hotelIsActiveChkBx) {
		this.hotelIsActiveChkBx = hotelIsActiveChkBx;
	}

	public By getHotelDescriptionTxtBx() {
		return hotelDescriptionTxtBx;
	}

	public void setHotelDescriptionTxtBx(By hotelDescriptionTxtBx) {
		this.hotelDescriptionTxtBx = hotelDescriptionTxtBx;
	}

	public By getHotelAdditionalInfoTxtBx() {
		return hotelAdditionalInfoTxtBx;
	}

	public void setHotelAdditionalInfoTxtBx(By hotelAdditionalInfoTxtBx) {
		this.hotelAdditionalInfoTxtBx = hotelAdditionalInfoTxtBx;
	}

	public By getHotelLabelNameTxtBx() {
		return hotelLabelNameTxtBx;
	}

	public void setHotelLabelNameTxtBx(By hotelLabelNameTxtBx) {
		this.hotelLabelNameTxtBx = hotelLabelNameTxtBx;
	}

	public By getHotelLabelValueTxtBx() {
		return hotelLabelValueTxtBx;
	}

	public void setHotelLabelValueTxtBx(By hotelLabelValueTxtBx) {
		this.hotelLabelValueTxtBx = hotelLabelValueTxtBx;
	}

	public By getHotelLabelAddBtn() {
		return hotelLabelAddBtn;
	}

	public void setHotelLabelAddBtn(By hotelLabelAddBtn) {
		this.hotelLabelAddBtn = hotelLabelAddBtn;
	}

	public By getNext1Btn() {
		return next1Btn;
	}

	public void setNext1Btn(By next1Btn) {
		this.next1Btn = next1Btn;
	}

	public By getAvailabilityTimeAddBtn() {
		return availabilityTimeAddBtn;
	}

	public void setAvailabilityTimeAddBtn(By availabilityTimeAddBtn) {
		this.availabilityTimeAddBtn = availabilityTimeAddBtn;
	}

	public By getNext2Btn() {
		return next2Btn;
	}

	public void setNext2Btn(By next2Btn) {
		this.next2Btn = next2Btn;
	}

	public By getHotelEmailIDTxtBx() {
		return hotelEmailIDTxtBx;
	}

	public void setHotelEmailIDTxtBx(By hotelEmailIDTxtBx) {
		this.hotelEmailIDTxtBx = hotelEmailIDTxtBx;
	}

	public By getHotelNameTxtBx2() {
		return hotelNameTxtBx2;
	}

	public void setHotelNameTxtBx2(By hotelNameTxtBx2) {
		this.hotelNameTxtBx2 = hotelNameTxtBx2;
	}

	public By getNext3Btn() {
		return next3Btn;
	}

	public void setNext3Btn(By next3Btn) {
		this.next3Btn = next3Btn;
	}

	public By getHotelLocationAddressLine1TxtBx() {
		return hotelLocationAddressLine1TxtBx;
	}

	public void setHotelLocationAddressLine1TxtBx(By hotelLocationAddressLine1TxtBx) {
		this.hotelLocationAddressLine1TxtBx = hotelLocationAddressLine1TxtBx;
	}

	public By getHotelLocationAddressLine2TxtBx() {
		return hotelLocationAddressLine2TxtBx;
	}

	public void setHotelLocationAddressLine2TxtBx(By hotelLocationAddressLine2TxtBx) {
		this.hotelLocationAddressLine2TxtBx = hotelLocationAddressLine2TxtBx;
	}

	public By getHotelLocationOptionsDpDownOptions() {
		return hotelLocationCountryDpDownOptions;
	}

	public void setHotelLocationOptionsDpDownOptions(By hotelLocationCountryDpDownOptions) {
		this.hotelLocationCountryDpDownOptions = hotelLocationCountryDpDownOptions;
	}

	public By getHotelLocationSelectedOption() {
		return hotelLocationCountrySelectedOption;
	}

	public void setHotelLocationSelectedOption(By hotelLocationCountrySelectedOption) {
		this.hotelLocationCountrySelectedOption = hotelLocationCountrySelectedOption;
	}

	public By getHotelLocationStateTxtBx() {
		return hotelLocationStateTxtBx;
	}

	public void setHotelLocationStateTxtBx(By hotelLocationStateTxtBx) {
		this.hotelLocationStateTxtBx = hotelLocationStateTxtBx;
	}

	public By getHotelLocationPinCodeTxtBx() {
		return hotelLocationPinCodeTxtBx;
	}

	public void setHotelLocationPinCodeTxtBx(By hotelLocationPinCodeTxtBx) {
		this.hotelLocationPinCodeTxtBx = hotelLocationPinCodeTxtBx;
	}

	public By getHotelLocationCityTxtBx() {
		return hotelLocationCityTxtBx;
	}

	public void setHotelLocationCityTxtBx(By hotelLocationCityTxtBx) {
		this.hotelLocationCityTxtBx = hotelLocationCityTxtBx;
	}

	public By getNext4Btn1() {
		return next4Btn1;
	}

	public void setNext4Btn1(By next4Btn1) {
		this.next4Btn1 = next4Btn1;
	}

	public By getNext4Btn2() {
		return next4Btn2;
	}

	public void setNext4Btn2(By next4Btn2) {
		this.next4Btn2 = next4Btn2;
	}

	public By getBrowseBtn1() {
		return browseBtn1;
	}

	public void setBrowseBtn1(By browseBtn1) {
		this.browseBtn1 = browseBtn1;
	}

	public By getAddBtn1() {
		return addBtn1;
	}

	public void setAddBtn1(By addBtn1) {
		this.addBtn1 = addBtn1;
	}

	public By getEllipsisBtn1() {
		return ellipsisBtn1;
	}

	public void setEllipsisBtn1(By ellipsisBtn1) {
		this.ellipsisBtn1 = ellipsisBtn1;
	}

	public By getEditBtn() {
		return editBtn;
	}

	public void setEditBtn(By editBtn) {
		this.editBtn = editBtn;
	}

	public By getDeactivateBtn() {
		return deactivateBtn;
	}

	public void setDeactivateBtn(By deactivateBtn) {
		this.deactivateBtn = deactivateBtn;
	}

	public By getDeleteBtn() {
		return deleteBtn;
	}

	public void setDeleteBtn(By deleteBtn) {
		this.deleteBtn = deleteBtn;
	}

	public By getRestaurantsChefTab() {
		return restaurantsChefTab;
	}

	public void setRestaurantsChefTab(By restaurantsChefTab) {
		this.restaurantsChefTab = restaurantsChefTab;
	}

	public By getAddChefBtn() {
		return addChefBtn;
	}

	public void setAddChefBtn(By addChefBtn) {
		this.addChefBtn = addChefBtn;
	}

	public By getSearchChefBtn() {
		return searchChefBtn;
	}

	public void setSearchChefBtn(By searchChefBtn) {
		this.searchChefBtn = searchChefBtn;
	}

	public By getSelectRestaurantDpDownOptions() {
		return selectRestaurantDpDownOptions;
	}

	public void setSelectRestaurantDpDownOptions(By selectRestaurantDpDownOptions) {
		this.selectRestaurantDpDownOptions = selectRestaurantDpDownOptions;
	}

	public By getSelectRestaurantOption() {
		return selectRestaurantOption;
	}

	public void setSelectRestaurantOption(By selectRestaurantOption) {
		this.selectRestaurantOption = selectRestaurantOption;
	}

	public By getChefNameTxtBx() {
		return chefNameTxtBx;
	}

	public void setChefNameTxtBx(By chefNameTxtBx) {
		this.chefNameTxtBx = chefNameTxtBx;
	}

	public By getDesignationTxtBx() {
		return designationTxtBx;
	}

	public void setDesignationTxtBx(By designationTxtBx) {
		this.designationTxtBx = designationTxtBx;
	}

	public By getSpecializationTxtBx() {
		return specializationTxtBx;
	}

	public void setSpecializationTxtBx(By specializationTxtBx) {
		this.specializationTxtBx = specializationTxtBx;
	}

	public By getSignatureDishTxtBx() {
		return signatureDishTxtBx;
	}

	public void setSignatureDishTxtBx(By signatureDishTxtBx) {
		this.signatureDishTxtBx = signatureDishTxtBx;
	}

	public By getChefDescriptionTxtBx() {
		return chefDescriptionTxtBx;
	}

	public void setChefDescriptionTxtBx(By chefDescriptionTxtBx) {
		this.chefDescriptionTxtBx = chefDescriptionTxtBx;
	}

	public By getNext4Btn3() {
		return next4Btn3;
	}

	public void setNext4Btn3(By next4Btn3) {
		this.next4Btn3 = next4Btn3;
	}

	public By getBrowseBtn2() {
		return browseBtn2;
	}

	public void setBrowseBtn2(By browseBtn2) {
		this.browseBtn2 = browseBtn2;
	}

	public By getAddBtn2() {
		return addBtn2;
	}

	public void setAddBtn2(By addBtn2) {
		this.addBtn2 = addBtn2;
	}

	public By getEllipsisBtn2() {
		return ellipsisBtn2;
	}

	public void setEllipsisBtn2(By ellipsisBtn2) {
		this.ellipsisBtn2 = ellipsisBtn2;
	}

	public By getEditChefBtn() {
		return editChefBtn;
	}

	public void setEditChefBtn(By editChefBtn) {
		this.editChefBtn = editChefBtn;
	}

	public By getDeleteChefBtn() {
		return deleteChefBtn;
	}

	public void setDeleteChefBtn(By deleteChefBtn) {
		this.deleteChefBtn = deleteChefBtn;
	}

	// Other methods:
	public void createRestaurant() {

		elementActions.clickOnElement(getAddRestaurantBtn());
		elementActions.sendKeysElement(getHotelNameTxtBx1(), "HotelName");
		elementActions.sendKeysElement(getHotelCodeTxtBx(), "HotelCode");
		elementActions.selectDropdownOption(getHotelTypeDpDownOptions(), "Restaurant");
		elementActions.sendKeysElement(getHotelAwardsTxtBx(), "HotelAwards");
		elementActions.selectDropdownOption(getHotelPrimaryCuisineDpDownOptions(), "Mexican");
		elementActions.sendKeysElement(getHotelVenueIDTxtBx(), "HotelVenue");
		elementActions.clickOnElement(getHotelIsActiveChkBx());

		elementActions.sendKeysElement(getHotelDescriptionTxtBx(), "HotelDescription");
		elementActions.sendKeysElement(getHotelAdditionalInfoTxtBx(), "HotelAdditionalInformation");

		elementActions.sendKeysElement(getHotelLabelNameTxtBx(), "Key1");
		elementActions.sendKeysElement(getHotelLabelValueTxtBx(), "Value1");
		elementActions.clickOnElement(getHotelLabelAddBtn());

		elementActions.clickOnElement(getNext1Btn());

		elementActions.clickOnElement(getNext2Btn());

		elementActions.sendKeysElement(getHotelEmailIDTxtBx(), "hotelemail@hotel.com");
		elementActions.clickOnElement(getNext3Btn());

		elementActions.sendKeysElement(getHotelLocationAddressLine1TxtBx(), "Hotel Address Line 1");
		elementActions.sendKeysElement(getHotelLocationAddressLine2TxtBx(), "Hotel Address Line 2");

		elementActions.selectDropdownOption(getHotelLocationCountrySelectedOption(), "India");
		elementActions.sendKeysElement(getHotelLocationStateTxtBx(), "Karnataka");
		elementActions.sendKeysElement(getHotelLocationPinCodeTxtBx(), "560001");
		elementActions.sendKeysElement(getHotelLocationCityTxtBx(), "Bangalore");

		elementActions.sendKeysElement(getHotelLocationTimezoneTxtBx(), "Indian Standard Time");
		elementActions.clickOnElement(getNext4Btn1());

		elementActions.clickOnElement(getNext4Btn2());

		elementActions.clickOnElement(getBrowseBtn1());
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

	}

	public void editRestaurant() {

		// Needs to be completed

		elementActions.sendKeysElement(getRestaurantSearchTxtBx(), "HotelName");
		elementActions.clickOnElement(getEllipsisBtn1());
		elementActions.clickOnElement(getEditBtn());

	}

	public void deleteRestaurant() {

		elementActions.sendKeysElement(getRestaurantSearchTxtBx(), "HotelName");
		elementActions.clickOnElement(getEllipsisBtn1());
		elementActions.clickOnElement(getDeleteBtn());

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		elementActions.clickOnElement(getConfirmDeleteBtn());

	}

	public void deactivateRestaurant() {

		elementActions.sendKeysElement(getRestaurantSearchTxtBx(), "HotelName");
		elementActions.clickOnElement(getEllipsisBtn1());
		elementActions.clickOnElement(getDeactivateBtn());

	}

	public void searchRestaurant() {

		elementActions.sendKeysElement(getRestaurantSearchTxtBx(), "HotelName");
		// In the test method, we need to check if the text "1-1 of 1" is present

	}

	public void reorderRestaurant() {

	}
	// Methods related to Chef tab:

	public boolean createChef() {

		elementActions.clickOnElement(getRestaurantsChefTab());
		elementActions.clickOnElement(getAddChefBtn());
		elementActions.clickOnElement(getSelectRestaurantDpDownOptions());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		elementActions.selectDropdownOption(getSelectRestaurantOption(), ExcelUtil.fetchData("Restaurant-Chef", 1, 0));
		elementActions.sendKeysElement(getChefNameTxtBx(), ExcelUtil.fetchData("Restaurant-Chef", 1, 1));
		elementActions.sendKeysElement(getDesignationTxtBx(), ExcelUtil.fetchData("Restaurant-Chef", 1, 2));
		elementActions.sendKeysElement(getSpecializationTxtBx(), ExcelUtil.fetchData("Restaurant-Chef", 1, 3));
		elementActions.sendKeysElement(getSignatureDishTxtBx(), ExcelUtil.fetchData("Restaurant-Chef", 1, 4));
		elementActions.sendKeysElement(getChefDescriptionTxtBx(), ExcelUtil.fetchData("Restaurant-Chef", 1, 5));
		elementActions.sendKeysElement(getEmailIdTxtBx(), ExcelUtil.fetchData("Restaurant-Chef", 1, 6));
		elementActions.sendKeysElement(getPhoneNumberTxtBx(), ExcelUtil.fetchData("Restaurant-Chef", 1, 7));

		elementActions.clickOnElement(getNext4Btn3());

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		elementActions.clickOnElement(getBrowseBtn());

		try {
			elementActions.uploadImage();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		elementActions.clickOnElement(getAddBtn1());

		// Code to verify if the chef is added successfully
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		elementActions.sendKeysElement(getChefSearchTxtBx(), ExcelUtil.fetchData("Restaurant-Chef", 1, 1));

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean isChefCreated = elementActions.checkIfElementIsPresent(getEllipsisBtn());
		return isChefCreated;

	}

	public boolean editChef() {

		elementActions.clickOnElement(getRestaurantsChefTab());

		elementActions.sendKeysElement(getChefSearchTxtBx(), ExcelUtil.fetchData("Restaurant-Chef", 1, 1));

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		elementActions.clickOnElement(getEllipsisBtn2());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		elementActions.clickOnElement(getEditChefBtn());

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		elementActions.clearData(getChefNameTxtBx());
		elementActions.clearData(getDesignationTxtBx());
		elementActions.clearData(getSpecializationTxtBx());
		elementActions.clearData(getSignatureDishTxtBx());
		elementActions.clearData(getChefDescriptionTxtBx());
		elementActions.clearData(getEmailIdTxtBx());
		elementActions.clearData(getPhoneNumberTxtBx());

		elementActions.sendKeysElement(getChefNameTxtBx(), ExcelUtil.fetchData("Restaurant-Chef", 2, 1));
		elementActions.sendKeysElement(getDesignationTxtBx(), ExcelUtil.fetchData("Restaurant-Chef", 2, 2));
		elementActions.sendKeysElement(getSpecializationTxtBx(), ExcelUtil.fetchData("Restaurant-Chef", 2, 3));
		elementActions.sendKeysElement(getSignatureDishTxtBx(), ExcelUtil.fetchData("Restaurant-Chef", 2, 4));
		elementActions.sendKeysElement(getChefDescriptionTxtBx(), ExcelUtil.fetchData("Restaurant-Chef", 2, 5));
		elementActions.sendKeysElement(getEmailIdTxtBx(), ExcelUtil.fetchData("Restaurant-Chef", 2, 6));
		elementActions.sendKeysElement(getPhoneNumberTxtBx(), ExcelUtil.fetchData("Restaurant-Chef", 2, 7));

		elementActions.clickOnElement(getNext4Btn3());

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		elementActions.clickOnElement(getBrowseBtn());

		try {
			elementActions.uploadImage();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		elementActions.clickOnElement(getUpdateBtn());

		// Code to verify if the chef is updated successfully
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		elementActions.sendKeysElement(getChefSearchTxtBx(), ExcelUtil.fetchData("Restaurant-Chef", 2, 1));

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean isChefUpdated = elementActions.checkIfElementIsPresent(getEllipsisBtn());
		return isChefUpdated;

	}

	public boolean deleteChef() {

		elementActions.clickOnElement(getRestaurantsChefTab());

		elementActions.sendKeysElement(getChefSearchTxtBx(), ExcelUtil.fetchData("Restaurant-Chef", 2, 1));

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		elementActions.clickOnElement(getEllipsisBtn2());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		elementActions.clickOnElement(getDeleteChefBtn());

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		elementActions.clickOnElement(getConfirmDeleteBtn());

		// Code to verify if the chef is deleted successfully
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		elementActions.sendKeysElement(getChefSearchTxtBx(), ExcelUtil.fetchData("Restaurant-Chef", 2, 1));

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean isChefDeleted = elementActions.checkIfElementIsPresent(getEllipsisBtn());
		return isChefDeleted;

	}

	public void searchChef() {

		elementActions.sendKeysElement(getSearchChefBtn(), "ChefName");
	}

	public void reorderChef() {

	}

}
