import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage {
    String count;
    By inputLocate = By.id("js-cart-update-product");
    By closeLocate = By.id("fa fa-times red-icon");
    public CartPage(WebDriver driver) {
        super(driver);
    }

    private int getCartCount(){
        count= find(inputLocate).getText();
        return Integer.parseInt(count);
    }

    public boolean isProdcutCountUp() {
        return getCartCount()>0;
    }

    public void clickToClose() {
        click(closeLocate);
    }

    public boolean isCartEmpty() {
       {
            return  Integer.parseInt(count)==0;
        }
    }
}
