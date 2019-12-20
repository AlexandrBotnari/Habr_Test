Feature: User look through services information
  @Alex
  @ServicesAB
  Scenario: User open every services page
    Given "HomePage" is opened

    When user navigate on "services"
    Then dropdown menu appears
    When user clicks on "services" button
    Then "PrivateEventsPage" is opened

    When user navigate on "services"
    Then dropdown menu appears
    When user clicks on "WeAreLookingForTasters" button
    Then "LookingforTastersPage" is opened

   When user navigate on "services"
    Then dropdown menu appears
    When user clicks on "Program_F2F" button
    Then "Friend2FriendPage" is opened

    When user navigate on "services"
    Then dropdown menu appears
    When user clicks on "ClientCard" button
    Then "ClientCardPage" is opened

    When user navigate on "services"
    Then dropdown menu appears
    When user clicks on "CorporateClient" button
    Then "CorporateClientPage" is opened

    When user navigate on "services"
    Then dropdown menu appears
    When user clicks on "KidsParties" button
    Then "KidsPartiesPage" is opened

    When user navigate on "services"
    Then dropdown menu appears
   When user clicks on "Banquets" button
    Then "BanquetsPage" is opened