Feature: Feature to login

  Scenario: Login functionality with valid credentials
    Given User is on login page
    When User should enter the username and password
    And User should able to click the login button
    Then User should navigate to Dashboard page
