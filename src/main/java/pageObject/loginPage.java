package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

    public WebDriver driver;
    private By usernameInput = By.id("user-name");

    private By passwordInput = By.id("password");

    private By loginBtn = By.id("login-button");

    private By errorMsg = By.cssSelector(".error-message-container");

    public loginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void openURL(WebDriver driver)
    {
        driver.get("https://www.saucedemo.com/");
    }
    public void enterLoginCreds(String username, String password, WebDriver driver)
    {
        driver.findElement(usernameInput).sendKeys(username);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(loginBtn).click();
    }

    public String  getErrorMsg(WebDriver driver)
    {
        return driver.findElement(errorMsg).getText();
    }

}
