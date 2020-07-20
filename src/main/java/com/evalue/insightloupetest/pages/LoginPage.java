/**
 * 
 */
package com.evalue.insightloupetest.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.evalue.insightloupetest.base.BaseTest;
import com.evalue.insightloupetest.testutils.SeleniumHelper;


/**
 * @author Shivani Nagpal
 * 18-Jul-2020
 * LoginPage.java
 *
 */
public class LoginPage extends BaseTest{
	
	  
	
	//Page Factory - OR:
		@FindBy(name="username")
		WebElement username;
		
		@FindBy(name="password")
		WebElement password;
		
		@FindBy(xpath="//button[@type='submit']")
		WebElement nextBtn;
		
		@FindBy(xpath="//button[@type='submit']")
		WebElement loginBtn;
		
		//Initializing the Page Objects:
		public LoginPage(WebDriver driver){
			this.driver = driver;
			PageFactory.initElements(driver, this);
		 }
		
		//Actions:
		
	    public HomePage login(WebDriver driver) {
	    	String un = prop.getProperty("username");
	    	String pwd = prop.getProperty("password");
	    	System.out.println("username is"+un);
			username.sendKeys(un);
			seleniumhelper.jsclick(nextBtn,driver);
			WebDriverWait wait = new WebDriverWait(driver,70);
			wait.until(ExpectedConditions.visibilityOfElementLocated((By.name("password"))));
			if(password.isDisplayed())
			password.sendKeys(pwd);
			seleniumhelper.jsclick(loginBtn,driver);
			wait = new WebDriverWait(driver,70);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"home\"]/div/div/div[1]/div[1]/div")));
			return new HomePage(driver);
			    	
			    	
			//return new HomePage();
		}
		

}
