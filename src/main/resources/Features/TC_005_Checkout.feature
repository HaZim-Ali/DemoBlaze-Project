Feature: Ensure that the user can successfully complete the purchase

  Scenario: user continue purchase process
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
    And click on place order button if cart total is 1580
    And user fill "Hazim" and "Egypt" and "Cairo" and "5010406985745" and "October" and "2025"
    And click on purchase
    Then purchase successfully