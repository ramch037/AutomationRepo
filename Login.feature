Feature: Login Functionality
As a registered user,
I want to login to my account,
To view my profile page and check my previous orders

Scenario: Login with valid credentials

Given I am on the home page and navigated to the account login page.
When I enter a valid user name "Ramakrishna@gmail.com"
And I enter a valid password "123Abc@"
And I click on the Login button
Then I should be redirected to the Profile page
And I can see the Previous orders section


