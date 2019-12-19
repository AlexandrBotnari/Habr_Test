Feature: Order lunch from Andy's pizza

  Background:
    Given "HomePage" is opened

  @LunchABPosistive
  Scenario:User opens lunch page
    When user navigate on "menuButton"
    And user clicks on "menuButton" button
    Then drop down menu appears
    When user clicks on "specials" button
    Then "SpecialsPage" is opened
    When user clicks on "lunchButton" button
    Then "LunchPage" is opened





