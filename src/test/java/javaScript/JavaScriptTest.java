package javaScript;

import base.BaseTest;
import org.testng.annotations.Test;

public class JavaScriptTest extends BaseTest {

    @Test
    public void scrolltoTableTest(){
        homePage.clickLargeAndDeepDown().ScrollTable();
    }
    @Test
    public void testScrollUntilFiveParagraph(){
        homePage.clickInfiniteScroll().scrollToParagraph(5);
    }


}
