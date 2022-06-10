Feature: US1010_Add products in cart



  Background:
    Given Launch browser
    And Navigate to url 'mainPage'
    And Verify that home page is visible successfully

  Scenario: Add products in cart


    And Click on Products button
    And Hover first product and click Add to cart
    And Click Continue Shopping button
    And Hover over second product and click Add to cart
    And Click View Cart button
    And Verify both products are added to Cart
    And Verify their prices, quantity and total price
    And Close the page

    @try
    Scenario:


    Given Click View Product for any product on home page
    And Verify product detail is opened
    And Increase quantity to 4
    And Click Add to cart button
    And Click View Cart button
    And Verify that product is displayed in cart page with exact quantity










