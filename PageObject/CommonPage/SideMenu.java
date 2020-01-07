package CommonPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.LocatorUtility;

public class SideMenu
{
	
	//Page level instance of the test case driver
	static WebDriver driver;
	static LocatorUtility loc;
	
	static WebElement Home,	Flights, Hotels, Cars, Cruises,	Destination,Vacation;
	
	public SideMenu(WebDriver driver)
	{
		this.driver = driver;
		loc = new LocatorUtility();
	}

	public static void Home_link(String locatorType, String locatorValue)
	{
		Home = driver.findElement(loc.locator(locatorType, locatorValue));
	}
	
	public void Home_click()
	{
		Home_link("linktext","Home");
		Home.click();
	}
	
	
	
	public static void Flights_link(String locatorType, String locatorValue)
	{
		Flights = driver.findElement(loc.locator(locatorType, locatorValue));
	}
	
	public void Flights_Click()
	{
		Flights_link("linktext","Flights");
		Flights.click();
	}
	
	
	public static void Hotels_link(String locatorType, String locatorValue)
	{
		Hotels = driver.findElement(loc.locator(locatorType, locatorValue));
	}
	
	public void Hotels_Click()
	{
		Hotels_link("linktext","Hotels");
		Hotels.click();
	}
	
	//Reusable object
	public static void Cars_link(String locatorType, String locatorValue)
	{
		Cars = driver.findElement(loc.locator(locatorType, locatorValue));
	}
	//Reusable actions
	public void cars_click()
	{
		Cars_link("linktext","Car Rentals"); //identifying the object
		Cars.click(); //performing the action
	}
	
	
	public static void Cruises_link(String locatorType, String locatorValue)
	{
		Cruises = driver.findElement(loc.locator(locatorType, locatorValue));
	}
	
	public void Cruises_click()
	{
		Cruises_link("linktext","Cruises");
		Cruises.click();
	}
	
	public static void Destination_link(String locatorType, String locatorValue)
	{
		Destination = driver.findElement(loc.locator(locatorType, locatorValue));
	}
	
	public void Destination_click()
	{
		Destination_link("linktext","Destinations");
		Destination.click();
	}
	
	public static void Vacation_link(String locatorType, String locatorValue)
	{
		Vacation = driver.findElement(loc.locator(locatorType, locatorValue));
	}
	public void Vacation_click()
	{
		Vacation_link("linktext","Vacations");
		Vacation.click();
	}
	
	public boolean homePageTitle(String expectedTitle)
	{
		String actualTitle = driver.getTitle();
		if(expectedTitle.contains(actualTitle))
			return true;
		else 
			return false;
	}

}
