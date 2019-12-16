Feature: User look through services information

  Scenario: User open every services page
    Given The Andy's pizza main page is displayed

    When user navigate on "Services"
    Then dropdown menu appears
    When user clicks on "Services" button
    Then "Private Events" is opened

    When user navigate on "Services"
    Then dropdown menu appears
    When user clicks on "WeAreLookingForTasters" button
    Then "We Are Looking For Tasters" is opened

    When user navigate on "Services"
    Then dropdown menu appears
    When user clicks on "Program_F2F" button
    Then "Program_F2F" is opened

    When user navigate on "Services"
    Then dropdown menu appears
    When user clicks on "ClientCard" button
    Then "ClientCard" is opened

    When user navigate on "Services"
    Then dropdown menu appears
    When user clicks on "CorporateClient" button
    Then "CorporateClient" is opened

    When user navigate on "Services"
    Then dropdown menu appears
    When user clicks on "KidsParties" button
    Then "KidsParties" is opened

    When user navigate on "Services"
    Then dropdown menu appears
    When user clicks on "Banquets" button
    Then "Banquets" is opened