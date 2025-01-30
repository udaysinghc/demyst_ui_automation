Feature: Login test

  @html
  Scenario Outline:  Verify HTML5 validation for invalid data
    Given user on the login page
    When user enter email "<EmailID>", password "<Password>"
    Then click on the continue button
    Then verify the error message "<ErrorMessage>"
    Examples:
      | EmailID        | Password | ErrorMessage                                                          |
      |                |          | Please fill out this field.                                           |
      | test@gmail.com |          | Please fill out this.                                                 |
      | test           |          | Please include an '@' in the email address. 'test' is missing an '@'. |
      |                | test     | Please fill out this field.                                           |

  @non-html
  Scenario Outline: Verify invalid credentials error message
    Given user on the login page
    When user enter email "<EmailID>", password "<Password>"
    Then click on the continue button
    Then I should see error message for "<invalidUser>"
    Examples:
      | EmailID        | Password  | invalidUser                |
      | uday@gmail.com | Test@1234 | Invalid Email or password. |