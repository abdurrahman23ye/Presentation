Feature: US1013: Remove product from cart
  @task
  Scenario: Remove product from cart

  Given Launch browser
  And Navigate to url 'mainPage'
  And Verify that home page is visible successfully
  And Add products to cart
  And Click View Cart button
  And Verify that cart page is displayed
  And Click X button corresponding to particular product
  And Verify that product is removed from the cart