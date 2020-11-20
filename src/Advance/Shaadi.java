package Advance;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Shaadi {
	
	public static WebDriver driver;
	
	

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\exe files\\chromedriver_win32\\chromedriver.exe");
		
	String path = System.getProperty("user.dir");
		
		HashMap<String, Object> hash = new HashMap<String, Object>();
		
		hash.put("profile.default_content_settings.popups", 0);
		hash.put("download.default_directory", path);
		
		
		ChromeOptions  options = new ChromeOptions();
		
	options.setExperimentalOption("prefs", hash);
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://altoconvertpdftojpg.com/");
		
	Thread.sleep(2000);
	
	driver.findElement(By.id("dropzoneInput-label")).click();
	
	Runtime.getRuntime().exec("F:\\AutoIT\\UPLOADING.exe");
	
	
	
	
		

	
		
		
		
	}

}
