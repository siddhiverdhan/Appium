package org.example;

import io.appium.java_client.AppiumDriver;
/**
 * Hello world!
 *
 */

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

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
//capabilities.setCapability("appium:newCommandTimeout", 3600);
//capabilities.setCapability("waitForIdleTimeout", 60);
//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
/*
capabilities.setCapability("platformVersion", "15.3.1");
capabilities.setCapability("udid", "d76241eac520231154486fc252984774c843e304");


//capabilities.setCapability("deviceName", "iPhone Sidhi's");
//capabilities.setCapability("platformVersion", "16.1.1");
//capabilities.setCapability("udid", "00008101-0005311E11D8001E");
//capabilities.setCapability("automationName","XCUITest");

capabilities.setCapability("bundleId", "ca.rpra.haztrack");
capabilities.setCapability("xcodeOrgId", "9H58C7BC37");
capabilities.setCapability("xcodeSigningId", "iPhone Developer");
capabilities.setCapability("updatedWDABundleId", "com.rpra.WebDriverAgentRunner");
//capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
	*/
//new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

setDriver(new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities));
}

@AfterClass
public void tearDown() {
if (getDriver() != null) {
getDriver().quit();
}
}

@SuppressWarnings("deprecation")
@Test
public void tC1() {

getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		//driver.resetApp();
	LoginPage loginPage = new LoginPage(driver);

	loginPage.loginDetails();
	System.out.println("---Login successfull----");

	ManifestSign manifestSign= new ManifestSign(driver);

	manifestSign.signManifest();
/*
	ManifestPage manifestPage= new ManifestPage(driver);

	manifestPage.createManifest();

System.out.println("---Manifest created----");
*/
}

	@Test
	public void tC2() {

		getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		//driver.resetApp();
		//LoginPage loginPage = new LoginPage(driver);

		//loginPage.loginDetails();
		//System.out.println("---Login successfull----");
		ManifestPage manifestPage= new ManifestPage(driver);

		manifestPage.createManifest();

		System.out.println("---Manifest 2 created----");

	}

	@Test
	public void tC3() {

		getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		//driver.resetApp();
		//LoginPage loginPage = new LoginPage(driver);

		//loginPage.loginDetails();
		//System.out.println("---Login successfull----");
		ManifestPage manifestPage= new ManifestPage(driver);

		manifestPage.createManifest();

		System.out.println("---Manifest 3 created----");

	}

public WebDriver getDriver() {
	return driver;
}

public void setDriver(WebDriver driver) {
	this.driver = driver;
}
}
