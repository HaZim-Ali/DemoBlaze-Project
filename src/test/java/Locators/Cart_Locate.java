package Locators;

import StepDefinitions.Hooks;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Cart_Locate {

    WebDriver HZM = Hooks.HZM;

    // Locator to fetch rows of the cart table
    public List<WebElement> getCartProductRows() {
        return HZM.findElements(By.xpath("//tbody/tr")); // Adjust the XPath based on your application structure
    }

    // Fetch product names from the cart table
    public List<String> getCartProductNames() {
        List<String> productNames = new ArrayList<>();
        for (WebElement row : getCartProductRows()) {
            String productName = row.findElement(By.xpath(".//td[2]")).getText().trim(); // Adjust column index if necessary
            productNames.add(productName);
        }
        return productNames;
    }

    // Fetch product title elements
    public List<WebElement> getCartProductTitles() {

        return HZM.findElements(By.xpath("//tbody/tr//td[2]"));
    }

    // Fetch product price elements
    public List<WebElement> getCartProductPrices() {

        return HZM.findElements(By.xpath("//tbody/tr//td[3]"));
    }

    // Locator for the total price element
    public WebElement getTotalPriceElement() {

        return HZM.findElement(By.xpath("//h3[@id='totalp']"));
    }

    public WebElement HomeButton() {

        return HZM.findElement(By.xpath("//a[contains(text(),'Home')]"));
    }
}
