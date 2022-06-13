Feature: US1015_Search Products and Verify Cart After Login

  @task
  Scenario: Search Products and Verify Cart After Login

  Given Launch browser
  And Navigate to url 'mainPage'
  And Click on Products button
  And Verify user is navigated to ALL PRODUCTS page successfully
  And Enter product name in search input and click search button
  And Verify SEARCHED PRODUCTS is visible
  And Verify all the products related to search are visible
  And Add those products to cart
  And Click View Cart button
  And Click on Signup  Login button
  And Enter correct email address and password
  And Click login button
  And Again, go to Cart page
  And Verify that those products are visible in cart after login as well