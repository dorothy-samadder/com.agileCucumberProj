Feature: Logintest
# insted of adding same stepes for both test, the step can be under Bacground and it will execute before each test.

  Background:
    Given I am on Home page

  @smoke
  Scenario: valid Scenario
    When I insert valid email
    And I inset valid password
    When I click on login button
    Then I should be navigated to the Login page.
# data provider setup for email and password

  @smoke
  Scenario Outline:
    When I insert valid '<email>'
    And I inset valid '<password>'
    When I click on login button
    Then I should be navigated to the Login page.

    Examples:
      | email         | password |
      | abc@gmail.com | uuu77777 |
      | ghn@aol.com   | yyyy4444 |
      | jhk@yahoo.com | ttti6666 |
