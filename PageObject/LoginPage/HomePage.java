package LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.LocatorUtility;

public class HomePage {
	
	static WebDriver driver;
	
	static WebElement username, password, signon, destination, vacation, register;
	
	static LocatorUtility pol;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		pol = new LocatorUtility();
	}
	
	public static void username()
	{
		username = driver.findElement(pol.locator("name", "userName"));
	}
	
	public void username_enter()
	{
		username();
		username.sendKeys("lankesh");
	}
	
	
	
	public static void password()
	{
		password= driver.findElement(pol.locator("name", "password"));
	}
	
	public void password_enter()
	{
		password();
		password.sendKeys("lankesh");
	}
	
	public static void signon()
	{
		signon= driver.findElement(pol.locator("name", "login"));
	}
	
	public void signon_click()
	{
		signon();
		signon.click();
	}
	
	public static void destination()
	{
		destination= driver.findElement(pol.locator("linktext", "your destination"));
	}
	public void destination_click()
	{
		destination();
		destination.click();
	}
	
	
	public static void vacation()
	{
		vacation= driver.findElement(pol.locator("linktext", "featured vacation destinations"));
	}
	
	public void vacation_click()
	{
		vacation();
		vacation.click();
	}
	
	public static void register()
	{
		register= driver.findElement(pol.locator("linktext", "Register here"));
	}
	public void register_click()
	{
		register();
		register.click();
	}
	

}
