package org.pom_adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Page {
	
	@FindBy(xpath = "//input[@type= 'radio']")
	private WebElement radio;
	
	@FindBy(id = "continue")
	private WebElement cont;

	public WebDriver driver;

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getCont() {
		return cont;
	}
	
	
	public Select_Page(WebDriver driver4) {
		this.driver = driver4;
		PageFactory.initElements(driver, this);
		

	}

}
