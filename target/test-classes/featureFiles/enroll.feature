Feature: EnrollmentTest

  Background:
    Given I am on Home page
    When I click Enroll Now on Home page

  @smoke
  Scenario: Successful enrollment with valid data
    Then I verify the page title is "Sign Up- Agile1Tech"
    And the Course Enrollment Form is displayed

  @smoke
  Scenario: Enrollment form submission
    Given I am on Enroll page
    When I enter FirstName
    And I enter LastName
    And I enter PhoneNumber
    And I enter StreetAddress
    And I enter City
    And I enter State
    And I enter PostalCode
    And I select CountryIndex
    And I enter enrollemail
    And I enter enrollpassword
    And I enter confirmpassword
    And I select CourseIndex
    And I select Terms & Conditions checkbox
    And I click on Enroll Now button
@smoke
  Scenario Outline: Fill out enrollment form
    Given I am on Enroll page
    When I enter "<FirstName>" as First Name
    And I enter "<LastName>" as Last Name
    And I enter "<PhoneNumber>" as Phone Number
    And I enter "<StreetAddress>" as Street Address
    And I enter "<City>" as City
    And I enter "<State>" as State
    And I enter "<PostalCode>" as Postal Code
    When I select country at index <CountryIndex>
    And I enter "<enrollemail>" as Email
    And I enter "<enrollpassword>" as Password
    And I enter "<confirmpassword>" as Confirm Password
    And I select Course at index <CourseIndex>
    And I select Terms & Conditions checkbox
    And I click on Enroll Now button

    Examples:
      | FirstName | LastName | PhoneNumber | StreetAddress    | City      | State | PostalCode | enrollemail    | enrollpassword | confirmpassword | CountryIndex | CourseIndex |
      | JOHN      | SMITH    | 5558889999  | 2333 TEST STREET | FAIRFAX   | VA    | 22033      | test@gmail.com | UUUXXX45       | UUUXXX45        | 1            | 3           |
      | Lea       | KOON     | 7779876543  | 666 MAIN STREE   | CHANTILLY | VA    | 20345      | YYY@GCR.COM    | BEAUTIFUL      | BEAUTIFUL       | 2            | 2           |
