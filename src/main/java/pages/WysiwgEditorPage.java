package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwgEditorPage {
     private WebDriver driver;
     private String frameEditorID= ("mce_0_ifr");
     private  By textArea= By.id("tinymce");
     private By decreaseIdentButton = By.xpath("//*[@id=\"content\"]/div/div/div[1]/div[1]/div[2]/div/div[5]/button[2]");
     public WysiwgEditorPage (WebDriver driver){
          this.driver = driver;
     }
     private void switchToEditArea(){
          driver.switchTo().frame(frameEditorID);
     }
     public void clearTextArea(){
          switchToEditArea();
          driver.findElement(textArea).clear();
          switchToTheMainArea();
     }
     private void switchToTheMainArea(){
          driver.switchTo().parentFrame();
     }

     public void decreaseIdentation(){

          driver.findElement(decreaseIdentButton).click();
     }
     public String getTexFromEditor(){
          switchToEditArea();
          String text= driver.findElement(textArea).getText();
          switchToTheMainArea();
          return  text;

     }
    public void setTextArea(String text){
          switchToEditArea();
          driver.findElement(textArea).sendKeys(text);
          switchToTheMainArea();
     }
}
