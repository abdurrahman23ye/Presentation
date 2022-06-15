Feature: US1020_Verify Scroll Up using 'Arrow' button and Scroll Down functionality

  @task
  Scenario: Verify Scroll Up using 'Arrow' button and Scroll Down functionality

  Given Launch browser
  And Navigate to url 'mainPage'
  And Verify that home page is visible successfully
  And Scroll down page to bottom
  And Verify text SUBSCRIPTION
  And Click on arrow at bottom right side to move upward
  And Verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen
  And Close the page