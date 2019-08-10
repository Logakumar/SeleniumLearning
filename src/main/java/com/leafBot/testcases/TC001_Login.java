package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.testng.api.base.ProjectSpecificMethods;
import com.leafBot.pages.LoginPage;

public class TC001_Login extends ProjectSpecificMethods {
	@BeforeTest
	public void setData() {
		excelFileName="TC001";
	}
	@Test(dataProvider="fetchData")
	public void runLogin(String username,String password) {
		
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		
		
		/*LoginPage page = new LoginPage();
		page.enterUsername();
		page.enterPassword();
		page.clickLogin();
		
		HomePage page1 = new HomePage();
		page1.clickLogout();*/
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}






