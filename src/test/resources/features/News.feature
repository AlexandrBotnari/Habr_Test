@olea
Feature: News

  Background:
    Given "HomePage" is opened
  Scenario: Verify a news is opened and back to news

    When user clicks on "news" button
    Then "NewsPage" is opened
    When user clicks on "seeMore" button
    Then a news is displayed
