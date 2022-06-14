Feature: US1017_Add to cart from Recommended items

  @task
  Scenario: Add to cart from Recommended items

  Given Launch browser
  And Navigate to url 'mainPage'
  And Scroll to bottom of page
  And Verify RECOMMENDED ITEMS are visible
  And Click on Add To Cart on Recommended product
  And Click View Cart button
  And Verify that product is displayed in cart page