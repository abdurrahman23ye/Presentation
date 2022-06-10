Feature: US1010_Add products in cart

  Scenario: Add products in cart


    Given Launch browser
    And Navigate to url 'mainPage'
    And Verify that home page is visible successfully
    And Click on Products button
    And Hover first product and click Add to cart
    And Click Continue Shopping button
    And Hover over second product and click Add to cart
    And Click View Cart button
    And Verify both products are added to Cart
    And Verify their prices, quantity and total price
    And Close the page










