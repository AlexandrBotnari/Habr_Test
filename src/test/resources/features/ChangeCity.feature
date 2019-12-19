Feature: Change city

  @ChangeCityAB
  Scenario Outline: User changes the city <location>
    Given "HomePage" is opened

    When user navigate on "cityCurrent"
    Then drop down menu appears
    When user clicks on "<location>" button
    Then current "<location>" field changes to chosen

    Examples:
      | location |
      | balti    |
      | chisinau |
