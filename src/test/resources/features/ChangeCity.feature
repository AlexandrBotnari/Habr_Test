Feature: Change city
@ChangeCityAB
  Scenario Outline: User changes the city <location>
  Given "Home" page is opened

    When user navigate on "current city button"
    Then drop down menu appears
    When user clicks on "<location>" button
    Then current "<location>" field changes to chosen

    Examples:
      | location |
      | Balti    |
      | Chisinau |
