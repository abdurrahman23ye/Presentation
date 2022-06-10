Feature: Filling contact form

  Background:
    Given Launch browser
    And Navigate to url 'mainPage'
    And Verify that home page is visible successfully

  @task
  Scenario:Contact us form is enable


  And Click on Contact Us button
  And Verify GET IN TOUCH is visible
  And Enter name, email, subject and message
  And Upload file
  And Click Submit button
  And Click OK button
  And Verify success message Success! Your details have been submitted successfully. is visible
  And Click Home button and verify that landed to home page successfully

   @task
    Scenario: Test cases page is enable
    Given Click on Test Cases button
    And Verify user is navigated to test cases page successfully

