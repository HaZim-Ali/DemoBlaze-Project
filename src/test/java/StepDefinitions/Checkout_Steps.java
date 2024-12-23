package StepDefinitions;

import Locators.Checkout_Locate;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Checkout_Steps {

    Checkout_Locate PlaceOrder = new Checkout_Locate();
    Checkout_Locate userName = new Checkout_Locate();
    Checkout_Locate userCountry = new Checkout_Locate();
    Checkout_Locate userCity = new Checkout_Locate();
    Checkout_Locate userCreditCard = new Checkout_Locate();
    Checkout_Locate userMonth = new Checkout_Locate();
    Checkout_Locate userYear = new Checkout_Locate();
    Checkout_Locate PurchaseButton1 = new Checkout_Locate();





        @And("click on place order button if cart total is 1580")
        public void click_On_Place_Order_Button_If_Cart_Total_Is_1580() {
           PurchaseButton1.PurchaseB().click();

        }


        @And("user fill {string} and {string} and {string} and {string} and {string} and {string}")
        public void user_fill(String name, String country, String city, String creditCard, String month, String year) {
            userName.userNameH(name).sendKeys("name");
            userCountry.userCountryH(country).sendKeys("country");
            userCity.userCityH(city).sendKeys("city");
            userCreditCard.userCreditCardH(creditCard).sendKeys("5010406985745");
            userMonth.userMonthH(month).sendKeys("October");
            userYear.userYearH(year).sendKeys("2025");
        }

        @And("click on purchase")
        public void click_on_purchase() {
            PlaceOrder.PurchaseButton().click();
        }

        @Then("A success message should be displayed Thank you for your purchase")
        public void A_success_message_should_be_displayed_Thank_you_for_your_purchase() {
            PurchaseButton1.PurchaseButton().click();

        }
    }




