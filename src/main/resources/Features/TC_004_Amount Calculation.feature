Feature: Verify Total Amount Calculation
  Scenario: Ensure that the total amount is calculated correctly
    And click on Laptops under categories on the homepage
    And choose Product 1 on Laptops category
    And Product 1 is added to the cart with confirmation
    And Click on the Cart button in the Header
    And navigate to home page
    And click on Laptops under categories on the homepage
    And choose Product 2 on Laptops category
    And Product 2 is added to the cart with confirmation
    And Click on the Cart button in the Header
    And verify that both products are in the cart
    Then The total amount is calculated correctly based on the prices of both products
