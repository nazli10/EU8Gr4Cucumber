
Feature: Login to the app

    Background: User is on myProject login page
    Given user is on the login page


  @INN-1508
  Scenario Outline: Verify user can login with valid credentials and "DRIVER" land on the "Quick Launchpad".
  "SALES MANAGER/STORE MANAGER" land on the "Dashboard"

  Verify user can login with valid credentials and "DRIVER" land on the "Quick Launchpad".
  "SALES MANAGER/STORE MANAGER" land on the "Dashboard"

    When user enters "<username>" in the username box
    And user enters "<password>" in the password box
    Then user lands on  "<subtitle>"

    Examples: Driver, sales manager and store manager use different credentials and driver lands on Quick Launchpad,
    Sales/Store Manager land on Dashboard.

      | username        | password    | subtitle        |
      | user4           | UserUser123 | Quick Launchpad |
      | salesmanager254 | UserUser123 | Dashboard       |
      | storemanager54  | UserUser123 | Dashboard       |


  @INN-1509
  Scenario Outline: Verify the system shouldn't allow users to access the application without providing credentials
  Verify the system shouldn't allow users to access the application without providing credentials

    When user enters "<username>" in the username box
    And user enters "<password>" in the password box
    Then user lands on  "<subtitle>"
    And user copies the URL
    Then user log out
    Then user paste the URL to the browser
    Then user clicks login button without providing credentials
    And user can not land on "<subtitle>"

    Examples: Driver, sales manager and store manager use different credentials and driver lands on Quick Launchpad,
    Sales Manager and Store Manager land on Dashboard

      | username        | password    | subtitle        |
      | user4           | UserUser123 | Quick Launchpad |
      | salesmanager254 | UserUser123 | Dashboard       |
      | storemanager54  | UserUser123 | Dashboard       |



  @INN-1532
  Scenario: Verify the copying of the text entered into the Password field is NOT POSSIBLE
    When user enter "<password>" in the password box
    And user tries to copy the text from password box
    Then user should not be able to paste the "<password>"



  @INN-1528
  Scenario: Verify all the fields in login page have proper placeholders
    Then user sees "Username or Email" placeholder in username input box
    Then user sees "Password" placeholder in the password input box


  @INN-1529
  Scenario Outline: Verify user gets the required WARNING MESSAGE for invalid credentials
    When user enters "<invalidUsername>" or "<invalidPassword>"
    And user clicks login button
    Then user should see "Invalid user name or password." message

    Examples: Wrong credentials

      | invalidUsername | invalidPassword |
      | user55          | UsekkUser123    |
      | salemanager4444 | UsemUser123     |
      | storemanager771 | UserUser12333   |


  @INN-1531
  Scenario: Verify user gets the required WARNING MESSAGE for any empty field
    When user clicks login button without providing any credentials
    Then user must see "Please fill out this field." message


  @INN-1533
  Scenario: Verify user lands on ‘Forgot Password’ page after clicking on the "Forgot your password?" link
  and can change their password


    When user clicks Forgot your password? link
    And user lands on "Forgot Password" page
    And user types "user4" as username
    And user clicks REQUEST button
    Then users change their password



  @INN-1534
  Scenario: Verify user can see the "Remember me on this computer" checkbox on the login page and
  it should be clickable
    When user sees the Remember me on this computer checkbox
    Then user should be able to click on it


  @INN-1535
  Scenario Outline: Verify user can login by using keyboard keys
  Verify user can login by using keyboard keys

    When user clicks on Username input box
    And user writes valid "<username>" clicks Enter, writes valid "<password>" clicks Enter
    Then user lands on  "<subtitle>"

    Examples: Driver, sales manager and store manager use different credentials and driver lands on Quick Launchpad, Sales/Store
    Manager land on Dashboard

      | username        | password    | subtitle        |
      | user4           | UserUser123 | Quick Launchpad |
      | salesmanager254 | UserUser123 | Dashboard       |
      | storemanager54  | UserUser123 | Dashboard       |


