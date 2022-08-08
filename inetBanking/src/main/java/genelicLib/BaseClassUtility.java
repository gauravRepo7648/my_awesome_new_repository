package genelicLib;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pageObjects.LoginPage;
import pageObjects.LogoutPage;

public class BaseClassUtility {
	public WebDriver driver;
	public FileUtility fileData=new FileUtility();
	public LoginPage login=new LoginPage(driver);
	public LogoutPage logout=new LogoutPage(driver);
	
	@BeforeClass
	public void launchBrowser() throws Throwable
	{
		String BROSWER=fileData.getPropertyKeyValue("browser");
		if(BROSWER.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(BROSWER.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "./src/main/resources/msedgedriver.exe");
			driver=new ChromeDriver();
		}
		else if(BROSWER.equals("firefox")) {
			System.setProperty("webdriver.firefox.driver", "./src/main/resources/geckodriver.exe");
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("launch browser successfully");
	}
	
	@BeforeMethod
	public void loginApplication() throws Throwable
	{
		driver.get(fileData.getPropertyKeyValue("url"));
		login.loginToapplication(fileData.getPropertyKeyValue("userID"), fileData.getPropertyKeyValue("password"));
	}
	
	@AfterMethod
	public void logoutApplication()
	{
		Reporter.log("logout functionality start",true);
		logout.logout();
		Reporter.log("logout sucessfully",true);
	}
	
	@AfterClass
	public void close()
	{
		driver.close();
	}
}
//checking for git commit