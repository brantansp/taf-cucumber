Feature: Test the ui application
  @webtest
  Scenario Outline: To test the UI application
    Given User opening the site "https://wdcoder.tech"
    When User clicks on "<page>"
    Then User should see the "<page>"
    Examples:
      | page           |
      | Driver Methods |
      #| Common         |