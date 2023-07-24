package retrievePassword;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RetrievePasswordTest extends BaseTest {
    @Test
    public void retrieveSuccessfulPassword()
    {
        var forgotPasswordPage= homePage.clickForgotPassword();
        forgotPasswordPage.putEmail("tau@email.com");
        var retrievePasswordPage= forgotPasswordPage.clickRetrievePassword();

         var validationString= retrievePasswordPage.getStringRetrievePassword();
        Assert.assertNotNull(validationString,"not retrievedPassword");
        System.out.println(validationString);

    }

}
