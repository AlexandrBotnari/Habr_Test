@DemoRun
@Alex
Feature: Order lunch from Andy's pizza

  Background:
    Given "HomePage" is opened
  @LunchAB
  Scenario:User opens lunch page
    When user navigate on "menu"
    And user clicks on "menu" button
    Then  menu map appears
    When user clicks on "specials" button
    Then "SpecialsPage" is opened
    When user clicks on "lunch" button
    Then "LunchPage" is opened
    When user clicks on "order" button
    Then validate time restriction





