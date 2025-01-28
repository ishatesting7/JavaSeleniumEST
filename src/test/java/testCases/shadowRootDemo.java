package testCases;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shadowRootDemo {

    public static void main(String args[]) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.prudential.com/");

        Thread.sleep(5000);
        WebElement ele = driver.findElement(By.cssSelector("[class='pru-header app-js__mega-menu-top-nav']"));

        SearchContext shadow_host_root = ele.getShadowRoot();

        WebElement ele1 = shadow_host_root.findElement(By.cssSelector("[class='top-navigation__panel__item panel__item-panel']"));

        ele1.click();
    }
}

