package testtry.test;

import org.testng.annotations.Test;
import testtry.drivermanage.TestBase;
import testtry.pages.LoginPage;

import static org.testng.Assert.assertEquals;

public class FailedLoginTest extends TestBase {

    @Test
    public void failedUsernameOrPassword(){

        LoginPage loginPage = new LoginPage();
        loginPage.typeIntoUserNameField("aa");
        loginPage.typeIntoPasswordField("aa");
        loginPage.clickOnLoginButton();

       String warningMessage = loginPage.getWarningMessage();
        assertEquals(warningMessage, ("Nieprawidłowy login"));
    }
}
