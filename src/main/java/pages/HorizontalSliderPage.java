package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage  {
    private WebDriver driver;
    private By sliderInput = By.tagName("input");
    private By sliderValue = By.id("range");
    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getSliderValue(){
        return driver.findElement(sliderValue).getText();
    }
    public void enterRightArrowKey(int iterations){

        for (int i= 0;i<=iterations;i++){
           driver.findElement(sliderInput).sendKeys(Keys.ARROW_RIGHT);
        }
    }

}
