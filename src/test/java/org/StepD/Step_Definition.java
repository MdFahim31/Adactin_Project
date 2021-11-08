package org.StepD;

import org.Maven.Adactin_Project.Adactin_Base_Class;
import org.openqa.selenium.WebDriver;
import org.sdp_adactin.Page_Object_Manager;

import Cucumber_Runner.Test_Runner;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Adactin_Base_Class{
	
	public static WebDriver driver= Test_Runner.driver;
	Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	

	
	
	
	@Given("^user launch The Application$")
	public void user_launch_The_Application() throws Throwable {

		get_url("https://adactinhotelapp.com/");
		
		
		
	}

	@When("^user Enter The \"([^\"]*)\" In The Username Fields$")
	public void user_Enter_The_In_The_Username_Fields(String username) throws Throwable {
	input(pom.getInstanceHp().getUsername(), username);
	}

	@When("^user Enter The \"([^\"]*)\" In The Password Fields$")
	public void user_Enter_The_In_The_Password_Fields(String password) throws Throwable {
		input(pom.getInstanceHp().getPassword(), password);
	}
	@Then("^user Click On The Login Button And It Navigates To The Search Hotel Page$")
	public void user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {
		clickOnElement(pom.getInstanceHp().getLogin());
	
	}
	
	@When("^user Select The \"([^\"]*)\" In Location$")
	public void user_Select_The_In_Location(String location) throws Throwable {
		select(pom.getInstanceSp().getLocation(), "selectByValue", location);

	}

	@When("^user Select The \"([^\"]*)\" In Hotel$")
	public void user_Select_The_In_Hotel(String hotel) throws Throwable {
		select(pom.getInstanceSp().getHotels(), "selectByValue", hotel);
		sleep(3000);
	}
	
	@When("^user Select The \"([^\"]*)\" In Room Type$")
	public void user_Select_The_In_Room_Type(String roomtype) throws Throwable {
		select(pom.getInstanceSp().getRoom_type(), "selectbyvisibletext", roomtype);

	}

	@When("^user Select The \"([^\"]*)\" Room No$")
	public void user_Select_The_Room_No(String roomno) throws Throwable {
		select(pom.getInstanceSp().getRoom_nos(), "selectByValue", roomno);

	}

	@When("^user Select The \"([^\"]*)\" Checkin Date$")
	public void user_Select_The_Checkin_Date(String checkin) throws Throwable {
		input(pom.getInstanceSp().getDatepick_in(), checkin);
	}

	@When("^user Select The \"([^\"]*)\" Checkout Date$")
	public void user_Select_The_Checkout_Date(String checkout) throws Throwable {
		input(pom.getInstanceSp().getDatepick_out(), checkout);

	}

	@When("^user Select The \"([^\"]*)\" In Adult No$")
	public void user_Select_The_In_Adult_No(String adultno) throws Throwable {
		select(pom.getInstanceSp().getAdult_room(),"selectByValue", adultno);

	}

	@When("^user Select The \"([^\"]*)\" In Child No$")
	public void user_Select_The_In_Child_No(String child) throws Throwable {
		select(pom.getInstanceSp().getChild_room(), "selectByValue", child);

	}

	@Then("^user Click On Submit Button And It Navigates To The Select Hotel Page$")
	public void user_Click_On_Submit_Button_And_It_Navigates_To_The_Select_Hotel_Page() throws Throwable {
		clickOnElement(pom.getInstanceSp().getSubmit());
	}

	@When("^user Click On The Radio Button$")
	public void user_Click_On_The_Radio_Button() throws Throwable {
		clickOnElement(pom.getInstanceS().getRadio());

	}

	@Then("^user Click on Continue Button And It Navigates To The Booking Page$")
	public void user_Click_on_Continue_Button_And_It_Navigates_To_The_Booking_Page() throws Throwable {
		clickOnElement(pom.getInstanceS().getCont());

	}

	@When("^user Enter The \"([^\"]*)\" In First Name$")
	public void user_Enter_The_In_First_Name(String firstname) throws Throwable {
		input(pom.getInstanceBp().getFirstname(), firstname);
	}

	@When("^user Enter The \"([^\"]*)\" In Last Name$")
	public void user_Enter_The_In_Last_Name(String lastname) throws Throwable {
		input(pom.getInstanceBp().getLastname(), lastname);

	}

	@When("^user Enter The \"([^\"]*)\" In Address$")
	public void user_Enter_The_In_Address(String address) throws Throwable {
		input(pom.getInstanceBp().getAddress(),address);

	}

	@When("^user Enter The \"([^\"]*)\" In Ccnum$")
	public void user_Enter_The_In_Ccnum(String ccnum) throws Throwable {
		input(pom.getInstanceBp().getCcnum(), ccnum);
	
	}

	@When("^user Select The \"([^\"]*)\" In Cc Type$")
	public void user_Select_The_In_Cc_Type(String type) throws Throwable {
		select(pom.getInstanceBp().getCctype(),"selectByValue",type);

	}

	@When("^user Select The \"([^\"]*)\" In Cc Expiry Month$")
	public void user_Select_The_In_Cc_Expiry_Month(String mnth) throws Throwable {
		select(pom.getInstanceBp().getCcexpmnth(), "selectByValue", mnth);

	}

	@When("^user Select The \"([^\"]*)\" In Cc Expiry Year$")
	public void user_Select_The_In_Cc_Expiry_Year(String year) throws Throwable {
		select(pom.getInstanceBp().getCcexpyr(), "selectByValue", year);
	}

	@When("^user Enter The \"([^\"]*)\" In Cvv Number$")
	public void user_Enter_The_In_Cvv_Number(String cvv) throws Throwable {
		input(pom.getInstanceBp().getCcv(), cvv);
	}

	@Then("^user Click On The Book Now Button And It Navigates To The Confirmation Page$")
	public void user_Click_On_The_Book_Now_Button_And_It_Navigates_To_The_Confirmation_Page() throws Throwable {
		clickOnElement(pom.getInstanceBp().getBook());

		sleep(8000);
	}

	@Then("^user Click On The My Itinerary Button And It Navigates To The Logout Page$")
	public void user_Click_On_The_My_Itinerary_Button_And_It_Navigates_To_The_Logout_Page() throws Throwable {
		clickOnElement(pom.getInstanceCp().getItinerary());
		
	}

	@Then("^user Click on Logout Button$")
	public void user_Click_on_Logout_Button() throws Throwable {
		clickOnElement(pom.getInstanceLp().getLogout());

	}





	
}
