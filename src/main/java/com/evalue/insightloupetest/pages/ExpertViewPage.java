/**
 * 
 */
package com.evalue.insightloupetest.pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.evalue.insightloupetest.base.BaseTest;

/**
 * @author Shivani Nagpal
 * 19-Jul-2020
 * ExpertViewPage.java
 *
 */
public class ExpertViewPage extends BaseTest{
	
	//Page Factory - OR:
	
		@FindBy(xpath="//*[@id=\"recordsContainer\"]/div/div[1]/div/div[1]/span[3]/div[1]/i")
		WebElement filter_link;
		
		@FindBy(xpath ="//*[@id=\"recordsContainer\"]/div/div[1]/div/div[2]/div[2]/div/div/div[1]/div[1]/div/div[2]/div/div")
		WebElement document_type_field;
		
		@FindBy(xpath ="//*[@id=\"recordsContainer\"]/div/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div/div[2]/button[1]")
		WebElement apply_button;
		
		@FindBy(xpath ="//*[@id=\"recordsContainer\"]/div/div[1]/div/div[1]/span[2]/div[1]/i")
		WebElement list_link;
		
		@FindBy(xpath ="//*[@id=\"recordsContainer\"]/div/div[1]/div/div[2]/div[1]/div/div/div[1]/div[2]/div/div/div/div[2]/div")
		WebElement list_dropdown;
		
		@FindBy(xpath ="//*[@id=\"recordsContainer\"]/div/div[1]/div/div[2]/div[1]/div/div/div[1]/div[2]/div/div/div/div[1]")
		WebElement bulk_action_list;
		
		@FindBy(xpath ="//*[@id=\"react-select-9-option-0\"]")
		WebElement patent_family_val;
		
		@FindBy(xpath ="//*[@id=\"recordsContainer\"]/div/div[1]/div/div[2]/div[2]/div/div/div[1]/div[1]/div/div[2]/div[1]/div/div[1]/div[2]/div[2]")
		WebElement article_val_remove;
		
		@FindBy(xpath ="//*[@id=\"recordsContainer\"]/div/div[1]/div/div[2]/div[2]/div/div/div[1]/div[1]/div/div[2]/div[1]/div/div[1]/div[1]/div[2]")
		WebElement patent_family_val_remove;
		
		@FindBy(xpath ="//*[@id=\"react-select-8-option-1\"]")
		WebElement export_all_tab;
		
		@FindBy(xpath ="/html/body/div[6]/div[2]/div/div[2]/div/div[2]/div/div[1]/div/button[1]")
		WebElement select_all_button;
		
		@FindBy(xpath ="/html/body/div[6]/div[2]/div/div[3]/div/button[1]")
		WebElement export_button;
		
		@FindBy(xpath ="/html/body/div[6]/div[2]/div/div[2]/div/div/a")
		WebElement download_button;
		
		
		
		
		
		
		
		//Initializing the Page Objects:
		public ExpertViewPage(WebDriver driver){
			this.driver = driver;
			PageFactory.initElements(driver, this);
		 }
		
		public void filter_document()
		{
			WebDriverWait wait = new WebDriverWait(driver,50);
			wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"recordsContainer\"]/div/div[1]/div/div[1]/span[3]/div[1]/i"))));
			filter_link.click();
			
		}
		
		public void select_document_type()
		{
			
			WebDriverWait wait = new WebDriverWait(driver,50);
			wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"recordsContainer\"]/div/div[1]/div/div[2]/div[2]/div/div/div[1]/div[1]/div/div[2]/div/div"))));
			document_type_field.click();
			seleniumhelper.jsclick(patent_family_val_remove, driver);
			apply_button.click();
			document_type_field.click();
			wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"react-select-9-option-0\"]"))));
			seleniumhelper.jsclick(patent_family_val, driver);
			//seleniumhelper.jsclick(article_val_remove, driver);
			System.out.println(document_type_field.getText());
			apply_button.click();
			
		}
		
		public String get_document_type_field_val()
		{
			
			return document_type_field.getText();
			
			
		}
		
		public void select_list_item() 
		{
			
			WebDriverWait wait = new WebDriverWait(driver,50);
			wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"recordsContainer\"]/div/div[1]/div/div[1]/span[2]/div[1]/i"))));
			list_link.click();
			bulk_action_list.click();
			wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"react-select-8-option-1\"]"))));
			seleniumhelper.jsclick(export_all_tab, driver);
			wait = new WebDriverWait(driver,50);
			wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("/html/body/div[6]/div[2]/div/div[2]/div/div[2]/div"))));
		    select_all_button.click();
		    select_all_button.click();
	        export_button.click();
	        
			
		}
		
		public String get_href_download_link() 
		{
			
			WebDriverWait wait = new WebDriverWait(driver,50);
			wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("/html/body/div[6]/div[2]/div/div[2]/div/div/a"))));
			String href = download_button.getAttribute("href");
			return href;
		}
		
		
	
	
	

}
