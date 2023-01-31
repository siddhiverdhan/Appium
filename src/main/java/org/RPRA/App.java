package org.RPRA;

import io.appium.java_client.AppiumDriver;
/**
 * Hello world!
 *
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class App {

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
	LoginPage loginPage = new LoginPage(driver);

	loginPage.loginDetails();
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




	ManifestPage manifestPage= new ManifestPage(driver);

	try {
		manifestPage.createManifest();
		manifestPage.addGenerator("ATC1 Business");

		manifestPage.addCarrier("TestautomationCar");

		manifestPage.scrollCustom();
		manifestPage.addReceiver("TestAutomationRec");

		manifestPage.addWasteInfo();
		manifestPage.scrollCustom();
		manifestPage.addWaste();
		manifestPage.addShippingInfo("Shipping Name", "350");
		manifestPage.generatorSign("create");

		manifestPage.carrierSign("create");
		manifestPage.dropOff();
		manifestPage.acceptWaste();
		manifestPage.receiverSign();
		//System.out.println("---Manifest Status is ----"+manifestPage.status.getDomAttribute("text"));
//	String finalStatus = manifestPage.status.getDomAttribute("text");
		manifestPage.assertMessage("finalStatus", "Completed");
		manifestPage.clickCustom(manifestPage.previousScreen);

		System.out.println("---Manifest 1 created--Test Result = --" + manifestPage.status.getDomAttribute("text"));
	}
	catch(Exception e){
		ManifestPage.takeScreenShot("test",driver);
	}
	}

@Test(enabled = false)
public void tC2() {



		ManifestPage manifestPage= new ManifestPage(driver);

		manifestPage.createManifest();
		manifestPage.addGenerator("ATC1 Business");

		manifestPage.addCarrier("TestautomationCar");

		manifestPage.scrollCustom();
		manifestPage.addReceiver("TestAutomationRec");

		manifestPage.addWasteInfo();
		manifestPage.scrollCustom();
		manifestPage.addWaste();
		manifestPage.addShippingInfo("Shipping Name", "350");
		manifestPage.generatorSign("create");

		manifestPage.carrierSign("create");
		manifestPage.dropOff();
		manifestPage.refuseWaste("Full", "False");
		manifestPage.receiverSign();
		System.out.println("---Manifest Status is ----"+manifestPage.status.getDomAttribute("text"));
		String finalStatus = manifestPage.status.getDomAttribute("text");
		manifestPage.assertMessage("finalStatus","Completed: Fully Refused");
		manifestPage.clickCustom(manifestPage.previousScreen);

	//	System.out.println("---Manifest 2 created--Test Result = --"+manifestPage.status.getDomAttribute("text"));

	}

	@Test(enabled = false)
	public void tC3() {



		ManifestPage manifestPage= new ManifestPage(driver);

		manifestPage.createManifest();
		manifestPage.addGenerator("ATC1 Business");

		manifestPage.addCarrier("TestautomationCar");

		manifestPage.scrollCustom();
		manifestPage.addReceiver("TestAutomationRec");

		manifestPage.addWasteInfo();
		manifestPage.scrollCustom();
		manifestPage.addWaste();
		manifestPage.addShippingInfo("Shipping Name", "350");
		manifestPage.generatorSign("create");

		manifestPage.carrierSign("create");
		manifestPage.dropOff();
		manifestPage.refuseWaste("Partial", "False");
		manifestPage.receiverSign();
		manifestPage.assertMessage("finalStatus","Completed: Partially Refused");
		manifestPage.clickCustom(manifestPage.previousScreen);

	//	System.out.println("---Manifest 3 created--Test Result = --"+manifestPage.status.getAttribute("text"));

	}

	@Test(enabled = true)
	public void tC4() {



		ManifestPage manifestPage= new ManifestPage(driver);

		manifestPage.createManifest();
		manifestPage.addGenerator("ATC1 Business");

		manifestPage.addCarrier("TestautomationCar");

		manifestPage.scrollCustom();
		manifestPage.addReceiver("TestAutomationRec");

		manifestPage.addWasteInfo();
		manifestPage.scrollCustom();
		manifestPage.addWaste();
		manifestPage.addShippingInfo("Shipping Name", "350");
		manifestPage.generatorSign("create");

		manifestPage.carrierSign("create");
		manifestPage.dropOff();
		manifestPage.refuseWaste("Partial", "True");
		manifestPage.receiverSign();

		//manifestPage.clickCustom(manifestPage.reviewCorrections);
		manifestPage.generatorSign("correction");

		manifestPage.carrierSign("correction");

		manifestPage.assertMessage("finalStatus","Completed: Partially Refused");
		manifestPage.clickCustom(manifestPage.previousScreen);

	//	System.out.println("---Manifest 4 created--Test Result = --"+manifestPage.status.getAttribute("text"));

	}

public WebDriver getDriver() {
	return driver;
}

public void setDriver(WebDriver driver) {
	this.driver = driver;
}
}

