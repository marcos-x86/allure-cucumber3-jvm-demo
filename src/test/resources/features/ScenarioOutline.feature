Feature: Login to Google Services

  In order to test the Google Services Login
  As a user
  I want to verify that Google Services Login is working properly

  Scenario Outline: Login with different credentials
    Given I enter to Google Services Login page
    When I fill the username field with "<Email>"
      And I fill the password field with "<Password>"
      And I click on login button
    Then I am in the login page
    Scenarios:
      | Email           | Password   |
      | user01gmail.com | passw0rd01 |
      | user02gmail.com | passw0rd02 |
      | user03gmail.com | passw0rd03 |
