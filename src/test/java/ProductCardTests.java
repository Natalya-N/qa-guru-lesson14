import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import pages.ProductCardDrawerPage;

@Tag("regress")
public class ProductCardTests extends TestBase {

    ProductCardDrawerPage productCardPage = new ProductCardDrawerPage();

    @CsvFileSource(resources = "/productsList.csv", delimiter = ';')
    @ParameterizedTest
    public void checkProductCardPopUpTest(String id, String name, String compound, String bestBefore) {
        productCardPage.openDrawerProductPage(id);
        productCardPage.checkProductInformation(name, compound, bestBefore);
    }

}
