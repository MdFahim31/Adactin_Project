Feature: Hotel Booking
Scenario: Login
Given user launch The Application
When user Enter The "MdFahimI" In The Username Fields
And user Enter The "Immrpsycho" In The Password Fields
Then user Click On The Login Button And It Navigates To The Search Hotel Page


Scenario: Search Hotel
When user Select The "New York" In Location 
And user Select The "Hotel Sunshine" In Hotel
And user Select The "Super Deluxe" In Room Type
And user Select The "1" Room No
And user Select The "23/10/2021" Checkin Date
And user Select The "24/10/2021" Checkout Date
And user Select The "2" In Adult No
And user Select The "0" In Child No
Then user Click On Submit Button And It Navigates To The Select Hotel Page

Scenario: Select Hotel
When user Click On The Radio Button
Then user Click on Continue Button And It Navigates To The Booking Page

Scenario: Book The Hotel
When user Enter The "Mohamed" In First Name
And user Enter The "Fahim" In Last Name
And user Enter The "No 31/189, Groove st,NY-43521" In Address
And user Enter The "1234567891011121" In Ccnum
And user Select The "AMEX" In Cc Type
And user Select The "8" In Cc Expiry Month
And user Select The "2022" In Cc Expiry Year
And user Enter The "278" In Cvv Number
Then user Click On The Book Now Button And It Navigates To The Confirmation Page


Scenario: Confirmation Of Booking
Then user Click On The My Itinerary Button And It Navigates To The Logout Page

Scenario: Logout The Application
Then user Click on Logout Button 


