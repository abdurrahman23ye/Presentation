Feature: US1019_Download Invoice after purchase order

  @task
  Scenario: Download Invoice after purchase order

  Given Launch browser
  And Navigate to url 'mainPage'
  And Verify that home page is visible successfully
  And Add products to cart
  And Click View Cart button
  And Verify that cart page is displayed
  And Click Proceed To Checkout
  And Click Register  Login button
  And Enter name and email address
  And Click Signup button
  And Fill details: Title, Name, Email, Password, Date of birth
  And Select checkbox Sign up for our newsletter!
  And Select checkbox Receive special offers from our partners!Fill details: First name, Last name, Company, Address,
  And Click Create Account button
  And Verify that ACCOUNT CREATED! is visible
  And Click Continue button
  And Verify that Logged in as username is visible
  And Click Cart button
  And Click Proceed To Checkout
  And Verify Address Details and Review Your Order
  And Enter description in comment text area and click Place Order
  And Enter payment details: Name on Card, Card Number, CVC, Expiration date
  And Click Pay and Confirm Order button
  And Verify success message Your order has been placed successfully!
  And Click Download Invoice button and verify invoice is downloaded successfully.
  And Click Continue button(After download invoice)
  And Click Delete Account button
  And Close the page