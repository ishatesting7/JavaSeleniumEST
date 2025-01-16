package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class MultipleWindowsInSelenium {

    WebDriver driver;
    @BeforeTest
    public void setUp() throws Exception {

        driver = new ChromeDriver();
        driver.get("https://www.lambdatest.com/selenium-playground/window-popup-modal-demo");

    }

    @Test
    public void singleWindowPopUpDetails() {
        try {
            //Clicks on the follow on twitter option
            WebElement followOnTwitter = driver.findElement(By.xpath("//a[text()='  Follow On Twitter ']"));
            followOnTwitter.click();

            WebElement followOnFacebook = driver.findElement(By.xpath("//a[text()='  Like us On Facebook ']"));
            followOnFacebook.click();

            // 3 Windows - 1 Parent and 2 are child
            // To handle parent window
            String MainWindow = driver.getWindowHandle();
            System.out.println("Main window handle is " + MainWindow);

            // To handle child window - next() and hasNext()
            Set<String> s1 = driver.getWindowHandles();
            System.out.println("Child window handle is" + s1);
            Iterator<String> i1 = s1.iterator();
            while (i1.hasNext()) {
                String ChildWindow = i1.next();
                if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
                    driver.switchTo().window(ChildWindow);
                    String pageTitle=driver.getTitle();
                    System.out.println("The web page title of child window is:"+pageTitle);
                    driver.close();
                    System.out.println("Child window closed");
                }
            }

        } catch (Exception e) {

        }

    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();

    }

}