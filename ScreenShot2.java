package h2_ScreenDemo;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import sel1.CrossBrowser;

public class ScreenShot2 extends CrossBrowser {
@Test
public void takelove() throws WebDriverException, IOException {
	openBrowser("chrome");

driver.get("http://www.facebook.com");

TakesScreenshot ts =(TakesScreenshot) driver ;

 String CurrentDate_time = new SimpleDateFormat("dd_mm_yyy hh:mm:ss").format(Calendar.getInstance().getTime());

FileHandler.copy(ts.getScreenshotAs(OutputType.FILE),
        new File(".\\sel\\src\\sel1\\Screenshot"+ CurrentDate_time +"abc.png"));


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
