package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    private By inputFile =By.id("file-upload");
    private By uploadFileButton= By.id("file-submit");

    private By uploadedFiles = By.id("uploaded-files");
    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void uploadFile(String path){
        driver.findElement(inputFile).sendKeys(path);
        clickUploadButton();
    }

    public void clickUploadButton(){
        driver.findElement(uploadFileButton).click();
    }
    public String getUploadedFiles()
    {
         return driver.findElement(uploadedFiles).getText();
    }
}
