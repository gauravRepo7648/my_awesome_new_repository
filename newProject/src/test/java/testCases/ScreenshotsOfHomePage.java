package testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import genelicLib.BaseClassUtility;
	/*
	 * @Author - Gaurav Kumar Singh
	 * TC : Take a screenShot of HomePage
	 */

public class ScreenshotsOfHomePage extends BaseClassUtility {
	@Test
	public void takesscreenShots() throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("./Screenshots");
		FileUtils.copyFile(src, trg);
	}
}
//checking for git commit