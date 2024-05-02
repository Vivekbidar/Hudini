package io.stage.hudinielevate.cms.tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.stage.hudinielevate.cms.base.BaseClass;
import io.stage.hudinielevate.cms.pages.LoginPage;
import io.stage.hudinielevate.cms.pages.OffersPage;
import io.stage.hudinielevate.cms.pages.PropertiesPage;
import io.stage.hudinielevate.cms.pages.TvChannelsPage;
/*Note:-currenlty we can't able to select room so the xpath related to this is hardcoded so before running script add 
302 room number  and First Floor and Second Floor*/


public class TvChannelsPageTest {
	public BaseClass baseClass;
	public Properties properties;
	public WebDriver driver;
	public LoginPage loginPage;
	public PropertiesPage propertiesPage;
	public TvChannelsPage tvChannelsPage;

	@BeforeMethod
	@Parameters("browserName")
	public void setUp(String browserName) {

		System.out.println("Browser name=" + browserName);

		baseClass = new BaseClass();
		properties = baseClass.initializeProperties();
		driver = baseClass.initializeBrowser(properties);
		System.out.println("Driver=" + driver);
		driver.get(properties.getProperty("appURL"));
		System.out.println("App URL=" + driver.getCurrentUrl());
		System.out.println(properties.getProperty("username"));
		System.out.println(properties.getProperty("password"));
		System.out.println(properties.getProperty("superadminusername"));
		System.out.println(properties.getProperty("superadminpassword"));
		loginPage = new LoginPage(driver, properties);
	}
	@Test(enabled = true, priority = 1)
	public void VerifyNewBouquetCreationTest() {
		loginPage.loginAsUser();
		propertiesPage = loginPage.navigateToPropertiesPage();
		tvChannelsPage=new TvChannelsPage(driver);
		tvChannelsPage.navigateToTvChannelsPage();
		boolean isNewBouquetsCreated = tvChannelsPage.createNewBouquet();
		Assert.assertTrue(isNewBouquetsCreated,"New Bouquet is not created");
	}
	
	@Test(enabled = true, priority = 2)
	public void VerifyNewBouquetEditTest() {
		loginPage.loginAsUser();
		propertiesPage = loginPage.navigateToPropertiesPage();
		tvChannelsPage=new TvChannelsPage(driver);
		tvChannelsPage.navigateToTvChannelsPage();
		boolean isBouquetsEdited = tvChannelsPage.editBouquet();
		Assert.assertTrue(isBouquetsEdited," Bouquet is not edited");
	}

	@Test(enabled = true,priority = 11)
	public void VerifyNewBouquetDeleteTest() {
		loginPage.loginAsUser();
		propertiesPage = loginPage.navigateToPropertiesPage();
		tvChannelsPage=new TvChannelsPage(driver);
		tvChannelsPage.navigateToTvChannelsPage();
		boolean isBouquetsDeleted = tvChannelsPage.deleteBouquet();
		Assert.assertTrue(isBouquetsDeleted," Bouquet is not deleted");
	}


	@Test(enabled = true, priority = 3)                         
	public void VerifyNewCategoryCreationTest() {                            
		loginPage.loginAsUser();                                
		propertiesPage = loginPage.navigateToPropertiesPage();  
		tvChannelsPage=new TvChannelsPage(driver);              
		tvChannelsPage.navigateToTvChannelsPage();              
		boolean isCategoryCreated = tvChannelsPage.createNewCategory();
		Assert.assertTrue(isCategoryCreated," New Category is not created");
	}

	@Test(enabled = true,priority = 9)
	public void VerifyNewCategoryDeactivateTest() {                            
		loginPage.loginAsUser();                                
		propertiesPage = loginPage.navigateToPropertiesPage();  
		tvChannelsPage=new TvChannelsPage(driver);              
		tvChannelsPage.navigateToTvChannelsPage();              
		boolean isCategoryDeactivated = tvChannelsPage.deactivateCategory();
		Assert.assertTrue(isCategoryDeactivated," New Category is not deactivated");
	}

	@Test(enabled = true,priority = 4)
	public void VerifyNewCategoryEditedTest() {                            
		loginPage.loginAsUser();                                
		propertiesPage = loginPage.navigateToPropertiesPage();  
		tvChannelsPage=new TvChannelsPage(driver);              
		tvChannelsPage.navigateToTvChannelsPage();              
		boolean isCategoryEdited = tvChannelsPage.editCategory();
		Assert.assertTrue(isCategoryEdited," New Category is not edited");
	}

	@Test(enabled = true,priority = 10)
	public void VerifyNewCategoryDeletedTest() {                            
		loginPage.loginAsUser();                                
		propertiesPage = loginPage.navigateToPropertiesPage();  
		tvChannelsPage=new TvChannelsPage(driver);              
		tvChannelsPage.navigateToTvChannelsPage();              
		boolean isCategoryDeleted = tvChannelsPage.deleteCategory();
		Assert.assertTrue(isCategoryDeleted," New Category is not deleted");
	}

	@Test(enabled = true,priority = 5)
	public void VerifyNewChannelCreationTest() {                            
		loginPage.loginAsUser();                                
		propertiesPage = loginPage.navigateToPropertiesPage();  
		tvChannelsPage=new TvChannelsPage(driver);              
		tvChannelsPage.navigateToTvChannelsPage();              
		boolean isCategoryDeleted = tvChannelsPage.createNewChannels();
		Assert.assertTrue(isCategoryDeleted," New Channel is not created");
	}

	@Test(enabled = true,priority = 7)
	public void VerifyNewChannelDeactivateTest() {                            
		loginPage.loginAsUser();                                
		propertiesPage = loginPage.navigateToPropertiesPage();  
		tvChannelsPage=new TvChannelsPage(driver);              
		tvChannelsPage.navigateToTvChannelsPage();              
		boolean isChannelDeactivated = tvChannelsPage.deactivateChannels();
		Assert.assertTrue(isChannelDeactivated," New Channel is not deactivated");
	}

	@Test(enabled = true,priority = 6)
	public void VerifyNewChannelEditTest() {                            
		loginPage.loginAsUser();                                
		propertiesPage = loginPage.navigateToPropertiesPage();  
		tvChannelsPage=new TvChannelsPage(driver);              
		tvChannelsPage.navigateToTvChannelsPage();              
		boolean isChannelEdited = tvChannelsPage.editChannels();
		Assert.assertTrue(isChannelEdited," New Channel is not edited");
	}

	@Test(enabled = true,priority = 8)
	public void VerifyNewChannelDeleteTest() {                            
		loginPage.loginAsUser();                                
		propertiesPage = loginPage.navigateToPropertiesPage();  
		tvChannelsPage=new TvChannelsPage(driver);              
		tvChannelsPage.navigateToTvChannelsPage();              
		boolean isChannelDeleted = tvChannelsPage.deleteChannels();
		Assert.assertTrue(isChannelDeleted," New Channel is not deleted");
	}


	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}                                                           