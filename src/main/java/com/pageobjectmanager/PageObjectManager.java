package com.pageobjectmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;
import com.pom.BookHotel;
import com.pom.Login;
import com.pom.Logout;
import com.pom.SearchHotel;
import com.pom.SelectHotel;

public class PageObjectManager  {

	public WebDriver driver;

	private Login l;
	private SearchHotel sh;
	private SelectHotel sth;
	private Logout lo;
	private BookHotel bh;

	public PageObjectManager(WebDriver driver2) {

		this.driver = driver2;
		
		// pagefactory theva illa bcoz idhula webelement illa
		// login la theva bcoz anga webelements iruku
	
	}

	public BookHotel getBh() {
		
		if (bh==null) {

		bh = new BookHotel(driver);

		}
		
		return bh;
	}

	public Login getL() {

		if (l==null) {
		
		l = new Login(driver);   // Login class la constructor la driver koduthirukom so driver varum

		}
		
		return l;
	}

	public SearchHotel getSh() {
		
		if (sh==null) {

		sh = new SearchHotel(driver);

		}
		
		return sh;
	}

	public SelectHotel getSth() {
		
		if(sth==null) {

		sth = new SelectHotel(driver);

		}
		
		return sth;
	}

	public Logout getLo() {
		
		if (lo == null) {

		lo = new Logout(driver);

		}
		
		return lo;
	}

	

}
