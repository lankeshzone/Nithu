
/* Created by CITS-Team for the training purpose
 * 
 * Date 24th Nov 2019
 */


package Registration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.LocatorUtility;

public class ConfirmationPage
{

	static WebDriver driver;
	
	static LocatorUtility pageUtility = new LocatorUtility();
	
	static WebElement verifyText;
	
	public ConfirmationPage(WebDriver d)
	{
		driver = d;
	}
	
	public void verifyText_Message()
	{
		verifyText = driver.findElement(pageUtility.locator("xpath", "//b[contains(text(),'Note: Your user name is .')]"));
	}
}
