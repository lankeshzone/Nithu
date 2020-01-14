package CarsModule;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Utility.Master_Listener.class)
public class CarsRegistration 
{

	@Test(priority =3, groups= {"Regression"}, dependsOnMethods= {"TC_CarsRegistration_02"})
	public void TC_CarsRegistration_01()
	{
		
	}
	
	@Test(priority=0, groups= {"Smoke"})
	public void TC_CarsRegistration_02()
	{
		Assert.fail();
	}
	
	@Test(enabled=false, priority=1)
	public void TC_CarsRegistration_03()
	{
		
	}
	
	@Test(priority=2, groups= {"Regression","Smoke"})
	public void TC_CarsRegistration_04()
	{
		
	}
	
}
