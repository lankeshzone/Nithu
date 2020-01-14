package VerifyLinks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import CommonPage.SideMenu;

@Listeners(Utility.Master_Listener.class)
public class SideMenuTests {
	
	static WebDriver driver;
	static SideMenu spo;
	
	@BeforeClass
	public void beforeclass()
	{
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
	
		//object of the class
		spo = new SideMenu(driver);
		
	}
	
	@Test
	public void TC_SideMenu_01()
	{
		//step-1 click on homepage link
		spo.Home_click();
		
		//verify the title of home page
		if(spo.homePageTitle("Mercury Tours"))
			System.out.println("Title matches");
		else
			System.out.println("Title does not match");
		
		//step - click on the flights link
		spo.Flights_Click();
		
		//verify the page title
		String actualTitle = driver.getTitle();
		if(actualTitle.contains("FLights page"))
			System.out.println("FLights page tilte mathces");
		else
			System.out.println("Flights page title does not match");
		
		spo.Hotels_Click();
	}
	
	@AfterClass
	public void afterclass()
	{
		driver.quit();
	}

}
