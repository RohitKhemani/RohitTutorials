package Advance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	
	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\exe files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		down(driver);
		

		
		
	}
	
	public static void down(WebDriver driver) {
		
	JavascriptExecutor js =	((JavascriptExecutor)driver);
	
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

}
