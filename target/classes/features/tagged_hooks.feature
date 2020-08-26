Feature: Test Tagged Hooks
 
@First 
Scenario: user is First Scenario
 Given user is the first step
 When user is the second step
 Then user is the third step
 
@Second	
Scenario: user is Second Scenario
 Given user is the first step
 When user is the second step
 Then user is the third step
 
@Third	
Scenario: user is Third Scenario
 Given user is the first step
 When user is the second step
 Then user is the third step