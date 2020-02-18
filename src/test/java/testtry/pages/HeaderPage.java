package testtry.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testtry.drivermanage.DriverManager;
import testtry.drivermanage.TestBase;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HeaderPage extends TestBase {

    @FindBy(xpath = "/html/body/app-root/app-navigation-bar/div/div/div[1]/app-nav-menu-item[1]/div/a")
    public WebElement mainPage;

    @FindBy(name = "autocomplete-search")
    public WebElement searchInput;

    @FindBy(xpath = "/html/body/app-root/app-srp/div/div/div[2]/div[2]/app-srp-list/div[1]/app-product-tile-list")
    public WebElement listOfProduct;

    @FindBy(xpath = "/html/body/app-root/app-srp/div/div/div[2]/div[2]/app-srp-list/div[1]/app-product-tile-list/div/div[2]/div[2]/div[1]/app-product-tile-list-price/div/div/span[2]")
    public WebElement listOfPrices;

    public HeaderPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public boolean isMainPageDisplayed() {
        boolean isDisplayed = mainPage.isDisplayed();
        return isDisplayed;
    }

    public void inputProduct(String productName) {
        searchInput.sendKeys(productName);
        searchInput.sendKeys(Keys.ENTER);
    }

    public List<String> getProducts() {
        List<String> productList = new ArrayList<>();
        List<WebElement> elements = listOfProduct.findElements(By.xpath("/html/body/app-root/app-srp/div/div/div[2]/div[2]/app-srp-list/div/app-product-tile-list/div/div[2]/div[1]"));
        for (WebElement product : elements) {
           productList.add(product.getText());
        }
        return productList;
    }
    public List<String> getPrices() {
        List<WebElement> pricesList = listOfProduct.findElements(By.xpath("//div[contains(@class, 'price')]//span[2]"));
        List<String> prices = pricesList.stream().map(element ->element.getText()).collect(Collectors.toList());
        return prices;
        }
    }

