package ca.rpra.test;

import java.util.concurrent.TimeUnit;

import ca.rpra.page.LoginPage;
import ca.rpra.page.IOS_ManifestPage;
import ca.rpra.utils.BaseTest;

import ca.rpra.utils.BaseTest;
import org.testng.annotations.Test;

public class IOS_TestCases extends BaseTest {

	@SuppressWarnings("deprecation")
	@Test(enabled = true)
	public void iOS_AcceptWithoutAnyCorrections() {

		getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		LoginPage loginPage = new LoginPage(getDriver());

		loginPage.loginDetails("rpraauto1@gmail.com","Pwc@2023");
		IOS_ManifestPage manifestPage = new IOS_ManifestPage(getDriver());

		manifestPage.createManifest();
		manifestPage.selectGenerator("ATC1 Business");
		manifestPage.selectCarrier("TestautomationCar");
		manifestPage.selectReceiver("TestAutomationRec");
		manifestPage.addWaste("111 - Spent");
		manifestPage.enterShippingInfo("shipping name", "350");
		manifestPage.initialSignature();
		manifestPage.enterVehicleInformation("87776", "Alberta");
		manifestPage.signCarrier();
		manifestPage.dropOff();
		manifestPage.acceptWasteLineItem(false);
		manifestPage.receiverSignature();
		loginPage.logout();


	}

	@SuppressWarnings("deprecation")
	@Test(enabled = false)
	public void iOS_AcceptWithCorrections() {

		getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		LoginPage loginPage = new LoginPage(getDriver());

		loginPage.loginDetails("rpraauto1@gmail.com","Pwc@2023");
		IOS_ManifestPage manifestPage = new IOS_ManifestPage(getDriver());

		manifestPage.createManifest();
		manifestPage.selectGenerator("ATC1 Business");
		manifestPage.selectCarrier("TestautomationCar");
		manifestPage.selectReceiver("TestAutomationRec");
		manifestPage.addWaste("111 - Spent");
		manifestPage.enterShippingInfo("shipping name", "350");
		manifestPage.initialSignature();
		manifestPage.enterVehicleInformation("87776", "Alberta");
		manifestPage.signCarrier();
		manifestPage.dropOff();
		manifestPage.acceptWasteLineItem(true);
		manifestPage.receiverSignature();
		manifestPage.generatorSignOnCorrection();
		manifestPage.carrierSignOnCorrection();
		loginPage.logout();

	}

	@SuppressWarnings("deprecation")
	@Test(enabled = false)
	public void iOS_FullRefusal() {

		getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		LoginPage loginPage = new LoginPage(getDriver());

		loginPage.loginDetails("rpraauto1@gmail.com","Pwc@2023");
		IOS_ManifestPage manifestPage = new IOS_ManifestPage(getDriver());

		manifestPage.createManifest();
		manifestPage.selectGenerator("ATC1 Business");
		manifestPage.selectCarrier("TestautomationCar");
		manifestPage.selectReceiver("TestAutomationRec");
		manifestPage.addWaste("111 - Spent");
		manifestPage.enterShippingInfo("shipping name", "350");
		manifestPage.initialSignature();
		manifestPage.enterVehicleInformation("87776", "Alberta");
		manifestPage.signCarrier();
		manifestPage.dropOff();
		manifestPage.refuseWaste("full",false);
		manifestPage.receiverSignature();
		loginPage.logout();

	}

	@SuppressWarnings("deprecation")
	@Test(enabled = true)
	public void iOS_PartialRefusalWithoutAnyCorrections() {

		getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		LoginPage loginPage = new LoginPage(getDriver());

		loginPage.loginDetails("rpraauto1@gmail.com","Pwc@2023");
		IOS_ManifestPage manifestPage = new IOS_ManifestPage(getDriver());

		manifestPage.createManifest();
		manifestPage.selectGenerator("ATC1 Business");
		manifestPage.selectCarrier("TestautomationCar");
		manifestPage.selectReceiver("TestAutomationRec");
		manifestPage.addWaste("111 - Spent");
		manifestPage.enterShippingInfo("shipping name", "350");
		manifestPage.initialSignature();
		manifestPage.enterVehicleInformation("87776", "Alberta");
		manifestPage.signCarrier();
		manifestPage.dropOff();
		manifestPage.refuseWaste("partial",false);
		manifestPage.receiverSignature();
		loginPage.logout();

	}

	@SuppressWarnings("deprecation")
	@Test(enabled = false)
	public void iOS_PartialRefusalWithCorrections() {

		getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		LoginPage loginPage = new LoginPage(getDriver());

		loginPage.loginDetails("rpraauto1@gmail.com","Pwc@2023");
		IOS_ManifestPage manifestPage = new IOS_ManifestPage(getDriver());

		manifestPage.createManifest();
		manifestPage.selectGenerator("ATC1 Business");
		manifestPage.selectCarrier("TestautomationCar");
		manifestPage.selectReceiver("TestAutomationRec");
		manifestPage.addWaste("111 - Spent");
		manifestPage.enterShippingInfo("shipping name", "350");
		manifestPage.initialSignature();
		manifestPage.enterVehicleInformation("87776", "Alberta");
		manifestPage.signCarrier();
		manifestPage.dropOff();
		manifestPage.refuseWaste("partial",true);
		manifestPage.receiverSignature();
		manifestPage.generatorSignOnCorrection();
		manifestPage.carrierSignOnCorrection();
		loginPage.logout();

	}



}
