@DemoRun
Feature:

@aa
  Scenario: Career Page functionality
    Given "HomePage" is opened
    When user clicks on "careerPage" button
    And "CareerPage" is opened
    And user navigate on "informationListBlock"
    And fills in data
    And user clicks on "restaurantTabButton" button
    Then clicks on random restaurant Checkboxes
    And user clicks on "factoryTabButton" button
    And clicks on random factory Checkboxes
    Then user clicks on "officeJobsButton" button
    And fills in info
    And clicks on random checkboxes on the page