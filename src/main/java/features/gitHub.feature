#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login to Github site
  
  @tag1
  Scenario: Login to GitHub
    Given user is on GitHub login page 
  # Test CaseI  
  # When user enters username and password
  # Test Case II
    When user enter "amita76" and "Amitsa@123"
    And user clicks on Signin button 
    Then user lands on homepage


