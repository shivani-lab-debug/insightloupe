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
 * HomeTest.java
 *
 */
public class HomeTest extends TestBase{
	
	@Test
	public void homepagetest()  
	{
		loginpage = new LoginPage(driver);
		homepage =loginpage.login(driver);
	    boolean is_onhomepage = homepage.home_title_displayed();
		Assert.assertEquals(is_onhomepage, true);
		
	}
	

}
