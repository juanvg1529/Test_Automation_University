package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ContextMenuPage {
    private     WebDriver driver;
    private By hotSpotField = By.id("hot-spot");
    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickHotSpot(){
        Actions actions= new Actions(driver);
        actions.contextClick(driver.findElement(hotSpotField)).perform();
    }
    public String getAlertText(){
        return driver.switchTo().alert().getText();
    }

    public void alert_clickAccept(){
        driver.switchTo().alert().accept();
    }

}
