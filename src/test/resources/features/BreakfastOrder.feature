@olea
Feature: Breakfast order

  Background:
    Given "HomePage" is opened
  Scenario:Verify warning message than select a random dish from 11-00 AM to 7-00 AM
    When user clicks on "menu" button
    Then Menu appears
    When  user clicks on "specials" button
    Then "SpecialsPage" is opened
    When user clicks on "breakfast" button
    Then "BreakfastPage" is opened
    When user clicks on "order" button
    Then warning message "This dish is available for order from 07:00 to 11:00" is displayed
