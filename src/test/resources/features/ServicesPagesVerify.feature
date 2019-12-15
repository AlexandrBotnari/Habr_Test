Feature: User look through services information
  Background:
    Given "Home" page is opened
  Scenario: User open every services page

    When user navigate to "Services" button
    Then dropdown menu appears

    When user clicks on "Services" button
    Then private event page opens

    When user clicks on "WeAreLookingForTasters" button
    Then "We Are Looking For Tasters" is opened
    When user clicks on "Program_F2F" button
    Then "We Are Looking For Tasters" is opened
    When user clicks on "ClientCard" button
    Then "We Are Looking For Tasters" is opened
    When user clicks on "CorporateClient" button
    Then "We Are Looking For Tasters" is opened
    When user clicks on "KidsParties" button
    Then "We Are Looking For Tasters" is opened
    When user clicks on "Banquets" button
    Then "We Are Looking For Tasters" is opened