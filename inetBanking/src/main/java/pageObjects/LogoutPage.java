package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	//WebDriver driver;
	public genelicLib.WebDriverUtility webUtility=new genelicLib.WebDriverUtility();
	public LogoutPage(WebDriver driver)
	{
		//this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Log out']") private WebElement logout;
	
	public WebElement getLogout()
	{
		return logout;
	}
	
	public void logout()
	{
		getLogout().click();
	//	webUtility.actions_accept(driver);
	}
	//checking for git commit
	
}
