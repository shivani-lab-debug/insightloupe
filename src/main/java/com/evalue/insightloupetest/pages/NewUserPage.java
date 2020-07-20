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
 * NewUserPage.java
 *
 */
public class NewUserPage extends BaseTest{
	
	//Page Factory - OR:
	
	@FindBy(xpath="//*[@id=\"navbar\"]/div[1]/div[2]/div[1]/div[4]/div/a")
	WebElement administrationLink;
	
	@FindBy(xpath ="//*[@id=\"users-list\"]/div/div[2]/div[2]/div/div/div[1]")
	WebElement cardPlaceHolder;
	
	@FindBy(xpath ="//input[@type='email' and @name ='email']")
	WebElement emailField;
	
	@FindBy(xpath ="//input[@type='text' and @name ='first_name']")
	WebElement firstName;
	
	@FindBy(xpath ="//input[@type='text' and @name ='last_name']")
	WebElement lastName;
	
	@FindBy(xpath ="//input[@type='checkbox' and @name ='is_manager']")
	WebElement isManager;
	
	@FindBy(xpath ="/html/body/div[5]/div/div[2]/form/div[6]/div/button")
	WebElement submit_button;
	
	@FindBy(xpath ="//a[@class ='btn btn-default']")
	WebElement cancel_button;
	
	@FindBy(xpath ="//*[@id=\"users-list\"]/div/div[2]/div[2]/div/div[2]/div/div[4]/div/a/div")
	WebElement user_detail_link;
	
	@FindBy(xpath ="//*[@id=\"container-main-content\"]/div/div[2]/div[1]/div/form/div/div[3]/a[1]/i")
	WebElement edit_project_access_icon;
	
	@FindBy(xpath ="//*[@id=\"container-main-content\"]/div[2]/div[2]/div[1]/div/form/div/div[2]/div[2]/div[1]/a")
	WebElement user_access_link;
	
	@FindBy(xpath ="/html/body/div[5]/div/div[2]/form/div[1]/div/div")
	WebElement client_domain_error;
	
	@FindBy(xpath ="/html/body/div[5]/div/div[2]/form/div[1]/div/div")
	WebElement existing_email_error;
	
	@FindBy(xpath ="//*[@id=\"users-list\"]/div/div[2]/div[2]/div/div[4]/div/div[2]/a/h3/div")
	WebElement new_user_text;
	
	@FindBy(xpath ="//*[@id=\"container-main-content\"]/div[2]/div[2]/div[1]/div/form/div/div[2]/div[1]/div/input")
	WebElement user_access_field;
	
	
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginBtn;
	
	//Initializing the Page Objects:
	public NewUserPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	 }
	
	public void go_to_user_page()
	{
		WebDriverWait wait = new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"navbar\"]/div[1]/div[2]/div[1]/div[4]/div/a"))));
	   administrationLink.click();
	}
	
   public void click_add_newuser_link() {
	   go_to_user_page();
	   WebDriverWait wait = new WebDriverWait(driver,70);
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"users-list\"]/div/div[2]/div[2]/div/div/div[1]"))));
	   cardPlaceHolder.click();

	}
   
   public void add_new_user_email(String email) 
   {
	   emailField.sendKeys(email);
   }
   
   public void add_new_user_first_name(String email,String fstnm, String lstnm) 
   {
	  firstName.sendKeys(fstnm);
   }
   
   public void add_new_user_last_name(String lstnm) 
   {
	  lastName.sendKeys(lstnm);
   }
   
   
   public void add_new_user(String email,String fstnm, String lstnm) 
   {
	   emailField.sendKeys(email);
	   firstName.sendKeys(fstnm);
	   lastName.sendKeys(lstnm);
   }
   
   public void confirm_new_user()
   {
	   submit_button.click();
   }
   
   public void cancel_new_user()
   {
	   cancel_button.click();
	   
   }
   public void go_to_new_user_detail_page()
   {
	   WebDriverWait wait = new WebDriverWait(driver,70);
	   wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"users-list\"]/div/div[2]/div[2]/div/div[2]/div/div[4]/div/a/div"))));
	   user_detail_link.click();
   }
   
   public void edit_project_access()
   {
	   
	   WebDriverWait wait = new WebDriverWait(driver,70);
	   wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"container-main-content\"]/div[2]/div[2]/div[1]/div/form/div/div[2]/div[2]/div[1]/a"))));
	   user_access_link.click();
	   edit_project_access_icon.click();
	   
   }
	
   public boolean client_domain_error_display()
   {
	   if(client_domain_error.isDisplayed())
		   return true;
	   return false;
   }
   
   public boolean existing_email_error_display()
   {
	   if(existing_email_error.isDisplayed())
		   return true;
	   return false;
   }
   
   public boolean get_new_user(String name)
   {
	   if(new_user_text.getText().equals(name))
		   return true;
	   return false;
   }

}
