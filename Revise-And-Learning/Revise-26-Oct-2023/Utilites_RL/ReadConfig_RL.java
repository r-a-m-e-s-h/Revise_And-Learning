package Utilites_RL;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig_RL {
	
	
	Properties properties;
	
	
	public ReadConfig_RL() {
		
		String floc = "./Revise-26-oct-2023/config_RL.properties";
		
		try {
			
			FileInputStream fis = new FileInputStream(floc);
			properties = new Properties();
			properties.load(fis);
						
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}

	}
	
	public String getUserName()
	{
		String uname = properties.getProperty("UserName");
		return uname;
	}
	public String getPassWord()
	{
		String pwd = properties.getProperty("PassWord");
		return pwd;
	}
	public String getUrl()
	{
		String url = properties.getProperty("BaseURL");
		return url;
	}
	
	
	

}
