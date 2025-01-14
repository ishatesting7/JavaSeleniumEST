package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class LocatorDemo {
    // 8 Ways to Identify the Web Element
    // WebPage and WebElement
    // WebDriver - Interface, it consist of all the methods (Without Body), Abstract Body
    // EdgeDriver/ChromeDriver - Its an class for intantiating the chrome/edge or any other browser
    WebDriver driver;
    @BeforeMethod
    void setUp()
    {
        driver = new EdgeDriver();
        driver.navigate().to("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.navigate().refresh();
        //WAIT - IMPLICIT, EXPLICIT and FLUENTWAIT
        //IMPLICIT WAIT
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test(description = "Login")
    void navigateToURL1()
    {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        //QUIT and CLOSE
        //QUIT - It will close all the browser
        //CLOSE - It will close the active browser

        //ID
        //name
        //classname
        //Xpath/CSS
    }

    @Test(description = "Add Product in the cart and perform checkout")
    void navigateToURL2()
    {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        List<WebElement> bagPack =  driver.findElements(By.cssSelector(".btn.btn_primary.btn_small.btn_inventory"));
        for(int i = 0;i<bagPack.size();i++)
        {
            bagPack.get(i).click();
        }

    }

    @Test(description = "Validate the Pricing")
    void navigateToURL2AndGetPrice()
    {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        Double totalAmount = 0.0d;
        List<WebElement> itemPrice = driver.findElements(By.cssSelector("[data-test='inventory-item-price']"));
        for(int i = 0;i<itemPrice.size();i++)
        {
            String priceText = itemPrice.get(i).getText().replace("$","");
            totalAmount+=Double.parseDouble(priceText);

        }
        System.out.println("Addition of all the product amount == "+totalAmount);


        List<WebElement> bagPack =  driver.findElements(By.cssSelector(".btn.btn_primary.btn_small.btn_inventory"));
        for(int i = 0;i<bagPack.size();i++)
        {
            bagPack.get(i).click();
        }



    }
    //CSS Locator
    /*
    1. If you are aware about the classname, then the css locator would be
    .classname
    2. If you are aware about the id, then the css locator would be
    #id
    3. If you are aware about - tagName, attribute and value
    tagname[attribute='value']
    4. If you are aware about attribute and value
    [attribute = 'value']
    5. Traversing through all the parent-child tagname -
        div[class='inventory_list'] div:nth-child(1) div:nth-child(2) div:nth-child(2) div:nth-child(1)
     */
    @AfterMethod
    void tearDown() throws InterruptedException {
        driver.close();
    }
}
