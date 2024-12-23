Feature: To sign up functionality
# Valid sign up
  Scenario: Verify that User Can Sign Up Successfully
    Given click on sign up
    When user sign up with valid username and password
    And click on sign up button
    Then sign up successfully
# valid log in
    Scenario: Verify that the user can log in successfully
      Given click on login
      When user fill username and password
      And click on login button
@zooz
# invalid sign up
      Scenario Outline: signing up with an existing username and verify the error message
        Given click on sign up
        When user sign up with invalid "<username>" and "<password>"
        And click on sign up button
        Then sign up not successfully

        Examples:
        |    username    |    password    |
        | invalid_user   |  Hazim123456789|
        | invalid        |  1234          |



