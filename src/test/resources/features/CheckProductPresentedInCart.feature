Feature: Andy's Test


  Scenario: Check product is presented on cart page and removal possibility
    Given "HomePage" is opened
    When user clicks on "menuButton" button
    And Random product added to cart
    When user navigate on "cartButton"
    Then user clicks on "orderButton" button
    Then Removes one product from cart
    And Check that product where removed