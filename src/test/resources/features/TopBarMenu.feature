Feature:

@aa
  Scenario: Top bar menu functionality
    Given "HomePage" is opened
    When user clicks on "feedbackButton" button
    Then Feedback Page is displayed
    When user clicks on "contactsButton" button
    Then Contacts page is displayed
    When user clicks on "deliveryButton" button
    Then Delivery page is displayed