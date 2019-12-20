Feature: Andy's Test

@aa
  Scenario: Select random product from product list
    Given "HomePage" is opened
    When user clicks on "menu" button
    And Menu appears
    Then Selects random category from Menu list
    Then User adds random product from category to cart

