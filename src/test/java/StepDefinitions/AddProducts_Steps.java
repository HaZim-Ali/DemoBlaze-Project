package StepDefinitions;

import Locators.AddProducts_Locate;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class AddProducts_Steps {

    AddProducts_Locate Cart = new AddProducts_Locate();

    @And("click on Laptops under categories on the homepage")
    public void click_on_Laptops_under_categories_on_the_homepage() {
        // Ensure the modal is not visible
        WebDriverWait wait = new WebDriverWait(Hooks.HZM, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"nameofuser\"]")));


        Cart.LaptopIcon().click();
    }

    @And("choose Product 1 on Laptops category")
    public void choose_product_1_on_Laptops_category() {
        // Ensure the modal is not visible
        WebDriverWait wait = new WebDriverWait(Hooks.HZM, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"nameofuser\"]")));

        // Click on Product 1 (Sony Vaio i5)
        WebElement product1 = Cart.Product1Laptops();
        product1.click();
    }

    @Then("Product 1 is added to the cart with confirmation")
    public void Product_1_is_added_to_the_cart_with_confirmation()  {
        // Ensure the modal is not visible
        WebDriverWait wait = new WebDriverWait(Hooks.HZM, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"nameofuser\"]")));


        // Click the Add to Cart button for Product 1
        WebElement addToCartButton = Cart.AddToCard1();
        ((JavascriptExecutor) Hooks.HZM).executeScript("arguments[0].scrollIntoView(true);", addToCartButton);
        addToCartButton.click();

//        Wait For the confirmation Alert;
        WebDriverWait wait1= new WebDriverWait(Hooks.HZM,Duration.ofSeconds(50));
        Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

        // Validate the confirmation message
        String expectedMessage = "Product added.";
        String actualMessage = alert.getText();
        Assert.assertEquals(actualMessage, expectedMessage, "Alert message mismatch for Product 1");

        // Accept the alert
        alert.accept();
    }

    @And("Click on the Cart button in the Header to verify a product add to cart")
    public void Click_on_the_Cart_button_in_the_Header_to_verify_a_product_add_to_cart() {
        // Ensure the modal is not visible
        WebDriverWait wait = new WebDriverWait(Hooks.HZM, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("logInModal")));

        // Scroll to and click the Cart button
        WebElement cartButton = Cart.CartButton1();
        ((JavascriptExecutor) Hooks.HZM).executeScript("arguments[0].scrollIntoView(true);", cartButton);
        cartButton.click();
    }


    @And("choose Product 2 on Laptops category")
    public void choose_Product_2_on_Laptops_category(){

        Cart.Product2Laptops().click();
    }
    @Then("Product 2 is added to the cart with confirmation")
    public void Product_2_is_added_to_the_cart_with_confirmation() {
        // Click the Add to Cart button for Product 2
        Cart.AddToCard2().click();

        // Wait for the confirmation alert
        WebDriverWait wait = new WebDriverWait(Hooks.HZM, Duration.ofSeconds(10));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());

        // Validate the confirmation message
        String expectedMessage = "Product added.";
        String actualMessage = alert.getText();
        Assert.assertEquals(actualMessage, expectedMessage, "Alert message mismatch for Product 2");

        // Accept the alert
        alert.accept();
    }

    @And("Click on the Cart button in the Header")
    public void Click_on_the_Cart_button_in_the_Header() {

        Cart.CartButton2().click();
    }

}



