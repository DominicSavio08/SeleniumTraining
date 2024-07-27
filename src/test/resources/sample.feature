Feature: To validate the login functionality of facebook application
Background:
Given To Launch the browser and maximise window

Scenario: To validate the login with valid email and invalid password

When To launch the url of the facebook application
And To pass the valid user name in email field
And To pass the invalid password in password field
And To click the login button
And To check wheather navigate to home page or not
Then To close the Browser


Scenario Outline: To validate the positive and negative combination

When User has to hit the facebook url
And user has to pass the data "<emailDatas>" in email field
And user has to pass the data "<passwordDatas>" in password field
And user has to click the login button
Then user has to close the browser

Examples:
|emailDatas| passwordDatas|
|vinistensanyo777@gmail.com|password@123|
|abc@gmail.com|54321|
|dominicsavio@gmail.com|password12345|
|adminsoftware@gmail.com|password@abcxyz|
|seleniumsoftware@yahoo.mail|4537YAHOO|
