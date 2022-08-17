#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Add to cart and buying the products

  Scenario: Add to cart
    Given Launch the  Chrome browser
    And Navigate to the Shopping site url
    When Navigate to the Account page
    And Enter the username and password
    And Go to Home Page
    Then Add to cart the products
    And View the products in cart page

  Scenario: Buying the products
    Given Launch the  Chrome browser
    And Navigate to the Shopping url
    When Navigate to the Cart page
    And Proceed to checkout
    And Enter the shipping details
    Then click cash on delivery and Place order
    And Logging out the shopping site
    

