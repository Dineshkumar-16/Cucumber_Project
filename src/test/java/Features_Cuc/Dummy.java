//package Features_Cuc;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class Dummy {
//	@Given("user Launch The Application")
//	public void user_launch_the_application() {
//		geturl("https://adactinhotelapp.com/");
//	}
//
//	@When("user Enter The Username In Username Field")
//	public void user_enter_the_username_in_username_field() throws Throwable {
//		String name = readparticular_data("C:\\Users\\HP\\Documents\\Data input for project Adactin.xlsx", 5, 2);
//		sendkeys(pom.getPage1().getUsername(), name);
//	}
//
//	@When("user Enter The Password In Password Field")
//	public void user_enter_the_password_in_password_field() throws Throwable {
//		String pass = readparticular_data("C:\\Users\\HP\\Documents\\Data input for project Adactin.xlsx", 5, 3);
//		sendkeys(pom.getPage1().getPassword(), pass);
//	}
//
//	@Then("user Click On Login Button And Its Navigates To The Search Hotel")
//	public void user_click_on_login_button_and_its_navigates_to_the_search_hotel() {
//		click(pom.getPage1().getLogin());
//	}
//
//	@When("user Select The Hotel Location")
//	public void user_select_the_hotel_location() {
//		select(pom.getPage2().getLocation(), "value", "London");
//	}
//
//	@When("user Select The Hotel Name")
//	public void user_select_the_hotel_name() {
//		select(pom.getPage2().getHotel(), "value", "Hotel Sunshine");
//	}
//
//	@When("user Select The Room Type")
//	public void user_select_the_room_type() {
//		select(pom.getPage2().getRoomtype(), "value", "Double");
//	}
//
//	@When("user Select The Number of Room")
//	public void user_select_the_number_of_room() {
//		select(pom.getPage2().getRoomno(), "index", "2");
//	}
//
//	@When("user Enter The CheckIn Date")
//	public void user_enter_the_check_in_date() {
//		sendkeys(pom.getPage2().getCheckin(), "20/01/2023");
//	}
//
//	@When("user Select The CheckOut Date")
//	public void user_select_the_check_out_date() {
//		sendkeys(pom.getPage2().getCheckout(), "22/01/2023");
//	}
//
//	@When("user Select The Number Of Adults")
//	public void user_select_the_number_of_adults() {
//		select(pom.getPage2().getAdultno(), "value", "2");
//	}
//
//	@When("user Select The Number Of Children")
//	public void user_select_the_number_of_children() {
//		select(pom.getPage2().getChildno(), "value", "0");
//	}
//
//	@Then("user Click On The Submit Button")
//	public void user_click_on_the_submit_button() {
//		click(pom.getPage2().getSubmit());
//	}
//
//	@When("user Click on the Radio Button Of The Selected Hotel")
//	public void user_click_on_the_radio_button_of_the_selected_hotel() {
//
//	}
//
//	@Then("user Click On The Submit Button")
//	public void user_click_on_the_submit_button1() {
//		click(pom.getPage3().getRadio());
//		click(pom.getPage3().getSubmit());
//	}
//
//	@When("user Enter The Firstname")
//	public void user_enter_the_firstname() {
//		sendkeys(pom.getPage4().getFirstname(), "Adam");
//	}
//
//	@When("user Enter The Lastname")
//	public void user_enter_the_lastname() {
//		sendkeys(pom.getPage4().getLastname(), "George");
//	}
//
//	@When("user Enter The Address")
//	public void user_enter_the_address() {
//		sendkeys(pom.getPage4().getAddress(), "TamilNadu");
//	}
//
//	@When("user Enter The Credit Card Number")
//	public void user_enter_the_credit_card_number() {
//		sendkeys(pom.getPage4().getCcno(), "8529631477894562");
//	}
//
//	@When("user Select The Credit Card Type")
//	public void user_select_the_credit_card_type() {
//		select(pom.getPage4().getCctype(), "text", "VISA");
//	}
//
//	@When("user Select The Credit Card Expiry Month")
//	public void user_select_the_credit_card_expiry_month() {
//		select(pom.getPage4().getCcexpmon(), "value", "10");
//	}
//
//	@When("user Select The Credit Card Expiry Year")
//	public void user_select_the_credit_card_expiry_year() {
//		select(pom.getPage4().getCcexpyear(), "value", "2022");
//		
//	}
//
//	@When("user Enter The Credit Card CVV Number")
//	public void user_enter_the_credit_card_cvv_number() {
//		sendkeys(pom.getPage4().getCccvv(), "258");
//		
//	}
//
//	@Then("user Click On The BookNow Button")
//	public void user_click_on_the_book_now_button() {
//		click(pom.getPage4().getBooknow());
//	}
//
//	@When("user Click On The My Itinerary Button")
//	public void user_click_on_the_my_itinerary_button() {
//		explicit_wait(pom.getPage5().getItinerary(), 3000);
//		click(pom.getPage5().getItinerary());
//	}
//
//	@When("user Click The Checkbox Of Selected Hotel")
//	public void user_click_the_checkbox_of_selected_hotel() {
//		click(pom.getPage6().getCheckbox());
//		
//	}
//
//	@Then("Click on Signout Button")
//	public void click_on_signout_button() {
//		click(pom.getPage6().getOut());
//	}
//}
