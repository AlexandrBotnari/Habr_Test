Feature:
  Background:
    Given "Home" page is opened

  @aa
  Scenario: Select random product from product list
    When User clicks on "Menu" button
    And Selects random category from "Menu" list
    Then User adds random product from category to cart


  @aa
  Scenario: Check product is presented on cart page and removal possibility
    When User opens product cart page
    Then Removes one product from cart


  @aa
  Scenario: Check if product preview functionality is operating
    When User clicks on "Menu" button
    And Selects random category from "Menu" list
    Then User click on random product image in order to open preview mode


  @aa
  Scenario: Career Page functionality
    When User opens Career page
    And clicks on random checkboxes


  @aa
  Scenario: Top bar menu functionality
    When user clicks on Feedback button
    Then Feedback Page is displayed
    When user clicks on Contacts button
    Then Contacts page is displayed
    When user clicks on Delivery button
    Then Delivery page is displayed

