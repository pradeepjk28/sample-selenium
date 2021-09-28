package com.sel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass1{
public LoginPage() {
	PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindBy(id="email")
	public WebElement userName;
	@FindBy(id="pass")
	public WebElement password;
	@FindBy(name="login")
	public WebElement loginBtn;
	
	
	
	public WebElement getUserName() {
		return userName;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
}
