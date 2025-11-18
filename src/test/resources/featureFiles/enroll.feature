Feature: EnrollmentTest

  Background:
    Given I am on Home page
    When I click Enroll Now on Home page
    And I navigate to Enroll page

 @smoke 
  Scenario: Successful enrollment with valid data
    Then I verify the page title is "Sign Up- Agile1Tech"
    And the Course Enrollment Form is displayed
    
@smoke
  Scenario: Enrollment form submission
    Given I am on Enroll page
    When I enter First Name
    And I enter Last Name
    And I enter Phone Number
    And I enter Street Address
    And I enter City
    And I enter State
    And I enter Postal Code
    And I select Country
    And I enter Email
    And I enter Password
    And I enter Confirm Password
    And I select Course
    And I select Terms & Conditions checkbox
    And I click on Enroll Now button
