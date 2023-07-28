package base;

import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.EventsRepoter;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BaseTest {

  /*  private EventFiringWebDriver driver;//1st steep create the web driver*/
    WebDriver driver;
    protected HomePage homePage;
    @BeforeClass
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");//specify where the web-driver is located

        driver = new ChromeDriver(getChromeOptions());

     /*   driver = new EventFiringWebDriver(  new ChromeDriver());
        driver.register(new EventsRepoter());*/

       // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        goHome();
        setCookie();
        driver.manage().window().maximize();
        homePage = new HomePage(driver);



       /* List< WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        WebElement inputLinks = driver.findElement(By.linkText("Inputs"));
        inputLinks.click();*/

       /* WebElement shiftingContenLink = driver.findElement(By.linkText("Shifting Content"));
        shiftingContenLink.click();

        WebElement optionOneLink = driver.findElement(By.linkText("Example 1: Menu Element"));
        optionOneLink.click();

        List<WebElement> listOptions = driver.findElements(By.tagName("li"));
        System.out.println("number of options :"+listOptions.size());


        System.out.println(driver.getTitle());*/

        //Excercise
        //click on shifting content, click on the first example and them how many elements appear, should be 5
        //https://testautomationu.applitools.com/selenium-webdriver-tutorial-java/chapter3.html


        //driver.quit();//quit the window

    }
    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }


    public WindowManager getWindowManager(){
        return  new WindowManager(driver);
    }
    @AfterMethod
    public void recordFailure(ITestResult result){
        if (ITestResult.FAILURE== result.getStatus())
        {
            var camera= (TakesScreenshot)driver;
            var screenShoot= camera.getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenShoot,new File("resources/screenshots/"+result.getName()+".png"));
            }
            catch (IOException e){
                e.printStackTrace();
            }

        }
    }
    private ChromeOptions getChromeOptions(){
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        WebDriver driver = new ChromeDriver(options);

        return options;
    }
    private void setCookie(){
        Cookie cookie = new Cookie.Builder("tau","123").domain("https://the-internet.herokuapp.com").build();//the domain is the site where I'm staging the cookie
        driver.manage().addCookie(cookie);
    }


    // to run the setup meanwhile, we are creatin a main method

   /* public static void main(String[] args) {

        BaseTest test = new BaseTest();
        test.setUp();
    }*/

}
