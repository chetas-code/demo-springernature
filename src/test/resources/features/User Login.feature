 @Demo
  Feature: User is able to login when password is correct


    Scenario Outline: User is able to login when he/she enters correct details
      Given I am on login page
      When I enter <username> and <password>
      And I click on login
      Then I am on profile homepage
      And I should see my name on profile page
      Examples:
      | username               | password|
      | rachanakruti@gmail.com | Test123 |

    Scenario:  User is unable to login when he/she enters incorrect details
      Given I am on login page
      When I provide wrong username and password
      And I click on login
      Then I should see validation message

    Scenario Outline: User is able to logout from the website
      Given I am on login page
      When I enter <username> and <password>
      And I click on login
      When I click on logout
      Then I am on landing page
      Examples:
        | username               | password|
        | rachanakruti@gmail.com | Test123 |
