package com.fannie.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.fannie.utils.ElementType;

public class FlightPagePOM {

	private static WebElement element;

	public static void clickFlightTab(WebDriver driver) {
		driver.findElement(By.id("tab-flight-tab-hp")).click();
	}

	public static void sendFlyFromTextBox(String flyFrom, WebDriver driver) {
		element = driver.findElement(By.id("flight-origin-hp-flight"));
		element.clear();
		element.sendKeys(flyFrom);
	}

	public static void sendFlyToTextBox(String flyTo, WebDriver driver) {
		element = driver.findElement(By.id("flight-destination-hp-flight"));
		element.clear();
		element.sendKeys(flyTo);
	}

	// user will send value -> 28
	public static void selectDepartingDate(String departDate, WebDriver driver) throws Exception {
		element = driver.findElement(By.id("flight-departing-hp-flight"));
		element.click();
		Thread.sleep(1000);
		String selectDateXPath = ".//*[@id='flight-departing-wrapper-hp-flight']/div"
				+ "/div/div[2]/table/tbody/tr/td/button[text()='" + departDate + "']";
		driver.findElement(By.xpath(selectDateXPath)).click();
	}

	public static void selectReturningDate(String returnDate, WebDriver driver) throws Exception {
		element = driver.findElement(By.id("flight-returning-hp-flight"));
		element.click();
		Thread.sleep(1000);
		String selectDateXPath = ".//*[@id='flight-returning-wrapper-hp-flight']/div/div/div"
				+ "[3]/table/tbody/tr/td/button[text()='"
				+ returnDate + "']";
		driver.findElement(By.xpath(selectDateXPath)).click();
	}

}
