package utilites;

import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig_example {
	
	
	
	Properties properties;
	
	
	
	public Readconfig_example()
	{
		String fpath="practise-2-Nov-2023//config_example.properties";
		
		try {
			
			FileInputStream fis = new FileInputStream(fpath);
			properties = new Properties();
			properties.load(fis);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}
	
	
	public String getUserName()
	{
		String uname = properties.getProperty("UserName");
		return uname;
	}
	public String getUserPassWord()
	{
		String pwd = properties.getProperty("PassWord");
		return pwd;
	}
	public String getBaseUrl()
	{
		String url = properties.getProperty("BaseURL");
		return url;
	}
	

}
