package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import Utilities.Read_config;

public class base_class {
	static Read_config read = new Read_config();  
	public WebDriver driver;
	SoftAssert softassert = new SoftAssert();
	
	public String url = read.getURL();
	public String username = read.getUserName();
	public String password = read.getPassword();
	public String pin = read.getPIN();
	public String expectedId = read.getexpectedId();
	public String Exp_Order_Title = read.get_Exp_Order_Title();
	public String Exp_Order_url = read.get_Exp_Order_URL();
	public String exp_Holding_title = read.get_Exp_Holding_Title();
	public String exp_Holding_url = read.get_Exp_Holding_URL();
	public String exp_Funds_title = read.get_Exp_Funds_Title();
	public String exp_Funds_url = read.get_Exp_Funds_URL();
	public String exp_Dashboard_title = read.get_Exp_Dashboard_Title();
	public String exp_Dashboard_url = read.get_Exp_Dashboard_URL();
	public String exp_Positions_title = read.get_Exp_Positions_Title();
	public String exp_Positions_url = read.get_Exp_Positions_URL();
	
	public String tatasteel = read.getTataSteel();

	@Parameters("browser")
	@BeforeClass 
	public void setup(String browser) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		FirefoxOptions opt1 = new FirefoxOptions();
		opt.addArguments("--disable-notifications");
		
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", read.getChromepath());
			driver = new ChromeDriver(opt);
		}

		else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", read.getFirefoxpath());
			driver = new FirefoxDriver(opt1);
		}
		else if(browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver", read.getMsedgepath());
			driver = new EdgeDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	

	@AfterClass
	public void quit() {
		driver.quit();
	}

}
