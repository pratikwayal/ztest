package zerodha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addfund {
	@FindBy (xpath="//a[text()='Add funds']") private WebElement Addfund;
	
	public addfund (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void af () {
	 Addfund.click();
	}
}
//a[@target='_blank'])[1]    //a[text()='Add funds']
////a[text()='Activate segment']
// hello
