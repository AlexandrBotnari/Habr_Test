Feature:

 @aa1
  Scenario: Check product is presented on cart page and removal possibility
    When User opens product cart page
    Then Removes one product from cart
    And Check that product where removed