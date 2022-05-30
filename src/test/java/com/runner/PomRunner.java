package com.runner;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.base.Base;
import com.pageobjectmanager.PageObjectManager;

public class PomRunner extends Base {

	public static WebDriver driver = browserLaunch("chrome");

	public static PageObjectManager pom = new PageObjectManager(driver);

	public static WebDriver driver2;

	public static void main(String[] args) throws InterruptedException, IOException {

		driver.manage().window().maximize();

		getUrl("https://adactinhotelapp.com/index.php");

		sendKeys(pom.getL().getUsername(), "Kirushma");

		sendKeys(pom.getL().getPassword(), "krish@123");

		click(pom.getL().getLoginbtn());

		dropDown(pom.getSh().getLocation(), "value", "Melbourne");

		dropDown(pom.getSh().getHotels(), "value", "Hotel Sunshine");

		dropDown(pom.getSh().getRoomtype(), "value", "Super Deluxe");

		dropDown(pom.getSh().getNumberofroom(), "value", "1");

		dropDown(pom.getSh().getAdult(), "value", "1");

		dropDown(pom.getSh().getChildren(), "value", "0");

		click(pom.getSh().getSearchbtn());

		click(pom.getSth().getRadio());

		click(pom.getSth().getContinuebtn());

		sendKeys(pom.getBh().getFirstname(), "Kirushma");

		sendKeys(pom.getBh().getLastname(), "S");

		sendKeys(pom.getBh().getBillingaddress(), "Chennai");

		sendKeys(pom.getBh().getCreditcard(), "1234567891234567");

		dropDown(pom.getBh().getCredittype(), "value", "VISA");

		dropDown(pom.getBh().getExpirymonth(), "value", "7");

		dropDown(pom.getBh().getExpiryyear(), "value", "2022");

		sendKeys(pom.getBh().getCvv(), "123");

		click(pom.getBh().getBooknowbtn());

		Thread.sleep(7000);

		click(pom.getLo().getLogoutbtn());

		Thread.sleep(3000);

		takeScreenshot("pic2");

	}

}
