Feature: Login Functionality
  As a registered user,
  I want to login to my account.

  Scenario Outline: Login with invalid credentials
    Given I am on the home page and navigated to the account login page
    When I enter an invalid user name <userName>
    And I enter an invalid password <password>
    And I click on the Login button
    Then I should not be logged in

    Examples:
      | userName               | password  |
      | Ramakrishna@gmail.com  | 123Abc@   |
      | Prasad@gmail.com       | Xyz@789   |

  Scenario Outline: Login with empty credentials
    Given I am on the home page and navigated to the account login page
    When I enter an empty user name <userName>
    And I enter an empty password <password>
    And I click on the Login button
    Then I should not be logged in

    Examples:
      | userName | password |
      |          |          |
