Feature: Order lunch from Andy's pizza

  Background:
    Given "HomePage" is opened
  @Alex
  @LunchABPosistive
  Scenario:User opens lunch page
    When user navigate on "menu"
    And user clicks on "menu" button
    Then  menu map appears
    When user clicks on "specials" button
    Then "SpecialsPage" is opened
    When user clicks on "lunch" button
    Then "LunchPage" is opened





