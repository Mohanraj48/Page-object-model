package com.freecrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginCRM extends BaseclassCRM
{

	public WebDriver driver;
	
	public LoginCRM(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	@FindBy(name="username") WebElement Username;
	@FindBy(name="password") WebElement pass; 
	@FindBy(xpath="//input[@type='submit']") WebElement button;
	
	public void LogCRM(String UnameApp, String PassApp)
	{
		
		Username.sendKeys(UnameApp);
		pass.sendKeys(PassApp);
		button.click();
	}
	
	
}
