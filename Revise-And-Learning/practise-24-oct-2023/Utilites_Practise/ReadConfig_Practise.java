package Utilites_Practise;

import java.io.File;
import java.io.FileInputStream;


import java.util.Properties;

public class ReadConfig_Practise {


	Properties property;

	

	 
	

	public ReadConfig_Practise() 
	{
//		String floc =System.getProperty("user.dir")+"./config_practise.properties";
		
		File floc = new File("./practise-24-oct-2023/config_practise.properties");

		try
		{
			FileInputStream fis = new FileInputStream(floc);
			property = new Properties();
			property.load(fis);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}

	public String getUserName()
	{
		String uname = property.getProperty("UserName");
		return uname;
	}
	public String getpwd()
	{
		String passwd = property.getProperty("PassWord");
		return passwd;
	}
	public String geturl()
	{
		String url = property.getProperty("BaseURL");
		return url;

	}






}
