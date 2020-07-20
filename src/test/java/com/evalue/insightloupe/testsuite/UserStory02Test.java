/**
 * 
 */
package com.evalue.insightloupe.testsuite;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.evalue.insightloupe.testutil.TestBase;
import com.evalue.insightloupetest.pages.LoginPage;

/**
 * @author Shivani Nagpal
 * 19-Jul-2020
 * UserStory02Test.java
 *
 */
public class UserStory02Test extends TestBase{
	
	
	@Test(enabled = true)
	public void userstory2_TC001() 
	{
		//Validate that user is able to apply "patent families filter"  by first removing it from document type and then selecting it from dropdown
		expertviewpage = homepage.getExpertViewPage(driver);
		expertviewpage.filter_document();
		expertviewpage.select_document_type();
		Assert.assertEquals(expertviewpage.get_document_type_field_val().contains("Patent Families"),true);
		
	}
	

	@Test(enabled = true)
	public void userstory2_TC002() throws InterruptedException 
	{
		//Validate that href attribute of download here link"
		String href = "documents4.zip";
		expertviewpage = homepage.getExpertViewPage(driver);
		expertviewpage.select_list_item();
		String actual_href = expertviewpage.get_href_download_link();
		Assert.assertEquals(actual_href.contains(href),true);
		
	}
	
	

}
