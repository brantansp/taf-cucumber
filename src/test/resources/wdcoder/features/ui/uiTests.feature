@webtest
Feature: Test the ui application
  Scenario: To tes the UI application
    Given User opening the site "https://wdcoder.tech"
    When User clicks on "Driver methods"
    Then User should see the "Driver methods"