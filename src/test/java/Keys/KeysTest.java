package Keys;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KeysTest extends BaseTest {
    @Test
    public void testBacKSpace(){
        var keyPage= homePage.clickKeyPressesPage();
        keyPage.enterText("A"+ Keys.BACK_SPACE);
        Assert.assertEquals(keyPage.getResult(),"You entered: BACK_SPACE!","not backspace");
    }
    @Test
    public void testArroba(){
        var keyPage= homePage.clickKeyPressesPage();
        keyPage.enterArroba();
    }
}
