package ca.rpra.page;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import ca.rpra.utils.BasePage;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ca.rpra.utils.BasePage;
import io.appium.java_client.ios.IOSDriver;

public class IOS_ManifestPage extends BasePage {
	
	private WebDriver driver;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name=\"Navigate to Create Manifest Screen\"])[2]")
	private WebElement newManifest;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name='-- '])[3]")
	private WebElement searchField;

	@FindBy(xpath="(//XCUIElementTypeOther[@name=\"Select Generator\"])[3]")
	private WebElement searchGenerator;
	
	@FindBy(xpath="(//XCUIElementTypeTextField[@name='RNE__Input__text-input'])")
	private WebElement searchText;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name=\"Select Generator\"])[5]")
	private WebElement selectGeneratorText;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name=\"Select Carrier\"])[4]")
	private WebElement searchCarrier;

	@FindBy(xpath="(//XCUIElementTypeOther[@name=\"Select Carrier\"])[6]")
	private WebElement selectCarrireText;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name=\"Select Intended Receiver\"])[4]")
	private WebElement searchReceiver;

	@FindBy(xpath = "//XCUIElementTypeSwitch[@name=\"Manifest does not include  waste which was previously refused\"]")
	private WebElement togglePreviouslyRefusedWaste;

	@FindBy(xpath = "(//XCUIElementTypeOther[@name=\"Select manifest with previously refused waste\"])[2]")
	private WebElement previouslyRefusedManifest;

	@FindBy(xpath = "")
	private WebElement destinationOfRefusedWaste;

	@FindBy(xpath="(//XCUIElementTypeOther[@name=\"Select Intended Receiver\"])[6]")
	private WebElement selectReceiverText;

	
	@FindBy(xpath="(//XCUIElementTypeOther[@name='Select'])[2]")
	private WebElement selectButton;

	@FindBy(xpath= "(//XCUIElementTypeOther[@name=\"Next - Add Waste Information\"])[2]")
	private WebElement addWasteButton;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name=\"Select Waste\"]")
	private WebElement selectWasteField;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name=\"Select Waste\"])[2]")
	private WebElement selectWasteText;

	@FindBy(xpath = "(//XCUIElementTypeOther[@name=\"Scheduled Shipment Month\"])[3]")
	private WebElement shipmentMonth;

	@FindBy(xpath = "(//XCUIElementTypeOther[@name=\"Scheduled Shipment Day\"])[3]")
	private WebElement shipmentDate;

	@FindBy(xpath = "(//XCUIElementTypeOther[@name=\"Scheduled Shipment Year\"])[3]")
	private WebElement shipmentYear;

	@FindBy(xpath="(//XCUIElementTypeOther[@name=\"Scheduled Arrival Month\"])[3]")
	private WebElement arrivalMonth;

	@FindBy(xpath="(//XCUIElementTypeOther[@name=\"Scheduled Arrival Day\"])[3]")
	private WebElement arrivalDate;

	@FindBy(xpath="(//XCUIElementTypeOther[@name=\"Scheduled Arrival Year\"])[3]")
	private WebElement arrivalYear;
	
	@FindBy(xpath="(//XCUIElementTypeTextField[@name='RNE__Input__text-input'])[5]")
	private WebElement shippingName;

	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"January\"] | (//XCUIElementTypeOther[@name=\"January\"])[2]")
	private WebElement selectMonth;

	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"1\"] | (//XCUIElementTypeOther[@name=\"1\"])[2]")
	private WebElement selectDate;

	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"2024\"] | (//XCUIElementTypeOther[@name=\"2024\"])[2]")
	private WebElement selectYear;
	
	@FindBy(xpath="(//XCUIElementTypeTextField[@name='RNE__Input__text-input'])[7]")
	private WebElement quantity;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name=\"Quantity Shipped Units\"])[3]")
	private WebElement unit;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name=\"kg\"])[2]")
	private WebElement selectUnitKg;

	@FindBy(xpath="(//XCUIElementTypeOther[@name=\"L\"])[2]")
	private WebElement selectUnitL;


	
	@FindBy(xpath="(//XCUIElementTypeOther[@name='Ready for Shipment'])[3]")
	private WebElement readyForShipment;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name='Waste']")
	private WebElement wasteTab;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name='Vehicle']")
	private WebElement vehicleTab;
	
	@FindBy(xpath="(//XCUIElementTypeTextField[@name='RNE__Input__text-input'])[4]")
	private WebElement vehicleRegNumber;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name=\"Carrier AY Chemicals's Vehicle 1 Province or State\"])[2]")
	private WebElement vehicleProvince;

	@FindBy(xpath = "(//XCUIElementTypeOther[@name=\"Alberta\"])[2]")
	private WebElement selectProvinceON;
	
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
	
	@FindBy(xpath="(//XCUIElementTypeOther[contains(@name,'partial quantity refusal')])[2]")
	private WebElement partialRefusalCheckbox;
	
	@FindBy(xpath="(//XCUIElementTypeTextField[@name=\"RNE__Input__text-input\"])[6]")
	private WebElement quantityRefused;
	
	@FindBy(xpath="(//XCUIElementTypeTextField[@name=\"RNE__Input__text-input\"])[6]")
	private WebElement quantityAccepted;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name=\"Quantity Refused Units\"])[3]")
	private WebElement unitRefused;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name=\"Quantity Received Units\"])[3]")
	private WebElement unitAccepted;

	@FindBy(xpath="(//XCUIElementTypeOther[@name=\"Select Handling Code\"])[2]")
	private WebElement handlingCode;

	
	@FindBy(xpath="//XCUIElementTypeOther[@name=\"Copy Quantity Shipped\"]")
	private WebElement copyQuantityShipped;
	
	@FindBy(xpath="(//XCUIElementTypeTextField[@name=\"RNE__Input__text-input\"])[6]")
	private WebElement qunatityReceived;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name=\"Quantity Received Units\"])[3]")
	private WebElement unitReceived;
	
	@FindBy(xpath="(//XCUIElementTypeOther[@name=\"Select Handling Code\"])[2]")
	private WebElement handlingCodeAceepted;

	@FindBy(xpath = "(//XCUIElementTypeOther[@name=\"02 - Thermal Treatment\"])[2]")
	private WebElement selectHandlingCode;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name='Accept Waste']")
	private WebElement acceptWasteConfirm;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name='Refuse Waste']")
	private WebElement refuseWasteConfirm;
	
	@FindBy(xpath="//XCUIElementTypeOther[@name=' Add Another Waste']")
	private WebElement addAnotherLineItem;

	@FindBy(xpath = "(//XCUIElementTypeOther[@name=\"EDIT SHIPPING INFORMATION\"])[2]")
	private WebElement editShippingInfo;

	@FindBy(xpath = "(//XCUIElementTypeOther[@name=\"Number of Packages (optional)\"])[7]")
	private WebElement editNumPackage;
	
	@FindBy(xpath="//XCUIElementTypeButton[@name=\"Return\"]")
	private WebElement returnButton;

	@FindBy(xpath="(//XCUIElementTypeOther[contains(@name,'MN-')])")
	private WebElement manifestCard;

	@FindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Manifest Status is')]")
	private WebElement manifestStatus;

	@FindBy(xpath = "(//XCUIElementTypeOther[@name=\"Review Corrections\"])[2]")
	private WebElement reivewCorrectionButton;
	
	public IOS_ManifestPage(WebDriver driver2) {
		PageFactory.initElements(driver2, this);
		this.driver=driver2;
		super.setDriver(driver);
		
	}

	
	public void createManifest() {	


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  waitForVisible(newManifest,60);
		  clickCustom(newManifest);
	}
	
	public void selectGenerator(String searchGeneratorKey) {
		  //Generator 
		  clickCustom(searchGenerator);		  
		  sendKeysCustom(searchText,searchGeneratorKey ); 
		  clickCustom(selectGeneratorText);
		  clickCustom(selectButton);
		  System.out.println("--Selected Generator--");
	}	  
		  
	public void selectCarrier(String searchCarrierKey) {
	  
		  clickMultiple(searchCarrier,searchText);
		  
		  sendKeysCustom(searchText,searchCarrierKey); 
		  clickCustom(selectCarrireText);
		  clickCustom(selectButton);
		  System.out.println("--Selected Carrier--");
		  
	}
		  
	public void selectReceiver(String searchReceiverKey) {  
		  //Receiver //scrollCustom(); 
		  clickMultiple(searchReceiver,searchText);
		  
		  sendKeysCustom(searchText,searchReceiverKey); 
		  clickCustom(selectReceiverText);
		  clickCustom(selectButton);
		  System.out.println("--Selected Receiver--");
	}
	
	public void addWaste(String searchWasteKey) {
		
		  //add waste 
		  clickMultiple(addWasteButton,shipmentDate);
		  clickCustom(shipmentMonth); clickCustom(selectMonth);
		  clickCustom(shipmentDate); clickCustom(selectDate);
		  clickCustom(shipmentYear); clickCustom(selectYear);
		  
		  clickCustom(arrivalMonth); clickCustom(selectMonth);
		  clickCustom(arrivalDate); clickCustom(selectDate); clickCustom(arrivalYear);
		  clickCustom(selectYear);	 

		  addWasteLineItem();
	}	
		
		//enter waste details
	public void enterShippingInfo(String shippingname, String quant)	{
		clickCustom(quantity);
		sendKeysCustom(quantity,quant);		
		shippingName.clear();
		shippingName.sendKeys(shippingname);		
		clickMultiple(unit,selectUnitKg);
		clickCustom(selectUnitKg);
		
	}
	
	public void initialSignature() {

		clickCustom(readyForShipment);
		clickCustom(manifestCard);
		signManifest();

	}

	public void enterVehicleInformation(String registrationNumber, String province){
		clickCustom(vehicleTab);
		sendKeysCustom(vehicleRegNumber,registrationNumber);
		clickMultiple(vehicleProvince,selectProvinceON);
		clickCustom(selectProvinceON);
	}

	public void signCarrier(){
		signManifest();
	}

	public void dropOff(){

		clickCustom(completeDropOff);
		clickCustom(confirmDropOff);
		clickCustom(closeConfirmation);
	}

	public void acceptWasteLineItem(boolean correction){
		clickCustom(wasteTab);
		clickCustom(acceptWasteButton);
		clickCustom(copyQuantityShipped);
		clickCustom(handlingCodeAceepted);
		clickCustom(selectHandlingCode);

		if(correction) {
			clickCustom(editShippingInfo);
			editNumPackage.clear();
			sendKeysCustom(editNumPackage,"214");
		}
		clickCustom(acceptWasteConfirm);
	}

	public void receiverSignature(){
		signManifest();
	}

	public void generatorSignOnCorrection(){
		clickCustom(reivewCorrectionButton);
		signManifest();
	}
	public void carrierSignOnCorrection(){
		clickCustom(reivewCorrectionButton);
		signManifest();
	}

	private void signManifest(){
		clickCustom(signManifest);
		clickCustom(signConsentCheckBox);
		clickCustom(signConfirmation);
		clickCustom(closeConfirmation);
	}
	
	//driver.findElement(By.xpath("//XCUIElementTypeTextField[@name='RNE__Input__text-input']")).sendKeys("ON001173125");
	//driver.findElement(By.xpath("//XCUIElementTypeOther[contains(@text,'ON001173125')]")).click();
	//driver.findElement(By.xpath("(//XCUIElementTypeOther[@name='Select'])[2]")).click();
	public void addWasteLineItem(){

		clickCustom(selectWasteField);

		//Select Waste
		clickCustom(selectWasteText);
		clickCustom(selectWasteText);
		clickCustom(selectButton);

		
		System.out.println("---select Waste line item---");

	}

	public void refuseWaste(String refusalType, boolean corrections){
		clickCustom(wasteTab);
		clickCustom(refuseWasteButton);
		clickCustom(refusalReasonAcceptance);
		if(refusalType.toLowerCase().contains("partial")){
			clickCustom(partialRefusalCheckbox);
			sendKeysCustom(quantityAccepted,"300");
			clickCustom(unitAccepted);
			clickCustom(selectUnitKg);
			sendKeysCustom(quantityRefused,"50");
			clickCustom(unitRefused);
			clickCustom(selectUnitKg);
			clickCustom(handlingCode);
			clickCustom(selectHandlingCode);
		}

		if(corrections){
			editNumPackage.clear();
			sendKeysCustom(editNumPackage, "35");
		}

		clickCustom(refuseWasteConfirm);
	}
}


