package io.stage.hudinielevate.cms.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BaseClass {

	public WebDriver driver;
	public Properties properties;
	public BaseClass baseClass;

	public Properties initializeProperties() {
		try {
			properties = new Properties();
			String configPath = System.getProperty("user.dir");

			FileInputStream fis = new FileInputStream(
					configPath + "\\src\\main\\java\\io\\stage\\hudinielevate\\cms\\config\\config.properties");
			properties.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return properties;
	}

	public WebDriver initializeBrowser(Properties prop) {

		String browserName = prop.getProperty("browserName");

		if (browserName.equalsIgnoreCase("Chrome")) {

			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
			options.addArguments("--remote-allow-origins=*");
			options.addArguments("--disable-extensions");
			options.addArguments("--disable-notifications");
			options.addArguments("--disable-infobars");
			options.addArguments("start-maximized");
			options.setAcceptInsecureCerts(true);

			driver = new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}

		else if (browserName.equalsIgnoreCase("Firefox")) {

			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("--incognito");
			options.addArguments("--disable-extensions");
			options.addArguments("--disable-notifications");
			options.addArguments("--disable-infobars");
			options.addArguments("start-maximized");
			options.setAcceptInsecureCerts(true);

			driver = new FirefoxDriver(options);
		}
		return driver;

	}

	public String getScreenshotPath(String testcaseName, WebDriver driver) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\screenshots\\" + testcaseName + ".jpg";
		File file = new File(destination);
		FileUtils.copyFile(source, file);
		return destination;

	}
	

}
