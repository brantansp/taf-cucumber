Feature: new

  @scenario1
  Scenario Outline: New customer logins
    Given client id as "<client>"
    Then client with client id logged has logged in
    Examples:
      | client |
      | amour  |
      | sean   |
      | ben    |