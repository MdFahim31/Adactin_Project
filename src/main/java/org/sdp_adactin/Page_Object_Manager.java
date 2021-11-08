package org.sdp_adactin;

import org.openqa.selenium.WebDriver;
import org.pom_adactin.Booking_Page;
import org.pom_adactin.Confirmation_Page;
import org.pom_adactin.Home_page;
import org.pom_adactin.Logout_Page;
import org.pom_adactin.Search_Page;
import org.pom_adactin.Select_Page;

public class Page_Object_Manager {
public WebDriver driver;

private Home_page hp;
private Search_Page sp;
private Select_Page s;
private Booking_Page bp;
private Confirmation_Page cp ; 
private Logout_Page lp ;

public Page_Object_Manager(WebDriver driver2) {
	this.driver = driver2;
}

public Home_page getInstanceHp() {
	hp = new Home_page(driver);
	return hp;
}

public Search_Page getInstanceSp() {
	sp = new Search_Page(driver);
	
	return sp;
}

public Select_Page getInstanceS() {
	s = new Select_Page(driver);
	
	return s;
}

public Booking_Page getInstanceBp() {
	bp = new Booking_Page(driver);
	
	return bp;
}

public Confirmation_Page getInstanceCp() {
	cp = new Confirmation_Page(driver);
	return cp;
}

public Logout_Page getInstanceLp() {
	lp = new Logout_Page(driver);
	return lp;
}
	

}
