package Locators;

import StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddProducts_Locate {

    WebDriver HZM= Hooks.HZM;
    // Locators and actions for login functionality


    public WebElement LaptopIcon() {
        return HZM.findElement(By.xpath("/html/body/div[5]/div/div[1]/div/a[3]"));
    }
    public WebElement Product1Laptops(){

        return HZM.findElement(By.linkText("Sony vaio i5"));
    }
    public WebElement AddToCard1(){

        return HZM.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[2]/div/a"));
    }
    public WebElement Product2Laptops(){

        return HZM.findElement(By.linkText("Sony vaio i7"));
    }
    public WebElement AddToCard2 (){

        return HZM.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[2]/div/a"));
    }
    public WebElement CartButton (){

        return HZM.findElement(By.xpath("/html/body/nav/div/div/ul/li[4]/a"));
    }

    }
