Feature: US1006_Verify all products and product detail page


  Background:
  Given Launch browser
  And Navigate to url 'mainPage'
  And Verify that home page is visible successfully

  Scenario:Verify all products and product detail page

    And Click on Products button
    And Verify user is navigated to ALL PRODUCTS page successfully
    And The products list is visible
    And Click on View Product of first product
    And User is landed to product detail page
    And Verify that detail detail is visible: product name, category, price, availability, condition, brand
    And Close the page

