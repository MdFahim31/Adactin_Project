package org.pom_adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirmation_Page {
	
	@FindBy(name = "my_itinerary")
	private WebElement itinerary;
	private WebDriver driver;

	public WebElement getItinerary() {
		return itinerary;
	}
	
	public Confirmation_Page(WebDriver driver6) {

		this.driver = driver6;
		PageFactory.initElements(driver, this);
	}

}
