package com.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass1 {
	public static WebDriver driver;
	public static void LauncherBrowser(String url) {
		System.setProperty("webdriver.chrome.driver", "F:\\java\\Selenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	public static void enterText(WebElement ele, String value) {
		ele.sendKeys(value);
	}
	public static void clickEle(WebElement ele) {
		ele.click();
	}
	public static String getTextEle(WebElement ele) {
		String text=ele.getText();
		return text;
	}
}
