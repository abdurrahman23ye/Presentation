Feature:US1018 Verify address details in checkout page

  @task
  Scenario: Verify address details in checkout page

  Given Launch browser
  And Navigate to url 'mainPage'
  And Verify that home page is visible successfully
  And Click on Signup  Login button
  And Enter name and email address
  And Click Signup button
  And Verify that ENTER ACCOUNT INFORMATION is visible
  And Fill details: Title, Name, Email, Password, Date of birth
  And Select checkbox Sign up for our newsletter!
  And Select checkbox Receive special offers from our partners!Fill details: First name, Last name, Company, Address,
  And Click Create Account button
  And Verify that ACCOUNT CREATED! is visible
  And Click Continue button
  And Verify that Logged in as username is visible
  And Add products to cart
  And Click View Cart button
  And Verify that cart page is displayed
  And Click Proceed To Checkout
  And Verify that the delivery address is same address filled at the time registration of account
  And Verify that the billing address is same address filled at the time registration of account
  And Click Delete Account button
  And Close the page