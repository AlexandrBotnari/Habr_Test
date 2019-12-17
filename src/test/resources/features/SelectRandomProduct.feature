Feature:

  @aa
  Scenario: Select random product from product list
    When User clicks on "Menu" button
    And Menu appears
    Then Selects random category from "Menu" list
    And Category appears
    Then User adds random product from category to cart

