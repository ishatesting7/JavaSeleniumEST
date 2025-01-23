package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.loginPage;
import pageObject.inventory;
public class LoginTest {

    public WebDriver driver;
    private loginPage lp = new loginPage(driver);
    private inventory ivr = new inventory(driver);

    @BeforeTest
    public void setUp()
    {
        driver = new ChromeDriver();
        lp.openURL(driver);
    }

    @Test
    public void loginIntoSauceTest()
    {
        lp.enterLoginCreds("standard_user","secret_sauce",driver);
        ivr.getProductTitle(driver);

    }

    @Test
    public void loginIntoSauceInvalidTest()
    {
        lp.enterLoginCreds("standard_usr","secret_sauce", driver);
        String errorMsg = lp.getErrorMsg(driver);
        Assert.assertEquals(errorMsg, "Epic sadface: Username and password do not match any user in this service");
    }

    @AfterTest
    public void tearDown()
    {
        if(driver!=null)
        {
            driver.quit();
        }
    }

}
