package com.evalue.insightloupe.testutil;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.evalue.insightloupetest.base.BaseTest;
import com.evalue.insightloupetest.pages.ExpertViewPage;
import com.evalue.insightloupetest.pages.HomePage;
import com.evalue.insightloupetest.pages.LoginPage;
import com.evalue.insightloupetest.pages.NewUserPage;
import com.evalue.insightloupetest.pages.RfmSelectionModelPage;

public class TestBase extends BaseTest{
	
	protected LoginPage loginpage;
	protected HomePage homepage;
	protected NewUserPage newuserpage;
	protected ExpertViewPage expertviewpage;
	protected RfmSelectionModelPage rfmpage;
	
	
	@BeforeMethod
	  public void setup() {
		initialization();
	    loginpage = new LoginPage(driver);
		homepage =loginpage.login(driver);
		boolean is_onhomepage = homepage.home_title_displayed();
		Assert.assertEquals(is_onhomepage, true);
	  }
	
	@AfterMethod
	  public void afterTest() {
	     cleanup();
	  }



}
