Feature: US1009_Verify subscription in home and cart pages

  Background:
    Given Launch browser
    And Navigate to url 'mainPage'
    And Verify that home page is visible successfully

    @try
  Scenario: Verify subscription in home

  Given Launch browser
  And Navigate to url 'mainPage'
  And Verify that home page is visible successfully
  And Scroll down to footer
  And Verify text SUBSCRIPTION
  And Enter email address in input and click arrow button
  And Verify success message You have been successfully subscribed! is visible

    @try
    Scenario:


    Given Click Cart button
    And Scroll down to footer
    And Verify text SUBSCRIPTION
    And Enter email address in input and click arrow button
    And Verify success message You have been successfully subscribed! is visible

