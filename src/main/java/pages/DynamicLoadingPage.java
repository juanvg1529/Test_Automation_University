package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class DynamicLoadingPage {
    private WebDriver driver;

    private By example1= By.xpath("//*[@id=\"content\"]/div/a[1]");
    private By example2= By.xpath("//*[@id=\"content\"]/div/a[2]");

    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }

    public DynamicLoadingPageExample1Page clickExample1(){
        driver.findElement(example1).click();
        return new DynamicLoadingPageExample1Page( driver);
    }
    public DynamicLoadingPageExample2Page clickExample2(){
        driver.findElement(example2).click();
        return new DynamicLoadingPageExample2Page( driver);
    }

    public DynamicLoadingPageExample2Page simulateRigthClick(){
        driver.findElement(example2).sendKeys(Keys.CONTROL,Keys.RETURN);
        return new DynamicLoadingPageExample2Page(driver);
    }
}
