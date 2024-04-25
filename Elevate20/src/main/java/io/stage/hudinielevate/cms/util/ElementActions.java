package io.stage.hudinielevate.cms.util;

import java.time.Duration;
import java.util.List;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.stage.hudinielevate.cms.base.BaseClass;
import io.stage.hudinielevate.cms.commons.Constants;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;

public class ElementActions extends BaseClass {

	public static WebDriver driver;
	WebElement element = null;
	Actions actions;

	public ElementActions(WebDriver driver) {
		ElementActions.driver = driver;
		this.actions = new Actions(driver);
	}

	public void navigateToPage(By selector) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element1 = driver.findElement(selector);
		js.executeScript("arguments[0].scrollIntoView();", element1);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		element1.click();
	}

	public void clickUsingJS() {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Specify the XPath of the element you want to interact with
		String xpath = "//div[@id='brand_select']"; // Replace with your actual XPath

		System.out.println("Hi1");

		// Find the element using JavaScript and store it in a variable
		String script = "return document.evaluate('" + xpath
				+ "', document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;";
		WebElement element = (WebElement) js.executeScript(script);

		System.out.println("Hi2");

		// Now, you can interact with the element, for example, click it
		element.click();

		System.out.println("Hi3");

	}

	public WebElement getElement(By selector) {
		try {

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.DEFAULT_EXPLICIT_WAIT));
			wait.until(ExpectedConditions.presenceOfElementLocated(selector));

			element = driver.findElement(selector);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return element;
	}

	public WebElement waitToFindElement(By selector) {
		try {

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.DEFAULT_EXPLICIT_WAIT));
			wait.until(ExpectedConditions.elementToBeClickable(selector));

			element = driver.findElement(selector);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return element;
	}

	public boolean checkIfElementIsPresent(By selector) {

		boolean displayValue = false;
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.DEFAULT_EXPLICIT_WAIT));
			wait.until(ExpectedConditions.presenceOfElementLocated(selector));

			element = driver.findElement(selector);
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (element.isDisplayed()) {
			displayValue = true;
		}

		return displayValue;
	}

	public void sendKeysElement(By selector, String value) {
		try {

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.DEFAULT_EXPLICIT_WAIT));
			wait.until(ExpectedConditions.presenceOfElementLocated(selector));
			getElement(selector).sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void sendKeysLongData(By selector, long phoneNumber) {
		getElement(selector).sendKeys(String.valueOf(phoneNumber));
	}

	public void sendKeysGridData(By selector, Object data) {
		String data1 = data.toString();
		getElement(selector).sendKeys(data1);
	}

	public void clickOnElement(By selector) {
		getElement(selector).click();

	}

	public void sendPhoneNumber(By selector, String phoneNumber) {
		String phoneNum1 = (String) phoneNumber.subSequence(0, 11);
		String finalphoneNum = phoneNum1.replace(".", "");
		getElement(selector).sendKeys(finalphoneNum);

	}

	public String getText(By selector) {
		return getElement(selector).getText();
	}

	public boolean getPageTitle(String pageTitle) {

		boolean titleValue = false;
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.DEFAULT_EXPLICIT_WAIT));
			// wait.until(ExpectedConditions.presenceOfElementLocated(selector));
			titleValue = wait.until(ExpectedConditions.titleIs(pageTitle));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return titleValue;
	}

	public void selectDropdownOption(By selector, String title) {
		List<WebElement> dropdownList = driver.findElements(selector);

		for (WebElement element2 : dropdownList) {

			System.out.println(element2.getText());
			if (element2.getText().equalsIgnoreCase(title)) {
				element2.click();
			}
		}

		// return dropdownList;

	}

	public void selectAllCheckBoxes(By selector) {
		List<WebElement> allOptions = driver.findElements(selector);

		for (WebElement element : allOptions) {
			element.click();
		}
	}

	public void selectSearchResult(By selector1, String value, By selector2) {
		sendKeysElement(selector1, value);
		CommonUtil.shortWait();

		clickOnElement(selector2);

	}

	public String getAttributeValue(By selector, String attribute) {
		WebElement element = getElement(selector);
		String elementValue = element.getAttribute(attribute);
		return elementValue;
	}

	public void selectMultipleChkBx(By selector) {

		try {

			Thread.sleep(3000);

			List<WebElement> chkBoxList = driver.findElements(selector);
			System.out.println("No. of check boxes = " + chkBoxList.size());

			for (int i = 2; i < chkBoxList.size(); i++) {

				chkBoxList.get(i).click();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public int getElementCount(By selector) {
		List<WebElement> WebElementList = driver.findElements(selector);
		return WebElementList.size();
	}

	public void scrollAndClick(By selector) {
		WebElement element = driver.findElement(selector);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
		element.click();
	}

	public void setBrowserZoom(String zoomValue) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String zoomBrowser = "document.body.style.zoom = '" + zoomValue + "'";
		System.out.println("Zoom value=" + zoomBrowser);
		js.executeScript(zoomBrowser);
	}

	public int calculateRecordCount(String recordsCount) {
		String textAfterOf = "";
		int recordCount = 0;
		int indexOfOf = recordsCount.indexOf("of ");
		if (indexOfOf != -1) {
			textAfterOf = recordsCount.substring(indexOfOf + 3);
			recordCount = Integer.parseInt(textAfterOf);
		}

		return recordCount;
	}

	public void moveAndClick(By selector) {
		actions.moveToElement(driver.findElement(selector)).click().build().perform();
	}

	public void handleDynamicDropdown(By selector1, By selector2) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.DEFAULT_EXPLICIT_WAIT));
			wait.until(ExpectedConditions.presenceOfElementLocated(selector1));

			element = driver.findElement(selector1);
		} catch (Exception e) {
			e.printStackTrace();
		}

		clickOnElement(selector1);

		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.DEFAULT_EXPLICIT_WAIT));
			wait.until(ExpectedConditions.presenceOfElementLocated(selector2));

			element = driver.findElement(selector2);
		} catch (Exception e) {
			e.printStackTrace();
		}

		selectDropdownOption(selector2, "Rahul --- Rc001");

	}

	public boolean test(By selector) {

		boolean displayValue = false;
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.DEFAULT_EXPLICIT_WAIT));
			wait.until(ExpectedConditions.presenceOfElementLocated(selector));

			element = driver.findElement(selector);
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (element.isDisplayed()) {
			displayValue = true;
		}

		return displayValue;
	}

	public void clearData(By selector) {
		WebElement element = driver.findElement(selector);
		String s = Keys.chord(Keys.CONTROL, "a");
		element.sendKeys(s);
		element.sendKeys(Keys.DELETE);
	}

	/*
	 * public void clickOnWebElement(WebElement element) { WebElement
	 * selectBrandDrpDwn2 =
	 * driver.findElement(By.xpath("//div[@id='brand_select']"));
	 * 
	 * }
	 */

	public void closePopup() throws AWTException {
		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);

	}

	public void uploadImage() throws AWTException {
		String fileLocation = System.getProperty("user.dir")
				+ "\\src\\main\\java\\io\\stage\\hudinielevate\\cms\\testdata\\Porsche.png";
		StringSelection str = new StringSelection(fileLocation);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		// imitate mouse events like ENTER, CTRL+C, CTRL+V
		Robot robot = new Robot();
		robot.delay(250);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(90);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	public void dragAndDropElement(By source, By target) {
		WebElement sourceElement = getElement(source);
		WebElement targetElement = getElement(target);

		actions = new Actions(driver);
		actions.dragAndDrop(sourceElement, targetElement).build().perform();

	}

	public void verifyToastMessage(String actualMessage, String expectedMessage, By selector) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.DEFAULT_EXPLICIT_WAIT));
		wait.until(ExpectedConditions.presenceOfElementLocated(selector));
	}

	public void doubleClickUsingActions(By selector) {
		actions.moveToElement(driver.findElement(selector)).doubleClick().build().perform();
	}

}
