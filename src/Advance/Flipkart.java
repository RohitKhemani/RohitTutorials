package Advance;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\exe files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		
		
		driver.findElement(By.cssSelector("button[class*='_2AkmmA _29Y']")).click();
		
		
	List<WebElement> active =	driver.findElements(By.tagName("a"));
	active.addAll(driver.findElements(By.tagName("img")));
	
	
	for(int i =1; i<active.size(); i++) {
		
		if(active.get(i).getAttribute("href")==null) {
			
System.out.println("Active Links are: " +active.size());	
}
	}
	
	
	
		
		
		
		
		
	}

}
