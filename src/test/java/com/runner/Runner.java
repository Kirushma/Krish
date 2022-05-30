package com.runner;

import java.io.IOException;

import javax.crypto.spec.DHGenParameterSpec;

import org.openqa.selenium.WebDriver;

import com.base.Base;
import com.pom.BookHotel;
import com.pom.Login;
import com.pom.Logout;
import com.pom.SearchHotel;
import com.pom.SelectHotel;

public class Runner extends Base {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {

		driver = browserLaunch("chrome");

		driver.manage().window().maximize();

		getUrl("https://adactinhotelapp.com/index.php");

		BookHotel bh = new BookHotel(driver);
		Login l = new Login(driver);
		SearchHotel sh = new SearchHotel(driver);
		SelectHotel sth = new SelectHotel(driver);
		Logout lo = new Logout(driver);

		sendKeys(l.getUsername(), "Kirushma");

		sendKeys(l.getPassword(), "krish@123");

		click(l.getLoginbtn());

		dropDown(sh.getLocation(), "value", "Melbourne");

		dropDown(sh.getHotels(), "value", "Hotel Sunshine");

		dropDown(sh.getRoomtype(), "value", "Super Deluxe");

		dropDown(sh.getNumberofroom(), "value", "1");

		dropDown(sh.getAdult(), "value", "1");

		dropDown(sh.getChildren(), "value", "0");

		click(sh.getSearchbtn());

		click(sth.getRadio());

		click(sth.getContinuebtn());

		sendKeys(bh.getFirstname(), "Kirushma");

		sendKeys(bh.getLastname(), "S");

		sendKeys(bh.getBillingaddress(), "Chennai");

		sendKeys(bh.getCreditcard(), "1234567891234567");

		dropDown(bh.getCredittype(), "value", "VISA");

		dropDown(bh.getExpirymonth(), "value", "7");

		dropDown(bh.getExpiryyear(), "value", "2022");

		sendKeys(bh.getCvv(), "123");

		click(bh.getBooknowbtn());

		Thread.sleep(7000);

		click(lo.getLogoutbtn());
		
		Thread.sleep(3000);

		takeScreenshot("screenshot1");

	}

}
