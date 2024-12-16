package Locators;

import StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sign_Up_Locate {
    WebDriver HZM = Hooks.HZM;
    // Locators and actions for login functionality

    public WebElement signupB() {

        return HZM.findElement(By.xpath("//*[@id=\"signin2\"]"));
    }

    public WebElement username() {

        return HZM.findElement(By.xpath("//*[@id=\"sign-username\"]"));
    }

    public WebElement password() {

        return HZM.findElement(By.xpath("//*[@id=\"sign-password\"]"));
    }

    public WebElement signupButton() {
        return HZM.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]"));
    }

    public WebElement loginB() {

        return HZM.findElement(By.xpath("//*[@id=\"login2\"]"));
    }

    public WebElement usernameL() {

        return HZM.findElement(By.xpath("//*[@id=\"loginusername\"]"));
    }

    public WebElement passwordL() {

        return HZM.findElement(By.xpath("//*[@id=\"loginpassword\"]"));
    }

    public WebElement loginButton() {
        return HZM.findElement(By.xpath("//button[contains(text(),'Log in')]"));
    }
}
