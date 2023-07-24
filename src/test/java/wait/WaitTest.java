package wait;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WaitTest extends BaseTest {

    @Test
    public void testWaitUntilHidden(){
        var loadingPage= homePage.clickDynamicLoading().clickExample1();
        loadingPage.clickStartButton();
        Assert.assertEquals(loadingPage.getText(),"Hello World!","loaded text incorrect");

    }@Test
    public void testWaitUntilAvailable(){
        var loadingPage= homePage.clickDynamicLoading().clickExample2();
        loadingPage.clickStartButton();
        Assert.assertEquals(loadingPage.getText(),"Hello World!","loaded text incorrect");

    }
}
