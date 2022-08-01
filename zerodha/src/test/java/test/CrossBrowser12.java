package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import browser.base;
import zerodha.Home;
import zerodha.login;
import zerodha.login2;

public class CrossBrowser12 extends base {
	WebDriver driver;
	login log;
	login2 log2;

	@BeforeTest
	@Parameters("browser")
	public void launchBrowser(String Browser) {
		System.out.println("Before Test");
		
		if (Browser.equals(("Chrome"))) {
			driver = openchromeBrowser();
		}
		if (Browser.equals(("Firefox"))) {
			driver = openFireFoxBrowser();

		}

	}

	@BeforeClass
	public void POMobject() {
		log = new login(driver);
		log2 = new login2(driver);
	}

	@BeforeMethod
	public void loginToApplication() throws InterruptedException  {
		System.out.println("before method");
		driver.get("https://kite.zerodha.com/");
		log.enterUN();
		log.enterPWD();
		log.ClickButton();
		Thread.sleep(2000);
		log2.enterPIN();
		log2.clickonContinue();
	}
	@Test
	  public void verifyorderpage() throws InterruptedException {

	   System.out.println("testA");
	   
	   
	   
	   String url = driver.getCurrentUrl();
	   String title = driver.getTitle();
	   
	   if(url.equals("") && title.equals(""))
	   {
	    System.out.println("PASS");
	   }
	   else
	   {
	    System.out.println("FAIL");
	   }
	   Thread.sleep(2000);
	  }
	@Test
	  public void verifyholdingpage() throws InterruptedException {
	   System.out.println("testB");
	  
	   String url = driver.getCurrentUrl();
	   String title = driver.getTitle();
	   
	   if(url.equals("") && title.equals(""))
	   {
	    System.out.println("PASS");
	   }
	   else
	   {
	    System.out.println("FAIL");
	   }
	   Thread.sleep(2000);
	  }
	  
	  @Test
	  public void verifyposition() throws InterruptedException {
	   System.out.println("testB");
	   
	   String url = driver.getCurrentUrl();
	   String title = driver.getTitle();
	   
	   
	   if(url.equals("") && title.equals(""))
	   {
	    System.out.println("PASS");
	   }
	   else
	   {
	    System.out.println("FAIL");
	   }
	   Thread.sleep(2000);
	  }
	  
	  @AfterMethod
	  public void logout1() throws InterruptedException {
	   System.out.println("After method");
	   driver.findElement(By.xpath("//span[text()='VZP835']")).click();
	   Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=' Logout']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Change user']")).click();
		Thread.sleep(2000);
	    }
	  
	  @AfterClass
	  public void closeObject() {
	   System.out.println("After class");
	    log=null;
	    log2 = null;
	   
	  }
	  
	  @AfterTest
	  public void closeBrowser1() {
	   
	   driver.quit();
	   driver = null;
	  System.gc();
	   
	   
	  }
		
		

	}


