package slider;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SliderTest extends BaseTest {

    @Test
    public void testSliderValue(){
        var sliderPage= homePage.clickHorizontalSliderPage();

        sliderPage.enterRightArrowKey(7);
        var sliderValue=sliderPage.getSliderValue();
        System.out.println(sliderValue);
        Assert.assertEquals(sliderValue,"4","value not the expected");

    }
}
