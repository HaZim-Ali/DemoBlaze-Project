package Locators;

import StepDefinitions.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.testng.Assert;

public class
AmountCalculation_Locate {

    public void goToCartPage() {
        WebElement cartButton = Hooks.HZM.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[4]/a"));
        cartButton.click();
    }

    // Get the total price element
    public WebElement getTotalPriceElement() {
        return Hooks.HZM.findElement(By.xpath("//h3[contains(number(),'1580')]"));
    }

    public void validateTotalAmount(String expectedTotalPrice) {
        WebElement totalPriceElement = getTotalPriceElement();

        String actualTotalPrice = totalPriceElement.getText();

        Assert.assertEquals(actualTotalPrice, expectedTotalPrice, "Total price mismatch: The calculated total does not match the expected value.");
    }
}





