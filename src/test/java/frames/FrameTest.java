package frames;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FrameTest extends BaseTest {

    @Test
    public void testWysiwyg(){
        var editorPage= homePage.clickWysiwgEditor();
        editorPage.clearTextArea();
        String text1= "Hello ";
        String text2= "World";

        editorPage.setTextArea(text1);
        editorPage.decreaseIdentation();
        editorPage.setTextArea(text2);

        String textEditor= editorPage.getTexFromEditor();
        Assert.assertEquals(textEditor, text1+text2, "text expected incorrect");
    }


    @Test
    public void testFramesText(){

        var framesPage= homePage.clickFrames();
        var nestedPage= framesPage.clickNestedFramesOption();

        String leftTextFrame= nestedPage.geTextLeftTopFrame();
        System.out.println(leftTextFrame);
        Assert.assertEquals(leftTextFrame,"LEFT","text incorrect");

        String bottomTextFrame= nestedPage.getTextBottomFrame();

        System.out.println(bottomTextFrame);
        Assert.assertEquals(bottomTextFrame,"BOTTOM","text incorrect");
    }
}
