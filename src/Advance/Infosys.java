package Advance;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Infosys {
	


	public static void main(String[] args) {

					
			System.setProperty("webdriver.chrome.driver","F:\\Selenium\\exe files\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.get("http://jqueryui.com/resources/demos/datepicker/other-months.html");
driver.manage().window().maximize();
WebElement picker = driver.findElement(By.id("datepicker"));

dateselection(driver, picker, "Sept 2020");

	}
	
}
		public static void dateselection(WebDriver driver, WebElement element, String dateval) {
			
			
			
		JavascriptExecutor js =	((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value', '"+dateval+"');", element);
		
		}
		
}
		
