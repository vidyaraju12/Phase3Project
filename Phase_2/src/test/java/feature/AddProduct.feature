Feature: Adding the product into cart Scenario from SauceLabs Application

  Background: 
    Given I have launched the application
@regression
  Scenario: This scenario is to add the product into cart
    When I enter the username as 'standard_user' and password as 'secret_sauce'
    And I click on the login Button
    When I click on add to cart product on "Sauce Labs Bolt T-Shirt"
    Then the basket number should be "1"
