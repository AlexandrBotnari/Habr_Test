Feature:
Background:
  Given "Home" page is opened

  Scenario: Verify Log In with correct credentials
    When User clicks on My Account dropdown
    And User clicks on "Login" button
    Then "Login" page is opened
    When User enters "" and ""
    And User clicks on "Login" button