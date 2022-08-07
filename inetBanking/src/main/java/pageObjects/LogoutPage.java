package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.inetBankingV1.genelicLib.WebDriverUtility;

public class LogoutPage {
	//WebDriver driver;
	public WebDriverUtility webUtility=new WebDriverUtility();
	public LogoutPage(WebDriver driver)
	{
		//this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Log out']")
	@CacheLookup
	private WebElement logout;
	
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
