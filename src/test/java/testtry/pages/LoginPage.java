package testtry.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testtry.drivermanage.DriverManager;

public class LoginPage {

    @FindBy(name = "login")
    private WebElement loginInput;

    @FindBy(name = "pass")
    private WebElement passwordInput;

    @FindBy(xpath = "//*[@id=\"LoginForm\"]/input[3]")
    private WebElement signOnButton;

    @FindBy(xpath = "//*[@id=\"LoginForm\"]/div[1]/label/span")
    private WebElement messageLabel;

    public LoginPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void typeIntoUserNameField(String username) {
        loginInput.sendKeys(username);
    }

    public void typeIntoPasswordField(String password) {
        passwordInput.sendKeys(password);
    }

    public void clickOnLoginButton() {
        signOnButton.click();

    }

    public String getWarningMessage() {
        String warningText = messageLabel.getText();
        return warningText;
    }

    boolean isWarningDisplayed() {
        boolean isDisplayed = messageLabel.isDisplayed();
        return isDisplayed;
    }
}