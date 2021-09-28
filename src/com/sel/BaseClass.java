package com.sel;
import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {
	public static WebDriver driver;
	public static void Browser(String url) {
		System.setProperty("webdriver.chrome.driver", "F:\\java\\Selenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	public static void enterText(String xpath,String value) {
		WebElement ele=driver.findElement(By.xpath(xpath));
		ele.sendKeys(value);
	}
	public static void clickEle(String xpath) {
		WebElement ele=driver.findElement(By.xpath(xpath));
		ele.click();
	}
	public static void actionAlert(String xpath) throws Exception {
	Actions actions = new Actions(driver);
	WebElement right = driver.findElement(By.xpath(xpath));
	actions.contextClick(right).perform();
	org.openqa.selenium.Alert al = driver.switchTo().alert();
	Thread.sleep(3000);
	al.accept();
	}
	public static void dragAndDrop(String source, String target) {
		WebElement s = driver.findElement(By.xpath(source));
		WebElement t = driver.findElement(By.xpath(target));
		Actions acc=new Actions(driver);
		acc.dragAndDrop(s, t).perform();
		
	}
	public static void dragAndDrop(WebElement s, WebElement t) {
		Actions acc=new Actions(driver);
		acc.dragAndDrop(s, t).perform();	
	}
	public static void closeButton(String xpath) {
		WebElement close = driver.findElement(By.xpath(xpath));
		close.click();
	}
	public static void movetoelement(String xpath) {
		WebElement move = driver.findElement(By.xpath(xpath));
		Actions acc=new Actions(driver);
		acc.moveToElement(move).perform();
	}
	public static void rightClick(String xpath) {
		Actions actions = new Actions(driver);
		WebElement right = driver.findElement(By.xpath(xpath));
		actions.contextClick(right).perform();
	}
	public static void screenshot(String location) throws Exception {
		TakesScreenshot tk=(TakesScreenshot)driver;
		File source = tk.getScreenshotAs(OutputType.FILE);
		File target=new File(location);
		FileUtils.copyFile(source, target);
	}
	public static void doubleClick(String xpath) {
		WebElement click = driver.findElement(By.xpath(xpath));
		Actions acc=new Actions(driver);
		acc.doubleClick(click);
	}
	public static void contextClick(String xpath) {
	Actions action = new Actions(driver);
	WebElement context = driver.findElement(By.xpath(xpath));
	action.contextClick(context).perform();
	}
	public static void robot(String xpath, int keyevent) throws AWTException {
		WebElement user = driver.findElement(By.xpath(xpath));
		Actions action=new Actions(driver);
		action.doubleClick(user).contextClick(user).build().perform();
		Robot r=new Robot();
		for (int i = 0; i < 2; i++) {
			r.keyPress(keyevent);
			r.keyRelease(keyevent);
		}
	}
}
















