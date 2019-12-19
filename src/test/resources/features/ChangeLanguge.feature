Feature: Change language

  @ChangeLanguageAb
  Scenario Outline: User  changes language to Russian and Romanian
    Given "HomePage" is opened
    When user clicks on "<lang>" button
    Then page changes language to "<lang>"

    Examples:
      | lang |
      | Ru   |
      | Ro   |







