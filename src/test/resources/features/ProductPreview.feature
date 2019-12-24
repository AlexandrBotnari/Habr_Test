@DemoRun
Feature:

@aa
  Scenario: Check if product preview functionality is operating
    Given "HomePage" is opened
    When user clicks on "menu" button
    And Selects random category from Menu
    Then User click on random product image in order to open preview