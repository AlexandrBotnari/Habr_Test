Feature: User manages product in basket
  Scenario: User changes the quantity of added products
    Given The Andy's pizza main page is displayed
    And any product(s) are added in basket
    When user navigate on basket icon
    Then dropdown menu appears
    When user click on "+" button
    Then quantity of this product changes to one more
    When user click on "-" button
    Then quantity of this product changes to one less