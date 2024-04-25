package io.stage.hudinielevate.cms.pages;

import java.awt.AWTException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.stage.hudinielevate.cms.base.BaseClass;
import io.stage.hudinielevate.cms.util.CommonUtil;
import io.stage.hudinielevate.cms.util.ElementActions;
import io.stage.hudinielevate.cms.util.ExcelUtil;

public class OffersPage extends BaseClass {


	public static WebDriver driver;
	public static Properties properties;
	public static ElementActions elementActions;
	public static CommonUtil commonUtil;

	//constructor for maintaining same driver instance
	public OffersPage(WebDriver driver) {
		this.driver = driver;
		elementActions = new ElementActions(driver);
		new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	//Webelements for navigating to offers page
	private By cmsLnk = By.xpath("//span[text()='CMS']");
	private By offersLnk=By.xpath("//div[@title='Offers']");
	private By offersTb=By.xpath("//span[text()='Offer Cards']/../..//span[text()='Offers']");

	//webelements of Details page
	private By addOfferBtn=By.xpath("//span[text()='Add Offer']");
	private By offersTypeDpDwnOptions=By.id("type_select");
	private By offersTypeOptionSelected=By.xpath("//ul[@role='listbox']/li");
	private By offersNameTxtBx=By.xpath("//input[@id='name_input']");
	private By descriptionTxtBx=By.id("description_input");
	private By addBtn=By.xpath("//span[text()='Add']");
	private By nextBtn=By.xpath("//span[text()='Next']");

	//CTA page webelements
	private By activeBtn=By.xpath("//span[text()='Active']");

	//schedule page webelements
	private By alwaysactiveRadioButton=By.xpath("//span[text()='Always Active']");

	//Contact page weblements
	private By emailIdTxtBx=By.id("email_id_input");
	private By phoneNumberTxtBx=By.xpath("//input[@name='phone']");

	//image upload page
	private By browseBtn = By.xpath("//span[text()='Browse']");
	private By addBtnOfImagePage=By.xpath("//span[text()='Add']");

	//verifying whether the offer is created or not
	private By offersSearchTxtBx = By.xpath("//input[@type='text']");
	private By ellipsisBtn= By.xpath("//tbody[@class='MuiTableBody-root']//span[@class='MuiButton-label']");

	//Deactivating created offer
	private By deactivateBtn=By.xpath("(//li[@role='menuitem'])[1]");
	private By deactivatingPopupYesBtn=By.xpath("//span[text()='Yes']");
	private By InactiveText=By.xpath("//span[text()='Inactive']");

	//Deleting created offer
	private By deleteBtn=By.xpath("//ul[@role='menu']/li");
	private By deleteOfferPopup=By.xpath("(//li[@role='menuitem'])[5]");
	private By DeleteOfferPopupBtn = By.xpath("//span[text()='Delete']");
	private By verifyingOffersCreationTxt = By.xpath("//p[text()='0-0 of 0']");


	//==========================================================================================================	
	//Webelements of Create New Offer Card

	//webelements of Offer Cards 
	private By offersCardBtn=By.xpath("//span[text()='Offer Cards']");
	private By addOfferCardBtn=By.xpath("//span[text()='Add Offer Card']");

	//Webelements of details page 
	private By selectOfferDpDwn=By.id("select_offer_select");
	private By selectOfferDpDwnOptionSelected=By.xpath("//ul[@aria-labelledby='select_offer_label']/li");
	private By selectOfferCardTypeDpDwn=By.id("select_offer_card_type_select");
	private By selectOfferCardTypeDpDwnOptionSelected=By.xpath("//ul[@aria-labelledby='select_offer_card_type_label']/li");
	private By offerCardNameTxtBx=By.id("offer_card_name_input");
	private By selectOfferRecipientDpDwn=By.id("select_offer_recipient_select");
	private By selectOfferRecipientDpDwnOptionSelected=By.xpath("(//ul[@aria-labelledby='select_offer_recipient_label']/li)[1]");

	//Webelements of CTA button
	private By inActiveBtn=By.id("//span[text()='Inactive']");

	//Webelements of schedule page
	private By alwaysActiveBtn=By.xpath("//span[text()='Always Active']");

	//Webelements of image upload page
	private By browseImageBtn1 = By.xpath("(//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeLarge'])[1]");
	private By browseImageBtn2 = By.xpath("(//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeLarge'])[2]");

	//Webelements of delete created offer card(deactivating)
	private By deleteOffersCardPopup = By.xpath("(//li[@role='menuitem'])[4]");

	//Webelements of deactivate created offer card(deleting)
	private By deactivateOffersCardPopup2 = By.xpath("(//li[text()='Deactivate'])[1]");
	private By deactivatingPopupYesBtn2=By.xpath("//span[text()='Yes']");

	//getter methods for navigating to offers page
	public By getCmsLnk()
	{
		return cmsLnk;
	}

	public By getOffersLnk()
	{
		return offersLnk;
	}


	public By getOffersTb() {
		return offersTb;
	}

	//getter methods for Details page

	public By getAddOfferBtn() {
		return  addOfferBtn;
	}

	public By getOffersTypeDpDwnOptions() {
		return offersTypeDpDwnOptions;
	}

	public By getOffersTypeOptionSelected() {
		return offersTypeOptionSelected;
	}

	public By getOffersNameTxtBx() {
		return offersNameTxtBx;
	}

	public By getDescriptionTxtBx() {
		return descriptionTxtBx;
	}

	public By getAddBtn() {
		return addBtn;
	}

	public By getNextBtn() {
		return nextBtn;
	}

	//getter methods for CTA page 
	public By getActiveBtn() {
		return activeBtn;
	}

	//getter methods for schedule page 
	public By getAlwaysactiveRadioButton() {
		return alwaysactiveRadioButton;
	}

	//getter methods for Contact page 
	public By getEmailIdTxtBx() {
		return emailIdTxtBx;
	}

	public By getPhoneNumberTxtBx() {
		return phoneNumberTxtBx;
	}

	//getter methods for image upload page 
	public By getBrowseBtn() {
		return browseBtn;
	}

	public By getAddBtnOfImagePage() {
		return addBtnOfImagePage;
	}

	//getter method for the offer creation verification
	public By getOffersSearchTxtBx() {
		return offersSearchTxtBx;
	}

	public By getEllipsisBtn() {
		return ellipsisBtn;
	}

	//getter method for deactivating created offer
	public By getDeactivateBtn() {
		return deactivateBtn;
	}

	public By getDeactivatingPopupYesBtn() {
		return deactivatingPopupYesBtn;
	}

	public By getInactiveText() {
		return InactiveText;
	}

	//getter method for dleting created offer
	public By getDeleteBtn() {
		return deleteBtn;
	}

	public By getDeleteOfferPopup() {
		return deleteOfferPopup;
	}

	public By getDeleteOfferPopupBtn() {
		return DeleteOfferPopupBtn;
	}
	
	public By getVerifyingOffersCreationTxt() {
		return verifyingOffersCreationTxt;
	}
	//==========================================================================================================	
	//getter method for Create New Offer Card
	//getter method for Offer Cards webelements
	public By getOffersCardBtn() {
		return offersCardBtn;
	}

	public By getAddOfferCardBtn() {
		return addOfferCardBtn;
	}

	//getter method for details page 
	public By getSelectOfferDpDwn() {
		return selectOfferDpDwn;
	}

	public By getSelectOfferDpDwnOptionSelected() {
		return selectOfferDpDwnOptionSelected;
	}

	public By getSelectOfferCardTypeDpDwn() {
		return selectOfferCardTypeDpDwn;
	}

	public By getSelectOfferCardTypeDpDwnOptionSelected() {
		return selectOfferCardTypeDpDwnOptionSelected;
	}

	public By getOfferCardNameTxtBx() {
		return offerCardNameTxtBx;
	}

	public By getSelectOfferRecipientDpDwn() {
		return selectOfferRecipientDpDwn;
	}

	public By getSelectOfferRecipientDpDwnOptionSelected() {
		return selectOfferRecipientDpDwnOptionSelected;
	}

	//getter method for CTA button
	public By getInActiveBtn() {
		return inActiveBtn;
	}

	//getter method for schedule page
	public By getAlwaysActiveBtn() {
		return alwaysActiveBtn;
	}

	//getter method for image upload page
	public By getBrowseImageBtn1() {
		return browseImageBtn1;
	}

	public By getBrowseImageBtn2() {
		return browseImageBtn2;
	}

	//getter method for delete created new offercards(While deactivating)
	public By getDeleteOffersCardPopup() {
		return deleteOffersCardPopup;
	}

	//getter method for deactivating created new offercard
	public By getDeactivateOffersCardPopup2() {
		return deactivateOffersCardPopup2;
	}

	public By getDeactivatingPopupYesBtn2() {
		return deactivatingPopupYesBtn2;
	}
	//Navigating to offers page
	public void NavigateToOffersPage() {
		elementActions.clickOnElement(getCmsLnk());
		elementActions.clickOnElement(getOffersLnk());
		//		elementActions.clickOnElement(getoffersTab());
	}

	//Offer creation
	public Boolean CreateNewOffer()
	{
		//Details Pgae
		elementActions.clickOnElement(getAddOfferBtn());
		elementActions.clickOnElement(getOffersTypeDpDwnOptions());
		elementActions.checkIfElementIsPresent(getOffersTypeOptionSelected());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}		
		elementActions.selectDropdownOption(getOffersTypeOptionSelected(), "IRD");
		elementActions.sendKeysElement(getOffersNameTxtBx(), ExcelUtil.fetchData("Offers", 1, 1));
		elementActions.sendKeysElement(getDescriptionTxtBx(), ExcelUtil.fetchData("Offers", 1, 2));
		elementActions.clickOnElement(getNextBtn());

		//CTA page
		elementActions.clickOnElement(getNextBtn());

		//Schedule page
		elementActions.clickOnElement(getNextBtn());

		//Contact page
		elementActions.sendKeysElement(getEmailIdTxtBx(), ExcelUtil.fetchData("Offers", 1, 5));
		elementActions.sendKeysElement(getPhoneNumberTxtBx(), ExcelUtil.fetchData("Offers", 1, 6));
		elementActions.clickOnElement(getNextBtn());

		//Images upload page
		elementActions.clickOnElement(getBrowseBtn());

		try {
			elementActions.uploadImage();
		} catch (AWTException e) {
			
			e.printStackTrace();
		}
		elementActions.clickOnElement(getAddBtnOfImagePage());

		//ellipsi button to verify wheathe the offer is created or not
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		elementActions.sendKeysElement(getOffersSearchTxtBx(), ExcelUtil.fetchData("Offers", 1, 1));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		boolean isOfferCreated = elementActions.checkIfElementIsPresent(getEllipsisBtn());
		return isOfferCreated;
	}

	//Deactivating created offer
	public boolean DeactivatingCreatedOffer() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		elementActions.sendKeysElement(getOffersSearchTxtBx(), ExcelUtil.fetchData("Offers", 1, 1));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		elementActions.clickOnElement(getEllipsisBtn());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		elementActions.clickOnElement(getDeactivateBtn());
		elementActions.clickOnElement(getDeactivatingPopupYesBtn());
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		elementActions.sendKeysElement(getOffersSearchTxtBx(), ExcelUtil.fetchData("Offers", 1, 1));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		boolean isInactiveTextPresent=elementActions.checkIfElementIsPresent(getInactiveText());
		return isInactiveTextPresent;
	}

	//Delete the created offer
	public boolean DeletingTheCreatedOffer() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		elementActions.sendKeysElement(getOffersSearchTxtBx(), ExcelUtil.fetchData("Offers", 1, 1));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		elementActions.clickOnElement(getEllipsisBtn());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		elementActions.clickOnElement(getDeleteOfferPopup());
		elementActions.clickOnElement(getDeleteOfferPopupBtn());
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		elementActions.sendKeysElement(getOffersSearchTxtBx(), ExcelUtil.fetchData("Offers", 1, 1));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		boolean isOfferDeleted = elementActions.checkIfElementIsPresent(getVerifyingOffersCreationTxt());
		return isOfferDeleted;
	}

	//Createing offerscard
	public boolean CreateNewOfferCard() {
		elementActions.clickOnElement(getOffersCardBtn());
		elementActions.clickOnElement(getAddOfferCardBtn());
//		elementActions.selectDropdownOption(selectOfferCardTypeDropdown, null);
		elementActions.clickOnElement(getSelectOfferDpDwn());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		elementActions.selectDropdownOption(getSelectOfferDpDwnOptionSelected(), ExcelUtil.fetchData("Offers", 1, 1));
		elementActions.clickOnElement(getSelectOfferCardTypeDpDwn());
		elementActions.selectDropdownOption(getSelectOfferCardTypeDpDwnOptionSelected(),"Scratch Card");
		elementActions.sendKeysElement(getOfferCardNameTxtBx(), ExcelUtil.fetchData("Offers", 1, 7));
		elementActions.clickOnElement(getSelectOfferRecipientDpDwn());
		elementActions.clickOnElement(getSelectOfferRecipientDpDwnOptionSelected());
		elementActions.clickOnElement(getNextBtn());
		elementActions.clickOnElement(getNextBtn());
		elementActions.clickOnElement(getNextBtn());
		elementActions.clickOnElement(getAddBtnOfImagePage());

		//ellipsi button to verify wheathe the offer is created or not
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}  
		elementActions.sendKeysElement(getOffersSearchTxtBx(), ExcelUtil.fetchData("Offers", 1, 7));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		boolean isOfferCardCreated = elementActions.checkIfElementIsPresent(getEllipsisBtn());
		return isOfferCardCreated;
	}

	//Deactivate the created offerCard
	public boolean DeactivateCreatedOfferCard() {
		elementActions.clickOnElement(getOffersCardBtn());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		elementActions.sendKeysElement(getOffersSearchTxtBx(), ExcelUtil.fetchData("Offers", 1, 7));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		elementActions.clickOnElement(getEllipsisBtn());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		//		elementActions.selectDropdownOption(getdeactivateBtn(), "Deactivate");
		//		elementActions.checkIfElementIsPresent(getdeactivateOffersCardPopup2());
		elementActions.clickOnElement(getDeactivateOffersCardPopup2());
		elementActions.clickOnElement(getDeactivatingPopupYesBtn2());
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		elementActions.sendKeysElement(getOffersSearchTxtBx(), ExcelUtil.fetchData("Offers", 1, 7));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		boolean isInactiveTextPresent=elementActions.checkIfElementIsPresent(getInactiveText());
		return isInactiveTextPresent;
	}

	//Delete the created offerCard
	public boolean DeletingTheCreatedOfferCard() {
		elementActions.clickOnElement(getOffersCardBtn());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elementActions.sendKeysElement(getOffersSearchTxtBx(), ExcelUtil.fetchData("Offers", 1, 7));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elementActions.clickOnElement(getEllipsisBtn());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elementActions.clickOnElement(getDeleteOffersCardPopup());
		elementActions.clickOnElement(getDeleteOfferPopupBtn());
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elementActions.sendKeysElement(getOffersSearchTxtBx(), ExcelUtil.fetchData("Offers", 1, 7));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean isOfferCardDeleted = elementActions.checkIfElementIsPresent(getVerifyingOffersCreationTxt());
		return isOfferCardDeleted;
	}
}