package ca.rpra.test;

import ca.rpra.page.ANDROID_LoginPage;
import ca.rpra.page.ANDROID_ManifestPage;
import ca.rpra.utils.ReadProperties;
import io.appium.java_client.AppiumDriver;
/**
 * Hello world!
 *
 */

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ANDROID_Test_Cases {

private WebDriver driver;

@BeforeClass
public void setUp() throws MalformedURLException {
	//Setting Desired Capabilities
	ReadProperties rp = new ReadProperties();
	DesiredCapabilities capabilities = new DesiredCapabilities();

	capabilities.setCapability("app_name",rp.getValue("app_name"));
	capabilities.setCapability("platformName", rp.getValue("platformName"));
	capabilities.setCapability("deviceName", rp.getValue("deviceName"));
	capabilities.setCapability("appPackage", rp.getValue("appPackage"));
	capabilities.setCapability( "appActivity", rp.getValue("appActivity"));
	capabilities.setCapability("BROWSER_NAME",rp.getValue("BROWSER_NAME"));
	capabilities.setCapability("appium:ensureWebviewsHavePages", true);
	capabilities.setCapability("appium:nativeWebScreenshot", true);
	capabilities.setCapability("appium:connectHardwareKeyboard", true);

	setDriver(new AppiumDriver(new URL(rp.getValue("huburl")), capabilities));

	//driver.resetApp();
	ANDROID_LoginPage ANDROIDLoginPage = new ANDROID_LoginPage(driver);

	ANDROIDLoginPage.loginDetails();
	System.out.println("---Login successfull----");
}

@AfterClass
public void tearDown() {
if (getDriver() != null) {
getDriver().quit();
}
}

@SuppressWarnings("deprecation")
@Test(enabled = true)
public void android_AcceptWithoutAnyCorrections() {


	getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	ANDROID_ManifestPage ANDROIDManifestPage = new ANDROID_ManifestPage(driver);

	try {
		ANDROIDManifestPage.createManifest();
		ANDROIDManifestPage.addGenerator("ATC1 Business");

		ANDROIDManifestPage.addCarrier("TestautomationCar");

		ANDROIDManifestPage.scrollCustom();
		ANDROIDManifestPage.addReceiver("TestAutomationRec");

		ANDROIDManifestPage.addWasteInfo();
		ANDROIDManifestPage.scrollCustom();
		ANDROIDManifestPage.addWaste();
		ANDROIDManifestPage.addShippingInfo("Shipping Name", "350");
		ANDROIDManifestPage.generatorSign("create");

		ANDROIDManifestPage.carrierSign("create");
		ANDROIDManifestPage.dropOff();
		ANDROIDManifestPage.acceptWaste("False");
		ANDROIDManifestPage.receiverSign();
		//System.out.println("---Manifest Status is ----"+manifestPage.status.getDomAttribute("text"));
//	String finalStatus = manifestPage.status.getDomAttribute("text");
		ANDROIDManifestPage.assertMessage("finalStatus", "Completed");
		ANDROIDManifestPage.clickCustom(ANDROIDManifestPage.previousScreen);

		System.out.println("---Manifest 1 created--Test Result = --" + ANDROIDManifestPage.status.getDomAttribute("text"));
	}
	catch(Exception e){
		ANDROID_ManifestPage.takeScreenShot("test",driver);
	}
	}
	@Test(enabled = false)
	public void android_AcceptWithCorrections() {


		getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		ANDROID_ManifestPage ANDROIDManifestPage = new ANDROID_ManifestPage(driver);

		try {
			ANDROIDManifestPage.createManifest();
			ANDROIDManifestPage.addGenerator("ATC1 Business");

			ANDROIDManifestPage.addCarrier("TestautomationCar");

			ANDROIDManifestPage.scrollCustom();
			ANDROIDManifestPage.addReceiver("TestAutomationRec");

			ANDROIDManifestPage.addWasteInfo();
			ANDROIDManifestPage.scrollCustom();
			ANDROIDManifestPage.addWaste();
			ANDROIDManifestPage.addShippingInfo("Shipping Name", "350");
			ANDROIDManifestPage.generatorSign("create");

			ANDROIDManifestPage.carrierSign("create");
			ANDROIDManifestPage.dropOff();
			ANDROIDManifestPage.acceptWaste("True");
			ANDROIDManifestPage.receiverSign();

			ANDROIDManifestPage.generatorSign("correction");

			ANDROIDManifestPage.carrierSign("correction");
			//System.out.println("---Manifest Status is ----"+manifestPage.status.getDomAttribute("text"));
//	String finalStatus = manifestPage.status.getDomAttribute("text");
			ANDROIDManifestPage.assertMessage("finalStatus", "Completed");
			ANDROIDManifestPage.clickCustom(ANDROIDManifestPage.previousScreen);

			System.out.println("---Manifest 1 created--Test Result = --" + ANDROIDManifestPage.status.getDomAttribute("text"));
		}
		catch(Exception e){
			ANDROID_ManifestPage.takeScreenShot("test",driver);
		}
	}


@Test(enabled = false)
public void android_FullRefusal() {



		ANDROID_ManifestPage ANDROIDManifestPage = new ANDROID_ManifestPage(driver);

		ANDROIDManifestPage.createManifest();
		ANDROIDManifestPage.addGenerator("ATC1 Business");

		ANDROIDManifestPage.addCarrier("TestautomationCar");

		ANDROIDManifestPage.scrollCustom();
		ANDROIDManifestPage.addReceiver("TestAutomationRec");

		ANDROIDManifestPage.addWasteInfo();
		ANDROIDManifestPage.scrollCustom();
		ANDROIDManifestPage.addWaste();
		ANDROIDManifestPage.addShippingInfo("Shipping Name", "350");
		ANDROIDManifestPage.generatorSign("create");

		ANDROIDManifestPage.carrierSign("create");
		ANDROIDManifestPage.dropOff();
		ANDROIDManifestPage.refuseWaste("Full", "False");
		ANDROIDManifestPage.receiverSign();
		System.out.println("---Manifest Status is ----"+ ANDROIDManifestPage.status.getDomAttribute("text"));
		String finalStatus = ANDROIDManifestPage.status.getDomAttribute("text");
		ANDROIDManifestPage.assertMessage("finalStatus","Completed: Fully Refused");
		ANDROIDManifestPage.clickCustom(ANDROIDManifestPage.previousScreen);

	//	System.out.println("---Manifest 2 created--Test Result = --"+manifestPage.status.getDomAttribute("text"));

	}

	@Test(enabled = false)
	public void android_PartialRefusalWithoutAnyCorrections() {



		ANDROID_ManifestPage ANDROIDManifestPage = new ANDROID_ManifestPage(driver);

		ANDROIDManifestPage.createManifest();
		ANDROIDManifestPage.addGenerator("ATC1 Business");

		ANDROIDManifestPage.addCarrier("TestautomationCar");

		ANDROIDManifestPage.scrollCustom();
		ANDROIDManifestPage.addReceiver("TestAutomationRec");

		ANDROIDManifestPage.addWasteInfo();
		ANDROIDManifestPage.scrollCustom();
		ANDROIDManifestPage.addWaste();
		ANDROIDManifestPage.addShippingInfo("Shipping Name", "350");
		ANDROIDManifestPage.generatorSign("create");

		ANDROIDManifestPage.carrierSign("create");
		ANDROIDManifestPage.dropOff();
		ANDROIDManifestPage.refuseWaste("Partial", "False");
		ANDROIDManifestPage.receiverSign();
		ANDROIDManifestPage.assertMessage("finalStatus","Completed: Partially Refused");
		ANDROIDManifestPage.clickCustom(ANDROIDManifestPage.previousScreen);

	//	System.out.println("---Manifest 3 created--Test Result = --"+manifestPage.status.getAttribute("text"));

	}

	@Test(enabled = false)
	public void android_PartialRefusalWithCorrections() {



		ANDROID_ManifestPage ANDROIDManifestPage = new ANDROID_ManifestPage(driver);

		ANDROIDManifestPage.createManifest();
		ANDROIDManifestPage.addGenerator("ATC1 Business");

		ANDROIDManifestPage.addCarrier("TestautomationCar");

		ANDROIDManifestPage.scrollCustom();
		ANDROIDManifestPage.addReceiver("TestAutomationRec");

		ANDROIDManifestPage.addWasteInfo();
		ANDROIDManifestPage.scrollCustom();
		ANDROIDManifestPage.addWaste();
		ANDROIDManifestPage.addShippingInfo("Shipping Name", "350");
		ANDROIDManifestPage.generatorSign("create");

		ANDROIDManifestPage.carrierSign("create");
		ANDROIDManifestPage.dropOff();
		ANDROIDManifestPage.refuseWaste("Partial", "True");
		ANDROIDManifestPage.receiverSign();

		//manifestPage.clickCustom(manifestPage.reviewCorrections);
		ANDROIDManifestPage.generatorSign("correction");

		ANDROIDManifestPage.carrierSign("correction");

		ANDROIDManifestPage.assertMessage("finalStatus","Completed: Partially Refused");
		ANDROIDManifestPage.clickCustom(ANDROIDManifestPage.previousScreen);

	//	System.out.println("---Manifest 4 created--Test Result = --"+manifestPage.status.getAttribute("text"));

	}

public WebDriver getDriver() {
	return driver;
}

public void setDriver(WebDriver driver) {
	this.driver = driver;
}
}

