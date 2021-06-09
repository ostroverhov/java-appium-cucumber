Feature: Tech support

  Scenario Outline: Send support request
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
    And click side menu item TECHSUPPORT
    Then tech support screen is opened

    When click send button from support screen
    And type message for support <supportMessage>
    And click send support message
    Then check support message contains text <supportMessage>

    Examples:
      | supportMessage |
      | Hello world    |


