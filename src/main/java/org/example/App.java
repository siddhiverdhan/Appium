package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
/**
 * Hello world!
 *
 */
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSTouchAction;
import io.appium.java_client.pagefactory.iOSXCUITBy;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.remote.DesiredCapabilities;

public class App {

private WebDriver driver;

@BeforeClass
public void setUp() throws MalformedURLException {
//Setting Desired Capabilities
DesiredCapabilities capabilities = new DesiredCapabilities();

capabilities.setCapability("app_name","RPRA HazTrack");
capabilities.setCapability("platformName", "android");
capabilities.setCapability("deviceName", "emulator-5556");
capabilities.setCapability("appPackage", "rpra.haztrack.internal");
capabilities.setCapability( "appActivity", "com.rpra.MainActivity");
capabilities.setCapability("BROWSER_NAME","Chrome");
capabilities.setCapability("appium:ensureWebviewsHavePages", true);
capabilities.setCapability("appium:nativeWebScreenshot", true);
capabilities.setCapability("appium:connectHardwareKeyboard", true);
//capabilities.setCapability("appium:newCommandTimeout", 3600);
capabilities.setCapability("waitForIdleTimeout", 600);
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

	ManifestPage manifestPage= new ManifestPage(driver);

	manifestPage.createManifest();

	//MobileElement element = (MobileElement) driver.findElement(By.xpath("Your element"));
	//TouchAction action = new TouchAction(driver);
	//action.singleTap(element);
	//action.perform();


//WebElement ele= driver.findElement(By.xpath("//XCUIElementTypeTextField"));
//ele.sendKeys("Jose");
//ele.clear();
// driver.findElement(By.xpath("//XCUIElementTypeTextField")).sendKeys("Jose.bingham@jyplo.com");;
// driver.findElement(By.xpath("//XCUIElementTypeSecureTextField")).sendKeys("James@rick1");	
// 
//getDriver().manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
//driver.findElement(By.xpath("//XCUIElementTypeButton[@name='Sign In']")).click();
//
////getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
//
//WebElement newMan= driver.findElement(By.xpath("(//XCUIElementTypeOther[contains(text(), 'New Manifest')])"));
//
//newMan.click();
//
//driver.findElement(By.xpath("(//XCUIElementTypeOther[contains(@text,'--')])")).click();
//driver.findElement(By.xpath("//XCUIElementTypeTextField[@name='RNE__Input__text-input']")).sendKeys("ON001173125");
//driver.findElement(By.xpath("//XCUIElementTypeOther[contains(@text,'ON001173125')]")).click();
//driver.findElement(By.xpath("(//XCUIElementTypeOther[@name='Select'])[2]")).click();
//
////XCUIElementTypeOther[contains(@name,’ON001173125’ )]
//
//driver.findElement(By.xpath("//XCUIElementTypeOther[contains(text(),'Back')]")).click();
//
//driver.findElement(By.xpath("//XCUIElementTypeOther[@name='Manifests']/XCUIElementTypeOther/XCUIElementTypeOther")).click();
//
//driver.findElement(By.xpath("//XCUIElementTypeOther[@name='Logout']")).click();



System.out.println("---Login successfull----");

}

public WebDriver getDriver() {
	return driver;
}

public void setDriver(WebDriver driver) {
	this.driver = driver;
}
}
