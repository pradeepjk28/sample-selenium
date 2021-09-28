package com.sel;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AlertDisplay {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "F:\\java\\Selenium\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String url="http://demo.automationtesting.in/Alerts.html";
	driver.get(url);
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
	driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
	Alert al = driver.switchTo().alert();
	Thread.sleep(3000);
	al.accept();
	WebElement txt = driver.findElement(By.id("demo"));
	boolean d = txt.isDisplayed();
	if(d) {
		System.out.println("Pass");
	}
	else {
		System.out.println("Fail");
	}
}
}
