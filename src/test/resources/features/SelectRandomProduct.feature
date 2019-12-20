Feature: Andy's Test


  Scenario: Select random product from product list
    Given "HomePage" is opened
    When user clicks on "menuButton" button
    And Menu appears
    Then Selects random category from Menu list
    And Category appears
    Then User adds random product from category to cart

