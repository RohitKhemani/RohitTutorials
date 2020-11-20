package Advance;

import java.io.IOException;

import org.openqa.selenium.By;


import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import SeleniumCode.CustomListener;


@Listeners(CustomListener.class)

public class Gmail extends SetUp {
	
	
	
	
	@BeforeMethod
	
	public void intialization() throws InterruptedException {
		
		SetUp.info();

driver.findElement(By.xpath("//span[text()='Create account']")).click();
		Thread.sleep(1000);
		
   driver.findElement(By.xpath("//div[text()='For myself']")).click();

		}	
	
	
	
	//@Test
	
	//public void test1() {
		
		//WebElement Username = driver.findElement(By.xpath("//input[@id='identifierId']"));
		
		//Username.sendKeys("Rohit");
		
	//	driver.findElement(By.cssSelector("button[class*='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5']")).click();
		
	//}
	
	@DataProvider
	
	public Object[][] test() throws IOException {
		
		Object data[][] = Utility.DataFetch("ROHIT");
		
		return data;
		
		
	}

	
	
	
		@Test(dataProvider="test")
		
		public void test2(String FirstName, String LastName) throws InterruptedException {
			
	   
	  WebElement first = driver.findElement(By.xpath("//input[@id='firstName']"));
	  WebElement last = driver.findElement(By.xpath("//input[@id='lastName']"));
	  
	  first.sendKeys(FirstName);
	  last.sendKeys(LastName);
	  
			
		}
		
		

	//@AfterMethod
	
	//public void teardown() {
		
	//driver.quit();
	//}
		
	
	}
	
	
