package org.example;

import java.awt.*;
import java.awt.dnd.Autoscroll;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.sql.Driver;
import java.time.DateTimeException;
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

	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Cancel\"]/android.view.ViewGroup")
	private WebElement cancelButton;


	@FindBy(xpath="//android.view.ViewGroup[@text=\"Receiving Site Address\"]/android.widget.TextView")
	private WebElement receivingSiteAddress;

	
	@FindBy(xpath="(//XCUIElementTypeOther[@name=\"Next - Add Waste Information  >\"])[2] | //android.view.ViewGroup[@content-desc=\"Next - Add Waste Information\"]/android.widget.TextView")
	private WebElement addWasteButton;

	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Add Another Carrier\"]/android.widget.TextView[2]")
	private WebElement addAdditionalCarrier;


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
	private WebElement selectWaste111A;

	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"121 B\"]")
	private WebElement selectWaste121B;
	@FindBy(xpath="//XCUIElementTypeOther[@name=\"Select Waste\"] | //android.view.ViewGroup[@content-desc=\"Select Waste\"]")
	private WebElement selectWaste;
	
	@FindBy(xpath="(//XCUIElementTypeTextField[@name='RNE__Input__text-input'])[5] | //android.widget.EditText[@content-desc=\"Shipping Name\"]")
	private WebElement shippingName;
	
	@FindBy(xpath="(//XCUIElementTypeTextField[@name='RNE__Input__text-input'])[7] | //android.widget.EditText[@content-desc=\"Quantity Shipped\"]")
	private WebElement quantity;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name=\"-- \"])[7] | //android.view.ViewGroup[@content-desc=\"Quantity Shipped Units\"]")
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
	
	@FindBy(xpath="(//XCUIElementTypeTextField[@name='-- '])[2] | //android.view.ViewGroup[@content-desc=\"Carrier 562-TestautomationCar's Vehicle 1 Province or State\"]")
	private WebElement vehicleProvince;


	@FindBy(xpath="(//XCUIElementTypeTextField[@name='-- '])[2] | //android.view.ViewGroup[@content-desc=\"Alberta\"]")
	private WebElement vehicleProvincePopupAB;

	@FindBy(xpath="(//XCUIElementTypeOther[@name='Sign Manifest'])[2] | //android.view.ViewGroup[@content-desc=\"Sign Manifest\"]/android.view.ViewGroup/android.widget.TextView")
	private WebElement signManifest;
	
	
	@FindBy(xpath="//XCUIElementTypeOther[@value='checkbox, not checked, off'] | //android.widget.CheckBox[@content-desc=\"Consent Toggle Disabled\"]")
	private WebElement signConsentCheckBox;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name='Confirm'])[2] | //android.view.ViewGroup[@content-desc=\"Confirm\"]/android.view.ViewGroup")
	private WebElement signConfirmation;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name='Close'])[2] | //android.view.ViewGroup[@content-desc=\"Close\"]/android.view.ViewGroup/android.widget.TextView")
	private WebElement closeConfirmation;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name='Confirm Drop-Off'])[2] | //android.view.ViewGroup[@content-desc=\"Confirm Drop-Off\"]/android.view.ViewGroup/android.widget.TextView")
	private WebElement confirmDropOff;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name='Complete Drop-Off'])[2] | //android.view.ViewGroup[@content-desc=\"Confirm\"]/android.view.ViewGroup")
	private WebElement completeDropOff;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name='Vertical scroll bar, 3 pages'] ")
	private WebElement verticalScrollBar;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name='Accept'] | //android.view.ViewGroup[@content-desc=\"Accept Button\"]")
	private WebElement acceptWasteButton;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name='Refuse'] | //android.view.ViewGroup[@content-desc=\"Refuse Button\"]")
	private WebElement refuseWasteButton;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name='Does not meet acceptance criteria'])[2] | //android.view.ViewGroup[@content-desc=\"Does not meet acceptance criteria\"]")
	private WebElement refusalReasonAcceptance;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name='I am partially refusing this waste.']/XCUIElementTypeOther/XCUIElementTypeOther | //android.widget.CheckBox[@content-desc=\"disabled partial quantity refusal\"]")
	private WebElement partialRefusalCheckbox;
	
	@FindBy(xpath="(//XCUIElementTypeTextField[@name='RNE__Input__text-input'])[1] | //android.widget.EditText[@content-desc=\"Quantity Refused / Units\"]")
	private WebElement quantityRefused;
	
	@FindBy(xpath="(//XCUIElementTypeTextField[@name='RNE__Input__text-input'])[2] | //android.widget.EditText[@content-desc=\"Quantity Accepted / Units\"]")
	private WebElement quantityAccepted;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name='-- '])[3] | //android.view.ViewGroup[@content-desc=\"Quantity Refused Units\"]")
	private WebElement unitRefused;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name='-- '])[6] | //android.view.ViewGroup[@content-desc=\"Quantity Received Units\"]")
	private WebElement unitAccepted;

	@FindBy(xpath="(//XCUIElementTypeOther[@name='-- '])[6] | //android.view.ViewGroup[@content-desc=\"kg\"]")
	private WebElement unitPopupKg;

	@FindBy(xpath="//XCUIElementTypeOther[@name='Copy Quantity Shipped'] | //android.view.ViewGroup[@content-desc=\"Copy Quantity Shipped\"]/android.widget.TextView")
	private WebElement copyQuantityShipped;
	
	@FindBy(xpath="//XCUIElementTypeTextField[@name='RNE__Input__text-input'] | //android.widget.EditText[@content-desc=\"Quantity Received\"]")
	private WebElement quantityReceived;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name='-- '])[3] | //android.view.ViewGroup[@content-desc=\"Quantity Received Units\"]" )
	private WebElement unitReceived;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name='-- '])[5] | //android.view.ViewGroup[@content-desc=\"Select Handling Code\"]")
	private WebElement handlingCode;


	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"01 - Storage\"] | //android.view.ViewGroup[@content-desc=\"01 - Storage\"]")
	private WebElement handlingCodePopUpStorage;

	@FindBy(xpath="//XCUIElementTypeOther[@name='Accept Waste'] | //android.view.ViewGroup[@content-desc=\"Accept Waste\"]/android.widget.TextView")
	private WebElement acceptWasteConfirm;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name='Refuse Waste'] | //android.view.ViewGroup[@content-desc=\"Refuse Waste\"]")
	private WebElement refuseWasteConfirm;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name=' Add Another Waste']")
	private WebElement addAnotherLineItem;
	
	@FindBy(xpath="//XCUIElementTypeButton[@name=\"Return\"] ")
	private WebElement returnButton;

	@FindBy(xpath="//android.widget.Switch[@content-desc=\"Manifest does not include  waste which was previously refused\"]" )
	private WebElement refusedWasteManifest;
	@FindBy(xpath="//android.view.ViewGroup[contains(@content-desc,'MN-')]")
	private WebElement manifestCard;

	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Review Corrections\"]/android.view.ViewGroup/android.widget.TextView")
	private WebElement reviewCorrections;

	@FindBy(xpath="//android.widget.TextView[@content-desc=\"WASTE INFORMATION\"]")
	private WebElement wasteInformation;

	@FindBy(xpath="//android.widget.TextView[contains(@content-desc,'Manifest Status is')]")
	public WebElement status;

	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Navigate to Previous Screen\"]/android.widget.TextView")
	public WebElement previousScreen;

	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Save Button\"]/android.view.ViewGroup")
	private WebElement saveButton;

	@FindBy(xpath="//android.widget.CheckBox[@content-desc=\"undefined\"]")
	private WebElement dangerousGoodsMain;

	@FindBy(xpath="//android.widget.CheckBox[@content-desc=\"This waste is not dangerous goods\"]")
	private WebElement dangerousGoodsReceive;


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

		waitForClickable(newManifest,60);
		clickCustom(newManifest);




	}

	public void addGenerator(String generator){
		//Select Generator
		clickCustom(searchGeneratorText);

		sendKeysCustom(searchGeneratorPopupText,generator);
		clickCustom(generatorSearchResult);
		clickCustom(selectGeneratorButton);
	}

	public void addCarrier(String carrier){
		//Select Carrier
		for(int i=0; i<2; i++) {
			clickCustom(searchCarrierText);
			System.out.println(searchCarrierText+carrier+"Count"+i);
			if(isVisible(searchCarrierPopupText,2)){
				sendKeysCustom(searchCarrierPopupText,carrier);
				break;
			}
		}

		clickCustom(carrierSearchResult);
		clickCustom(selectButton);

	}

	public void addReceiver(String receiver){
		for(int i=0; i<2; i++) {
			clickCustom(searchReceiverText);
			System.out.println(searchReceiverText+receiver+"Count"+i);

			if(isVisible(searchReceiverPopupText,2)){
				sendKeysCustom(searchReceiverPopupText,receiver);
				break;
			}
		}



		clickCustom(receiverSearchResult);
		clickCustom(selectButton);
	}

	public void addWasteInfo(){
		//Navigate to Waste

		for(int i=0; i<2; i++) {

			if(isVisible(selectShipMonth,2)){
				clickCustom(addWasteButton);
				break;
			}
		}

		//Add Waste and Shipment Date Info

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		clickCustom(addWasteButton);
		//String tDate = today();
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
	}

	public void addWaste(){

		clickCustom(selectWaste);

		//Select Waste
		clickCustom(selectWaste111A);

		for(int i=0; i<10; i++) {

			if(!isVisible(selectArrivalMonth,5)){
				clickCustom(selectWaste111A);
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

	}

	public void addShippingInfo(String shipName , String qty){
		//enter waste details

		sendKeysCustom(shippingName,shipName);
		sendKeysCustom(quantity,qty);
		clickCustom(unit);
		clickCustom(unitKg);
		clickCustom(readyForShipment);
	}

	public void dropOff(){
		//Drop Off
		clickCustom(confirmDropOff);
		clickCustom(completeDropOff); //check
		clickCustom(closeConfirmation);
		System.out.println("---Carrier Signed----");

	}

	public void generatorSign(){
		//Generator Sign
		clickCustom(manifestCard);
		clickCustom(signManifest);
		clickCustom(signConsentCheckBox);
		clickCustom(signConfirmation);
		clickCustom(closeConfirmation);
	}

	public void carrierSign(){
		//Carrier Sign
		clickCustom(vehicleTab);
		sendKeysCustom(vehicleRegNumber,"Testing");
		clickCustom(vehicleProvince);
		clickCustom(vehicleProvincePopupAB);
		clickCustom(signManifest);
		clickCustom(signConsentCheckBox);
		clickCustom(signConfirmation);
		clickCustom(closeConfirmation);
	}

	public void acceptWaste(){
		clickCustom(wasteTab);
		clickCustom(acceptWasteButton);
		clickCustom(copyQuantityShipped);
		clickCustom(handlingCode);
		clickCustom(handlingCodePopUpStorage);
		clickCustom(acceptWasteConfirm);
	}

	public void refuseWaste(String refusalType){
		clickCustom(wasteTab);
		clickCustom(refuseWasteButton);
		clickCustom(refusalReasonAcceptance);
		if (refusalType == "Partial"){
			clickCustom(partialRefusalCheckbox);
			sendKeysCustom(quantityAccepted,"300");
			clickCustom(unitAccepted);
			clickCustom(unitPopupKg);
			sendKeysCustom(quantityRefused,"50");
			clickCustom(unitRefused);
			clickCustom(unitPopupKg);
			clickCustom(handlingCode);
			clickCustom(handlingCodePopUpStorage);
		}




		clickCustom(refuseWasteConfirm);
	}

	public void receiverSign(){
		//Receiver Sign

		clickCustom(signManifest);
		for(int i=0; i<2; i++) {

			if(!isVisible(signConsentCheckBox,2)){
				clickCustom(signManifest);
				System.out.println("---Sign Checkbox not visible--looping for --" + i);
			}
			else {
				System.out.println("---Sign Checkbox visible--breaking--");
				break;
			}
		}

		clickCustom(signConsentCheckBox);
		clickCustom(signConfirmation);

		clickCustom(closeConfirmation);
		System.out.println("---Receiver Signed----");
	}

}
