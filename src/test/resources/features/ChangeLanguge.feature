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


#  @cl4Menu
#  Scenario Outline: Change <language> situated on "Menu" page
#    Given The Andy's pizza "Menu" page is displayed
#
#    When User press the <lang> button
#    Then "Menu" page refreshes
#    And "Menu" page sets language at <language>
#    Examples:
#      | lang | language |
#      | Ro   | Romanian |
#      | Ru   | Russian  |
#      | En   | English  |
#
#
#  @cl5Restaurant
#  Scenario Outline: Change <language> situated on "Restaurant" page
#    Given The Andy's pizza  "Restaurant" page is already opened
#
#    When User press the <lang> button
#    Then "Restaurant" page refreshes
#    And "Restaurant" page sets language at <language>
#
#    Examples:
#      | lang | language |
#      | Ro   | Romanian |
#      | Ru   | Russian  |
#      | En   | English  |
#
#  @cl6News
#  Scenario Outline: Change <language> situated on "News" page
#    Given The Andy's pizza  "News" page is already opened
#
#    When User press the <lang> button
#    Then "News" page refreshes
#    And "News" page sets language at <language>
#    Examples:
#      | lang | language |
#      | Ro   | Romanian |
#      | Ru   | Russian  |
#      | En   | English  |
#
#
#  @cl7Career
#  Scenario Outline: Change language situated on "Career" page
#    Given The Andy's pizza  "Career" page is already opened
#
#    When User press the <lang> button
#    Then "Career" page refreshes
#    And "Career" page sets language at <language>
#    Examples:
#      | lang | language |
#      | Ro   | Romanian |
#      | Ru   | Russian  |
#      | En   | English  |
#
#
#  @cl8ServicesPrivateEvents
#  Scenario Outline: Change language situated on "PrivateEvents" page
#    Given The Andy's pizza  "PrivateEvents" page is already opened
#
#    When User press the <lang> button
#    Then "PrivateEvents" page refreshes
#    And "PrivateEvents" page sets language at <language>
#
#    Examples:
#      | lang | language |
#      | Ro   | Romanian |
#      | Ru   | Russian  |
#      | En   | English  |
#
#  @cl9ServicesBanquets
#  Scenario Outline: Change language situated on "PrivateEvents" page
#    Given The Andy's pizza  "PrivateEvents" page is already opened
#
#    When User press the <lang> button
#    Then "PrivateEvents" page refreshes
#    And "PrivateEvents" page sets language at <language>
#
#    Examples:
#      | lang | language |
#      | Ro   | Romanian |
#      | Ru   | Russian  |
#      | En   | English  |
#
#  @cl10ServicesClient
#  Scenario Outline: Change language situated on "Client" page
#    Given The Andy's pizza  "Client" page is already opened
#
#    When User press the <lang> button
#    Then "Client" page refreshes
#    And "Client" page sets language at <language>
#
#    Examples:
#      | lang | language |
#      | Ro   | Romanian |
#      | Ru   | Russian  |
#      | En   | English  |
#
#  @cl118ServicesCorporateClient
#  Scenario Outline: Change language situated on "CorporateClient" page
#    Given The Andy's pizza  "CorporateClient" page is already opened
#
#    When User press the <lang> button
#    Then "CorporateClient" page refreshes
#    And "CorporateClient" page sets language at <language>
#
#    Examples:
#      | lang | language |
#      | Ro   | Romanian |
#      | Ru   | Russian  |
#      | En   | English  |
#
#  @cl12ServicesF2F
#  Scenario Outline: Change language situated on "F2F" page
#    Given The Andy's pizza  "F2F" page is already opened
#
#    When User press the <lang> button
#    Then "F2F" page refreshes
#    And "F2F" page sets language at <language>
#
#    Examples:
#      | lang | language |
#      | Ro   | Romanian |
#      | Ru   | Russian  |
#      | En   | English  |
#
#  @cl13ServicesKids
#  Scenario Outline: Change language situated on "Kids" page
#    Given The Andy's pizza  "Kids" page is already opened
#
#    When User press the <lang> button
#    Then "Kids" page refreshes
#    And "Kids" page sets language at <language>
#
#    Examples:
#      | lang | language |
#      | Ro   | Romanian |
#      | Ru   | Russian  |
#      | En   | English  |
#
#  @cl14ServicesLFT
#  Scenario Outline: Change language situated on "LookForTasters" page
#    Given The Andy's pizza  "LookForTasters" page is already opened
#
#    When User press the <lang> button
#    Then "LookForTasters" page refreshes
#    And "LookForTasters" page sets language at <language>
#
#    Examples:
#      | lang | language |
#      | Ro   | Romanian |
#      | Ru   | Russian  |
#      | En   | English  |


