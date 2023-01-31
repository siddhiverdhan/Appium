package org.RPRA;

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
	DesiredCapabilities capabilities = new DesiredCapabilities();

	capabilities.setCapability("app_name","RPRA HazTrack");
	capabilities.setCapability("platformName", "android");
	capabilities.setCapability("deviceName", "emulator-5554");
	capabilities.setCapability("appPackage", "rpra.haztrack.internal");
	capabilities.setCapability( "appActivity", "com.rpra.MainActivity");
	capabilities.setCapability("BROWSER_NAME","Chrome");
	capabilities.setCapability("appium:ensureWebviewsHavePages", true);
	capabilities.setCapability("appium:nativeWebScreenshot", true);
	capabilities.setCapability("appium:connectHardwareKeyboard", true);

	setDriver(new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities));

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
@Test(enabled = false)
public void tC1() {


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
		ANDROIDManifestPage.acceptWaste();
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
public void tC2() {



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
	public void tC3() {



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

	@Test(enabled = true)
	public void tC4() {



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

