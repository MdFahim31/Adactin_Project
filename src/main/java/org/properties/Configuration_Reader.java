package org.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties p;
	public Configuration_Reader() throws IOException {
		File f = new File("C:\\Users\\Hp 15\\eclipse-workspace\\Adactin_Project\\src\\main\\java\\org\\properties\\Configuration_Reader.properties");
		
		FileInputStream fis = new FileInputStream(f);
		p= new Properties();
		p.load(fis);

	}
	
	public String getUsername() {
		String username = p.getProperty("username");
		return username;

	}
	public String getPassword() {

		String password = p.getProperty("password");
		return password;
	}
	
	public String getFirstname() {

		String firstname = p.getProperty("firstname");
		return firstname;
	}

	public String getLastaname() {
		String lastname = p.getProperty("lastname");
		return lastname;

	}
	
	public String getaddress() {
		String address = p.getProperty("address");
		return address;

	}
	
	public String getccnum() {

		String ccnum = p.getProperty("ccnum");
		return ccnum;
	}
	
	public String getccv() {
		String ccv = p.getProperty("ccv");
		return ccv;

	}
}
