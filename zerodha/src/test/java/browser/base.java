package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	public static WebDriver openchromeBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\browser\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		 WebDriver driver = new ChromeDriver(opt);
		 return driver;
	}
public static WebDriver openFireFoxBrowser() {
	System.setProperty("webdriver.gecko.driver","C:\\browser\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	return driver;
	
}
}
