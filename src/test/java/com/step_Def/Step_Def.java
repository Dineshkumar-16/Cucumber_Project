package com.step_Def;

import org.openqa.selenium.WebDriver;
import com.cucumber_Proj.Base;
import com.pageObjectManager.Manager_POM;
import com.runner.Runner_Class;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Def extends Base {

	public static WebDriver driver = Runner_Class.driver;
	public static Manager_POM pom = new Manager_POM(driver);
	
	@Before
	public void before_Hooks() {
		// TODO Auto-generated method stub

	}

	@Given("user Launch The Application")
	public void user_Launch_The_Application() {
		geturl("https://adactinhotelapp.com/");
	}

	@When("user Enter The {string} In Username Field")
	public void user_Enter_The_In_Username_Field(String user) {
		sendkeys(pom.getPage1().getUsername(), user);
	}

	@When("user Enter The {string} In Password Field")
	public void user_Enter_The_In_Password_Field(String pass) {
		
		sendkeys(pom.getPage1().getPassword(), pass);
	}
	

	@Then("user Click On Login Button And Its Navigates To The Search Hotel")
	public void user_Click_On_Login_Button_And_Its_Navigates_To_The_Search_Hotel() {
		click(pom.getPage1().getLogin());
	}

	@When("user Select The Hotel Location")
	public void user_Select_The_Hotel_Location() {
	   select(pom.getPage2().getLocation(), "Value", "London");
	}

	@When("user Select The Hotel Name")
	public void user_Select_The_Hotel_Name() {
		select(pom.getPage2().getHotel(), "value", "Hotel Sunshine");
		
	}

	@When("user Select The Room Type")
	public void user_Select_The_Room_Type() {
		select(pom.getPage2().getRoomtype(), "value", "Double");
		
	}

	@When("user Select The Count Of Room")
	public void user_Select_The_Count_Of_Room() {
		select(pom.getPage2().getRoomno(), "index", "1");
		
	}

	@When("user Enter The Check In Date")
	public void user_Enter_The_Check_In_Date() {
		sendkeys(pom.getPage2().getCheckin(), "20/01/2023");
		
	}

	@When("user Enter The Check Out Date")
	public void user_Enter_The_Check_Out_Date() {
		sendkeys(pom.getPage2().getCheckout(), "22/01/2023");
		
	}

	@When("user Select The Number Of Adults")
	public void user_Select_The_Number_Of_Adults() {
		select(pom.getPage2().getAdultno(), "value", "2");
		
	}

	@When("user Select The Number Of Children")
	public void user_Select_The_Number_Of_Children() {
		select(pom.getPage2().getChildno(), "value", "0");
		
	}

	@Then("user Click On The Submit Button")
	public void user_Click_On_The_Submit_Button() {
		click(pom.getPage2().getSubmit());
	}

	@When("user Click on the Radio Button Of The Selected Hotel")
	public void user_Click_on_the_Radio_Button_Of_The_Selected_Hotel() {
		click(pom.getPage3().getRadio());

	}

	@Then("user Click On The Submit Button In Hotel Selection Page")
	public void user_Click_On_The_Submit_Button_In_Hotel_Selection_Page() {
		click(pom.getPage3().getSubmit());

	}

	@When("user Enter The Firstname")
	public void user_Enter_The_Firstname() {
		sendkeys(pom.getPage4().getFirstname(), "Adam");
		
	}

	@When("user Enter The Lastname")
	public void user_Enter_The_Lastname() {
		sendkeys(pom.getPage4().getLastname(), "George");
		
	}

	@When("user Enter The Address")
	public void user_Enter_The_Address() {
		sendkeys(pom.getPage4().getAddress(), "TamilNadu");
		
	}

	@When("user Enter The Credit Card Number")
	public void user_Enter_The_Credit_Card_Number() {
		sendkeys(pom.getPage4().getCcno(), "8529631477894562");
		
	}

	@When("user Select The Credit Card Type")
	public void user_Select_The_Credit_Card_Type() {
		select(pom.getPage4().getCctype(), "text", "VISA");
		
	}

	@When("user Select The Credit Card Expiry Month")
	public void user_Select_The_Credit_Card_Expiry_Month() {
		select(pom.getPage4().getCcexpmon(), "value", "10");
		
	}

	@When("user Select The Credit Card Expiry Year")
	public void user_Select_The_Credit_Card_Expiry_Year() {
		select(pom.getPage4().getCcexpyear(), "value", "2022");
		
	}

	@When("user Enter The Credit Card CVV Number")
	public void user_Enter_The_Credit_Card_CVV_Number() {
		sendkeys(pom.getPage4().getCccvv(), "258");
	}

	@Then("user Click On The BookNow Button In Details Page")
	public void user_Click_On_The_BookNow_Button_In_Details_Page() {
		click(pom.getPage4().getBooknow());

	}

	@When("user Click On The My Itinerary Button")
	public void user_Click_On_The_My_Itinerary_Button() {
		explicit_wait(pom.getPage5().getItinerary(), 3000);
		click(pom.getPage5().getItinerary());
	}

	@When("user Click The Checkbox Of Selected Hotel")
	public void user_Click_The_Checkbox_Of_Selected_Hotel() {
		click(pom.getPage6().getCheckbox());

	}

	@Then("Click on Signout Button")
	public void click_on_Signout_Button() {
		click(pom.getPage6().getOut());

	}


}
