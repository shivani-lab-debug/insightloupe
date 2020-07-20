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
 * NewUserStory.java
 *
 */
public class UserStory01Test extends TestBase {
	
	
	@Test(enabled = true)
	public void userstory1_TC001() 
	{
		//Validate that clicking the add button link is taking the user to the add new user page 
        newuserpage = homepage.getNewUserPage(driver);
		newuserpage.click_add_newuser_link();
		Assert.assertEquals(driver.getCurrentUrl(), prop.getProperty("new_user_page_url"));
		
	}
	
	@Test(enabled = true)
	public void userstory1_TC002() 
	
	{
		//validate that clicking on cancel button on  add new user page takes the user back to the users page
		newuserpage = homepage.getNewUserPage(driver);
		newuserpage.click_add_newuser_link();
		//newuserpage.add_new_user("abc444@example.com", "abc", "lst");
		newuserpage.cancel_new_user();
		Assert.assertEquals(driver.getCurrentUrl(), prop.getProperty("user_page_url"));
		
		
		
	}
	
	@Test(enabled= true)
	public void userstory1_TC003() 
	{
		//Validate that when user feed in email with domain other than client's domain, he will receive error for the same
		String email = prop.getProperty("email_wrong_domain");
		String fst_nm = prop.getProperty("first_name");
		newuserpage = homepage.getNewUserPage(driver);
		newuserpage.click_add_newuser_link();
		newuserpage.add_new_user(email,fst_nm,"");
		newuserpage.confirm_new_user();
		Assert.assertEquals(newuserpage.client_domain_error_display(),true);
		//newuserpage.go_to_new_user_detail_page();
		
		
	}
	
	@Test(enabled= true)
	public void userstory1_TC004()  
	{
		//Validate that when user feed in email with alreday exsiting email id, he will receive error for the same
		
		String email = prop.getProperty("email_existing");
		String fst_nm = prop.getProperty("first_name");
		newuserpage = homepage.getNewUserPage(driver);
		newuserpage.click_add_newuser_link();
		newuserpage.add_new_user(email,fst_nm,"");
		newuserpage.confirm_new_user();
		Assert.assertEquals(newuserpage.existing_email_error_display(),true);
		//newuserpage.go_to_new_user_detail_page();
		//newuserpage.
		
	}
	
	@Test(enabled= true)
	public void userstory1_TC009() 
	{
		//Validate that when user feed in blank first name mandatory field then on clicking submit , user reamins on same epage
		newuserpage = homepage.getNewUserPage(driver);
		newuserpage.click_add_newuser_link();
		newuserpage.add_new_user_email("hh@example.com");
		newuserpage.confirm_new_user();
		Assert.assertEquals(driver.getCurrentUrl(), prop.getProperty("new_user_page_url"));
	}
	
	@Test(enabled = true)
	public void userstory1_TC010() 
	{
		//validate that on submitting  valid user details  we are able to see that user on the user page
		String email = prop.getProperty("user_email");
		String fst_nm = prop.getProperty("first_name");
		newuserpage = homepage.getNewUserPage(driver);
		newuserpage.click_add_newuser_link();
		newuserpage.add_new_user(email,fst_nm,"");
		newuserpage.confirm_new_user();
		Assert.assertEquals(driver.getCurrentUrl(), prop.getProperty("user_page_url"));
		Assert.assertEquals(newuserpage.get_new_user(fst_nm), true);
	}
	
	
	@Test(enabled = true)
	public void userstory1_TC011() 
	{
		//validate that on clicking new user detail link  user is redirected to the details page
		newuserpage = homepage.getNewUserPage(driver);
		newuserpage.go_to_user_page();
		newuserpage.go_to_new_user_detail_page();
		Assert.assertEquals(driver.getCurrentUrl(), prop.getProperty("user_detail_page"));
		//newuserpage.edit_project_access();
		
		//newuserpage.
		
	}
	
	
	


}
