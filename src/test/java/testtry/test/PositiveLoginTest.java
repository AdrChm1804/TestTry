package testtry.test;

import org.testng.annotations.Test;
import testtry.drivermanage.TestBase;
import testtry.pages.HeaderPage;
import testtry.pages.LoginPage;

import static org.testng.Assert.assertTrue;

public class PositiveLoginTest extends TestBase {

    @Test

    public void logInWithValidUsernameAdnPassword(){

        LoginPage loginPage = new LoginPage();
        loginPage.typeIntoUserNameField("test.ecmp4");
        loginPage.typeIntoPasswordField("67456929");
        loginPage.clickOnLoginButton();

        HeaderPage headerPage = new HeaderPage();
        assertTrue(headerPage.isMainPageDisplayed());

    }
}
