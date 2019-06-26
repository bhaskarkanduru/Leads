Feature: Leaftaps CreateLead
Background:
Given Open the Browser
And Maximise the Browser
And set the Timeouts
And Load the URL

Scenario Outline: TC001_Positive Leaftaps CreateLead

Given Enter the UserName as <username>
And Enter the Password as <password>
When Click on the Login Button
Then Verify Login Successful

Examples:
|username|password|
|Demosalesmanager|crmsfa|
|Democsr|crmsfa|
