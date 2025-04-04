import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import pages.ProductCardDrawerPage;

@Epic("Отображение информации о продукте")
@Tag("regress")
public class ProductCardTests extends TestBase {

    ProductCardDrawerPage productCardPage = new ProductCardDrawerPage();

    @Story("Отображение информации о продукте в дровере")
    @CsvFileSource(resources = "/productsList.csv", delimiter = ';')
    @ParameterizedTest(name = "Проверка отображения карточки продукта {1}")
    public void checkProductCardPopUpTest(String id, String name, String compound, String bestBefore) {
        productCardPage.openDrawerProductPage(id);
        productCardPage.checkProductInformation(name, compound, bestBefore);
    }

}
