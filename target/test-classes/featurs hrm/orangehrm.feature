Feature: Orange Employee list functionality

  @tag1
  Scenario: User able to launch the Orangehrm Web application.

    Given  User verifies the url.
    When   User enters valid credintials
    Then   User clicks login

  @tag2
  Scenario:  Use Valid orangehrm Login  credentials.

    Given User need to enter the appropiate credentials
    When  User enteres the valid username in username field
    And   Password in password field
    Then  User clicks on login

  @tag3
  Scenario:  User clicks to previous page and next page

    Given User clicks on previous page mark
    When  User clicks on next page mark 
    Then  User lands on to the request page

 @tag4
  Scenario:  User clicks the Add Employee Button

    Given User clickes on add employee button
    When  User clicks on add employee button
    Then  User lands on to the request add employee page

 @tag5
  Scenario: User needs to enter the employee full name

    Given User try to fill the employee name
    When  User enters the employee full name that is first name fully  
    And   Middle name
    Then  Last name fully in the prescribed name field

 @tag6
  Scenario:  User needs to enter the employee id

    Given User enter the employee id in the given field
    When  User enteres the employee id 
    Then  Application allows to enter the same

 @tag7
  Scenario:  User nees to clicks the create login Details tick box


    Given User clicks the create login Details tick box
    When  User enters the valid username as mandatory field
    And   User enters the valid passward and confirm passpord in the password field as mandatory field
    Then  User select the status of employee 


 @tag8
  Scenario:  User needs to click the save button under Add employee section.

    Given User needs to click on save button
    When  User clicks on save 
    Then  Employee details save succesfully




