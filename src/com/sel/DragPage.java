package com.sel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragPage extends BaseClass{
		public DragPage() {
			PageFactory.initElements(driver, this);
			}
			@CacheLookup
			@FindBy(xpath="//a[text()=' BANK ']")
			public WebElement source;
			@FindBy(xpath="(//li[@class='placeholder'])[1]")
			public WebElement target;
			public WebElement getSource() {
				return source;
			}
			public WebElement getTarget() {
				return target;
			}
}
