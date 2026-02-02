package utils;

import java.util.Properties;
import java.io.*;

public class ConfigReader {
	Properties prop;
	
	public void loadProp() throws IOException {
		
		FileInputStream data=new FileInputStream("src\\test\\resources\\config.properties");
		prop=new Properties();
		prop.load(data);
	}
	
	public String getBrowser() {
		return prop.getProperty("browser");
		
		
	}
	
	public String getURL() {
		
		return prop.getProperty("url");
	}
	
	public String getUserName() {
		
		return prop.getProperty("username");
	}
public String getPassword() {
	
	return prop.getProperty("password");
}
}
