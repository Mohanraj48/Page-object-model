package com.freecrm.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.freecrm.pages.BaseclassCRM;
import com.freecrm.pages.LoginCRM;

public class LoginToCRM extends BaseclassCRM
{

	
	@Test
	public void LoginApp()
	{
	
		LoginCRM logincrm=PageFactory.initElements(driver, LoginCRM.class);
		logincrm.LogCRM(excel.getStringData("Login", 0, 0),excel.getStringData("Login", 0, 1));
		
	}
	
	
	
}
