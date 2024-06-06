Feature: hooks
@user
    Scenario: user
      Given got to practice
      And click on shop
      When click on android basket button
      Then verify basket
  @admin
  Scenario: user
    Given got to practice
    And click on shop for admin
    When click on android basket button
    Then verify basket
