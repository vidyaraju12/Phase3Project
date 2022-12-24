Feature: Sauce Lab Login Feature Scenario
@sanity
  Scenario: This scenario is to define the login happy path
    Given I have launched the application
    When I enter the username as 'standard_user' and password as 'secret_sauce'
    And I click on the login Button
@sanity
  Scenario: This scenario is to define the failure path
    Given I have launched the application
    When I enter the username as 'standard_user' and password as 'secret'
    And I click on the login Button
    Then I should get the error message "Epic sadface: Username and password do not match any user in this service"