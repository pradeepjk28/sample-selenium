package com.sel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class LaunchBrowserChrome {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "F:\\java\\Selenium\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String url="http://demo.guru99.com/test/drag_drop.html";
	driver.get(url);
	driver.manage().window().maximize();
	Thread.sleep(3000);
	WebElement source =driver.findElement(By.xpath("//a[text()=' BANK ']"));
	WebElement target =driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	Actions acc=new Actions(driver);
	acc.dragAndDrop(source, target).perform();
	WebElement source1 =driver.findElement(By.xpath("//a[text()=' 5000 ']"));
	WebElement target1 =driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	acc.dragAndDrop(source1, target1).perform();
	WebElement source2 =driver.findElement(By.xpath("//a[text()=' SALES ']"));
	WebElement target2 =driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	acc.dragAndDrop(source2, target2).perform();
	WebElement source3 =driver.findElement(By.xpath("//a[text()=' 5000 ']"));
	WebElement target3 =driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	acc.dragAndDrop(source3, target3).perform();
	WebElement per=driver.findElement(By.xpath("//a[text()='Perfect!']"));
    String s=per.getText();
    System.out.println(s);
    if(s.equals("Perfect!")) {
    	System.out.println("PASS");
    }
    else {
    	System.out.println("FAIL");
    }
}
}
