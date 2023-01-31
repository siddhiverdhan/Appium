package ca.rpra.utils;



import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseTest {

private WebDriver driver;

@BeforeClass
public void setUp() throws MalformedURLException {
//Setting Desired Capabilities
ReadProperties rp = new ReadProperties();
DesiredCapabilities capabilities = new DesiredCapabilities();

capabilities.setCapability("app_name",rp.getValue("app_name"));
capabilities.setCapability("platformName", rp.getValue("platformName"));
capabilities.setCapability("deviceName", rp.getValue("deviceName"));
capabilities.setCapability("platformVersion", rp.getValue("platformVersion"));
capabilities.setCapability("udid", rp.getValue("udid"));

//capabilities.setCapability("deviceName", "iPhone Sidhi's");
//capabilities.setCapability("platformVersion", "16.1.1");
//capabilities.setCapability("udid", "00008101-0005311E11D8001E");
capabilities.setCapability("automationName",rp.getValue("automationName"));

capabilities.setCapability("bundleId", rp.getValue("bundleId"));
capabilities.setCapability("xcodeOrgId", rp.getValue("xcodeOrgId"));
capabilities.setCapability("xcodeSigningId", rp.getValue("xcodeSigningId"));
capabilities.setCapability("iosInstallPause", "8000");
capabilities.setCapability("wdaStartupRetries", "4");
capabilities.setCapability("wdaStartupRetryInterval", "20000");
capabilities.setCapability("waitForIdleTimeout","0");
capabilities.setCapability("sendKeyStrategy", "grouped");
capabilities.setCapability("waitForQuiescence",false);

setDriver(new RemoteWebDriver(new URL(rp.getValue("huburl")), capabilities));
}

@AfterClass
public void tearDown() {
if (getDriver() != null) {
getDriver().quit();
}
}



public WebDriver getDriver() {
	return driver;
}

public void setDriver(WebDriver driver) {
	this.driver = driver;
}
}
