package com.sel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class LaunchBrowserFirefox {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "F:\\java\\Selenium\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
	}
}
