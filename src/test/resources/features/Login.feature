Feature:
Background:
  Given "Home" page is opened

  Scenario: Verify Log In with correct credentials
    When user clicks on "Login" button
    Then "Login" page is opened
    When user enters "" and ""
    And user clicks on "Login1" button
    Then user is loged in
