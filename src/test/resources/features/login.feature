Feature: This feature is about login into an account

  Scenario: Successfull log-in
    Given I have opened homepage
    When I select My account menu
      And I select Account menu Log in button
      And I enter Email address
      And I enter Password
      And I select Log in button
    Then user is logged into account

  Scenario: Unsuccessfull log-in
    Given I have opened homepage
    When I select My account menu
    And I select Account menu Log in button
    And I select Log in button
    Then user is logged into account