package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STRestartNumber;

import java.util.List;
import java.util.stream.Collectors;

public class inventory {

    public WebDriver driver;
    private By productTitle = By.cssSelector(".inventory_item_name ");

    public inventory(WebDriver driver)
    {
        this.driver = driver;
    }

    public List<String> getProductTitle(WebDriver driver)
    {
        return driver.findElements(productTitle)
                .stream()
                .map(element -> element.getText())
                .collect(Collectors.toList());

    }

}
