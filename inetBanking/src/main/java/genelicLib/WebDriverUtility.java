package com.inetBankingV1.genelicLib;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class WebDriverUtility 
{
	
	public void actions_accept(WebDriver driver)
	{
		Alert alt=driver.switchTo().alert();
		alt.accept();
	}
	public void actions_dismiss(WebDriver driver)
	{
		Alert alt=driver.switchTo().alert();
		alt.dismiss();
	}
	public void actions_gettext(WebDriver driver)
	{
		Alert alt=driver.switchTo().alert();
		alt.getText();
	}
	public void actions_sendkeys(WebDriver driver, String value)
	{
		Alert alt=driver.switchTo().alert();
		alt.sendKeys(value);
	}
	
	public void scrollBy(WebDriver driver)
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000);");
	}
}
//checking for git commit