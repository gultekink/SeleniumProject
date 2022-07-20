import jdk.nashorn.internal.objects.NativeString;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    SearchBar searchBar;
    By cartCountLocate = By.id("cart-items");
    By cartIconLocate = By.id("sprite-cart-icon");
    By goToCartLocate = By.id("js-cart");
    public HomePage(WebDriver driver) {
        super(driver);
        searchBar = new SearchBar(driver);
    }

    public SearchBar searchBar(){
        return this.searchBar;
    }

    public void clickGoToCart() {
        click(cartIconLocate);
    }
    public void clickToMyCart() {
        click(goToCartLocate);
    }

    private int getCartCount(){
       String count = find(cartCountLocate).getText();
        return Integer.parseInt(count);
    }

    public boolean isProdcutCountUp() {
        return getCartCount()>0;
    }
}
