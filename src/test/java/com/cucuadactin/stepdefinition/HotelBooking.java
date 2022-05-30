package com.cucuadactin.stepdefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.base.Base;
import com.pageobjectmanager.PageObjectManager;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HotelBooking extends Base {

	public static PageObjectManager pom = new PageObjectManager(driver);

	public static Properties p;

	public HotelBooking() throws IOException {

		File f = new File(
				"C:\\Users\\Derin\\eclipse-workspace\\Adactin\\src\\main\\java\\com\\credentials\\cred.properties");

		FileInputStream fis = new FileInputStream(f);

		p = new Properties();

		p.load(fis);

	}

	@Given("^user launches the browser and gets the url$")
	public void user_launches_the_browser_and_gets_the_url() throws Throwable {
		getUrl("https://adactinhotelapp.com/index.php");
	}

	@When("^user enters the valid username in the usernameField$")
	public void user_enters_the_valid_username_in_the_usernameField() throws Throwable {
		sendKeys(pom.getL().getUsername(), p.getProperty("username"));
	}

	@When("^user enters the valid password in the passwordField$")
	public void user_enters_the_valid_password_in_the_passwordField() throws Throwable {
		sendKeys(pom.getL().getPassword(), p.getProperty("password"));
	}

	@Then("^user clicks the loginButton and user navigates to the Homepage$")
	public void user_clicks_the_loginButton_and_user_navigates_to_the_Homepage() throws Throwable {
		click(pom.getL().getLoginbtn());
	}

	@When("^user selects the location from the dropdown$")
	public void user_selects_the_location_from_the_dropdown() throws Throwable {
		dropDown(pom.getSh().getLocation(), "value", "Melbourne");
	}

	@When("^user selects the hotel from the dropdown$")
	public void user_selects_the_hotel_from_the_dropdown() throws Throwable {
		dropDown(pom.getSh().getHotels(), "value", "Hotel Sunshine");
	}

	@When("^user selects the room type from the dropdown$")
	public void user_selects_the_room_type_from_the_dropdown() throws Throwable {
		dropDown(pom.getSh().getRoomtype(), "value", "Super Deluxe");
	}

	@When("^user selects the number of rooms from the dropdown$")
	public void user_selects_the_number_of_rooms_from_the_dropdown() throws Throwable {
		dropDown(pom.getSh().getNumberofroom(), "value", "1");
	}

	@When("^user enters the check in date$")
	public void user_enters_the_check_in_date() throws Throwable {
		clear(pom.getSh().getCheckin());
		sendKeys(pom.getSh().getCheckin(), "25/05/2022");
	}

	@When("^user enters the check out date$")
	public void user_enters_the_check_out_date() throws Throwable {
		clear(pom.getSh().getCheckout());
		sendKeys(pom.getSh().getCheckout(), "26/05/2022");
	}

	@When("^user selects the number of adults per room from the dropdown$")
	public void user_selects_the_number_of_adults_per_room_from_the_dropdown() throws Throwable {
		dropDown(pom.getSh().getAdult(), "value", "1");
	}

	@When("^user selects the number of children per room from the dropdown$")
	public void user_selects_the_number_of_children_per_room_from_the_dropdown() throws Throwable {
		dropDown(pom.getSh().getChildren(), "value", "0");
	}

	@Then("^user clicks the Search button and navigates to the Select Hotel page$")
	public void user_clicks_the_Search_button_and_navigates_to_the_Select_Hotel_page() throws Throwable {
		click(pom.getSh().getSearchbtn());
	}

	@When("^user selects the hotel by clicking the radio button$")
	public void user_selects_the_hotel_by_clicking_the_radio_button() throws Throwable {
		click(pom.getSth().getRadio());
	}

	@Then("^user clicks the Continue button and navigates to the Book a Hotel page$")
	public void user_clicks_the_Continue_button_and_navigates_to_the_Book_a_Hotel_page() throws Throwable {
		click(pom.getSth().getContinuebtn());
	}

	@When("^user enters the first name in the firstnameField$")
	public void user_enters_the_first_name_in_the_firstnameField() throws Throwable {
		sendKeys(pom.getBh().getFirstname(), "Kirushma");
	}

	@When("^user enters the last name in the lastnameField$")
	public void user_enters_the_last_name_in_the_lastnameField() throws Throwable {
		sendKeys(pom.getBh().getLastname(), "S");
	}

	@When("^user enters the address details in the Billing address Field$")
	public void user_enters_the_address_details_in_the_Billing_address_Field() throws Throwable {
		sendKeys(pom.getBh().getBillingaddress(), "Chennai");
	}

	@When("^user enters the credit card number in the credit card no Field$")
	public void user_enters_the_credit_card_number_in_the_credit_card_no_Field() throws Throwable {
		sendKeys(pom.getBh().getCreditcard(), "1234567891234567");
	}

	@When("^user selects the credit card type from the dropdown$")
	public void user_selects_the_credit_card_type_from_the_dropdown() throws Throwable {
		dropDown(pom.getBh().getCredittype(), "value", "VISA");
	}

	@When("^user enters the Expiry date from the Select month and Select year dropdowns$")
	public void user_enters_the_Expiry_date_from_the_Select_month_and_Select_year_dropdowns() throws Throwable {
		dropDown(pom.getBh().getExpirymonth(), "value", "7");
		dropDown(pom.getBh().getExpiryyear(), "value", "2022");
	}

	@When("^user enters the CVV number in the CVV number Field$")
	public void user_enters_the_CVV_number_in_the_CVV_number_Field() throws Throwable {
		sendKeys(pom.getBh().getCvv(), "123");
	}

	@Then("^user clicks the Book now Button and navigates to the Booking confirmation page$")
	public void user_clicks_the_Book_now_Button_and_navigates_to_the_Booking_confirmation_page() throws Throwable {
		Thread.sleep(3000);
		click(pom.getBh().getBooknowbtn());
	}

	@When("^user clicks the Log out Button$")
	public void user_clicks_the_Log_out_Button() throws Throwable {
		Thread.sleep(6000);
		click(pom.getLo().getLogoutbtn());
	}

	@Then("^user account log out from the application and navigates to Login again page$")
	public void user_account_log_out_from_the_application_and_navigates_to_Login_again_page() throws Throwable {
	}

}
