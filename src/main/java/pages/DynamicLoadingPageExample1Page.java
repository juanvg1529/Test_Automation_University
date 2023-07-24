package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class DynamicLoadingPageExample1Page {
    private WebDriver driver;
    private By starButton = By.xpath("//*[@id=\"start\"]/button");
    private By textAssert = By.id("finish");

    private By loadingIndicator= By.id("loading");
    public DynamicLoadingPageExample1Page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickStartButton(){
        driver.findElement(starButton).click();
      /*  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));*/
        FluentWait wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));
    }



    public String getText(){

        return driver.findElement(textAssert).getText();
    }
}
