Feature: Ensure that the user can add products to the cart

  # product 1 add to cart
  Scenario: Ensure that the user can add product 1 to the cart
    Given click on login
    When user fill username and password
    And click on login button
    And click on Laptops under categories on the homepage
    And choose Product 1 on Laptops category
    Then Product 1 is added to the cart with confirmation





  # product 2 add to cart
  Scenario: Ensure the second product 2 is added to the cart
      Given click on login
      When user fill username and password
      And click on login button
      And click on Laptops under categories on the homepage
      And choose Product 2 on Laptops category
      Then Product 2 is added to the cart with confirmation


  # verify the same product twice to the cart
    Scenario: adding the same product twice to the cart and verify that the quantity updates correctly
      Given click on login
      When user fill username and password
      And click on login button
      And click on Laptops under categories on the homepage
      And choose Product 2 on Laptops category
      And navigate to home page
      And click on Laptops under categories on the homepage
      And choose Product 2 on Laptops category
      And Click on the Cart button in the Header
      And verify that both products are in the cart















