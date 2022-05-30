Feature: user booking a hotel using Adactin

Scenario: User login to application with valid username and password
Given user launches the browser and gets the url
When user enters the valid username in the usernameField
And user enters the valid password in the passwordField
Then user clicks the loginButton and user navigates to the Homepage


Scenario: user searching a hotel
When user selects the location from the dropdown
And user selects the hotel from the dropdown
And user selects the room type from the dropdown
And user selects the number of rooms from the dropdown
And user enters the check in date
And user enters the check out date
And user selects the number of adults per room from the dropdown
And user selects the number of children per room from the dropdown
Then user clicks the Search button and navigates to the Select Hotel page


Scenario: user selecting a hotel
When user selects the hotel by clicking the radio button
Then user clicks the Continue button and navigates to the Book a Hotel page

Scenario: user booking a hotel
When user enters the first name in the firstnameField
And user enters the last name in the lastnameField
And user enters the address details in the Billing address Field
And user enters the credit card number in the credit card no Field
And user selects the credit card type from the dropdown
And user enters the Expiry date from the Select month and Select year dropdowns
And user enters the CVV number in the CVV number Field
Then user clicks the Book now Button and navigates to the Booking confirmation page


Scenario: user log out of the Application
When user clicks the Log out Button
Then user account log out from the application and navigates to Login again page