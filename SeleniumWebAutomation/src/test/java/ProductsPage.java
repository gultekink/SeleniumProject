import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.FileReader;
import java.io.IOException;

public class ProductsPage extends BasePage{
    String CSV_PATH = "C:\\Users\\gulte\\Documents\\KitapYurdu.csv";
    private CSVReader csvReader;
    String[] csvCell;

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

   /* public void dataRead_CSV() throws IOException, CsvValidationException {
        //Create an object of CSVReader
        csvReader = new CSVReader(new FileReader(CSV_PATH));
        By bookNameBy = By.xpath("//span[.='Corto Maltese (Bir Martı Yüzünden)']");
        //You can use while loop like below, It will be executed until the last line in CSV used.
        while ((csvCell = csvReader.readNext()) != null) {
            String BookName = csvCell[0];
            driver.findElement(bookNameBy).clear();
            driver.findElement(bookNameBy).sendKeys(BookName);

        }
    }*/

    public void selectBook() {
        click(By.id("product-306815"));
    }
}
