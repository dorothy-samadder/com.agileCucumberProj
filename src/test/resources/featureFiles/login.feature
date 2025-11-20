Feature: Logintest
# insted of adding same stepes for both test, the step can be under Bacground and it will execute before each test.

  Background:
    Given I am on Home page
    When I click on Sign In link.
    Then I navigate to Sign in page.
@smoke
  Scenario: Create Profile
    And I insert valid email
    And I inset valid password
    When I click on login button
    Then I should be navigated to the Login page.
# data provider setup for email and password


@smoke
  Scenario Outline: Login
    When I insert valid '<email>'
    And I inset valid '<password>'
    When I click on login button
    Then I should be navigated to the Login page.

    Examples:
      | email         | password |
      | abc@gmail.com | uuu77777 |
      | ghn@aol.com   | yyyy4444 |
      | jhk@yahoo.com | ttti6666 |

      