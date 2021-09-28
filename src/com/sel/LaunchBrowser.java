package com.sel;

public class LaunchBrowser extends BaseClass{
	public static void main(String[] args) {
	Browser("https://en-gb.facebook.com/");
	enterText("//input[@id='email']", "pradeep");
	enterText("//input[@id='pass']","kuamr");
	clickEle("//button[@name='login']");
	}
}
