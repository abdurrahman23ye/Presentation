
Feature:Logout, Login with existing email


    Background:
    Given Launch browser
    And Navigate to url 'mainPage'
    And Verify that home page is visible successfully
    And Click on Signup  Login button

   @task
  Scenario: Logout User


  And Verify Login to your account is visible
  And Enter correct email address and password
  And Click login button
  And Verify that Logged in as username is visible
  And Click Logout button
  And Verify that user is navigated to login page

     @task
    Scenario: Signup name and already registered email address


  And Verify New User Signup! is visible
  And Enter name and already registered email address
  And Click Signup button
  And Verify error Email Address already exist! is visible



