Feature: Login form

  Scenario: Login and check name
    Given main screen is opened
    When click sandwich menu button
    Then side menu is opened

    When click side menu item STATUS
    Then login screen is opened

    When click register button
    Then email text box is displayed

    When type valid email and password
    And click sign in button
    Then main screen is opened

    When click sandwich menu button
    Then check status user should be Full access

    When click side menu item SETTINGS
    Then settings screen should be opened
    And check user data from settings screen