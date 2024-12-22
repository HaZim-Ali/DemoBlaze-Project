Feature: Ensure that the user can add products to the cart

  Scenario: Ensure that the user can add product 1 to the cart
#    Given click on login
#    When user fill username and password
#    And click on login button
    And click on Laptops under categories on the homepage
    And choose Product 1 on Laptops category
    Then Product 1 is added to the cart with confirmation






  Scenario: Ensure the second product 2 is added to the cart
  #    Given click on login
#    When user fill username and password
#    And click on login button
      And click on Laptops under categories on the homepage
      And choose Product 2 on Laptops category
      Then Product 2 is added to the cart with confirmation













