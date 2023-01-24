Feature: Login

  Scenario: User should be able to login with valid credentials

    Given I am on the homepage
    When I enter valid username
    And I enter valid password
    When I click the login button
    And I confirm I am not a robot
    #Then I should be logged in successfully