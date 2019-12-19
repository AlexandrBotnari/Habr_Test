Feature: Login

  Background:
    Given "HomePage" is opened
#  @olea
  Scenario: Verify Log In with correct credentials
    When user clicks on "login" button
    Then "LoginPage" is opened
    When user enters "dochki_12@mail.ru" and "andysframe21"
    And user clicks on "login" button
    Then "AccountPage" is opened