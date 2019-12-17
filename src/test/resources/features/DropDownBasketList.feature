Feature: User manages product in basket
  Background: The Andy's pizza main page is displayed

  Scenario: User changes the quantity of added products
    Given any product are added in basket

    When user navigate on basket icon
    Then dropdown menu appears
    When user clicks on "minus" button
    Then quantity of this product changes to one "less"
    When user clicks on "plus" button
    Then quantity of this product changes to one "more"