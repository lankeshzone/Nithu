package Utility;

import org.openqa.selenium.By;

public class LocatorUtility {
	
	public static By locator(String locatorType,String locatorValue)
	{
		By locator=null;
		switch (locatorType)
		{
		case "id":
			locator = By.id(locatorValue);
			break;
		case "name":
			locator = By.name(locatorValue);
			break;	
		case "tagname":
			locator = By.tagName(locatorValue);
			break;
		case "class":
			locator = By.className(locatorValue);
			break;
		case "linktext":
			locator = By.linkText(locatorValue);
			break;
		case "partial":
			locator = By.partialLinkText(locatorValue);
			break;
		case "css":
			locator = By.cssSelector(locatorValue);
			break;
		case "xpath":
			locator = By.xpath(locatorValue);
			break;
		}
		
		
		return locator;
	}

}
