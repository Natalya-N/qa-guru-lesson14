package pages;

import io.qameta.allure.Step;
import pages.components.ProductCardDrawerComponent;
import static com.codeborne.selenide.Selenide.open;

public class ProductCardDrawerPage {

    ProductCardDrawerComponent productCardDrawer = new ProductCardDrawerComponent();

    @Step("Открыть дровер продукта")
    public ProductCardDrawerPage openDrawerProductPage(String id) {
        open("/product/" + id);
        return this;
    }

    @Step("Проверить название, состав и срок годности продукта")
    public ProductCardDrawerPage checkProductInformation(String name, String compound, String bestBefore) {
        productCardDrawer.checkProductInformation(name, compound, bestBefore);
        return this;
    }

    @Step("Добавить продукт в корзину")
    public ProductCardDrawerPage clickAddToCartButton() {
        productCardDrawer.clickAddToCartButton();
        productCardDrawer.closeDrawer();
        return this;
    }


}
