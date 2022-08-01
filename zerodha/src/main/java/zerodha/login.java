package zerodha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
//  step 1 declare Varibale goloblly(data member)
	@FindBy (xpath="//input[@type='text']") private WebElement Username;
	@FindBy (xpath="//input[@type='password']") private WebElement Password;
	@FindBy(xpath="//button[@type='submit']") private WebElement LoginButton;
	
	// STEP 2 Initlisation Globale Data memeber
	public login (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//step 3 method creation
	public void enterUN() {
		Username.sendKeys("VZP835");
	}
	public void enterPWD() {
		Password.sendKeys("Khush@123");
	}
	public void ClickButton() {
		LoginButton.click();
	}
}
