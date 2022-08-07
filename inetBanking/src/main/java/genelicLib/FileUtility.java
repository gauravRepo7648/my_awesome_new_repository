package com.inetBankingV1.genelicLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class FileUtility 
{
	public String getPropertyKeyValue(String key) throws Throwable
	{
		FileInputStream fis=new FileInputStream("./src/test/testData/testData.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		return pobj.getProperty(key);	
	}
}
//checking for git commit