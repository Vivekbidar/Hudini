package io.stage.hudinielevate.cms.tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class MyTest {

	@Test
	public void testing1(){

		ChromeOptions options = new ChromeOptions();
		// Below line opens the automation browser for chrome
		// Note: Below provided number should NOT be same as the normal chrome browser
		// installed in the system
		// options.setBrowserVersion("118");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());

	}

}
