package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
	
	private WebDriver driver;
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy(xpath = "/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[4]/td[2]/select")
	private WebElement roomtype;
	
	@FindBy(xpath = "/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[5]/td[2]/select")
	private WebElement numberofroom;
	
	@FindBy(xpath = "/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[6]/td[2]/input")
	private WebElement checkin;
	
	@FindBy(xpath = "/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[7]/td[2]/input")
	private WebElement checkout;
	
	@FindBy(xpath = "/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[8]/td[2]/select")
	private WebElement adult;
	
	@FindBy(xpath = "/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[9]/td[2]/select")
	private WebElement children;
	
	@FindBy(id="Submit")
	private WebElement searchbtn;
	
	public WebElement getSearchbtn() {
		return searchbtn;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNumberofroom() {
		return numberofroom;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChildren() {
		return children;
	}

	public SearchHotel(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	

}
