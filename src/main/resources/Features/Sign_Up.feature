Feature: To sign up functionality

  Scenario: Verify that User Can Sign Up Successfully
  #Given open the web site and go to "https://www.demoblaze.com/"
    When click on sign up
    When user sign up with valid username and password
    And click on sign up button
    Then sign up successfully

    Scenario: Verify that the user can log in successfully
      #Given open the web site and go to "https://www.demoblaze.com/"
      When click on loginx`
      When user fill username and password
      And click on login button
      Then user login successfully