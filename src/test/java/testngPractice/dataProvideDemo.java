package testngPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvideDemo {

    @DataProvider(name = "LoginCreds")
    public Object[][] provideTestData()
    {
        return new Object[][]
                {
                        {"Admin","admin123"},

                };
    }

    @Test(dataProvider = "LoginCreds", dataProviderClass = dataProvideDemo.class)
    void loadUrl(String u, String p) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        String currentURL = driver.getCurrentUrl();
        String getPageSource = driver.getPageSource();
        String pageTitle = driver.getTitle();

        System.out.println(currentURL);
        System.out.println(getPageSource);
        System.out.println(pageTitle);

        Thread.sleep(5000);
        /*driver.findElement(By.name("username")).sendKeys(u);
        driver.findElement(By.name("password")).sendKeys(p);
        driver.findElement(By.cssSelector("[type='submit']")).click();
    */
        //WebDriver - Interface
        //Interface - Abstract Method, Method Without Body

    }
    @Test(dataProvider = "LoginCreds", dataProviderClass = dataProvideDemo.class)
    void ReadTestData(String username, String password)
    {
        System.out.println("USERNAME - "+username+ "  PASSWORD"+password);
    }

}
