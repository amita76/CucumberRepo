Feature: user register 

Scenario Outline: user gets registered

Given when user is register page
Then user enters contact information "<firstname>" and "<lastname>" and "<phone>" and "<email>"
Then user enters mailing information "<address>" and "<city>" and "<state>" and "<postalCode>" and select country
Then user enters user information "<username>" and "<password>" and "<confirmPassword>"
And user clicks on submit button

Examples: 
	| firstname | lastname | phone | email | address | city | state | postalCode | username | password | confirmPassword |
	| Amita | Saraf | 123456789 | abc@123 | warje | Pune | MS | 411054 | amitsa | abc@123 | abc@123 |
	| Nanu | Saraf | 123456111 | xyz@123 | MOG Lines | Indore | MP | 411054 | nanu | xyz@123 | xyz@123 |
