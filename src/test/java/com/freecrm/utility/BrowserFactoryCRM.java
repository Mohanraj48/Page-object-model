package com.freecrm.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactoryCRM 
{

	public static WebDriver StartApp(WebDriver driver,String Browsername, String AppUrl)
	{
		if(Browsername.equals("Chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else
		{
			System.out.println("Invalid Browser");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get(AppUrl);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
		
	}
	
	
	public static void Quitbrowser(WebDriver driver)
	{
		driver.quit();
	}
	
	
}
