@DemoRun
@olea
Feature: Restaurants filter

  Background:
    Given "HomePage" is opened

  Scenario:  Restaurants filter
    When user clicks on "restaurants" button
    Then "RestaurantsPage" is opened
    When user selects random a filter
    Then verify Restaurants list is filtered