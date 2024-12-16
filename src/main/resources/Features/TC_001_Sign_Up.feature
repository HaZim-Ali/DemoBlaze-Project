Feature: To sign up functionality

  Scenario: Verify that User Can Sign Up Successfully
    Given click on sign up
    When user sign up with valid username and password
    And click on sign up button
    Then sign up successfully

    Scenario: Verify that the user can log in successfully
      Given click on login
      When user fill username and password
      And click on login button
      Then user login successfully and navigate to home page