package org.pom_adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Page {

	@FindBy(id = "first_name")
	private WebElement firstname;
	
	@FindBy(id = "last_name")
	private WebElement lastname;
	
	@FindBy(id = "address")
	private WebElement address;
	
	@FindBy(id = "cc_num")
	private WebElement ccnum;
	
	@FindBy(id = "cc_type")
	private WebElement cctype;
	
	@FindBy(id = "cc_exp_month")
	private WebElement ccexpmnth;
	
	@FindBy(id = "cc_exp_year")
	private WebElement ccexpyr;
	
	@FindBy(id = "cc_cvv")
	private WebElement ccv;
	
	@FindBy(id = "book_now")
	private WebElement book;

	private WebDriver driver;

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcnum() {
		return ccnum;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getCcexpmnth() {
		return ccexpmnth;
	}

	public WebElement getCcexpyr() {
		return ccexpyr;
	}

	public WebElement getCcv() {
		return ccv;
	}

	public WebElement getBook() {
		return book;
	}
	
	public Booking_Page(WebDriver driver5) {
		
		this.driver = driver5;
		PageFactory.initElements(driver, this);
		
		
	}
}
