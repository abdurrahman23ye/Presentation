Feature: US1016_Add review on product

  @task
  Scenario: Add review on product

  Given Launch browser
  And Navigate to url 'mainPage'
  And Click on Products button
  And Verify user is navigated to ALL PRODUCTS page successfully
  And Click on View Product of first product
  And Verify Write Your Review is visible
  And Enter name, email and review
  And Click Submit button(Review)
  And Verify success message Thank you for your review.
  And Close the page