package uploadFile;

import base.BaseTest;
import com.beust.ah.A;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadFileTest extends BaseTest {
    @Test
    public void testFileUpload(){
        var uploadPage= homePage.clickFileUpload();
        uploadPage.uploadFile("C:\\Users\\Rockj\\IdeaProjects\\TAUniversityUITA\\resources\\chromedriver.exe");
        Assert.assertEquals(uploadPage.getUploadedFiles(),"chromedriver.exe");
    }
}
