 package com.sel;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class AlertDismiss {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "F:\\java\\Selenium\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String url="http://demo.automationtesting.in/Alerts.html";
	driver.get(url);
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
	driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']")).click();
	Alert al = driver.switchTo().alert();
	Thread.sleep(3000);
	String txt = al.getText();
	System.out.println(txt);
	al.sendKeys("Pradeep");
	al.dismiss();
	boolean s = driver.findElement(By.id("demo1")).isDisplayed();
	System.out.println(s);
}
}
