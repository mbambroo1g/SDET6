package com.fannie.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class AllFactory {
	WebDriver driver; 
	FlightPageEPOM flightPage;
	LoginPagePOM loginPage; 
	
	public AllFactory(WebDriver driver) {
		this.driver = driver;
		flightPage = new FlightPageEPOM(driver);
		loginPage = new LoginPagePOM();
		
		PageFactory.initElements(driver, flightPage );
		PageFactory.initElements(driver, loginPage);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public FlightPageEPOM getFlightPage() {
		return flightPage;
	}

	public LoginPagePOM getLoginPage() {
		return loginPage;
	}
	
	
}
