package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	 
	@FindBy(name="uid")
	@CacheLookup
	private WebElement txtUserID;
	
	@FindBy(name="password")
	@CacheLookup
	private WebElement txtPassword;
	
	@FindBy(name="btnLogin")
	@CacheLookup
	private WebElement loginButton;
	
	public WebElement getTxtUserID()
	{
		return txtUserID;
	}
	
	public WebElement getTxtPassword()
	{
		return txtPassword;
	}
	
	public WebElement getLoginButton()
	{
		return loginButton;
	}
	
	public void loginToApp(String userID,String password) {
		getTxtUserID().sendKeys(userID);
		getTxtPassword().sendKeys(password);
		getLoginButton().click();
	}
}
//checking for git commit
