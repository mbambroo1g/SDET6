package com.fannie.pomtest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.fannie.generics.GenericMethods;
import com.fannie.pom.AllFactory;
import com.fannie.pom.FlightPageEPOM;
import com.fannie.pom.FlightPagePOM;
import com.fannie.utils.DriverFactory;
import com.fannie.utils.DriverNames;
import com.fannie.utils.ScreenShot;

// this program will not work properly since it is refactored in src for 
// factory example 

public class FlightPageTest2 {

	WebDriver driver;
	String baseURL1;
	String baseURL2;
	ScreenShot screenShot;
	AllFactory factory ; 
	@Before
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);

		// driver.manage().window().maximize();
		baseURL1 = "https://www.expedia.com/";
		baseURL2 = "http://naveenks.com/selenium/LoginForm.html";
		screenShot = new ScreenShot(driver);
		factory = new AllFactory(driver);
	}

	@After
	public void tearDown() throws Exception {
		screenShot.takeScreenShot();
		Thread.sleep(3000);
		 driver.quit();
	}


	@Test
	public void expediaFlightTest() throws Exception {
		driver.get(baseURL1);
		factory.getFlightPage().clickFlightTab();
		factory.getFlightPage().sendFlyFrom("Washington, DC (IAD-Washington Dulles Intl.)");
		factory.getFlightPage().sendFlyTo("San Francisco, CA (QSF-All Airports)");
		factory.getFlightPage().sendDepartDate("30");
		factory.getFlightPage().sendReturnDate("6");
	}

	@Ignore
	@Test
	public void loginPageTest(){
		driver.get(baseURL2);
		factory.getLoginPage().sendUserName("naveen@gmail.com");
		factory.getLoginPage().sendPassword("hello");
		factory.getLoginPage().clickLoginBtn();
	}
	
	
}
















