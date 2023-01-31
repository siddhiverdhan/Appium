package ca.rpra.utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.AppiumBy;

public class BasePage {
	private WebDriver driver;
	

	public void setDriver(WebDriver driver2){
		this.driver= driver2;
	}
	public void waitForVisible(WebElement ele, int time) {
		Duration dur = Duration.ofSeconds(time);
		int interval = (int) (dur.toSeconds())/20;
		try {
			for (int i = 0; i <= interval; ) {
				if (isVisible(ele))
					break;
				else
					i = i + 20;

			}
		}
		catch (Exception e){
			e.printStackTrace();
		}
		
	}
	
	public void waitForClickable(WebElement ele, int time) {
		Duration dur = Duration.ofSeconds(time);
		int interval = (int) (dur.toSeconds())/20;
		for(int i= 0; i<=interval;){
			if(isVisible(ele) && isClickable(ele))
				break;
			else
				i=i+20;

		}
		//WebDriverWait wait = new WebDriverWait(driver, dur);
		//wait.until(ExpectedConditions.elementToBeClickable(ele));

		
	}
	
	public void sendKeysCustom(WebElement ele, String text) {
		waitForVisible(ele, 5);
		System.out.println("Set value for Element"+ ele.getText() +"as "+text);
		ele.sendKeys(text);
		
	}
	
	public void clickCustom(WebElement ele) {
		waitForClickable(ele, 30);
		System.out.println("--clicked on Element--"+ ele.getText());
		ele.click();
		
	}

	public boolean isVisible(WebElement ele, int time) {
		//waitForVisible(ele, time);

		try{
			ele.getLocation();
			return true;
		}catch(Exception e){
			return false;
		}

	}

	public boolean isClickable(WebElement ele) {
		//waitForVisible(ele, time);

		try{
			if(ele.getAttribute("clicable").contains("rue"))
				return true;
			else
				return false;
		}catch(Exception e){
			return false;
		}

	}

	public boolean isVisible(WebElement ele) {
		//waitForVisible(ele, 10);

		try{
			ele.getLocation();
			return true;
		}catch(Exception e){
			return false;
		}

	}

	public void clickMultiple(WebElement tobeSelectedElement,WebElement visibleAfterSelectingFirst ){
		for(int i=0;i<5;i++){
			clickCustom(tobeSelectedElement);
			if(isVisible(visibleAfterSelectingFirst)) {
				System.out.println("Selected Element"+ tobeSelectedElement.toString()+ "after "+ i +" retries");
				break;
			}

		}
	}



	public void scrollCustom(){
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(100000)"));

	}

}
