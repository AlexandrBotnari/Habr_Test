Feature: Order lunch from Andy's pizza

  Background:
    Given "Home" page is opened

    @Success
  Scenario:Add lunch to shopping cart(basket) at present day

    When customer tries to add lunch from current day
    And at the available time
    Then the chosen lunch pack stores in the cart





