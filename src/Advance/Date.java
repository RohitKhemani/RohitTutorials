package Advance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date {
	
	public static WebDriver driver;

	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Zip Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/datepicker/");
		
Thread.sleep(3000);
		
driver.findElement(By.xpath("//input[@id='datepicker']")).click();		
		
		
	}



}
