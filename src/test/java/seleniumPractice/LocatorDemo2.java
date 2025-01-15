package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class LocatorDemo2 {

    WebDriver driver;
    @Test
    void testCase1()
    {
        driver = new ChromeDriver();
        driver.get("https://blazedemo.com/");
        driver.manage().window().maximize();
        selectValueFromDropdown(driver);
    }

    static void selectValueFromDropdown(WebDriver driver)
    {
        WebElement dropdownDemo = driver.findElement(By.name("fromPort"));
        Select dropdown = new Select(dropdownDemo);
        //Total - 3 Ways
        dropdown.selectByVisibleText("Mexico City");

        WebElement dropdownDemo2 = driver.findElement(By.name("toPort"));
        Select dropdown2 = new Select(dropdownDemo2);
        dropdown2.selectByValue("New York");

        WebElement findFlightBtn = driver.findElement(By.xpath("//input[@type='submit']"));
        findFlightBtn.click();
    }
    @Test
    void countNumberOfFlights()
    {
        driver = new ChromeDriver();
        driver.get("https://blazedemo.com/");
        driver.manage().window().maximize();
        selectValueFromDropdown(driver);
        List<WebElement> numberOfFlight = driver.findElements(By.xpath("//input[@value='Choose This Flight']"));
        System.out.print("Number of Flights -- "+ numberOfFlight.size());
    }

    @Test
    void displayAllTheAirLineName()
    {
        driver = new ChromeDriver();
        driver.get("https://blazedemo.com/");
        driver.manage().window().maximize();
        selectValueFromDropdown(driver);
        WebElement table = driver.findElement(By.xpath("//table[@class='table']"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));

        for(WebElement row : rows)
        {
            List<WebElement> columns = row.findElements(By.tagName("td"));
            for(WebElement col: columns)
            {
                System.out.println(col.getText()+"  ");
            }
            System.out.println();
        }
    }
    /*
    Xpath - Relative Xpath and Absolute Xpath

    Relative Xpath
    - Starts with //
    - Several function already defined in XPath
    - Multiple Ways of Writing the XPath -
        - Using tagname, attribute and value  -  //tagname[@attribute = 'value']
        - Using contains - (//*[contains(@value,'Choose This Flight')])[1]
        - Using And and OR - //*[@type='submit' or @value='Choose This Flight']
        - Using starts-with - //label[starts-with(@id,'message')] -- Ex - //a[starts-with(@href,'home')]
        - Using text() - //td[text()='UserID'] - Ex -- //a[text()='home']
        - Xpath Axes
        - following - //a[text()='home']//following::form
        -

    Absolute Xpath
    - Starts with /
    - Started from the root of the element
    - /html/body/div[2]/div/div/ul/li[3]/button

     */
}
