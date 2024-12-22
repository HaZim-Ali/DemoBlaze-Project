package Locators;

import StepDefinitions.Hooks;
import org.openqa.selenium.*;


public class Checkout_Locate {

    WebDriver HZM = Hooks.HZM;

    public WebElement PurchaseB (){
        return HZM.findElement(By.xpath("/html/body/div[6]/div/div[2]/button"));
    }

    public WebElement userNameH (String name){
        return HZM.findElement(By.xpath("//input[@id=\"name\"]"));
    }
    public WebElement userCountryH (String country){
        return HZM.findElement(By.xpath("//input[@id=\"country\"]"));
    }
    public WebElement userCityH (String city){
        return HZM.findElement(By.xpath("//input[@id=\"city\"]"));
    }
    public WebElement userCreditCardH (String creditCard){
        return HZM.findElement(By.xpath("//input[@id=\"card\"]"));
    }
    public WebElement userMonthH (String month){
        return HZM.findElement(By.xpath("//input[@id=\"month\"]"));
    }
    public WebElement userYearH (String year){
        return HZM.findElement(By.xpath("//input[@id=\"year\"]"));
    }
    public WebElement PurchaseButton(){
        return HZM.findElement(By.xpath("//button[@onclick=\"purchaseOrder()\"]"));
    }

}
