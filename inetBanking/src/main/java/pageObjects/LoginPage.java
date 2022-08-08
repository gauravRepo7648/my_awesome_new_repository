package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/*
 * @Author : Gaurav
 */
public class LoginPage 
{
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="uid") private WebElement txtUserID;
	@FindBy(name="password") private WebElement txtPassword;
	@FindBy(name="btnLogin") private WebElement loginButton;
	@FindBy(name="btnReset") private WebElement resetButton;
	
	public WebElement getTxtUserID(){
		return txtUserID;
	}
	public WebElement getTxtPassword(){
		return txtPassword;
	}
	public WebElement getLoginButton(){
		return loginButton;
	}
	public WebElement getResetButton(){
		return resetButton;
	}
	
	public void loginToapplication(String userID, String password) {
		getTxtUserID().sendKeys(userID);
		getTxtPassword().sendKeys(password);
		getLoginButton().click();
	}
	
	public void resetButton() {
		getResetButton().click();
	}
//	public LoginPage(WebDriver driver) {
//		PageFactory.initElements(driver, this);
//	}
//	 
//	@FindBy(name="uid") private WebElement txtUserID;
//	@FindBy(name="password") private WebElement txtPassword;
//	@FindBy(name="btnLogin") private WebElement loginButton;
//	
//	public WebElement getTxtUserID() {
//		return txtUserID;
//	}
//	public WebElement getTxtPassword(){
//		return txtPassword;
//	}
//	public WebElement getLoginButton(){
//		return loginButton;
//	}
//	
//	public void loginToApp(String userID,String password) {
//		getTxtUserID().sendKeys(userID);
//		getTxtPassword().sendKeys(password);
//		getLoginButton().click();
//	}
}
//checking for git commit
