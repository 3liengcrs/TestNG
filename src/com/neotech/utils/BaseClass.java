

package com.neotech.utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseClass {
	public static WebDriver driver;
	public static void setUp() {
		
		ConfigsReader.readProperties(Constants.CONFIGURATION_FIILEPATH);
		String browser = ConfigsReader.getProperty("browser");
		
		
		switch (browser.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		default:
			break;
		}
		driver.manage().window().maximize();
		String url = ConfigsReader.getProperty("url");
		driver.get(url);
	}
	public static void tearDown() {
		if(driver != null) {
			driver.quit();
			}
	}

}
