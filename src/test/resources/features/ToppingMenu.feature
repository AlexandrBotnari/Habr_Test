  Feature: Topping menu for pizza
    Background:
    Given "Home" page is opened

      Scenario: Add and remove a random topping
        When user clicks on "Menu" button
        And  user clicks on "Pizza" button
        Then "Pizza" page is opened
        When user adds random product
        Then Topping Menu is opened
        When user clicks on "plus" button
        Then verify topping is added
        When user clicks on "minus" button
        Then verify topping is removed


