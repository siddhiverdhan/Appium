package org.example;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.ios.IOSDriver;

public class ManifestPage {
	
	private WebDriver driver;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Navigate to Create Manifest Screen\"]/android.widget.TextView[2]")
	private WebElement newManifest;

	/*
	@FindBy(xpath="(//XCUIElementTypeOther[@name='-- '])[3]")
	private WebElement searchField;
	
	@FindBy(xpath="(//XCUIElementTypeTextField[@name='RNE__Input__text-input'])")
	private WebElement searchText;
	*/
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Select Generator\"]")
	private WebElement searchGeneratorText;

	@FindBy(xpath="//android.widget.EditText[@content-desc=\"Searchgenerator\"]")
	private WebElement searchGeneratorPopupText;


	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"ATC1 BUSINESS\"]")
	private WebElement generatorSearchResult;
	@FindBy(xpath="(//XCUIElementTypeOther[@name='Select Generator'][5] | //android.view.ViewGroup[@content-desc=\"Select\"]/android.view.ViewGroup)")
	private WebElement selectGeneratorButton;

	@FindBy(xpath="(//*[@name='Select Carrier'])[3] | //android.view.ViewGroup[@content-desc=\"Select Carrier\"]")
	private WebElement searchCarrierText;

	@FindBy(xpath="//android.widget.EditText[@content-desc=\"Searchcarrier\"]")
	private WebElement searchCarrierPopupText;

	@FindBy(xpath="(//android.view.ViewGroup[@content-desc=\"562-TestautomationCar\"])[1]")
	private WebElement carrierSearchResult;


	@FindBy(xpath="(//*[@name='Select Intended Receiver'])[3]")
	private WebElement searchReceiverText;
	

	@FindBy(xpath="(//XCUIElementTypeOther[@name='Select'])[2]")
	private WebElement selectButton;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name='Select Carrier'])[6]")
	private WebElement searchCarrierButton;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name='Select Intended Receiver'])[6]")
	private WebElement searchReceiverButton;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name=\"Next - Add Waste Information  >\"])[2]")
	private WebElement addWasteButton;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name='-- '])")
	private WebElement selectWasteField;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name=\"Select Waste\"]")
	private WebElement selectWaste;
	
	@FindBy(xpath="(//XCUIElementTypeTextField[@name='RNE__Input__text-input'])[5]")
	private WebElement shippingName;
	
	@FindBy(xpath="(//XCUIElementTypeTextField[@name='RNE__Input__text-input'])[7]")
	private WebElement quantity;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name=\"-- \"])[7]")
	private WebElement unit;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name='kg'])[2]")
	private WebElement unitKg;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name='Ready for Shipment'])[3]")
	private WebElement readyForShipment;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name='Waste']")
	private WebElement wasteTab;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name='Vehicle']")
	private WebElement vehicleTab;
	
	@FindBy(xpath="(//XCUIElementTypeTextField[@name='RNE__Input__text-input'])[4]")
	private WebElement vehicleRegNumber;
	
	@FindBy(xpath="(//XCUIElementTypeTextField[@name='-- '])[2]")
	private WebElement vehicleProvince;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name='Sign Manifest'])[2]")
	private WebElement signManifest;
	
	
	@FindBy(xpath="//XCUIElementTypeOther[@value='checkbox, not checked, off'`]")
	private WebElement signConsentCheckBox;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name='Confirm'])[2]")
	private WebElement signConfirmation;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name='Close'])[2]")
	private WebElement closeConfirmation;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name='Confirm Drop-Off'])[2]")
	private WebElement confirmDropOff;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name='Complete Drop-Off'])[2]")
	private WebElement completeDropOff;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name='Vertical scroll bar, 3 pages']")
	private WebElement verticalScrollBar;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name='Accept']")
	private WebElement acceptWasteButton;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name='Refuse']")
	private WebElement refuseWasteButton;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name='Does not meet acceptance criteria'])[2]")
	private WebElement refusalReasonAcceptance;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name='I am partially refusing this waste.']/XCUIElementTypeOther/XCUIElementTypeOther")
	private WebElement partialRefusalCheckbox;
	
	@FindBy(xpath="(//XCUIElementTypeTextField[@name='RNE__Input__text-input'])[1]")
	private WebElement quantityRefused;
	
	@FindBy(xpath="(//XCUIElementTypeTextField[@name='RNE__Input__text-input'])[2]")
	private WebElement quantityAccepted;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name='-- '])[3]")
	private WebElement unitRefused;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name='-- '])[6]")
	private WebElement unitAccepted;
	
	
	@FindBy(xpath="//XCUIElementTypeOther[@name='Copy Quantity Shipped']")
	private WebElement copyQuantityShipped;
	
	@FindBy(xpath="//XCUIElementTypeTextField[@name='RNE__Input__text-input']")
	private WebElement qunatityReceived;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name='-- '])[3]")
	private WebElement unitReceived;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name='-- '])[5]")
	private WebElement handlingCode;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name='Accept Waste']")
	private WebElement acceptWasteConfirm;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name='Refuse Waste']")
	private WebElement refuseWasteConfirm;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name=' Add Another Waste']")
	private WebElement addAnotherLineItem;
	
	@FindBy(xpath="//XCUIElementTypeButton[@name=\"Return\"]")
	private WebElement returnButton;

	public ManifestPage(WebDriver driver2) {
		PageFactory.initElements(driver2, this);
		this.driver=driver2;
		
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
		waitForVisible(ele, 5);
		ele.sendKeys(text);
		
	}
	
	public void clickCustom(WebElement ele) {
		waitForClickable(ele, 10);
		ele.click();
		
	}
	
	public void createManifest() {
		 AppiumDriver dr = null;

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
/* Working New Manifest Click - P2
		WebElement el1 = (WebElement) driver.findElement (By.xpath("//android.view.ViewGroup[@content-desc=\"Navigate to Create Manifest Screen\"]/android.widget.TextView[2]"));
		el1.click();
		WebElement el2 = (WebElement) driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Select Generator\"]"));
		el2.click();
*/
		clickCustom(newManifest);

		//Generator
		clickCustom(searchGeneratorText);
		
		sendKeysCustom(searchGeneratorPopupText,"ATC1 Business" );
		clickCustom(generatorSearchResult);
		clickCustom(selectGeneratorButton);
		//clickCustom(selectButton);

		
		//carrier
		
		clickCustom(searchCarrierText);
		sendKeysCustom(searchCarrierPopupText,"TestautomationCar" );
		clickCustom(carrierSearchResult);
		clickCustom(selectGeneratorButton);
		//sendKeysCustom(searchText,"TestautomationCar");
/*		clickCustom(searchCarrierButton);
		clickCustom(selectButton);
		
		
		//Receiver
		
		clickCustom(searchReceiverText);
		
		sendKeysCustom(searchText,"AY Chemicals");
		clickCustom(searchReceiverButton);
		clickCustom(selectButton);
		
		
		//add waste
		
		clickCustom(addWasteButton);
		clickCustom(selectWasteField);
		returnButton.click();
		clickCustom(selectWaste);
		clickCustom(selectButton);
		
		
		//enter waste details
		shippingName.clear();
		shippingName.sendKeys("Shipping name");
		
		shippingName.sendKeys(Keys.RETURN);
		
		quantity.clear();
		sendKeysCustom(quantity,"350");
		quantity.sendKeys(Keys.RETURN);
		unit.clear();
		
		
		//sendKeysCustom(quantity,Keys.RETURN);
		unit.sendKeys(Keys.RETURN);//didn't work
		//unitKg.click();
		
		readyForShipment.click();
		
		*/
		
	}
	
	//driver.findElement(By.xpath("//XCUIElementTypeTextField[@name='RNE__Input__text-input']")).sendKeys("ON001173125");
	//driver.findElement(By.xpath("//XCUIElementTypeOther[contains(@text,'ON001173125')]")).click();
	//driver.findElement(By.xpath("(//XCUIElementTypeOther[@name='Select'])[2]")).click();

}
