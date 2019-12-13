Feature: Order lunch from Andy's pizza

  Background:
    Given Open "Lunch" page

    @Success
  Scenario:Add lunch to shopping cart(basket) at present day
      Given The Andy's pizza main page is displayed
    When customer tries to add lunch from current day
    And at the available time
    Then The choosen lunch pack stores in the cart





