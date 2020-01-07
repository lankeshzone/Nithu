package Flight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import CommonPage.SideMenu;

public class FlightFinderPage 
{

	public static void main(String[] args)
	{
	WebDriver driver;
	driver = new ChromeDriver();
	
	driver.get("http://newtours.demoaut.com/");
	//Reusable pageobject
	//reusabe method to identify oobject
	
	//SideMenu.Cars_link("linktext", "Cars");
	//WebElement user = driver.findElement(By.linkText("Car Rentals")); 
	//reusabe method to perform an action
	//user.click();
	
	SideMenu spo = new SideMenu(driver);
	
	spo.cars_click();
	
	
	}
}
