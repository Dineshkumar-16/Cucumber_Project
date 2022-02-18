package com.cucumber_Proj;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import com.cucumber_Proj.Test_Runner;
import com.pageObjectManager.Manager_POM;

public class Test_Runner extends Base {
	
	public static WebDriver driver = Base.browserlaunch("Chrome");
	
	public static Manager_POM pom = new Manager_POM(driver);

	static Logger log = Logger.getLogger(Test_Runner.class);

public static void main(String[] args) {

		PropertyConfigurator.configure("log4j.properties");

		geturl("https://adactinhotelapp.com/");

		log.info("Browser Launch");

		sendkeys(pom.getPage1().getUsername(), "Dineshkumar16");
		sendkeys(pom.getPage1().getPassword(), "Qwerty123");
		click(pom.getPage1().getLogin());

		log.info("Login Done");

		select(pom.getPage2().getLocation(), "value", "London");
		select(pom.getPage2().getHotel(), "value", "Hotel Sunshine");
		select(pom.getPage2().getRoomtype(), "value", "Double");
		select(pom.getPage2().getRoomno(), "index", "1");
		sendkeys(pom.getPage2().getCheckin(), "20/01/2023");
		sendkeys(pom.getPage2().getCheckout(), "22/01/2023");
		select(pom.getPage2().getAdultno(), "value", "2");
		click(pom.getPage2().getSubmit());

		log.info("Hotel Selection Done");

		click(pom.getPage3().getRadio());
		click(pom.getPage3().getSubmit());

		log.info("Confirm Hotel Done");

		sendkeys(pom.getPage4().getFirstname(), "Adam");
		sendkeys(pom.getPage4().getLastname(), "George");
		sendkeys(pom.getPage4().getAddress(), "TamilNadu");
		sendkeys(pom.getPage4().getCcno(), "8529631477894562");
		select(pom.getPage4().getCctype(), "text", "VISA");
		select(pom.getPage4().getCcexpmon(), "value", "10");
		select(pom.getPage4().getCcexpyear(), "value", "2022");
		sendkeys(pom.getPage4().getCccvv(), "258");
		click(pom.getPage4().getBooknow());

		log.info("Details Entered");

		explicit_wait(pom.getPage5().getItinerary(), 3000);
		click(pom.getPage5().getItinerary());

		log.info("Itinerary click Done");

		click(pom.getPage6().getCheckbox());
		click(pom.getPage6().getOut());

		log.info("Sigin_out Done");

	}
}
