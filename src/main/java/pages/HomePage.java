package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private  WebDriver driver;

//    private By formAuthenticationLink = By.linkText("Form Authentication");
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickFormAuthenticationLink() {
        clickLink("Form Authentication");
        return  new LoginPage(driver);

    }
    public DropDownPage clickDropDown()
    {
        clickLink("Dropdown");
        return  new DropDownPage(driver);
    }
    public ForgotPasswordPage clickForgotPassword(){
        clickLink("Forgot Password");
        return  new ForgotPasswordPage(driver);
    }
    public HoverPage clickHoverPage(){
        clickLink("Hovers");
        return  new HoverPage(driver);
    }
    public KeyPressesPage clickKeyPressesPage(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }
    public HorizontalSliderPage clickHorizontalSliderPage(){
        clickLink("Horizontal Slider");
        return  new HorizontalSliderPage(driver);
    }

    public AlertPage clickJSAlerts(){
        clickLink("JavaScript Alerts");
        return new AlertPage(driver);
    }
    public FileUploadPage clickFileUpload()
    {
        clickLink("File Upload");
        return  new FileUploadPage(driver);
    }
    public ContextMenuPage clickContexMenu(){
        clickLink("Context Menu");
        return  new ContextMenuPage(driver);
    }

    public WysiwgEditorPage clickWysiwgEditor(){
        clickLink("WYSIWYG Editor");
        return  new WysiwgEditorPage(driver);
    }

    public FramesPage clickFrames(){
        clickLink("Frames");
        return new FramesPage(driver);
    }

    public DynamicLoadingPage clickDynamicLoading(){
        clickLink("Dynamic Loading");
        return  new DynamicLoadingPage(driver);
    }

    public LargeAndDeepDomPage clickLargeAndDeepDown()
    {
        clickLink("Large & Deep DOM");
        return new LargeAndDeepDomPage(driver);
    }

    public InfiniteScrollPage clickInfiniteScroll(){
        clickLink("Infinite Scroll");
        return  new InfiniteScrollPage(driver);
    }
    private void clickLink(String linkText)
    {
        driver.findElement(By.linkText(linkText)).click();
    }


}
