package com.freecrm.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider 
{
	
	Properties pro;

	public ConfigDataProvider()
	{
		File src=new File("./Configure/Config.properties");
		try {
			FileInputStream fin=new FileInputStream(src);
			pro=new Properties();
			pro.load(fin);
		} catch (Exception e) {
			System.out.println("not able to load"+e.getMessage());
		} 
		
	}
	
	
	public String getDataFromConfig(String keyToSearch)
	{
		return pro.getProperty(keyToSearch);
	}
	
	public String getBrowser()
	{
		return pro.getProperty("Browser");
	}
	
	public String getTestURL()
	{
		return pro.getProperty("qaURL");
	}
	
}
