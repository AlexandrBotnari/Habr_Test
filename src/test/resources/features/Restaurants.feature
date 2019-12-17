Feature:
Background:
Given "Home" page is opened
  @olea
  Scenario:  Restaurants filter
    When user clicks on "Restaurants " button
    Then "Restaurants " page is opened
    When user selects random a filter
    Then verify Restaurants list is filtered