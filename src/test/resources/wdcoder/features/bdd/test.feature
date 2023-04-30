Feature: test
  this is a sample feature for testing

  @scenario1
  Scenario: this non-parameterized test
    this is a sample non parameterized test

    Given test username
    * test success
    Then test usernames
    * test failure

  Rule: Login from login page
    Background: User is on the login page
      Given user

    Scenario Outline: Testing parameter
      this is a sample scenario outline to test

      Given username "<username>"
      Then print username

      @preprod
      Examples:
      |username|
      |ben     |
      |gwen    |

      @prod
      Examples:
      |username|
      |test    |