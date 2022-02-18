package com.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Details {
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcno() {
		return ccno;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getCcexpmon() {
		return ccexpmon;
	}

	public WebElement getCcexpyear() {
		return ccexpyear;
	}

	public WebElement getCccvv() {
		return cccvv;
	}

	public WebElement getBooknow() {
		return booknow;
	}

	public Details(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebDriver driver;
	
	@FindBy(id="first_name")
	private WebElement firstname;
	
	@FindBy(id="last_name")
	private WebElement lastname;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement ccno;
	
	@FindBy(id="cc_type")
	private WebElement cctype;
		
	@FindBy(id="cc_exp_month")
	private WebElement ccexpmon;
	
	@FindBy(id="cc_exp_year")
	private WebElement ccexpyear;
	
	@FindBy(id="cc_cvv")
	private WebElement cccvv;
	
	@FindBy(id="book_now")
	private WebElement booknow;
	
}
