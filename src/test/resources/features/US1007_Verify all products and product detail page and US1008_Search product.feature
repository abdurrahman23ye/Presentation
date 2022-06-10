Feature: US1006_Verify all products and product detail page and search product


   Background:
    Given Launch browser
    And Navigate to url 'mainPage'
    And Verify that home page is visible successfully
    And Click on Products button
    And Verify user is navigated to ALL PRODUCTS page successfully
  @task
  Scenario:Verify all products and product detail page


    And The products list is visible
    And Click on View Product of first product
    And User is landed to product detail page
    And Verify that detail detail is visible: product name, category, price, availability, condition, brand
    And Close the page

   @task
   Scenario: Search product
    And Enter product name in search input and click search button
    And Verify SEARCHED PRODUCTS is visible
    And Verify all the products related to search are visible
    And Close the page




