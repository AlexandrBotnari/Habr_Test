Feature: News
  Background:
    Given "Home" page is opened
  Scenario: Verify a news is opened and back to news

    When user tabs on News link
    Then "News" page is opened
    When user clicks on "See more" button
    Then a news is displayed
    When user clicks on "Back to news" button
    Then "News" page is opened
