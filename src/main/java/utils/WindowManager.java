package utils;

import org.openqa.selenium.WebDriver;

public class WindowManager {

    private WebDriver driver;
    private WebDriver.Navigation navigate;
    public WindowManager(WebDriver driver) {
        this.driver = driver;
        this.navigate= driver.navigate();
    }

    /**
     * This method goes back in the page
     */
    public void goBack(){
        navigate.back();
    }
    public void goFoward(){
        navigate.forward();
    }

    public void refreshPage(){
        navigate.refresh();
    }
    public void gotTo(String url){
        navigate.to(url);
    }

    public void switchToNewTab(){
        var windows = driver.getWindowHandles();
        windows.forEach(driver.switchTo()::window);
    }
    public void switchToTab(String tabTitle){
        var windows=  driver.getWindowHandles();
        System.out.println("Number of tabs "+windows.size());
        System.out.println("Window handles");
        windows.forEach(System.out::println);
        for (String window:windows){
            System.out.println("Switching to window: "+window);
            driver.switchTo().window(window);

            System.out.println("Current window title "+driver.getTitle());

            if(tabTitle.equals(driver.getTitle())){
                break;
            }
        }
    }
}
