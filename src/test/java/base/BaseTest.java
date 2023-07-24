package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.WindowManager;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    private WebDriver driver;//1st steep create the web driver
    protected HomePage homePage;
    @BeforeClass
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");//specify where the web-driver is located
        driver = new ChromeDriver();

       // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        goHome();
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


    // to run the setup meanwhile, we are creatin a main method

   /* public static void main(String[] args) {

        BaseTest test = new BaseTest();
        test.setUp();
    }*/

}
