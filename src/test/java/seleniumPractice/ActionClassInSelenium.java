package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionClassInSelenium {

    WebDriver driver;
    @Test
    void actionClassDemo()
    {
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        Actions action = new Actions(driver);

        WebElement facebookUrl = driver.findElement(By.cssSelector("[href='https://www.facebook.com/OrangeHRM/'"));

        WebElement typeValue = driver.findElement(By.cssSelector("[name='username']"));

        action.sendKeys(typeValue,"Admin").build().perform();

        action.click(facebookUrl).build().perform();

        //contextClick and doubleClick

        driver.get("https://qa-practice.netlify.app/double-click");

        WebElement doubleClickDemo = driver.findElement(By.id("double-click-btn"));

        action.doubleClick(doubleClickDemo).build().perform();

        action.contextClick().build().perform();
    }

    @Test
    void actionClassDemo1() throws InterruptedException {
        driver = new ChromeDriver();

        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        driver.manage().window().maximize();

        Thread.sleep(10000);
        Actions action = new Actions(driver);

        WebElement source = driver.findElement(By.id("DHTMLgoodies_dragableElement0"));

        WebElement destination = driver.findElement(By.id("box105"));

        action.clickAndHold(source).moveToElement(destination).release();


    }
}
