Feature: US1011 Place Order:
  @task
  Scenario: Place Order: Register while Checkout


    Given Launch browser
    And Navigate to url 'mainPage'
    And Verify that home page is visible successfully
    And Add product to cart
    And wait 1 seconds
    And Click Continue Shopping button
    And Add products to cart
    And Click Cart button
    And Verify that cart page is displayed
    And Click Proceed To Checkout
    And Click Register  Login button
    And Enter name and email address
    And Click Signup button
    And Verify that ENTER ACCOUNT INFORMATION is visible
    And Fill details: Title, Name, Email, Password, Date of birth
    And Select checkbox Sign up for our newsletter!
    And Select checkbox Receive special offers from our partners!
    And Select checkbox Receive special offers from our partners!Fill details: First name, Last name, Company, Address,
    And Click Create Account button
    And Verify that ACCOUNT CREATED! is visible
    And Click Continue button
    And Verify that Logged in as username is visible
    And Click Cart button
    And Click Proceed To Checkout
    And Verify Address Details and Review Your Order
    And Enter description in comment text area and click Place Order
    And wait 2 seconds
    And Enter payment details: Name on Card, Card Number, CVC, Expiration date
    And Click Pay and Confirm Order button
    And Verify success message Your order has been placed successfully!
    And Click Delete Account button
    And Close the page