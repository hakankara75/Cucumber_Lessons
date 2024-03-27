@hiddenElements
Feature: hidden elements

  Scenario Outline: hidden elements
    Given As a user got to orange
    Then verify url
    And I enter username "<username>"
    And I enter password "<password>"
    When I click login button
    Then I verify in dashboard with "<dashboard text>"
    And I click admin link
    And I click add button
    And I select "<user role>" with user role dropdown
    And I select "<status>" with status dropdown
    And I write "<employee name>" with employee name box
    And I "<new user name>" with new user name box
    And I write "<new password>" with new password box
    And I write "<re new password>" with re new password box
    When I click save button
    Then I verify "<success message>" with success message box
    Examples:
      | username | password | dashboard text | user role | status  | employee name        | new user name | new password | re new password | success message    |
      | Admin    | admin123 | Dashboard      | Admin     | Enabled | Muhammad Haseeb 1935 | hakankara75     | 123456y      | 123456y         | Successfully Saved |