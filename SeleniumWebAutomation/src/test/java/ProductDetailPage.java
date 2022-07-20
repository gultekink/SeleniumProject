import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage {

    By addToCartButton = By.id("button-cart");

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }


    public void addToCart() {
        click(addToCartButton);
    }


}
