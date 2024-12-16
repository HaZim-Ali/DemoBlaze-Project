package Locators;

import StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cart_Locate {

    WebDriver HZM = Hooks.HZM ;

    public WebElement bothProducts (){
        return HZM.findElement(By.xpath("\"//li[@class=\\\"nav-item\\\"]//a[@id=\\\"cartur\\\"]\""));
    }
    public WebElement HomeButton (){
        return HZM.findElement(By.xpath("//div[@class=\"container\"]//a[@class=\"navbar-brand\"]"));
    }//class="navbar-brand"
}
