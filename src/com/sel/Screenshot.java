package com.sel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","F:\\java\\Selenium\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	TakesScreenshot tk=(TakesScreenshot)driver;
	File source = tk.getScreenshotAs(OutputType.FILE);
	File target=new File("F:\\java\\Selenium\\screenshots\\fbpic.png");
	FileUtils.copyFile(source, target);
}
}
