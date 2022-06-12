Feature: US1014_View Categories


 Background:
  Given Launch browser
  And Navigate to url 'mainPage'

  @task
  Scenario: View category products

  And Verify that categories are visible on left side bar
  And Click on Women category
  And Click on any category link under Women category, for example: Dress
  And Verify that category page is displayed and confirm text WOMEN - TOPS PRODUCTS
  And On left side bar, click on any sub-category link of Men category
  And Verify that user is navigated to that category page
  And Close the page

    @try
    Scenario:  View Cart Brand Products


    And Click on Products button
    And Verify that Brands are visible on left side bar
    And Click on any brand name
    And Verify that user is navigated to brand page and brand products are displayed
    And On left side bar, click on any other brand link
    And Verify that user is navigated to that brand page and can see products