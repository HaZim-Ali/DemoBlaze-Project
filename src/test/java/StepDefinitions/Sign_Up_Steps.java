package StepDefinitions;

import Locators.Sign_Up_Locate;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Sign_Up_Steps {

    Sign_Up_Locate sign_up = new Sign_Up_Locate();
    Sign_Up_Locate login = new Sign_Up_Locate();

    @Given("click on sign up")
    public void click_on_sign_up() {
        sign_up.signupB().click();

    }

    @When("user sign up with valid username and password")
    public void user_sign_up_with_valid_username_and_password() {
        sign_up.username().sendKeys("Mazen_Aly_NEW");
        sign_up.password().sendKeys("Mazin1234");
    }

    @Then("sign up not successfully")
    public void sign_up_not_successfully() {
        WebDriverWait wait1 = new WebDriverWait(Hooks.HZM, Duration.ofSeconds(50));
        Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

        // Validate the confirmation message
        String expectedMessage = "This user already exist.";
        String actualMessage = alert.getText();
        Assert.assertEquals(actualMessage, expectedMessage, "Alert message mismatch for invalid sign up");

        // Accept the alert
        alert.accept();
    }
    @And("click on sign up button")
        public void click_on_sign_up_button(){

        sign_up.signupButton().click();
    }
    @Then("sign up successfully")
    public void sign_up_successfully(){
        WebDriverWait wait1= new WebDriverWait(Hooks.HZM, Duration.ofSeconds(50));
        Alert alert = wait1.until(ExpectedConditions.alertIsPresent());

        // Validate the confirmation message
        String expectedMessage = "Sign up successful.";
        String actualMessage = alert.getText();
        Assert.assertEquals(actualMessage, expectedMessage, "Alert message mismatch for valid sign up");

        // Accept the alert
        alert.accept();
    }
    @When("user sign up with invalid {string} and {string}")
    public void user_sign_up_with_invalid(String username , String password){
        sign_up.username().sendKeys(username);
        sign_up.password().sendKeys(password);

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

}
