/**
 * 
 */
package com.evalue.insightloupetest.testutils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.evalue.insightloupetest.base.BaseTest;

/**
 * @author Shivani Nagpal
 * 18-Jul-2020
 * SeleniumHelper.java
 *
 */
public class SeleniumHelper {
	
	static JavascriptExecutor js;
	
	public void switchto_frame(WebDriver driver) {
		driver.switchTo().frame("mainpanel");
	}
	
	public void jsclick(WebElement element,WebDriver driver)
	{
		 js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].click();", element);
	}
	
	

}
