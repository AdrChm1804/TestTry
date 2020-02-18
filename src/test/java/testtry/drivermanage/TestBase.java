package testtry.drivermanage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import testtry.drivermanage.DriverManager;
import testtry.drivermanage.DriverUtils;

public class TestBase {

    protected WebDriver driver;

    @BeforeMethod
    public void beforeTest() {
        DriverManager.getWebDriver();
        DriverUtils.setInitialConfiguration();
        DriverUtils.navigateToPage("https://ehurtuat.eurocash.pl/sso/core/custom/login?id=a39df019e42cc63093339a58f3e52e3d&client=ehurtuatssl");

       }


    @AfterMethod
    public void afterTest() {
        //driver.quit();
    }

}