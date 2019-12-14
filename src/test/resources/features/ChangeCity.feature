Feature: Change city

  Scenario Outline: User changes the city <location>
    Given The Andy's pizza main page is displayed
    When user navigate on "current city button"
    Then dropdownmenu peears
    When user click on another <location>
    Then current location field changes to chosen

    Examples:
      | location |
      | Balti    |
      | Chisinau |
