Feature: Login Functionality

@smoke
Scenario Outline: Verification of Login Functionality
Given user navigate to the website 
When user navigate to login page
And user enter the "<username>" username
And user enter the "<password>" password
Then login must be succesful

Examples:
|username|password|
|mbshitole|jkessls|
|shitolemb|maepaes|
 
