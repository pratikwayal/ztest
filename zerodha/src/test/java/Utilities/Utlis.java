package Utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utlis {
	
	public static void capureScreen(WebDriver driver,int TestID) throws IOException {
		Date date = new Date();
		String date1 = date.toString().replace(" ", "_").replace(":", "-");
		
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("test-output//screenshot//test-"+ TestID + date1 + ".jpeg");
		FileHandler.copy(source, dest);


	}

}
