package Cucumber_Runner;

import org.Maven.Adactin_Project.Adactin_Base_Class;
import org.filereader.File_Reader_Manager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.properties.Configuration_Reader;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\Adactin.feature",
glue="org.StepD", plugin = {"html:Report/HtmlReport","pretty","json:jsonReport/Report.json","com.cucumber.listener.ExtentCucumberFormatter:ReportNew/File.html"},monochrome = true,dryRun = false,strict = true)
		public class Test_Runner {

	public static WebDriver driver;
	@BeforeClass
	public static  void Set_up() {

		driver= Adactin_Base_Class.getdriver();
	}
	@AfterClass
	public static void Tear_down() {

		driver.close();
	}
	

}
