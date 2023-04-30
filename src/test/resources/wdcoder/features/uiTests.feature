Feature: Test the ui application

  @webtest
  Scenario Outline: To tes the UI application
    Given User opening the site "https://wdcoder.tech"
    When User clicks on "<page>"
    Then User should see the "<page>"
    Examples:
      | page           |
      | Driver methods |
      | Common         |

  Scenario: Login to Admin portal
    Given User opening the site "https://wdcoder.tech/wp-admin"
    #Example for CustomDataTableType
    When User enter the username and password
      | username | password |
      | admin    | pnc@2K19 |
    And Clicking on login
    Then Admin panel should be displayed