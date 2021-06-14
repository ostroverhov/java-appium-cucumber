Feature: Check languages

  Scenario Outline: Change language
    Given main screen is opened
    When click city label
    And click ok on alert from Select City screen
    Then select city screen is opened

    When type city name <cityName>
    And select first available city
    Then check name city <cityName>

    Examples:
      | cityName |
      | Dubai    |
      | Milano   |
      | Warsaw   |
      | Москва   |