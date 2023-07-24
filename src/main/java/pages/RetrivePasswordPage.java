package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RetrivePasswordPage  {
     private WebDriver driver;
     private By assertionTag= By.tagName("h1");
     public  RetrivePasswordPage(WebDriver driver){
          this.driver = driver;
     }
     public String getStringRetrievePassword()
     {
          return driver.findElement(assertionTag).getText();

     }
}
