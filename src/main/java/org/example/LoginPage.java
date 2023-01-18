package org.example;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.ios.IOSDriver;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;


public class LoginPage {

	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"bioUsername"\"]")
	private WebElement user_name;


	@FindBy(xpath="bioPassword")
	private WebElement user_password;


	@FindBy(xpath ="Sign In")
	 private WebElement signIn;
	
	public LoginPage(WebDriver driver) {
		
	
		PageFactory.initElements(driver, this);
		
	}
	
	public void loginDetails() {
	//	user_name.sendKeys("jose");
	//	user_name.clear();
		user_name.sendKeys("pwcsalesforcetest@gmail.com");
		user_password.sendKeys("Pwc@2022");
		signIn.click();
		
	}

}
