package h2_ScreenDemo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import sel1.CrossBrowser;

public class ScreenDemo1 extends CrossBrowser {
	@Test
	public void takelove() throws WebDriverException, IOException {
		openBrowser("chrome");

driver.get("http://www.google.com");

TakesScreenshot ts =(TakesScreenshot) driver ;

 File source =ts.getScreenshotAs(OutputType.FILE);


File dest =new File("C:\\Users\\admin\\eclipse-workspace\\sel\\fol");


FileHandler.copy(source, dest) ;









}
}
