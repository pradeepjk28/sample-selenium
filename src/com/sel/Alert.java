package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Alert {

public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "F:\\java\\Selenium\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String url="https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI";
	driver.get(url);
	driver.manage().window().maximize();
	Thread.sleep(3000);
	Actions actions = new Actions(driver);
	WebElement right = driver.findElement(By.name("DUMMY1"));
	actions.contextClick(right).perform();
	org.openqa.selenium.Alert al = driver.switchTo().alert();
	Thread.sleep(3000);
	al.accept();
}
}
