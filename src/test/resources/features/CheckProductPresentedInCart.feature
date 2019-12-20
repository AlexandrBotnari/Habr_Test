Feature: Andy's Test

@aa
  Scenario: Check product is presented on cart page and removal possibility
    Given "HomePage" is opened
    When user clicks on "menu" button
    And Random product added to cart
    When user navigate on "cart"
    Then user clicks on "order" button
    Then Removes one product from cart
    And Check that product where removed