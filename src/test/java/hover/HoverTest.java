package hover;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoverTest extends BaseTest {

    @Test

    public void testHoverUser1(){
        var hoversPage= homePage.clickHoverPage();

         var caption =hoversPage.hoverOverFigure(1);
        Assert.assertTrue(caption.isCaptionDisplayed(),"caption its not displayed");
        Assert.assertEquals(caption.getTitle(),"name: user1","caption tittle incorrect");
        Assert.assertEquals(caption.getLinkText(),"View profile","caption lint text incorrect");
        Assert.assertTrue(caption.getLink().endsWith("/users/1"),"link incorrect");
    }
}
