package StepDefinitions;

import Locators.Cart_Locate;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Cart_Steps {

    Cart_Locate verifyCart = new Cart_Locate () ;


    @And("navigate to home page")
    public void navigate_to_home_page() {
        verifyCart.HomeButton().click();
    }
    @And("verify that both products are in the cart")
    public void verify_that_both_products_are_in_the_cart (){
        verifyCart.bothProducts().click();
    }
    @Then("Both products are visible in the cart with their respective titles and prices")
    public void Both_products_are_visible_in_the_cart_with_their_respective_titles_and_prices(){

    }
}
