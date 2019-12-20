Feature:

@aa
  Scenario: Top bar menu functionality
    Given "HomePage" is opened
    When user clicks on "feedbackButton" button
    Then "FeedbackPage" is opened
    When user clicks on "contactsButton" button
    Then "ContactsPage" is opened
    When user clicks on "deliveryButton" button
    Then "DeliveryPage" is opened