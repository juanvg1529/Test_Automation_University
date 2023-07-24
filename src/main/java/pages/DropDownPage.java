package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDownPage {
    private WebDriver driver;
    private By dropdown = By.id("dropdown");
    public  DropDownPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public void selecFromDropDown(String option)
    {
        Select dropDownElement = new Select(driver.findElement(dropdown));
        dropDownElement.selectByVisibleText(option);
    }
    public List<String> getSelectedOptions(){
       var selectedElements= findDropDownElement().getAllSelectedOptions();
       return selectedElements.stream().map(x->x.getText()).collect(Collectors.toList());
    }

    private Select findDropDownElement(){
        return new Select(driver.findElement(dropdown));
    }

    public void addOptionToDropDown(){
        var script= "document.querySelector(\"#dropdown\").setAttribute('multiple','HelloWorld')";
        var jsExecutor=((JavascriptExecutor)driver);
        jsExecutor.executeScript(script);

    }
}
