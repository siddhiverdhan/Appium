package org.RPRA;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class ANDROID_LoginPage {
	private WebDriver driver;

	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[3]/android.widget.EditText")

	//@FindBy(xpath="//label[text()=\"Email\"]/parent::div/following-sibling::div/descendant::input")
	private WebElement user_name;


	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[5]/android.widget.EditText")
	private WebElement user_password;


	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[6]/android.widget.Button")
	 private WebElement signIn;
/*
	@FindBy(xpath="(//android.widget.EditText)[1]")
	private WebElement user_name;
	@FindBy(xpath="(//android.widget.EditText)[2]")
	private WebElement user_password;
	@FindBy(xpath ="//android.widget.Button")
	private WebElement signIn;

*/
	public ANDROID_LoginPage(WebDriver driver) {

	this.driver =  driver;

		PageFactory.initElements(driver, this);
		
	}
	
	public void loginDetails() {
	//	user_name.sendKeys("jose");
	//	user_name.clear();
		//fullcopy
		sendKeysCustom(user_name,"rpraauto1@gmail.com" );
		sendKeysCustom(user_password,"Pwc@2023" );
		//waitForVisible(user_name,60);
		//user_name.sendKeys("rpraauto1@gmail.com");
		//user_password.sendKeys("Pwc@2023");
		/*preprod
		user_name.sendKeys("pwcsalesforcetest@gmail.com");
		user_password.sendKeys("Pwc@2023");
		*/

		signIn.click();
		
	}

	public void waitForVisible(WebElement ele, int time) {
		Duration dur = Duration.ofSeconds(time);
		WebDriverWait wait = new WebDriverWait(driver, dur);
		wait.until(ExpectedConditions.visibilityOf(ele));

	}

	public void waitForClickable(WebElement ele, int time) {
		Duration dur = Duration.ofSeconds(time);
		WebDriverWait wait = new WebDriverWait(driver, dur);
		wait.until(ExpectedConditions.elementToBeClickable(ele));

	}

	public void sendKeysCustom(WebElement ele, String text) {
		waitForVisible(ele, 60);
		ele.sendKeys(text);

	}

	public void clickCustom(WebElement ele) {
		waitForClickable(ele, 60);
		ele.click();

	}

}
