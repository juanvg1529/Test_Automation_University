package navigation;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigationTest extends BaseTest {

    @Test
    public void testNavigator(){
        homePage.clickDynamicLoading().clickExample1();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goFoward();
        getWindowManager().gotTo("http://google.com");
    }

    @Test
    public void testMultipleWindow(){
        homePage.clickMultipleWindow().clickHere();
        getWindowManager().switchToTab("New Window");
    }

    @Test
    public void testSwitchToTab(){
       var loadingPage= homePage.clickDynamicLoading().simulateRigthClick();
        getWindowManager().switchToNewTab();
        loadingPage.clickStartButton();
        Assert.assertEquals(loadingPage.getText(),"Hello World!");

    }
}
