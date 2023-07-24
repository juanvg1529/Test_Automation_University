package login;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testSuccesfulLogin()

    {
        var loginPage= homePage.clickFormAuthenticationLink();
        loginPage.setUsername("tomsmith");
        loginPage.setPasswordField("SuperSecretPassword!");
        var secureArea= loginPage.clickLogginButton();
        var expectedResult= secureArea.getAlertText();
        Assert.assertTrue(expectedResult.contains("You logged into a secure area"));
    }
}
