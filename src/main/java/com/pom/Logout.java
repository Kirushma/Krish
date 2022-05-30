package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	
	private WebDriver driver;
	
	
	@FindBy(id="logout")
	private WebElement logoutbtn;


	
	public WebElement getLogoutbtn() {
		return logoutbtn;
	}
	
	
	public Logout(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	

}
