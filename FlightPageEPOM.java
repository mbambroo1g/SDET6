package com.fannie.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fannie.utils.ElementType;

public class FlightPageEPOM {

	private WebDriver driver;
	
	public FlightPageEPOM() {
		// TODO Auto-generated constructor stub
	}
	

	public FlightPageEPOM(WebDriver driver) {
		this.driver = driver;
	}
	
	
	@FindBy(id="tab-flight-tab-hp")
	WebElement flightTab;

	@FindBy(id="flight-origin-hp-flight")
	WebElement flyFrom;
	
	@FindBy(id="flight-destination-hp-flight")
	WebElement flyTo;
	
	@FindBy(id="flight-departing-hp-flight")
	WebElement departDate;
	
	@FindBy(id="flight-returning-hp-flight")
	WebElement returnDate; 
	
	public void clickFlightTab(){
		this.flightTab.click();
	}
	
	public void sendFlyFrom(String flyFrom){
		this.flyFrom.sendKeys(flyFrom);
	}
	
	public void sendFlyTo(String flyTo){
		this.flyTo.sendKeys(flyTo);
	}
	
	public void sendDepartDate(String departDate) throws InterruptedException{
		this.departDate.click();
		Thread.sleep(600);
		String selectDateXPath=".//*[@id='flight-departing-wrapper-hp-flight']/div"
				+ "/div/div[2]/table/tbody/tr/td/button[text()='"+departDate+"']";
		driver.findElement(By.xpath(selectDateXPath)).click();
	}
	
	public void sendReturnDate(String returnDate) throws InterruptedException{
		this.returnDate.click();
		Thread.sleep(600);
		String selectDateXPath=".//*[@id='flight-returning-wrapper-hp-flight']/div/"
				+ "div/div[3]/table/tbody/tr/td/button[text()='"+returnDate+"']";
		driver.findElement(By.xpath(selectDateXPath)).click();
	}
}








