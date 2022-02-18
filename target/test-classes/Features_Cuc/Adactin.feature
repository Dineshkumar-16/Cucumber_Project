Feature: Hotel Booking In Adactin Application

@SmokeTest
Scenario Outline: Login Page
Given user Launch The Application
When user Enter The "<username>" In Username Field
And user Enter The "<password>" In Password Field
Then user Click On Login Button And Its Navigates To The Search Hotel

Examples:
|username|password|
|ABC|ACV|
|Dineshkumar16|Qwerty123|

@SanityTest
Scenario: Search Hotel Page
When user Select The Hotel Location  
And user Select The Hotel Name
And user Select The Room Type
And user Select The Count Of Room
And user Enter The Check In Date
And user Enter The Check Out Date
And user Select The Number Of Adults
And user Select The Number Of Children
Then user Click On The Submit Button

@SanityTest
Scenario: Hotel Selection Confirmation
When user Click on the Radio Button Of The Selected Hotel
Then user Click On The Submit Button In Hotel Selection Page

@SanityTest
Scenario: Entering the Details
When user Enter The Firstname
And user Enter The Lastname
And user Enter The Address
And user Enter The Credit Card Number
And user Select The Credit Card Type
And user Select The Credit Card Expiry Month 
And user Select The Credit Card Expiry Year
And user Enter The Credit Card CVV Number
Then user Click On The BookNow Button In Details Page

@SanityTest
Scenario: Hotel Booking Done
When user Click On The My Itinerary Button

@RegressionTest
Scenario: Signing Out After Check
When user Click The Checkbox Of Selected Hotel
Then Click on Signout Button


