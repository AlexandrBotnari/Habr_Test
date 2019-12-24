@DemoRun
Feature:

  @aa
  Scenario Outline: Career Page functionality
    Given "HomePage" is opened
    When user clicks on "careerPage" button
    Then "CareerPage" is opened
    When user fills in name = "<name>",Old = "<Old>",Phone = "<Phone>", Email = "<E-mail>"
     And choose some optional checkBoxes
    Then all inserted information is displayed in fields
    Examples:
      | name   | Old | Phone     | E-mail                    |
      | Andrei | 27  | 069123667 | nesuditestrogo@enterni.md |
      | Olga   | 15  | 078564234 | urehguhrehf@whh.com       |





