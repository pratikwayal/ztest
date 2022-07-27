package zerodha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dfund {
	@FindBy (xpath="//input[@id='addfunds_amount']") private WebElement AMT;
	@FindBy (xpath="//select[@name='segment']") private WebElement SEG;
	@FindBy (xpath="//select[@name='account_number']") private WebElement ACC;
	@FindBy (xpath="//input[@value='7875387693@upi']") private WebElement UPI;
	@FindBy (xpath="//button[@type='submit']") private WebElement CON;

	public Dfund (WebDriver driver) {
		PageFactory.initElements(driver, this);
		
}
	public void amount() {
		AMT.sendKeys("2000");
	}
	public void segment() {
		SEG.click();
	}
	public void Account() {
		ACC.click();
	}
	public void upid () {
		UPI.click();
	}
	public void contiune() {
		CON.click();
	}
}