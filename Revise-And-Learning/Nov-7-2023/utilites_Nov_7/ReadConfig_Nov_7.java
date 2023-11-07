package utilites_Nov_7;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig_Nov_7 {
	
	
	Properties properties;
	
	
	public ReadConfig_Nov_7()
	{
		File fpath=new File("./Nov-7-2023/configNov.properties");
		
		try {
			FileInputStream fis = new FileInputStream(fpath);
			properties = new Properties();
			properties.load(fis);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	
	public String getUsername()
	{
		String uname = properties.getProperty("UserName");
		return uname;
	}
	public String getPassword()
	{
		String pwd = properties.getProperty("PassWord");
		return pwd;
	}
	public String getBaseUrl()
	{
		String baseurl = properties.getProperty("BaseURL");
		return baseurl;
	}
	public String getbrowserName()
	{
		String  browserName = properties.getProperty("BrowserName");
		return browserName;
	}
	
	

}
