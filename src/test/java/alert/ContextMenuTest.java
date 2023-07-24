package alert;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextMenuTest extends BaseTest {

    @Test
    public void testSuccesfulContextMenu(){
        var contextMenuPage = homePage.clickContexMenu();
        contextMenuPage.clickHotSpot();
        var assertionText = contextMenuPage.getAlertText();
        contextMenuPage.alert_clickAccept();
        Assert.assertEquals(assertionText,"You selected a context menu","text expected alert incorrected");
    }
}
