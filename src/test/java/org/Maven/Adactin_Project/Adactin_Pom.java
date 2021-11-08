package org.Maven.Adactin_Project;

import org.filereader.File_Reader_Manager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.pom_adactin.Booking_Page;
import org.pom_adactin.Confirmation_Page;
import org.pom_adactin.Home_page;
import org.pom_adactin.Logout_Page;
import org.pom_adactin.Search_Page;
import org.pom_adactin.Select_Page;
import org.sdp_adactin.Page_Object_Manager;

public class Adactin_Pom extends Adactin_Base_Class {
public static WebDriver driver = Adactin_Base_Class.getdriver();
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	public static void main(String[] args) throws Throwable {
		
		
		get_url("https://adactinhotelapp.com/");
		

		String username = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUsername();
		input(pom.getInstanceHp().getUsername(),username);
		
		String password = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPassword();
		input(pom.getInstanceHp().getPassword(),password);
		
		clickOnElement(pom.getInstanceHp().getLogin());

		
		
		select(pom.getInstanceSp().getLocation(), "selectByValue", "New York");
		select(pom.getInstanceSp().getHotels(), "selectByValue", "Hotel Sunshine");
		select(pom.getInstanceSp().getRoom_type(), "selectByValue", "Deluxe");
		select(pom.getInstanceSp().getRoom_nos(), "selectByValue", "1");
		input(pom.getInstanceSp().getDatepick_in(), "23/10/2021");
		input(pom.getInstanceSp().getDatepick_out(), "24/10/2021");
		select(pom.getInstanceSp().getAdult_room(),"selectByValue", "2");
		select(pom.getInstanceSp().getChild_room(), "selectByValue", "0");
		clickOnElement(pom.getInstanceSp().getSubmit());
		

		clickOnElement(pom.getInstanceS().getRadio());
		clickOnElement(pom.getInstanceS().getCont());
		
		String firstname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getFirstname();
		input(pom.getInstanceBp().getFirstname(), firstname);
		String lastaname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getLastaname();
		input(pom.getInstanceBp().getLastname(),lastaname);
		String getaddress = File_Reader_Manager.getInstanceFRM().getInstanceCR().getaddress();
		input(pom.getInstanceBp().getAddress(),getaddress);
		String getccnum = File_Reader_Manager.getInstanceFRM().getInstanceCR().getccnum();
		input(pom.getInstanceBp().getCcnum(), getccnum);
		select(pom.getInstanceBp().getCctype(),"selectByValue", "AMEX");
		select(pom.getInstanceBp().getCcexpmnth(), "selectByValue","8");
		select(pom.getInstanceBp().getCcexpyr(), "selectByValue", "2022");
		String getccv = File_Reader_Manager.getInstanceFRM().getInstanceCR().getccv();
		input(pom.getInstanceBp().getCcv(), getccv);
		clickOnElement(pom.getInstanceBp().getBook());
		sleep(5000);
		
		
		clickOnElement(pom.getInstanceCp().getItinerary());
		
		
		clickOnElement(pom.getInstanceLp().getLogout());
		
//		close();
		

	}

}
