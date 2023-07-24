package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage {
    private     WebDriver driver;
    private  By tiggerAlertButton = By.xpath(".//button[text()= 'Click for JS Alert']");
    private  By tiggerConfirmButton = By.xpath(".//button[text()= 'Click for JS Confirm']");
    private  By tiggerPromptButton = By.xpath(".//button[text()= 'Click for JS Prompt']");



    private  By resultText = By.id("result");
    public AlertPage(WebDriver driver){
        this.driver  =driver;
    }
    public void triggerAlert(){
        driver.findElement(tiggerAlertButton).click();
    }

    public void triggerConfirm(){
        driver.findElement(tiggerConfirmButton).click();
    }
    public void triggerPrompt(){
        driver.findElement(tiggerPromptButton).click();
    }
    public void alert_clickToAccept(){
        driver.switchTo().alert().accept();
    }

    public void alert_clickToDissmis(){
        driver.switchTo().alert().dismiss();
    }
    public void alert_setInput(String text)
    {
        driver.switchTo().alert().sendKeys(text);
    }

    public String alert_getText(){
        return driver.switchTo().alert().getText();
    }
    public String getResultText(){
        return  driver.findElement(resultText).getText();
    }
}
