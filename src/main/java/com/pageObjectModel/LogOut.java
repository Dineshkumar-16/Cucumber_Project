package com.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut {
	public WebDriver driver;

	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private WebElement checkbox;

	@FindBy(name ="logout")
	private WebElement out;

	public LogOut(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getOut() {
		return out;
	}

}
