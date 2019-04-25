package com.freecrm.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.freecrm.utility.BrowserFactoryCRM;
import com.freecrm.utility.ConfigDataProvider;
import com.freecrm.utility.ExcelDataProvider;

public class BaseclassCRM 
{

	public WebDriver driver;
	public ExcelDataProvider excel;
	public ConfigDataProvider config;
	@BeforeSuite
	public void serupSuite()
	{
		excel=new ExcelDataProvider();
		config=new ConfigDataProvider();

	}
	
	@BeforeClass
	public void setup()
	{
		driver=BrowserFactoryCRM.StartApp(driver, config.getBrowser(),config.getTestURL());
	}
	
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	
	
	
}
