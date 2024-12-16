package StepDefinitions;

import Locators.Checkout_Locate;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.checkerframework.checker.units.qual.C;

public class Checkout_Steps {

    Checkout_Locate PlaceOrder =new  Checkout_Locate ();
    Checkout_Locate userName =new Checkout_Locate();
    Checkout_Locate userCountry =new Checkout_Locate();
    Checkout_Locate userCity =new Checkout_Locate();
    Checkout_Locate userCreditCard =new Checkout_Locate();
    Checkout_Locate userMonth =new Checkout_Locate();
    Checkout_Locate userYear =new Checkout_Locate();
    Checkout_Locate PurchaseButton =new Checkout_Locate();


    @And("click on place order button")
    public void click_on_place_order_button(){
        PlaceOrder.PlaceOrderButton().click();
    }
    @And("user fill {string} and {string} and {string} and {string} and {string} and {string}")
    public void user_fill(String name,String country,String city,String creditCard,String month,String year){
        userName.userNameH(name).sendKeys("name");
        userCountry.userCountryH(country).sendKeys("country");
        userCity.userCityH(city).sendKeys("city");
        userCreditCard.userCreditCardH(creditCard).sendKeys("501040698574");
        userMonth.userMonthH(month).sendKeys("October");
        userYear.userYearH(year).sendKeys("2025");
    }
    @And("click on purchase")
    public void click_on_purchase(){
        PlaceOrder.PurchaseButton().click();
    }
    @Then("purchase successfully")
    public void purchase_successfully(){

    }


}
