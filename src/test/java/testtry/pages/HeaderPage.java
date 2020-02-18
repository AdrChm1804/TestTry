package testtry.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testtry.drivermanage.DriverManager;
import testtry.drivermanage.TestBase;

public class HeaderPage extends TestBase {

    @FindBy(xpath = "/html/body/app-root/app-navigation-bar/div/div/div[1]/app-nav-menu-item[1]/div/a")
    public WebElement mainPage;

    @FindBy(name = "autocomplete-search")
    public WebElement searchInput;

    public HeaderPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public boolean isMainPageDisplayed() {
        boolean isDisplayed = mainPage.isDisplayed();
        return isDisplayed;
    }

    public void inputProduct(String product) {
        searchInput.sendKeys(product);
    }
}