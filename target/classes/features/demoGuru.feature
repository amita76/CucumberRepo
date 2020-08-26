Feature: Login to Demo Guru99 site

#Simple I - Harcoding username password in StepDeinition
#Scenario: Login page
#When user is on Login page
#Then user enters username and password 
#And user clicks on the Login button

#Simple-II Harcoding username password in feature file
#Scenario: Login page
#When user is on Login page
#Then user entering "mngr279630" and "dEtuqYg" 
#And user clicks on the Login button

#III - With Scenario Outline and Examples keyword
#Scenario Outline:Login page
#When user is on Login page
#Then user put "<username>" and "<password>"
#And user clicks on the Login button
#
#Examples:
#	| username | password |
#	| mngr279630 | dEtuqYg |
#	| abc | xyz |

#IV - Data Table using raw()
Scenario: Login page
When user is on Login page
Then user enters credentials
	| mngr279630 | dEtuqYg |
	
And user clicks on the Login button

#V - If there is large data then we need to use Excel to store the test data insted of Data Table
# Need to use Apache POI for that 

