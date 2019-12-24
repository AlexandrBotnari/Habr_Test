@DemoRun
@Alex
Feature: Change language
  @ChangeLanguageAb
  Scenario Outline: User  changes language to <language>
    Given "HomePage" is opened
    When user clicks on "<lang>" button
    Then page changes language to "<lang>"

    Examples:
      | lang |language|
      | Ru   |Russian |
      | Ro   |Romanian|







