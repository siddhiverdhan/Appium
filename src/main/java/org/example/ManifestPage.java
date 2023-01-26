package org.example;

import java.awt.*;
import java.awt.dnd.Autoscroll;
import java.awt.event.KeyEvent;
import java.sql.Driver;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.ios.IOSDriver;

public class ManifestPage {
	
	private WebDriver driver;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Navigate to Create Manifest Screen\"]/android.widget.TextView[1]")
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

	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Select Carrier\"]")
	private WebElement searchCarrierText;

	@FindBy(xpath="//android.widget.EditText[@content-desc=\"Searchcarrier\"]")
	private WebElement searchCarrierPopupText;

	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"562-TestautomationCar\"]")
	private WebElement carrierSearchResult;

	@FindBy(xpath="(//XCUIElementTypeOther[@name='Select Carrier'])[6]")
	private WebElement searchCarrierButton;

	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Select Intended Receiver\"]")
	private WebElement searchReceiverText;

	@FindBy(xpath="//android.widget.EditText[@content-desc=\"Searchreceiver\"]")
	private WebElement searchReceiverPopupText;

	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"8569-TestAutomationRec\"]")
	private WebElement receiverSearchResult;

	@FindBy(xpath="(//XCUIElementTypeOther[@name='Select Intended Receiver'])[6] / | //android.view.ViewGroup[@content-desc=\"Select\"]/android.view.ViewGroup/android.widget.TextView")
	private WebElement searchReceiverButton;

	@FindBy(xpath="(//XCUIElementTypeOther[@name='Select'])[2] | //android.view.ViewGroup[@content-desc=\"Select\"]/android.view.ViewGroup")
	private WebElement selectButton;

	@FindBy(xpath="//android.view.ViewGroup[@text=\"Receiving Site Address\"]/android.widget.TextView")
	private WebElement receivingSiteAddress;

	
	@FindBy(xpath="(//XCUIElementTypeOther[@name=\"Next - Add Waste Information  >\"])[2] | //android.view.ViewGroup[@content-desc=\"Next - Add Waste Information\"]/android.widget.TextView")
	//@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Next - Add Waste Information\"]")
	private WebElement addWasteButton;

	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Scheduled Shipment Month\"]")
	private WebElement selectShipMonth;

	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Scheduled Shipment Day\"]")
	private WebElement selectShipDate;

	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Scheduled Shipment Year\"]")
	private WebElement selectShipYear;

	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Scheduled Arrival Month\"]")
	private WebElement selectArrivalMonth;

	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Scheduled Arrival Day\"]")
	private WebElement selectArrivalDate;

	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Scheduled Arrival Year\"]")
	private WebElement selectArrivalYear;

	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"January\"]")
	private WebElement selectMonth;
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"1\"]")
	private WebElement selectDate;
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"2024\"]")
	private WebElement selectYear;

	@FindBy(xpath="//android.widget.EditText[@content-desc=\"Search waste typewaste\"]")
	private WebElement searchWaste;

	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"111 A\"]")
	private WebElement selectWasteField;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name=\"Select Waste\"] | //android.view.ViewGroup[@content-desc=\"Select Waste\"]")
	private WebElement selectWaste;
	
	@FindBy(xpath="(//XCUIElementTypeTextField[@name='RNE__Input__text-input'])[5] | //android.widget.EditText[@content-desc=\"Shipping Name\"]")
	private WebElement shippingName;
	
	@FindBy(xpath="(//XCUIElementTypeTextField[@name='RNE__Input__text-input'])[7] | //android.widget.EditText[@content-desc=\"Quantity Shipped\"]")
	private WebElement quantity;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name=\"-- \"])[7] | (//android.view.ViewGroup[@content-desc=\"undefined\"])[3]")
	private WebElement unit;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name='kg'])[2] | //android.view.ViewGroup[@content-desc=\"kg\"]/android.widget.TextView")
	private WebElement unitKg;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name='Ready for Shipment'])[3] | //android.view.ViewGroup[@content-desc=\"Ready for Shipment\"]/android.widget.TextView")
	private WebElement readyForShipment;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name='Waste'] | //android.view.View[@content-desc=\"Waste\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
	private WebElement wasteTab;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name='Vehicle'] | //android.view.View[@content-desc=\"Vehicle\"]/android.view.ViewGroup")
	private WebElement vehicleTab;
	
	@FindBy(xpath="(//XCUIElementTypeTextField[@name='RNE__Input__text-input'])[4] | //android.widget.EditText[@content-desc=\"Carrier 562-TestautomationCar's Vehicle 1 Registration Number\"]")
	private WebElement vehicleRegNumber;
	
	@FindBy(xpath="(//XCUIElementTypeTextField[@name='-- '])[2] | (//android.view.ViewGroup[@content-desc=\"undefined\"])[1]/android.widget.TextView[2]")
	private WebElement vehicleProvince;


	@FindBy(xpath="(//XCUIElementTypeTextField[@name='-- '])[2] | //android.view.ViewGroup[@content-desc=\"Alberta\"]")
	private WebElement vehicleProvincePopup;

	@FindBy(xpath="(//XCUIElementTypeOther[@name='Sign Manifest'])[2] | //android.view.ViewGroup[@content-desc=\"Sign Manifest\"]/android.view.ViewGroup/android.widget.TextView")
	private WebElement signManifest;
	
	
	@FindBy(xpath="//XCUIElementTypeOther[@value='checkbox, not checked, off'] | //android.widget.CheckBox[@content-desc=\"Consent Toggle Disabled\"]")
	private WebElement signConsentCheckBox;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name='Confirm'])[2] | (//android.view.ViewGroup[@content-desc=\"undefined\"])[1]/android.view.ViewGroup/android.widget.TextView")
	private WebElement signConfirmation;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name='Close'])[2] | //android.view.ViewGroup[@content-desc=\"Close\"]/android.view.ViewGroup/android.widget.TextView")
	private WebElement closeConfirmation;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name='Confirm Drop-Off'])[2] | //android.view.ViewGroup[@content-desc=\"Confirm Drop-Off\"]/android.view.ViewGroup/android.widget.TextView")
	private WebElement confirmDropOff;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name='Complete Drop-Off'])[2] | //android.view.ViewGroup[@content-desc=\"Confirm\"]/android.view.ViewGroup")
	private WebElement completeDropOff;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name='Vertical scroll bar, 3 pages'] ")
	private WebElement verticalScrollBar;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name='Accept'] | //android.view.ViewGroup[@text='Accept']/android.view.ViewGroup")
	private WebElement acceptWasteButton;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name='Refuse'] | //android.view.ViewGroup[@text='Refuse']/android.view.ViewGroup")
	private WebElement refuseWasteButton;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name='Does not meet acceptance criteria'])[2] | (//android.view.ViewGroup[@text=\"Does not meet acceptance criteria\"])[1]/android.widget.TextView")
	private WebElement refusalReasonAcceptance;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name='I am partially refusing this waste.']/XCUIElementTypeOther/XCUIElementTypeOther | //android.widget.CheckBox[@content-desc=\"undefined\"]")
	private WebElement partialRefusalCheckbox;
	
	@FindBy(xpath="(//XCUIElementTypeTextField[@name='RNE__Input__text-input'])[1] | //android.widget.EditText[@content-desc=\"Quantity Refused / Units\"]")
	private WebElement quantityRefused;
	
	@FindBy(xpath="(//XCUIElementTypeTextField[@name='RNE__Input__text-input'])[2] | //android.widget.EditText[@content-desc=\"Quantity Received\"]")
	private WebElement quantityAccepted;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name='-- '])[3] | (//android.view.ViewGroup[@content-desc=\"undefined\"])[5]")
	private WebElement unitRefused;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name='-- '])[6] | (//android.view.ViewGroup[@content-desc=\"undefined\"])[1]")
	private WebElement unitAccepted;

	@FindBy(xpath="(//XCUIElementTypeOther[@name='-- '])[6] | //android.view.ViewGroup[@content-desc=\"kg\"]")
	private WebElement unitPopup;

	@FindBy(xpath="//XCUIElementTypeOther[@name='Copy Quantity Shipped'] | //android.view.ViewGroup[@text='Copy Quantity Shipped'] ")
	private WebElement copyQuantityShipped;
	
	@FindBy(xpath="//XCUIElementTypeTextField[@name='RNE__Input__text-input'] | //android.widget.EditText[@content-desc=\"Quantity Received\"]")
	private WebElement quantityReceived;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name='-- '])[3] | //android.view.ViewGroup[@content-desc=\"Quantity Received Units\"]" )
	private WebElement unitReceived;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name='-- '])[5] | //android.view.ViewGroup[@content-desc=\"undefined\"]")
	private WebElement handlingCode;


	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"01 - Storage\"] | //android.view.ViewGroup[@content-desc=\"01 - Storage\"]")
	private WebElement handlingCodePopUp;

	@FindBy(xpath="//XCUIElementTypeOther[@name='Accept Waste'] | /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.TextView")
	private WebElement acceptWasteConfirm;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name='Refuse Waste'] | //android.widget.TextView[@text=\"Refuse Waste\"]")
	private WebElement refuseWasteConfirm;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name=' Add Another Waste']")
	private WebElement addAnotherLineItem;
	
	@FindBy(xpath="//XCUIElementTypeButton[@name=\"Return\"] ")
	private WebElement returnButton;

	//driver.find_element_by_xpath(“//tag [contains( text(), ‘word’)]”)
	@FindBy(xpath="//android.view.ViewGroup[contains(@content-desc,'MN-')]")
	private WebElement manifestCard;


	public ManifestPage(WebDriver driver2) {
		PageFactory.initElements(driver2, this);
		this.driver=driver2;
		
	}
	
	public void waitForVisible(WebElement ele, int time) {
		Duration dur = Duration.ofSeconds(time);
		WebDriverWait wait = new WebDriverWait(driver, dur);
		wait.until(ExpectedConditions.visibilityOf(ele));
		
	}

	public boolean isVisible(WebElement ele, int time) {
		//waitForVisible(ele, time);

		try{
			return ele.isDisplayed();
		}catch(Exception e){
			return false;
		}

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

	public void scrollCustom(){
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(100000)"));

	}
	
	public void createManifest() {
		 AppiumDriver dr = null;

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
/* Working New Manifest Click - P2
		WebElement el1 = (WebElement) driver.findElement (By.xpath("//android.view.ViewGroup[@content-desc=\"Navigate to Create Manifest Screen\"]/android.widget.TextView[2]"));
		el1.click();
		WebElement el2 = (WebElement) driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Select Generator\"]"));
		el2.click();
*/		waitForClickable(newManifest,60);
		clickCustom(newManifest);

		//Generator
		clickCustom(searchGeneratorText);
		
		sendKeysCustom(searchGeneratorPopupText,"ATC1 Business" );
		clickCustom(generatorSearchResult);
		clickCustom(selectGeneratorButton);
		//clickCustom(selectButton);

		
		//carrier
		for(int i=0; i<2; i++) {
			clickCustom(searchCarrierText);
			if(isVisible(searchCarrierPopupText,2)){
				sendKeysCustom(searchCarrierPopupText,"TestautomationCar" );
				break;
			}
		}

		clickCustom(carrierSearchResult);
		clickCustom(selectButton);
		//clickCustom(selectGeneratorButton);
		//sendKeysCustom(searchText,"TestautomationCar");
/*		clickCustom(searchCarrierButton);
		clickCustom(selectButton);
		
		
		//Receiver

		TouchActions action = new TouchActions(driver);
		action.scroll(element, 10, 100);
		action.perform();

		new Actions(driver)
				.scrollToElement(searchReceiverText)
				.perform();

		waitForVisible(searchReceiverText,60);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", searchReceiverText);
		js.executeScript("arguments[0].click();", searchReceiverText);
*/		//waitForVisible(searchReceiverText,60);


		scrollCustom();
		//driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(100000)"));

		//clickCustom(searchReceiverText);
		for(int i=0; i<2; i++) {
			clickCustom(searchReceiverText);
			if(isVisible(searchReceiverPopupText,2)){
				sendKeysCustom(searchReceiverPopupText,"TestAutomationRec" );
				break;
			}
		}



		//sendKeysCustom(searchReceiverPopupText,"TestAutomationRec");
		clickCustom(receiverSearchResult);
		//clickCustom(searchReceiverButton);
		clickCustom(selectButton);
		
		
		//clickCustom(addWasteButton);
		//waitForClickable(addWasteButton,10);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//waitForVisible(receivingSiteAddress,10);

		for(int i=0; i<2; i++) {
			//clickCustom(addWasteButton);
			if(isVisible(selectShipMonth,2)){
				clickCustom(addWasteButton);
				break;
			}
		}


	/*	for(int i=0; i<2; i++) {

			if(addWasteButton.getDomAttribute("enabled") == "1"){
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				clickCustom(addWasteButton);
				break;
			}
		}
	*/
		//Add Waste and Shipment Date Info

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		clickCustom(addWasteButton);

		clickCustom(selectShipMonth);
		clickCustom(selectMonth);
		clickCustom(selectShipDate);
		clickCustom(selectDate);
		clickCustom(selectShipYear);
		clickCustom(selectYear);

		clickCustom(selectArrivalMonth);
		clickCustom(selectMonth);
		clickCustom(selectArrivalDate);
		clickCustom(selectDate);
		clickCustom(selectArrivalYear);
		clickCustom(selectYear);
		scrollCustom();
		clickCustom(selectWaste);

		//Select Waste
		clickCustom(selectWasteField);

		for(int i=0; i<10; i++) {

			if(!isVisible(selectArrivalMonth,5)){
				clickCustom(selectWasteField);
				clickCustom(selectButton);
			}
			else {
				System.out.println("count is "+ i);
				break;
			}
		}
		System.out.println("---selectWasteField----");



		System.out.println("---selectButton----");
		if(isVisible(selectArrivalMonth,5)){
			scrollCustom();
		}

		//enter waste details

		sendKeysCustom(shippingName,"Shipping name");
		sendKeysCustom(quantity,"350");
		clickCustom(unit);
		clickCustom(unitKg);
		clickCustom(readyForShipment);

		//Generator Sign
		clickCustom(manifestCard);
		clickCustom(signManifest);
		clickCustom(signConsentCheckBox);
		//System.out.println("---selectButton----"+signConsentCheckBox.getAttribute("Value"));
		/*if(signConsentCheckBox.getAttribute("Value")== "True") {
			clickCustom(signConfirmation);
		}*/
		clickCustom(signConfirmation);

/*		for(int i=0;i<2;i++) {
			if(signConfirmation.getAttribute("enabled") == "false") {
				clickCustom(signConfirmation);
				break;
			} else {
				waitForClickable(signConfirmation,5);
				clickCustom(signConfirmation);
				break;
			}
		}*/
		clickCustom(closeConfirmation);

		//Carrier Sign
		clickCustom(vehicleTab);
		sendKeysCustom(vehicleRegNumber,"Testing");
		clickCustom(vehicleProvince);
		//driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Ontario\"))"));

		clickCustom(vehicleProvincePopup);
		clickCustom(signManifest);
		clickCustom(signConsentCheckBox);
		clickCustom(signConfirmation);

		clickCustom(closeConfirmation);

		clickCustom(confirmDropOff);
		clickCustom(completeDropOff); //check
		clickCustom(closeConfirmation);

		//Receiver Sign
		clickCustom(wasteTab);
		clickCustom(acceptWasteButton);
		clickCustom(copyQuantityShipped);
		clickCustom(handlingCode);
		clickCustom(handlingCodePopUp);
		clickCustom(acceptWasteButton);
		clickCustom(signManifest);
		clickCustom(signConsentCheckBox);
		clickCustom(signConfirmation);

		clickCustom(closeConfirmation);

	}
	
	//driver.findElement(By.xpath("//XCUIElementTypeTextField[@name='RNE__Input__text-input']")).sendKeys("ON001173125");
	//driver.findElement(By.xpath("//XCUIElementTypeOther[contains(@text,'ON001173125')]")).click();
	//driver.findElement(By.xpath("(//XCUIElementTypeOther[@name='Select'])[2]")).click();

}
