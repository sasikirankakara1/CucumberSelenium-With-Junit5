Feature: Verify Registration Functionality
Scenario Outline: User attempts to register by providing necessary fields
Given The User is on the homepage
When The User attempts to click MyAccount Drop menu 
And The User attempts to click Register
And The User enters "<FirstName>" in the firstname input field
And The User enters "<LastName>" in the lastname input field
And The User enters "<E-Mail>" in the email input field
And The User enters "<Telephone>" in the telephone input field
And The User enters "<Password>" in the password input field
And The User enters "<Confirm-Password>" in the confirm password input field
And The User select Privacy Policy checkbox on the form 
And The User attempts to clicks Continue Button 
Then The account should be created successfully 
And The User should  see a success message containing "<Account Success>"
Examples:
| FirstName | LastName | E-Mail | Telephone | Password | Confirm-Password | Account Success |
| Hello | Kiran | assa1234@gmail.com| 555457 | Hellos | Hellos | Your Account Has Been Created! |