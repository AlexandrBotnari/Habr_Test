Feature: Breakfast order
  Background:
    Given "Home" page is opened

  Scenario:Verify warning message than select a random dish  from 11:00 AM to 7:00 AM

    When user clicks on "Menu" button
    Then Menu container is opened
    And  user clicks on "Specials" button
    Then "Specials" page is opened
    When user clicks on "Breakfast" button
    Then "Breakfast" page is opened
    When user clicks on "Order" button
    Then warning message "This dish is available for order from 07:00 to 11:00" is displayed
    `