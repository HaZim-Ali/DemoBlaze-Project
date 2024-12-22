package StepDefinitions;

import Locators.AmountCalculation_Locate;
import io.cucumber.java.en.Then;


public class AmountCalculation_Steps {


    AmountCalculation_Locate amountCalculation = new AmountCalculation_Locate();

    @Then("The total amount is calculated correctly based on the prices of both products")
    public void the_total_amount_is_calculated_correctly_based_on_the_prices_of_both_products() {
        // Navigate to the cart page
        amountCalculation.goToCartPage();

        String expectedTotalPrice = "1580";

        amountCalculation.validateTotalAmount("1580");
    }
}




