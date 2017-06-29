package com.fannie.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPagePOM {

	@FindBy(how=How.ID, id="uname")
//	@FindBy(id="uname")
	WebElement userName;
	
	@FindBy(how=How.ID, id="pwd")
	WebElement password;
	
	@FindBy(how=How.ID, id="submitBtn")
	WebElement loginBtn;
	
	public void sendUserName(String userName){
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password){
		this.password.sendKeys(password);
	}
	
	public void clickLoginBtn(){
		this.loginBtn.click();
	}
	
	
}
