package StepDefinitions;

import Locators.Sign_Up_Locate;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Sign_Up_Steps {

    Sign_Up_Locate sign_up = new Sign_Up_Locate();
    Sign_Up_Locate login = new Sign_Up_Locate();

    @Given("click on sign up")
    public void click_on_sign_up(){
        sign_up.signupB().click();

    }
    @When("user sign up with valid username and password")
    public void user_sign_up_with_valid_username_and_password() {
        sign_up.username().sendKeys("Hazim_Aly_NEW");
        sign_up.password().sendKeys("Hazim1234");
    }
    @And("click on sign up button")
        public void click_on_sign_up_button(){

        sign_up.signupButton().click();
    }
    @Then("sign up successfully")
    public void sign_up_successfully(){

    }
    @When("click on login")
    public void click_on_login(){

        login.loginB().click();
    }
    @When("user fill username and password")
    public void user_fill_username_and_password() throws InterruptedException {
        Thread.sleep(3);
        login.usernameL().sendKeys("Hazim_Aly_NEW");
        login.passwordL().sendKeys("Hazim1234");
    }
    @And("click on login button")
    public void click_on_login_button() {

        login.loginButton().click();
    }
    @Then("user login successfully and navigate to home page")
    public void user_login_successfully_and_navigate_to_home_page(){

    }
}
