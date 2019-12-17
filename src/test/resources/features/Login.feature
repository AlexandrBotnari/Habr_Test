Feature:
Background:
  Given "Home" page is opened
  @olea
  Scenario: Verify Log In with correct credentials
    When user clicks on "Login" button
    Then "Login" page is opened
    When user enters "dochki_12@mail.ru" and "andysframe21"
    And user clicks on "Login1" button
    Then "Account" page is opened
