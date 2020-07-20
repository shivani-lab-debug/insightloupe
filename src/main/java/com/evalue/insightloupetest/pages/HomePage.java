/**
 * 
 */
package com.evalue.insightloupetest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.evalue.insightloupetest.base.BaseTest;

/**
 * @author Shivani Nagpal
 * 19-Jul-2020
 * HomePage.java
 *
 */
public class HomePage extends BaseTest {
	
	//Page Factory - OR:
			@FindBy(xpath = "//*[@id=\"home\"]/div/div/div[1]/div[1]/div")
			WebElement widget_pagetitle;
			
			@FindBy(name="password")
			WebElement password;
			
			@FindBy(xpath="//button[@type='submit']")
			WebElement nextBtn;
			
			@FindBy(xpath="//button[@type='submit']")
			WebElement loginBtn;
			
			@FindBy(xpath="//*[@id=\"navbar\"]/div[1]/div[2]/div[1]/div[4]/div/a")
			WebElement administrationLink;
			
			@FindBy(xpath="//*[@id=\"widget-content-1\"]/div/div/div[2]/ul/div/div[1]/div/div[2]/a/span")
			WebElement document_tab;
			
			@FindBy(xpath="//*[@id=\"widget-content-1\"]/div/div/div[2]/ul/div/div[2]/div/a/button")
			WebElement manage_link;
			
			@FindBy(xpath="//*[@id=\"container-main-content\"]/div[1]/div/div/div/a[4]")
			WebElement rfm_Selection_link;
			
			//Initializing the Page Objects:
			public HomePage(WebDriver driver){
				this.driver = driver;
				PageFactory.initElements(driver, this);
			 }
			
           public boolean home_title_displayed() {
        	   if(widget_pagetitle.isDisplayed())
        		   return true;
			return false;
        	   
           }
           
           public NewUserPage getNewUserPage(WebDriver driver)
           {
        	   WebDriverWait wait = new WebDriverWait(driver,50);
       		   wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"navbar\"]/div[1]/div[2]/div[1]/div[4]/div/a"))));
       	       administrationLink.click();
        	   return new NewUserPage(driver);
           }
           
           public ExpertViewPage getExpertViewPage(WebDriver driver)
           {
        	   WebDriverWait wait = new WebDriverWait(driver,50);
       		   wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"widget-content-1\"]/div/div/div[2]/ul/div/div[1]/div/div[2]/a/span"))));
       	       document_tab.click();
        	   return new ExpertViewPage(driver);
           }
           
           public RfmSelectionModelPage getRfmSelectionModelPage(WebDriver driver)
           {
        	   WebDriverWait wait = new WebDriverWait(driver,50);
       		   wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"widget-content-1\"]/div/div/div[2]/ul/div/div[2]/div/a/button"))));
       	       manage_link.click();
       	       rfm_Selection_link.click();
			   return new RfmSelectionModelPage(driver);
        	   
           }
           
           
           
}
			
			

