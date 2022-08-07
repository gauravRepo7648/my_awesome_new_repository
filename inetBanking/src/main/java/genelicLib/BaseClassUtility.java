package com.inetBankingV1.genelicLib;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.inetBankingV1.pageObjects.LoginPage;
import com.inetBankingV1.pageObjects.LogoutPage;

public class BaseClassUtility {
	public WebDriver driver;
	public FileUtility fu=new FileUtility();
	public LogoutPage lp=new LogoutPage(driver);
	
	@BeforeClass
	public void launchBrowser() throws Throwable
	{
		String BROSWER=fu.getPropertyKeyValue("browser");
		if(BROSWER.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./src/main/Drivers/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(BROSWER.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "./src/main/Drivers/msedgedriver.exe");
			driver=new ChromeDriver();
		}
		else if(BROSWER.equals("firefox")) {
			System.setProperty("webdriver.firefox.driver", "./src/main/Drivers/geckodriver.exe");
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@BeforeMethod
	public void loginApplication() throws Throwable
	{
		driver.get(fu.getPropertyKeyValue("url"));
		LoginPage login=new LoginPage(driver);
		login.loginToApp(fu.getPropertyKeyValue("userID"), fu.getPropertyKeyValue("password"));
	}
	
	@AfterMethod
	public void logout()
	{
		lp.logout();
	}
	
	@AfterClass
	public void close()
	{
		driver.close();
	}
}
//checking for git commit