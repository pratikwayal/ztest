package zerodha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	@FindBy(xpath = "//span[text()='Orders']")	private WebElement ORDERS;
	@FindBy(xpath = "//span[text()='Holdings']")	private WebElement Holdings;
	@FindBy(xpath="//span[text()='Positions']") private WebElement Positions;
	@FindBy (xpath="//span[text()='Funds']") private WebElement funds;
	@FindBy (xpath="//span[text()='Apps']") private WebElement Apps;
	@FindBy (xpath="(//span[@class='last-price up'])[1]") private WebElement sensex;
	@FindBy (xpath="//span[text()='Dashboard']") private WebElement Dashborad;
	public Home(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void orders() {
		ORDERS.click();
	}
	public void holding() {
		Holdings.click();
	}
	public void positions () {
		Positions.click();
	}
	public void fund () {
		funds.click();
	}
	public void apps() {
		Apps.click();
	}
	public void sensexvalue() {
		sensex.click();
	}
	public void dashborad () {
		Dashborad.click();
	}
}

//Apps / Kite
//https://kite.zerodha.com/apps


//Dashboard / Kite
//https://kite.zerodha.com/dashboard