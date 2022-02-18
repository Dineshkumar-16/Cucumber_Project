package com.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel {
	public Hotel(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver2, this);
	}
		

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getSubmit() {
		return submit;
	}


	public WebDriver driver;

	@FindBy(id = "radiobutton_0")
	private WebElement radio;

	@FindBy(id = "continue")
	private WebElement submit;

}
