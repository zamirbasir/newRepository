package base;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class Base {
	public static WebDriver driver;
	public static Properties properties;
	public static Logger logger;
	
	private String userDir = System.getProperty("user.dir");
	private String pathToProperty ="src\\tset\\resources\\InputData\\Property.properties";
	private String ppfile = userDir + pathToProperty;
	
	
	
	public Base() {
		
	}

}
