package alert;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertTest extends BaseTest {

    @Test
    public void testAcceptAlert(){
        var alertPage= homePage.clickJSAlerts();
        alertPage.triggerAlert();
        alertPage.alert_clickToAccept();
         var resultString = alertPage.getResultText();
        System.out.println(resultString);
        Assert.assertEquals(resultString,"You successfully clicked an alert", "the result it's not the expected");
    }

    @Test
    public void testGetTextFromAlert(){
        var alertAPage= homePage.clickJSAlerts();
        alertAPage.triggerConfirm();
        String alertText = alertAPage.alert_getText();
        System.out.println(alertText);
        alertAPage.alert_clickToDissmis();
        Assert.assertEquals(alertText,"I am a JS Confirm","Alert Text incorrect");
    }@Test
    public void testsetInputIntmAlert(){
        var alertAPage= homePage.clickJSAlerts();
        alertAPage.triggerPrompt();
        String text = "Hello world";
        alertAPage.alert_setInput(text);
        alertAPage.alert_clickToAccept();
        var resultString = alertAPage.getResultText();
        Assert.assertEquals(resultString,"You entered: "+text,"Alert Text incorrect");
    }
}
