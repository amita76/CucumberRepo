Feature: Katalon-Cura Login feature 

# 5 - Data Table with Map<k,V>
Scenario: Katalon-Cura Login Test Scenario

Given user loads Katalon-Cura application
When user is on Katalon-Cura Home page
Then user enter credentials to Katalon-Cura login page
	| username | password 					|
	| John Doe | ThisIsNotAPassword |

Then user clicks on Login of Katalon-Cura