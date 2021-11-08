$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking",
  "description": "",
  "id": "hotel-booking",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Login",
  "description": "",
  "id": "hotel-booking;login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user Enter The \"MdFahimI\" In The Username Fields",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"Immrpsycho\" In The Password Fields",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user Click On The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_launch_The_Application()"
});
formatter.result({
  "duration": 5941366189,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MdFahimI",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_The_Username_Fields(String)"
});
formatter.result({
  "duration": 161438836,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Immrpsycho",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_The_Password_Fields(String)"
});
formatter.result({
  "duration": 86489062,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 1480637569,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Search Hotel",
  "description": "",
  "id": "hotel-booking;search-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "user Select The \"New York\" In Location",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user Select The \"Hotel Sunshine\" In Hotel",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user Select The \"Super Deluxe\" In Room Type",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user Select The \"1\" Room No",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user Select The \"23/10/2021\" Checkin Date",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user Select The \"24/10/2021\" Checkout Date",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user Select The \"2\" In Adult No",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user Select The \"0\" In Child No",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user Click On Submit Button And It Navigates To The Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "New York",
      "offset": 17
    }
  ],
  "location": "Step_Definition.user_Select_The_In_Location(String)"
});
formatter.result({
  "duration": 167197361,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hotel Sunshine",
      "offset": 17
    }
  ],
  "location": "Step_Definition.user_Select_The_In_Hotel(String)"
});
formatter.result({
  "duration": 3136040345,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Super Deluxe",
      "offset": 17
    }
  ],
  "location": "Step_Definition.user_Select_The_In_Room_Type(String)"
});
formatter.result({
  "duration": 167166143,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 17
    }
  ],
  "location": "Step_Definition.user_Select_The_Room_No(String)"
});
formatter.result({
  "duration": 105617576,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "23/10/2021",
      "offset": 17
    }
  ],
  "location": "Step_Definition.user_Select_The_Checkin_Date(String)"
});
formatter.result({
  "duration": 77541238,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "24/10/2021",
      "offset": 17
    }
  ],
  "location": "Step_Definition.user_Select_The_Checkout_Date(String)"
});
formatter.result({
  "duration": 77530120,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 17
    }
  ],
  "location": "Step_Definition.user_Select_The_In_Adult_No(String)"
});
formatter.result({
  "duration": 114479445,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 17
    }
  ],
  "location": "Step_Definition.user_Select_The_In_Child_No(String)"
});
formatter.result({
  "duration": 97076007,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_Submit_Button_And_It_Navigates_To_The_Select_Hotel_Page()"
});
formatter.result({
  "duration": 701009560,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Select Hotel",
  "description": "",
  "id": "hotel-booking;select-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 21,
  "name": "user Click On The Radio Button",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "user Click on Continue Button And It Navigates To The Booking Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Radio_Button()"
});
formatter.result({
  "duration": 100168659,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_on_Continue_Button_And_It_Navigates_To_The_Booking_Page()"
});
formatter.result({
  "duration": 714705835,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Book The Hotel",
  "description": "",
  "id": "hotel-booking;book-the-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "user Enter The \"Mohamed\" In First Name",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "user Enter The \"Fahim\" In Last Name",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user Enter The \"No 31/189, Groove st,NY-43521\" In Address",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "user Enter The \"1234567891011121\" In Ccnum",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "user Select The \"AMEX\" In Cc Type",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "user Select The \"8\" In Cc Expiry Month",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "user Select The \"2022\" In Cc Expiry Year",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user Enter The \"278\" In Cvv Number",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "user Click On The Book Now Button And It Navigates To The Confirmation Page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Mohamed",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_First_Name(String)"
});
formatter.result({
  "duration": 361084668,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Fahim",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Last_Name(String)"
});
formatter.result({
  "duration": 97495517,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "No 31/189, Groove st,NY-43521",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Address(String)"
});
formatter.result({
  "duration": 148518717,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1234567891011121",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Ccnum(String)"
});
formatter.result({
  "duration": 112434069,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AMEX",
      "offset": 17
    }
  ],
  "location": "Step_Definition.user_Select_The_In_Cc_Type(String)"
});
formatter.result({
  "duration": 151471533,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "8",
      "offset": 17
    }
  ],
  "location": "Step_Definition.user_Select_The_In_Cc_Expiry_Month(String)"
});
formatter.result({
  "duration": 123863882,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2022",
      "offset": 17
    }
  ],
  "location": "Step_Definition.user_Select_The_In_Cc_Expiry_Year(String)"
});
formatter.result({
  "duration": 128427597,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "278",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Cvv_Number(String)"
});
formatter.result({
  "duration": 77652423,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Book_Now_Button_And_It_Navigates_To_The_Confirmation_Page()"
});
formatter.result({
  "duration": 8064677996,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "Confirmation Of Booking",
  "description": "",
  "id": "hotel-booking;confirmation-of-booking",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 37,
  "name": "user Click On The My Itinerary Button And It Navigates To The Logout Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_My_Itinerary_Button_And_It_Navigates_To_The_Logout_Page()"
});
formatter.result({
  "duration": 1185139618,
  "status": "passed"
});
formatter.scenario({
  "line": 39,
  "name": "Logout The Application",
  "description": "",
  "id": "hotel-booking;logout-the-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 40,
  "name": "user Click on Logout Button",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Click_on_Logout_Button()"
});
formatter.result({
  "duration": 444741936,
  "status": "passed"
});
});