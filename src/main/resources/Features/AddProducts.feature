Feature: Ensure that the user can add products to the cart
@1
  Scenario: Ensure that the user can add products to the cart
    #Given open web site and go to "https://www.demoblaze.com/"

    And click on Laptops under categories on the homepage
    And choose Product 1 on Laptops category

    And Product 1 is added to the cart with confirmation
    And Click on the Cart button in the Header




  Scenario: Ensure the second product is added to the cart
    #Given open web site and go to "https://www.demoblaze.com/"
      And click on Laptops under categories on the homepage
      And choose Product 2 on Laptops category
      And Product 2 is added to the cart with confirmation
      And Click on the Cart button in the Header












