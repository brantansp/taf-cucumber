@webtest
Feature: To check if the webpages are loading

  Scenario Outline: To check if the webpages are loading
    Given User is on the Documentation page
    Then User click on "<page>"
    Examples:
      | page               |
      | Selenium with Java |
      | JavaScript         |