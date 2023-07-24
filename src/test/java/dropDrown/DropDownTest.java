package dropDrown;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class DropDownTest extends BaseTest {
    @Test
    public void testSelectedOption(){
         var dropDownPage= homePage.clickDropDown();

         String option = "Option 1";
         dropDownPage.selecFromDropDown(option);


         var selecteOptions= dropDownPage.getSelectedOptions();
        Assert.assertEquals(selecteOptions.size(),1,"the number of selected options it's not expected");
        Assert.assertTrue(selecteOptions.contains(option),"selected option it's not contained");


    }

    @Test
    public void testJSScript(){
        var dropDownPage=homePage.clickDropDown();
        String option1="Option 1";
        String option2="Option 2";
        dropDownPage.addOptionToDropDown();
        dropDownPage.selecFromDropDown(option1);

        var selectedOptions= dropDownPage.getSelectedOptions();
        Assert.assertEquals(selectedOptions.size(),1,"the number of selected options it's not expected");
        Assert.assertTrue(selectedOptions.contains(option1),"selected option it's not contained");

        dropDownPage.selecFromDropDown(option2);
        selectedOptions= dropDownPage.getSelectedOptions();
        Assert.assertEquals(selectedOptions.size(),2,"the number of selected options it's not expected");
        Assert.assertTrue(selectedOptions.contains(option2),"selected option it's not contained");

    }

}
