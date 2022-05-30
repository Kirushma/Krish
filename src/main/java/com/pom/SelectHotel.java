package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {
	
	private WebDriver driver;
	
	
	@FindBy(xpath = "/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]/input[1]")
	private WebElement radio;
	
	@FindBy(id="continue")
	private WebElement continuebtn;
	
	
	public WebElement getRadio() {
		return radio;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}

	
	public SelectHotel(WebDriver driver) {
		this.driver= driver;
		
		PageFactory.initElements(driver, this);
		
	}
	

}
