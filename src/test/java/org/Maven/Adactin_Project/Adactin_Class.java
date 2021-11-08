package org.Maven.Adactin_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin_Class extends Adactin_Base_Class{
	
	public static void main(String[] args) throws Throwable {

		getdriver();
		
		get_url("https://adactinhotelapp.com/");
		
		WebElement username = driver.findElement(By.id("username"));
		clickOnElement(username);
		input(username, "MdFahimI");
		
		WebElement password = driver.findElement(By.id("password"));
		clickOnElement(password);
		input(password, "Immrpsycho");
		
		WebElement login = driver.findElement(By.id("login"));
		clickOnElement(login);
		
		WebElement location = driver.findElement(By.id("location"));
		select(location, "selectByValue", "New York");
		sleep(2000);
		
		WebElement hotels = driver.findElement(By.id("hotels"));
		select(hotels, "selectByValue", "Hotel Sunshine");
		sleep(2000);
		
		WebElement roomtype = driver.findElement(By.id("room_type"));
		select(roomtype, "selectByValue", "Deluxe");
		sleep(2000);
		
		WebElement nos = driver.findElement(By.id("room_nos"));
		select(nos, "selectByValue", "2");
		
		WebElement checkin = driver.findElement(By.id("datepick_in"));
		clickOnElement(checkin);
		input(checkin, "23/10/2021");
		sleep(2000);
		
		WebElement checkout = driver.findElement(By.id("datepick_out"));
		clickOnElement(checkout);
		input(checkin, "24/10/2021");
		sleep(2000);
	
		WebElement adult = driver.findElement(By.id("adult_room"));
		select(adult, "selectByValue", "2");
		sleep(1000);
		
		WebElement child = driver.findElement(By.id("child_room"));
		select(child, "selectByValue", "0");
		sleep(1000);
		
		WebElement search = driver.findElement(By.id("Submit"));
		clickOnElement(search);
		
		WebElement choose = driver.findElement(By.xpath("//input[@type='radio']"));
		clickOnElement(choose);
		sleep(1000);
		
		WebElement cont = driver.findElement(By.id("continue"));
		clickOnElement(cont);
		
		WebElement firstname = driver.findElement(By.id("first_name"));
		clickOnElement(firstname);
		input(firstname, "Mohamed");
		
		WebElement lastname = driver.findElement(By.id("last_name"));
		clickOnElement(lastname);
		input(lastname, "Fahim");
		sleep(2000);
		
		WebElement address = driver.findElement(By.id("address"));
		clickOnElement(address);
		input(address, "No 31/189, Groove st,NY-43521");
		sleep(2000);
		
		WebElement ccnum = driver.findElement(By.id("cc_num"));
		clickOnElement(ccnum);
		input(ccnum, "1234567891011121");
		
		WebElement cctype = driver.findElement(By.id("cc_type"));
		select(cctype, "selectByValue", "AMEX");
		sleep(2000);
		
		WebElement ccexpmnth = driver.findElement(By.id("cc_exp_month"));
		select(ccexpmnth, "selectByValue", "8");
		sleep(2000);
		
		WebElement ccexpyr = driver.findElement(By.id("cc_exp_year"));
		select(ccexpyr, "selectByValue", "2022");
		sleep(2000);
		
		WebElement ccv = driver.findElement(By.id("cc_cvv"));
		clickOnElement(ccv);
		input(ccv, "278");
		sleep(1000);
		
		WebElement submit = driver.findElement(By.id("book_now"));
		clickOnElement(submit);
		sleep(5000);
		
		WebElement logout = driver.findElement(By.id("logout"));
		clickOnElement(logout);
		sleep(1000);

		
		close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
