package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptScroll {
public static void main(String[] args) throws Exception  {
	System.setProperty("webdriver.chrome.driver","F:\\java\\Selenium\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.irctc.co.in/nget/train-search");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	WebElement down = driver.findElement(By.xpath("//h3[text()='Rail Tour Packages']"));
	WebElement up = driver.findElement(By.xpath("//input[@class='ng-tns-c58-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)",down);
	Thread.sleep(3000);
	js.executeScript("arguments[0].scrollIntoView(false)", up);
	
}
}
