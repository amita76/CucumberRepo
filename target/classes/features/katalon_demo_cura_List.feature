Feature: katalon Login feature

 #  4 - Data Table with List<List<String>> - used only for single row data not for multiple data
 # This is example of Data Table without header and single row data
  Scenario: katalon Login Test Scenario
  
    Given user loads katalon application
    When user is on Home page
    Then user enter credentials to katalon login page
      | John Doe | ThisIsNotAPassword |
  
    Then user clicks  on Login
    

