import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BasePage {

    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement find(By findBy){
        return driver.findElement(findBy);
    }

    public List<WebElement> findAll(By findByAll){
        return driver.findElements(findByAll);
    }

    public void click(By clickBy){
        find(clickBy).click();
    }

    public void type(By typeBy, String text){
        find(typeBy).sendKeys(text);
    }

    public boolean isDisplayed(By isOnBy){
        return find(isOnBy).isDisplayed();
    }
}
