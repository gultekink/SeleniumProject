import com.opencsv.exceptions.CsvValidationException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.io.IOException;

public class ProductTests extends BaseTest{

    HomePage homePage ;
    ProductsPage productsPage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;

    @Test
    @Order(1)
    public void searchInBar(){
        homePage = new HomePage(driver);

    homePage.searchBar.search("roman");
    }
/*
    @Test
    @Order(2)
    public void selectBook() throws CsvValidationException, IOException {
        productsPage = new ProductsPage(driver);
        productsPage.dataRead_CSV();

    }*/

    @Test
    @Order(2)
    public void selectBooke() {
        productsPage = new ProductsPage(driver);
        productsPage.selectBook();

    }

    @Test
    @Order(3)
    public void addBookToCart(){
        productDetailPage = new ProductDetailPage(driver);
        productDetailPage.addToCart();
        Assertions.assertTrue(homePage.isProdcutCountUp(),"Product count didnt increase");
    }

    @Test
    @Order(4)
    public void goToCart(){
    homePage.clickToMyCart();
    homePage.clickGoToCart();
    }

    @Test
    @Order(5)
    public void clickCloseButton(){
        cartPage = new CartPage(driver);
        cartPage.clickToClose();
        Assertions.assertTrue(cartPage.isCartEmpty(),"Cart is not empty");
    }

}
