

Feature: login and logout application in chrome

  Scenario: login and logout
    Given Launch the chrome browser
    And Navigate to the url
    When Enter the username and password
    And Click the login button
    Then Validate the home page
    And Logout the application 

  #@tag2
  #Scenario Outline: Title of your scenario outline
  #  Given I want to write a step with <name>
  #  When I check for the <value> in step
  #  Then I verify the <status> in step

   # Examples: 
   #   | name  | value | status  |
    #  | name1 |     5 | success |
    #  | name2 |     7 | Fail    |
