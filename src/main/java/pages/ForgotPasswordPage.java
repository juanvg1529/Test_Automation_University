package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
     private WebDriver driver;
    private By inputEmailField = By.id("email");
    private By buttonRetrievePassword = By.id("form_submit");
     public ForgotPasswordPage(WebDriver driver){
         this.driver = driver;
     }

     public void putEmail(String email){
        driver.findElement(inputEmailField).sendKeys(email);
     }

     public RetrivePasswordPage clickRetrievePassword(){

         driver.findElement(buttonRetrievePassword).click();
         return  new RetrivePasswordPage(driver);
     }

}
