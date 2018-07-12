Feature: This feature is about login into Account

  Scenario: Successfull log-in
    Given I have opened homepage
    When I select My account menu
      And I select Login button
      And I enter Email address
      And I enter Password
      And I select Login button
    Then User is logged into Account


    Scenario: Unsuccessfull log-in
      Given I have opened homepage
      When I select My Account menu
        And I select Login button
        And I select Login button
      Then User is logged into Account