package org.Maven.Adactin_Project;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Adactin_Base_Class {
	
	public static WebDriver driver;
	public static WebDriver getdriver(){
		
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		return driver;
		

}
	
	public static void get_url(String url) {
		driver.get(url);

	}
     
	public static void sleep(int s) throws Throwable {

		Thread.sleep(s);
		
	}


	public static void clickOnElement(WebElement element) {
		element.click();
	}
	
	public static void input(WebElement element, String value) {

		element.sendKeys(value);
		
	}
	public static void actions(WebElement w , String s) {
		Actions a = new Actions(driver);
		if (s.equalsIgnoreCase("move")) {
			a.moveToElement(w).perform();
		}
			else if (s.equalsIgnoreCase("click")) {
				a.click(w).perform();
				
				
			}
			
			
		 else if(s.equalsIgnoreCase("contextclick")) {
			 a.contextClick(w).perform();

		}
		 else if (s.equalsIgnoreCase("doubleclick")) {
			 a.doubleClick(w).perform();
		 }
		
	}
	
	public static void select(WebElement w , String type, String value) {
		
		Select k = new Select(w);
		if (type.equalsIgnoreCase("selectbyindex")) {
			int parseint = Integer.parseInt(value);
			k.selectByIndex(parseint);
		
	}
	else if(type.equalsIgnoreCase("selectbyvalue")) {
		k.selectByValue(value);
		
		
	}
	else if(type.equalsIgnoreCase("selectbyvisibletext")) {
		k.selectByVisibleText(value);
	}
		
	}
public static void screenshot(String name) throws Throwable {

TakesScreenshot ts =  (TakesScreenshot) driver;
File s1 = ts.getScreenshotAs(OutputType.FILE);
File s2 = new File(System.getProperty("user.dir")+"\\ScreenShot"+name+".png");
FileUtils.copyFile(s1, s2);



}

public static void defaultframe() {


}
public static void close() {
driver.close();

}


}
