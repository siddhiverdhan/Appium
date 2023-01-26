package org.example;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ManifestSign {

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





	//@FindBy(xpath="(//XCUIElementTypeOther[@name=\"Next - Add Waste Information  >\"])[2] | //android.view.ViewGroup[@content-desc=\"Next - Add Waste Information\"]s")
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Next - Add Waste Information\"]")
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

	@FindBy(xpath="(//XCUIElementTypeOther[@name='-- ']) | //android.view.ViewGroup[@content-desc=\"111 A\"]")
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


	@FindBy(xpath="(//XCUIElementTypeTextField[@name='-- '])[2] | //android.view.ViewGroup[@content-desc=\"Ontario\"]")
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

	@FindBy(xpath="//XCUIElementTypeOther[@name='Accept'] | //android.view.ViewGroup[@text=\"Accept\"]/android.view.ViewGroup")
	private WebElement acceptWasteButton;

	@FindBy(xpath="//XCUIElementTypeOther[@name='Refuse'] | //android.view.ViewGroup[@text=\"Refuse\"]/android.view.ViewGroup")
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

	@FindBy(xpath="//XCUIElementTypeOther[@name='Copy Quantity Shipped'] | //android.view.ViewGroup[@text=\"Copy Quantity Shipped\"] ")
	private WebElement copyQuantityShipped;

	@FindBy(xpath="//XCUIElementTypeTextField[@name='RNE__Input__text-input'] | //android.widget.EditText[@content-desc=\"Quantity Received\"]")
	private WebElement quantityReceived;

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

	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Search\"]/android.widget.TextView")
	private WebElement manifestSearch;

	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.TextView")
	private WebElement manifestNewSearch;

	@FindBy(xpath="//android.widget.EditText[@content-desc=\"Manifest Number\"]")
	private WebElement manifestSearchNumber;

	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Apply Filters\"]/android.view.ViewGroup/android.widget.TextView")
	private WebElement manifestSearchApply;

	@FindBy(xpath="(//android.view.ViewGroup[@content-desc=\"undefined\"])[1]")
	private WebElement manifestSearchStatus;

	//android.view.ViewGroup[@content-desc="Awaiting Signatures"]/android.widget.TextView
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Awaiting Signatures\"]/android.widget.TextView")
	private WebElement manifestStatusAwaitingSign;

	@FindBy(xpath="//android.view.ViewGroup[contains(@content-desc,'MN-')]")
	private WebElement manifestCard;

	public ManifestSign(WebDriver driver2) {
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
		waitForVisible(ele, 60);
		ele.sendKeys(text);
		
	}
	
	public void clickCustom(WebElement ele) {
		waitForClickable(ele, 60);
		ele.click();
		
	}
	
	public void signManifest() {
		 AppiumDriver dr = null;
		Duration dur = Duration.ofSeconds(5);
		WebDriverWait wait = new WebDriverWait(driver, dur );
		/*clickCustom(manifestSearch);
		clickCustom(manifestNewSearch);
		clickCustom(manifestSearchStatus);
		clickCustom(manifestStatusAwaitingSign);
		clickCustom(manifestSearchApply);
*/
		clickCustom(manifestCard);

		clickCustom(signManifest);
		System.out.println("---Sign Invoked----");
		clickCustom(signConsentCheckBox);
		//signConsentCheckBox.sendKeys(Keys.RETURN);
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		wait.until(ExpectedConditions.elementToBeClickable(signConsentCheckBox));
		System.out.println("---Waited----");
		for(int i=0;i<2;i++) {
			if(signConfirmation.getAttribute("enabled") == "false") {
				clickCustom(signConfirmation);
				break;
			} else {
				waitForClickable(signConfirmation,5);
				clickCustom(signConfirmation);
				break;
			}
		}
		System.out.println("---Sign Confirmed----");
		clickCustom(closeConfirmation);
		System.out.println("---Sign Closed----");
		clickCustom(signManifest);
		//clickCustom(signConsentCheckBox);
		if(signConsentCheckBox.getAttribute("Value")== "True") {
			clickCustom(signConfirmation);
		}
		clickCustom(closeConfirmation);
		
	}
	
	//driver.findElement(By.xpath("//XCUIElementTypeTextField[@name='RNE__Input__text-input']")).sendKeys("ON001173125");
	//driver.findElement(By.xpath("//XCUIElementTypeOther[contains(@text,'ON001173125')]")).click();
	//driver.findElement(By.xpath("(//XCUIElementTypeOther[@name='Select'])[2]")).click();

}
