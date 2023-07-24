package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {

    private WebDriver driver;
    private String topFrame= "frame-top";
    private String bottomFrame= "frame-bottom";
    private  String leftFrame= "frame-left";
    private By body= By.tagName("body");


    public NestedFramesPage(WebDriver driver) {
        this.driver = driver;
    }

    private void swithToMainArea(){
        driver.switchTo().parentFrame();
    }
    private void switchToFrame(String text){
        driver.switchTo().frame(text);
    }
    public String geTextLeftTopFrame(){
        switchToFrame(topFrame);
        switchToFrame(leftFrame);
        String text = getFrameText();
        swithToMainArea();
        swithToMainArea();
        return  text;
    }
    public String getTextBottomFrame(){
        switchToFrame(bottomFrame);
        String text = getFrameText();
        swithToMainArea();
        return text;
    }
    private String getFrameText(){
        return  driver.findElement(body).getText();
    }

}
