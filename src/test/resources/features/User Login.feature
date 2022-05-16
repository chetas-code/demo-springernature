
  Feature: User is able to login when password is correct

    @first
    Scenario: User is able to login when he/she enters correct details
      Given I am on login page
      When I enter username and password
      And I click on login
      Then I am on profile homepage
      And I should see my name on profile page

    Scenario:  User unable to login when he/she enters incorrect details
      Given I am on login page
      When I enter wrong username and password
      And I click on login
      Then I should see validation message

    Scenario: User is able to logout from the website
      Given I am on login page
      And I enter username and password
      And I click on login
      When I click on logout
      #Then I am on landing page
