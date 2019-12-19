Feature:

  @aa
  Scenario: Career Page functionality
    Given "HomePage" is opened
    When user clicks on "careerPage" button
    And "CareerPage" is opened
    And user navigate on "informationListBlock"
    And fills in info
    And user clicks on "restaurantTabButton" button
    Then clicks on random restaurant Checkboxes
    And user clicks on "factoryTabButton" button
    Then clicks on random factory Checkboxes
    Then clicks on random checkboxes on the page