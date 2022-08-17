
Feature: Checking login and logout credentails for OrangeHrm

  Scenario: Login and Logout
    Given Launch the url
    When Enter username and password
    And Validate the homepage
    Then Logging out the application