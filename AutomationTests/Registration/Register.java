package Registration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import CommonPage.TopMenu;

@Listeners(Utility.Master_Listener.class)
public class Register
{

	static WebDriver driver;
	static TopMenu tpo;
	static RegisterPage rpo;
	
	@BeforeClass
	public void initialize()
	{
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		tpo = new TopMenu(driver);
		rpo = new RegisterPage(driver);
	}
	
	@Test
	public void TC_Register_01()
	{
		tpo.registr_click();
		// verify the page title
		String ExpectedTitle = "Register: Mercury Tours";
		
		if(driver.getTitle().equals(ExpectedTitle))
			System.out.println("Application is in Registration Page");
		else
			System.out.println("Incorrect page to Register the user");
		
		//contact information
		rpo.firstname_enterText("Lankesh");
		rpo.lastname_enterText("H");
		rpo.phone_enterText("9999999999");
		rpo.email_enterText("lankesh@gmail.com");
		
		//mail info
		rpo.address1_enterText("Block-3");
		rpo.address2_entertext("Sector 4");
		rpo.city_entertext("Bangalore");
		rpo.state("Karnataka");
		rpo.postal_entertext("560022");
		rpo.coutry_select("INDIA");
		
		//User Info
		rpo.uname_enterText("lankesh123@gmail.com");
		rpo.password_enterText("lankesh123");
		rpo.confirm_enterText("lankesh123");
		
		//submit
		rpo.submit_click();
		//verify successfull registration
		WebElement dear = driver.findElement(By.xpath("//b[contains(text(),'Dear')]"));
		
		if(dear.getText().contains("Dear"))
			System.out.println("Registration Successfull");
		else
			System.out.println("Unsuccessfull Registration");
	}
	
	@Test
	public void TC_Register_02()
	{
		
	}
	
	@AfterClass
	public void shutdown()
	{
		driver.quit();
	}
	
}
