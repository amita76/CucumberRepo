Feature: MediBuddy portal Login scenario

Scenario: user login to the medi buddy portal


Given user is on Medi login page
Then user enters "Amita.Saraf@harman.com" and "Amitsa@123"
Then user clicks on Medi Sign In button
Then user verifies the title of the Medi page

