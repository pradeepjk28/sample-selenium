package com.sel;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Wait {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\java\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url="https://www.facebook.com/";
		driver.get(url);
		driver.manage().window().maximize();
		FluentWait w =new FluentWait(driver).withTimeout(100, TimeUnit.SECONDS).pollingEvery(10, TimeUnit.SECONDS).ignoring(Throwable.class);
		WebElement user = (WebElement)w.until(ExpectedConditions.elementToBeClickable(By.id("email")));
		user.sendKeys("pradeep");
	}
}
