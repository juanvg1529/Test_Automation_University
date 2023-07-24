package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.security.Key;

public class KeyPressesPage {
   private WebDriver driver;
   private By inputdField = By.id("target");
   private By resultText =By.id("result");
    public KeyPressesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterText(String string){
        driver.findElement(inputdField).sendKeys(string);
    }

    public void enterArroba(){
        enterText(Keys.chord(Keys.ALT,"p"));
    }

    public String getResult(){
        return driver.findElement(resultText).getText();
    }
}
