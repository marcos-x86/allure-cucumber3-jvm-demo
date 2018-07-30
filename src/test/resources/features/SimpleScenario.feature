Feature: Login to Google Services

  In order to test the Google Services Login
  As a user
  I want to verify that Google Services Login is working properly

  @skip
  Scenario: Login with a valid account.
    Given I enter to Google Services Login page
    When I fill the username field with "user00@gmail.com"
    And I fill the password field with "passw0rd00"
    And I click on login button
    Then I am in the login page
