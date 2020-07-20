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
 * UserStory03Test.java
 *
 */
public class UserStory03Test extends TestBase {
	
	
	@Test(enabled = true)
	public void userstory3_TC001() 
	{
		//Validate that user is able to add new rfm model
		
		
		
		
		rfmpage = homepage.getRfmSelectionModelPage(driver);
		rfmpage.add_rfm_model();
		Assert.assertEquals(rfmpage.is_new_user_visible(), true);
        
		
	}
		
	@Test(enabled = true)
	public void userstory3_TC002() 
	{
		//Validate that user is able to edit the name of the new rfm model
		rfmpage = homepage.getRfmSelectionModelPage(driver);
		rfmpage.add_rfm_model();
		rfmpage.add_preference_rfm();
		rfmpage.edit_new_rfm_model_name("demo");
	    Assert.assertEquals(rfmpage.is_new_rfm_visible("demo"), true);
		
	}
	
	@Test(enabled = true)
	public void userstory3_TC003() 
	{
		//Validate that user is able to clear all default values
		rfmpage = homepage.getRfmSelectionModelPage(driver);
		rfmpage.add_rfm_model();
		rfmpage.add_preference_rfm();
		rfmpage.clear_default_values();
	    Assert.assertEquals(rfmpage.is_jurisdication_field_blank(), true);
		
	}
	
	@Test(enabled = true)
	public void userstory3_TC004() 
	{
		//Validate that user is able to clear all default values
		rfmpage = homepage.getRfmSelectionModelPage(driver);
		rfmpage.add_rfm_model();
		rfmpage.add_preference_rfm();
		rfmpage.clear_default_values();
		rfmpage.select_wo_as_preference();;
		Assert.assertEquals(rfmpage.is_wo_selected(), true);
		
	}
	

}
