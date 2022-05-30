package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel {
	
	private WebDriver driver;
	
	
	
	@FindBy(xpath = "/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[12]/td[2]/input")
	private WebElement firstname;
	
	@FindBy(xpath = "/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[13]/td[2]/input")
	private WebElement lastname;
	
	@FindBy(xpath = "/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[14]/td[2]/textarea")
	private WebElement billingaddress;
	
	@FindBy(xpath = "/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[15]/td[2]/input")
	private WebElement creditcard;
	
	@FindBy(xpath = "/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[16]/td[2]/select")
	private WebElement credittype;
	
	
	@FindBy(xpath = "/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[17]/td[2]/select[1]")
	private WebElement expirymonth;

	@FindBy(xpath = "/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[17]/td[2]/select[2]")
	private WebElement expiryyear;
	
	@FindBy(xpath = "/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[18]/td[2]/input")
	private WebElement cvv;
	
	@FindBy(xpath = "/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[19]/td[2]/input[1]")
	private WebElement booknowbtn;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getBillingaddress() {
		return billingaddress;
	}

	public WebElement getCreditcard() {
		return creditcard;
	}

	public WebElement getCredittype() {
		return credittype;
	}

	public WebElement getExpirymonth() {
		return expirymonth;
	}

	public WebElement getExpiryyear() {
		return expiryyear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBooknowbtn() {
		return booknowbtn;
	}

	
	public BookHotel(WebDriver driver) {
		
		this.driver= driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	

}
