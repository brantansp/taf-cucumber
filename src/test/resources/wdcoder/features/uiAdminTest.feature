Feature: Test the ui application
  @webtest @test
  Scenario: Login to Admin portal
    Given User opening the site "https://wdcoder.tech/wp-admin"
    #Example for CustomDataTableType
    When User enter the username and password
      | username | password |
      | admin    | pnc@2K19 |
    And Clicking on login
    Then Admin panel should be displayed