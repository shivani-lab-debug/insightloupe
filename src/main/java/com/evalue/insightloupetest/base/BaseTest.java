/**
 * 
 */
package com.evalue.insightloupetest.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.evalue.insightloupetest.testutils.SeleniumHelper;



/**
 * @author Shivani Nagpal
 * 18-Jul-2020
 * BaseTest.java
 *
 */
public class BaseTest {
	
	public WebDriver driver;
	public static Properties prop;
	protected SeleniumHelper seleniumhelper;
	
	public BaseTest() {
		seleniumhelper = new SeleniumHelper();
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/evalue"
					+ "/insightloupetest/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
	}
	
	public void initialization()
	{
		String driver_path = System.getProperty("user.dir") + "/Drivers/firefox/geckodriver-v0.26.0-win64/geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", driver_path);	
		driver = new FirefoxDriver(); 
		//driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(80, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}
	
	    public void cleanup() {
	        try {
	                this.driver.quit();
                } 
	        catch(Exception e) {
	      e.printStackTrace();
	    }
	  }


}
