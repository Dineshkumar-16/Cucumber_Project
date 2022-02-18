$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/Features_Cuc/Adactin.feature");
formatter.feature({
  "name": "Hotel Booking In Adactin Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login Page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "name": "user Enter The \"\u003cusername\u003e\" In Username Field",
  "keyword": "When "
});
formatter.step({
  "name": "user Enter The \"\u003cpassword\u003e\" In Password Field",
  "keyword": "And "
});
formatter.step({
  "name": "user Click On Login Button And Its Navigates To The Search Hotel",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "ABC",
        "ACV"
      ]
    },
    {
      "cells": [
        "Dineshkumar16",
        "Qwerty123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login Page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.match({
  "location": "com.step_Def.Step_Def.user_Launch_The_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Enter The \"ABC\" In Username Field",
  "keyword": "When "
});
formatter.match({
  "location": "com.step_Def.Step_Def.user_Enter_The_In_Username_Field(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Enter The \"ACV\" In Password Field",
  "keyword": "And "
});
formatter.match({
  "location": "com.step_Def.Step_Def.user_Enter_The_In_Password_Field(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Click On Login Button And Its Navigates To The Search Hotel",
  "keyword": "Then "
});
formatter.match({
  "location": "com.step_Def.Step_Def.user_Click_On_Login_Button_And_Its_Navigates_To_The_Search_Hotel()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login Page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.match({
  "location": "com.step_Def.Step_Def.user_Launch_The_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Enter The \"Dineshkumar16\" In Username Field",
  "keyword": "When "
});
formatter.match({
  "location": "com.step_Def.Step_Def.user_Enter_The_In_Username_Field(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Enter The \"Qwerty123\" In Password Field",
  "keyword": "And "
});
formatter.match({
  "location": "com.step_Def.Step_Def.user_Enter_The_In_Password_Field(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Click On Login Button And Its Navigates To The Search Hotel",
  "keyword": "Then "
});
formatter.match({
  "location": "com.step_Def.Step_Def.user_Click_On_Login_Button_And_Its_Navigates_To_The_Search_Hotel()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search Hotel Page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user Select The Hotel Location",
  "keyword": "When "
});
formatter.match({
  "location": "com.step_Def.Step_Def.user_Select_The_Hotel_Location()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Select The Hotel Name",
  "keyword": "And "
});
formatter.match({
  "location": "com.step_Def.Step_Def.user_Select_The_Hotel_Name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Select The Room Type",
  "keyword": "And "
});
formatter.match({
  "location": "com.step_Def.Step_Def.user_Select_The_Room_Type()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Select The Count Of Room",
  "keyword": "And "
});
formatter.match({
  "location": "com.step_Def.Step_Def.user_Select_The_Count_Of_Room()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Enter The Check In Date",
  "keyword": "And "
});
formatter.match({
  "location": "com.step_Def.Step_Def.user_Enter_The_Check_In_Date()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Enter The Check Out Date",
  "keyword": "And "
});
formatter.match({
  "location": "com.step_Def.Step_Def.user_Enter_The_Check_Out_Date()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Select The Number Of Adults",
  "keyword": "And "
});
formatter.match({
  "location": "com.step_Def.Step_Def.user_Select_The_Number_Of_Adults()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Select The Number Of Children",
  "keyword": "And "
});
formatter.match({
  "location": "com.step_Def.Step_Def.user_Select_The_Number_Of_Children()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Click On The Submit Button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.step_Def.Step_Def.user_Click_On_The_Submit_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Hotel Selection Confirmation",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user Click on the Radio Button Of The Selected Hotel",
  "keyword": "When "
});
formatter.match({
  "location": "com.step_Def.Step_Def.user_Click_on_the_Radio_Button_Of_The_Selected_Hotel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Click On The Submit Button In Hotel Selection Page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.step_Def.Step_Def.user_Click_On_The_Submit_Button_In_Hotel_Selection_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Entering the Details",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user Enter The Firstname",
  "keyword": "When "
});
formatter.match({
  "location": "com.step_Def.Step_Def.user_Enter_The_Firstname()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Enter The Lastname",
  "keyword": "And "
});
formatter.match({
  "location": "com.step_Def.Step_Def.user_Enter_The_Lastname()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Enter The Address",
  "keyword": "And "
});
formatter.match({
  "location": "com.step_Def.Step_Def.user_Enter_The_Address()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Enter The Credit Card Number",
  "keyword": "And "
});
formatter.match({
  "location": "com.step_Def.Step_Def.user_Enter_The_Credit_Card_Number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Select The Credit Card Type",
  "keyword": "And "
});
formatter.match({
  "location": "com.step_Def.Step_Def.user_Select_The_Credit_Card_Type()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Select The Credit Card Expiry Month",
  "keyword": "And "
});
formatter.match({
  "location": "com.step_Def.Step_Def.user_Select_The_Credit_Card_Expiry_Month()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Select The Credit Card Expiry Year",
  "keyword": "And "
});
formatter.match({
  "location": "com.step_Def.Step_Def.user_Select_The_Credit_Card_Expiry_Year()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Enter The Credit Card CVV Number",
  "keyword": "And "
});
formatter.match({
  "location": "com.step_Def.Step_Def.user_Enter_The_Credit_Card_CVV_Number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Click On The BookNow Button In Details Page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.step_Def.Step_Def.user_Click_On_The_BookNow_Button_In_Details_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Hotel Booking Done",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user Click On The My Itinerary Button",
  "keyword": "When "
});
formatter.match({
  "location": "com.step_Def.Step_Def.user_Click_On_The_My_Itinerary_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Signing Out After Check",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user Click The Checkbox Of Selected Hotel",
  "keyword": "When "
});
formatter.match({
  "location": "com.step_Def.Step_Def.user_Click_The_Checkbox_Of_Selected_Hotel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Signout Button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.step_Def.Step_Def.click_on_Signout_Button()"
});
formatter.result({
  "status": "passed"
});
});