package org.pom_adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_Page {
	@FindBy(id = "logout")
	private WebElement logout;
	private WebDriver driver;

	public WebElement getLogout() {
		return logout;
	}
	
	public Logout_Page(WebDriver driver7) {
		this.driver = driver7;
		PageFactory.initElements(driver, this);
		
		
		
	}

}
