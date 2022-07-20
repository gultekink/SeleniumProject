import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchBar extends BasePage{
    By searchBarLocate = By.id("search-input");
    public SearchBar(WebDriver driver) {
        super(driver);
    }

    public void search(String text) {
        type(searchBarLocate,text);
        driver.findElement(By.id("Value")).sendKeys(Keys.ENTER);

    }
}
