Feature: KatalonCura Login feature

#1 - Simple form
Scenario: KatalonCura Login Test Scenario

Given user is already on login page
#And title of the login page is CURAHealthcareService
Then user enter username and password 
Then user clicks on login button
Then user is on home page

# 2 -Data driven without using Examples keyword
#Scenario: NewTours Login Test Scenario
#
#Given user is already on login page
##When title of the login page is CURAHealthcareService
#Then user enter "John Doe" and "ThisIsNotAPassword"
#Then user clicks on login button
#Then user is on home page




# 3 -Data driven with Examples keyword
#Scenario Outline: NewTours Login Test Scenario
#
#Given user is already on login page
#When title of the login page is Welcome: Mercury Tours
#Then user enter "<username>" and "<password>"   
#Then user clicks on login button
#Then user is on home page
#
#Examples:
#	|	username | password |
#	| admin  | mercury		|
#	| test     | test123  |

# 4 - Data Table 
#Scenario: NewTours Login Test Scenario
#
#Given user is already on login page
#When title of the login page is Welcome: Mercury Tours
#Then user enter credentials to login page
#	| admin | mercury |  
#	
#Then user clicks on login button
#Then user is on home page