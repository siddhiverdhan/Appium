package ca.rpra.page;



import ca.rpra.utils.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;


public class IOS_LoginPage extends BasePage {
	private WebDriver driver;
	@FindBy(xpath="//XCUIElementTypeOther[@name='main']/XCUIElementTypeOther[4]/XCUIElementTypeTextField")
	private WebElement user_name;


	@FindBy(xpath="//XCUIElementTypeSecureTextField")
	private WebElement user_password;


	@FindBy(xpath ="//XCUIElementTypeButton[@name='Sign In']")
	 private WebElement signIn;

	@FindBy(xpath = "//XCUIElementTypeOther[@name=\"Navigate to Previous Screen\"]")
	private WebElement navigateToDashboard;

	@FindBy(xpath="(//XCUIElementTypeOther[@name=\"Navigate to Profile Screen\"])[2]")
	private WebElement navigateToProfilePage;

	@FindBy(xpath ="//XCUIElementTypeOther[@name='Logout']")
	private WebElement logoutButton;
	
	public IOS_LoginPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
		this.driver=driver;
		super.setDriver(driver);
		
	}
	
	public void loginDetails(String username,String pwd) {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		if(isVisible(user_name)) {
			//sendKeysCustom(user_name,"jose");
			user_name.sendKeys("xxxxxxx");
			user_name.clear();
			user_name.sendKeys(username);
			user_password.sendKeys(pwd);
			signIn.click();
		}
		
	}

	public void logout(){
		if(isVisible(navigateToDashboard))
			clickCustom(navigateToDashboard);
		clickCustom(navigateToProfilePage);
		clickCustom(logoutButton);
	}

}
