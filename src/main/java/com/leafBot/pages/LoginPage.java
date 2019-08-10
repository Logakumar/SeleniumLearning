package com.leafBot.pages;

import org.openqa.selenium.WebElement;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {

	public LoginPage() { // Pagefactory code
	}

	public void enterUsername(String data) {
		
		WebElement eleusername = locateElement("id","username");
		clearAndType(eleusername,data);
		
	}

	public void enterPassword(String data) {
		clearAndType(locateElement("id", "password"), data);

	}

	public void clickLogin() {
		click(locateElement("class","decorativeSubmit"));
		
		/*
		 * HomePage page = new HomePage(); return page;
		 */
		//return new HomePage();
	}

}
