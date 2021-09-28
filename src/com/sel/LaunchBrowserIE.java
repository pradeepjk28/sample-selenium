package com.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class LaunchBrowserIE {
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "F:\\java\\Selenium\\drivers\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.facebook.com/");
	}
}
