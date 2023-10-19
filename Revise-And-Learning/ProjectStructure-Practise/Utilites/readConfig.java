package Utilites;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;



public class readConfig {
	
	
	Properties properties;
	
	
	public  readConfig()  {
		
		File floc = new File("./ProjectStructure-Practise/config.properties");
		try {
			
		FileInputStream	fis= new FileInputStream(floc);
			properties = new Properties();
			properties.load(fis);
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("The Error message is : "+e.getMessage());
		}
	
	}
	
	public String getUSerName()
	{
		String userName = properties.getProperty("UserName");
		return userName;
	}
	public String getPassWord()
	{
		String passWord = properties.getProperty("PassWord");
		return passWord;
	}
	public String getBaseURL()
	{
		String baseUrl = properties.getProperty("BaseURL");
		return baseUrl;
	}
	public String getBrowserName()
	{
		String browserName = properties.getProperty("BrowserName");
		return browserName;
	}

}
