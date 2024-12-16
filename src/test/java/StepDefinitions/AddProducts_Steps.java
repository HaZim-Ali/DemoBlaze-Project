package StepDefinitions;

import Locators.AddProducts_Locate;
import io.cucumber.java.en.And;

public class AddProducts_Steps {

    AddProducts_Locate Cart = new AddProducts_Locate();

    @And("click on Laptops under categories on the homepage")
    public void click_on_Laptops_under_categories_on_the_homepage()  {

        Cart.LaptopIcon().click();
    }
    @And("choose Product 1 on Laptops category")
    public void choose_product_1_on_Laptops_category(){

        Cart.Product1Laptops().click();
    }
    @And("Product 1 is added to the cart with confirmation")
    public void Product_1_is_added_to_the_cart_with_confirmation()  {

        Cart.AddToCard1().click();
    }
    @And("Click on the Cart button in the Header to verify a product add to cart")
    public void Click_on_the_Cart_button_in_the_Header_to_verify_a_product_add_to_cart() {

        Cart.CartButton1().click();
    }

    @And("choose Product 2 on Laptops category")
    public void choose_Product_2_on_Laptops_category(){

        Cart.Product2Laptops().click();
    }
    @And("Product 2 is added to the cart with confirmation")
    public void Product_2_is_added_to_the_cart_with_confirmation(){

        Cart.AddToCard2().click();
    }
    @And("Click on the Cart button in the Header")
    public void Click_on_the_Cart_button_in_the_Header(){

        Cart.CartButton2().click();
    }
}
