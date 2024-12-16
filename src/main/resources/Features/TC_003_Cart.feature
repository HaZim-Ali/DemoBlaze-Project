Feature:Verify the products in the cart

  Scenario: Ensure that both products are in the cart with accurate details
#    Given click on login
#    When user fill username and password
#    And click on login button
    And click on Laptops under categories on the homepage
    And choose Product 1 on Laptops category
    And Product 1 is added to the cart with confirmation
    And Click on the Cart button in the Header
    And navigate to home page
#    And click on Laptops under categories on the homepage
#    And choose Product 2 on Laptops category
#    And Product 2 is added to the cart with confirmation
#    And Click on the Cart button in the Header
#    And verify that both products are in the cart
#    Then products added successfully