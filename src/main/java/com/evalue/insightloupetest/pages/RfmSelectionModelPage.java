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
 * RfmSelectionModelPage.java
 *
 */
public class RfmSelectionModelPage extends BaseTest {
	
	//Page Factory - OR:
	
			@FindBy(xpath="//*[@id=\"rfm-models-page\"]/div/div/div[1]/div/div/button")
			WebElement add_rfm_model_button;
			
			@FindBy(xpath ="//*[@id=\"rfm-models-page\"]/div/div/div[2]/div/div[1]/h2/div/span")
			WebElement new_rfm_model_tab;
			
			
			@FindBy(xpath ="//*[@id=\"rfm-models-page\"]/div/div/div[2]/div/div[1]/div/button[2]")
			WebElement edit_rfm_model_tab;
			
			@FindBy(xpath ="//*[@id=\"rfm-models-page\"]/div/div/div[2]/div/div[3]/div/div/div[1]/div")
			WebElement add_preference_button;
			
			@FindBy(css =".ilp-dropdown-button__option:nth-of-type(1)")
			WebElement jurisdiction_field;
			

			@FindBy(css ="span[data-component=\"inline_edit\"]")
			WebElement rfm_model_name_link;
			
			
			@FindBy(xpath ="//*[@id=\"rfm-models-page\"]/div/div/div[2]/div/div[1]/h2/div/input")
			WebElement rfm_model_name_input;
			
			@FindBy(xpath ="//*[@id=\"rfm-models-page\"]/div/div/div[2]/div/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]")
			WebElement delete_default_values;
			
			@FindBy(xpath ="//*[@id=\"rfm-models-page\"]/div/div/div[2]/div/div[2]/div/div/div[2]/div[1]/div/div[1]/div[1]")
			WebElement preference_dropdown;
			
			@FindBy(xpath ="//*[@id=\"react-select-10-option-5\"]")
			WebElement wo_selector;
			
			@FindBy(xpath ="//*[@id=\"rfm-models-page\"]/div/div/div[2]/div/div[2]/div/div/div[2]/div[1]/div")
			WebElement jurisdiction_input;
			
			@FindBy(css ="body")
			WebElement body;
			
			
			
			
			
			
			//Initializing the Page Objects:
			public RfmSelectionModelPage(WebDriver driver){
				this.driver = driver;
				PageFactory.initElements(driver, this);
			 }
			
			public void add_rfm_model()
			{
				WebDriverWait wait = new WebDriverWait(driver,50);
				wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"rfm-models-page\"]/div/div/div[1]/div/div/button"))));
				add_rfm_model_button.click();
				
			}
			
	        public void add_preference_rfm()
	        {
	        	add_preference_button.click();
//	        	WebDriverWait wait = new WebDriverWait(driver,50);
//				wait.until(ExpectedConditions.visibilityOfElementLocated((By.cssSelector(".ilp-dropdown-button__menu .ilp-dropdown-button__option:first"))));
	            seleniumhelper.jsclick(jurisdiction_field, driver);
	            
	        }
	        
	        public boolean is_new_user_visible()
	        {
	        	if(new_rfm_model_tab.isDisplayed())
	        		return true;
				return false;
	        }
	
	        public void go_to_edit_rfm_page()
	        {
	        	WebDriverWait wait = new WebDriverWait(driver,50);
				wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"rfm-models-page\"]/div/div/div[2]/div/div[1]/h2/div/span"))));
	        }
	
	        public void edit_new_rfm_model_name(String name)
	        {
	        	go_to_edit_rfm_page();
	        	rfm_model_name_link.click();
	        	rfm_model_name_input.sendKeys(name);
	        	body.click();
	        }
	     
	        
	        public void clear_default_values()
	        {
	        	go_to_edit_rfm_page();
	        	WebDriverWait wait = new WebDriverWait(driver,50);
				wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"rfm-models-page\"]/div/div/div[2]/div/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]"))));
	        	delete_default_values.click();
	        }
	
	        public void select_wo_as_preference()
	        {
	        	go_to_edit_rfm_page();
	        	preference_dropdown.click();
	        	WebDriverWait wait = new WebDriverWait(driver,50);
				wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"react-select-10-option-5\"]"))));
	        	wo_selector.click();
	        	
	        }

	        public boolean is_new_rfm_visible(String name)
	        { 
	        	if(rfm_model_name_link.getText().equals(name))
	        		return true;
	        	return false;
	        	
	        }
	        
	        public boolean is_jurisdication_field_blank()
	        { 
	        	if(jurisdiction_input.getText().equals("Enter multiple values in order of preference"))
	        		return true;
	        	return false;
	        	
	        }
	        
	        public boolean is_wo_selected()
	        { 
	        	if(jurisdiction_input.getText().equals("WO"))
	        		return true;
	        	return false;
	        	
	        }
}
