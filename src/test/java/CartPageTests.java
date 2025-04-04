import data.Constants;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;
import pages.components.CartComponent;
import pages.MainPage;
import pages.ProductCardDrawerPage;

import static data.Constants.ADDRESS;
import static data.Constants.CITY;

@Epic("Работа с корзиной")
@Tag("regress")
public class CartPageTests extends TestBase {

    MainPage mainPage = new MainPage();
    ProductCardDrawerPage productCardPage = new ProductCardDrawerPage();

    @CsvFileSource(resources = "/productsIdList.csv", delimiter = ';')
    @Story("Добавление и удаление продуктов в корзину")
    @Tag("smoke")
    @DisplayName("Проверить добавление и удаление продуктов из корзины")
    @ParameterizedTest
    void addAndDeleteProductsTest(String product, String productName) {
        mainPage.openPage();
        mainPage.openChooseAddressDrawer();
        mainPage.chooseAddress(CITY, ADDRESS);
        productCardPage.openDrawerProductPage(product);
        productCardPage.clickAddToCartButton();
        mainPage.checkProductInCart(product);


    }

}
