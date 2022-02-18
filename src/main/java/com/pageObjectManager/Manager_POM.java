package com.pageObjectManager;

import org.openqa.selenium.WebDriver;
import com.pageObjectModel.Confirm;
import com.pageObjectModel.Details;
import com.pageObjectModel.Hotel;
import com.pageObjectModel.LogIn;
import com.pageObjectModel.LogOut;
import com.pageObjectModel.Search;

public class Manager_POM {
	public WebDriver driver;

	private LogIn page1;
	private Search page2;
	private Hotel page3;
	private Details page4;
	private Confirm page5;
	private LogOut page6;

	public Manager_POM(WebDriver driver2) {
		this.driver = driver2;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public LogIn getPage1() {
		if (page1 == null) {
			page1 = new LogIn(driver);
		}
		return page1;
	}

	public Search getPage2() {
		if (page2 == null) {
			page2 = new Search(driver);
		}
		return page2;
	}

	public Hotel getPage3() {
		if (page3 == null) {
			page3 = new Hotel(driver);
		}
		return page3;
	}

	public Details getPage4() {
		if (page4 == null) {
			page4 = new Details(driver);
		}
		return page4;
	}

	public Confirm getPage5() {
		if (page5 == null) {
			page5 = new Confirm(driver);
		}
		return page5;
	}

	public LogOut getPage6() {
		if (page6 == null) {
			page6 = new LogOut(driver);
		}
		return page6;
	}
}
