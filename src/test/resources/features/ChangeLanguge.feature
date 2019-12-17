Feature: Change language

  @cl
  Scenario Outline: User  changes language to <language>
    Given "Home" page is opened
    When user clicks on "<lang>" button
    Then page changes language to "<lang>"

    Examples:
      | lang | language |
      | Ru   | Russian  |
      | Ro   | Romanian |
      | En   | English  |






