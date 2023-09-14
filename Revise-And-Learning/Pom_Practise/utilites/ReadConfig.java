package utilites;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	
	
	
	Properties pro;
	
	public ReadConfig()
	{
		File floc = new  File("./Pom_Practise/config.properties");
		
		try
		{
			FileInputStream fis = new FileInputStream(floc);
			pro=new Properties();
			pro.load(fis);
			
		}
		catch(Exception e)
		{
			System.out.println("The Error message is : "+e.getMessage());
		}
	}
	
	public String getUserName()
	{
		String username = pro.getProperty("UserMailID");
		return username;
	}
	public String getPassword()
	{
		String pwd = pro.getProperty("PassWord");
		return pwd;
	}
	
	public String getBaseURL()
	{
		String baseUrl = pro.getProperty("BaseURL");
		return baseUrl;
	}

}
