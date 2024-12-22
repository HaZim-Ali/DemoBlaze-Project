package StepDefinitions;

import Locators.Cart_Locate;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.Arrays;
import java.util.List;

public class Cart_Steps {

    Cart_Locate cartPage = new Cart_Locate();

    @And("navigate to home page")
    public void navigate_to_home_page() {
        cartPage.HomeButton().click();
    }

    @And("verify that both products are in the cart")
    public void verify_that_both_products_are_in_the_cart() {
        List<String> productNames = cartPage.getCartProductNames();
        Assert.assertTrue(productNames.contains("Sony vaio i5"), "Product Sony vaio i5 is missing from the cart.");
        Assert.assertTrue(productNames.contains("Sony vaio i7"), "Product Sony vaio i7 is missing from the cart.");
    }

    @Then("Both products are visible in the cart with their respective titles and prices")
    public void both_products_are_visible_in_the_cart_with_their_respective_titles_and_prices() {
        List<WebElement> productTitles = cartPage.getCartProductTitles();
        List<WebElement> productPrices = cartPage.getCartProductPrices();
        WebElement totalPriceElement = cartPage.getTotalPriceElement();

        // Expected data
        List<String> expectedTitles = Arrays.asList("Sony vaio i5", "Sony vaio i7");
        List<String> expectedPrices = Arrays.asList("790", "790");
        String expectedTotalPrice = "1580";

        // Assertions for each product
        for (int i = 0; i < expectedTitles.size(); i++) {
            Assert.assertEquals(productTitles.get(i).getText().trim(), expectedTitles.get(i), "Product title mismatch at index " + i);
            Assert.assertEquals(productPrices.get(i).getText().trim(), expectedPrices.get(i), "Product price mismatch at index " + i);
        }

        // Assertion for total price
        String actualTotalPrice = totalPriceElement.getText().replace("790", "790").trim();
        Assert.assertEquals(actualTotalPrice, expectedTotalPrice, "1580");
    }
}
