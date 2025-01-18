package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptExecutorDemo {


    WebDriver driver;

    @Test
    void JavaScriptExecutorDemo()
    {
        driver = new ChromeDriver();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.navigate().to("https://blazedemo.com/");

        String title = js.executeScript("return document.title").toString();

        System.out.println("Page Title is = "+ title);

        WebElement vacationDetails = driver.findElement(By.cssSelector("[href='vacation.html']"));

        js.executeScript("arguments[0].click()",vacationDetails);

        js.executeScript("window.location ='https://www.saucedemo.com/'");



    }
}
