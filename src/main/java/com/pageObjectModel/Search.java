package com.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {
	public WebDriver driver;

	@FindBy(name="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotel;
	
	@FindBy(id="room_type")
	private WebElement roomtype;
	
	@FindBy(id="room_nos")
	private WebElement roomno;
	
	@FindBy(id="datepick_in")
	private WebElement checkin;
	
	@FindBy(id="datepick_out")
	private WebElement checkout;
	
	@FindBy(id="adult_room")
	private WebElement adultno;
	
	@FindBy(id="child_room")
	private WebElement childno;
	
	@FindBy(id="Submit")
	private WebElement submit;
	
	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getLocation() {
		return location;
	}


	public WebElement getHotel() {
		return hotel;
	}


	public WebElement getRoomtype() {
		return roomtype;
	}


	public WebElement getRoomno() {
		return roomno;
	}


	public WebElement getCheckin() {
		return checkin;
	}


	public WebElement getCheckout() {
		return checkout;
	}


	public WebElement getAdultno() {
		return adultno;
	}


	public WebElement getChildno() {
		return childno;
	}


	public WebElement getSubmit() {
		return submit;
	}


	public Search(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

}
