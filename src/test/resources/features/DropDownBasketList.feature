@Alex
Feature: User manages product in basket

  Background: The Andy's pizza main page is displayed
  @DropDMBasketMenuAB
  Scenario: User changes the quantity of added products
    Given any product are added in basket

    When "HomePage" is opened
    And user navigate on "cartButton"
    Then dropdown cart menu appears
    When user clicks on "plus" button
    Then quantity of this product changes to one more
    When user clicks on "minus" button
    Then quantity of this product changes to one less
    When user clicks on "orderButton" button
    Then "CartPage" is opened
