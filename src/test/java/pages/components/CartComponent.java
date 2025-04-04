package pages.components;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class CartComponent {

    private final ElementsCollection cardProductList = $$("div[class*=ProductItem_root]");
    private final SelenideElement product = $x("//a[@href=\"/product/$s\"]");

    public void checkProduct(String name) {
        SelenideElement product = $x(String.format("//a[@href=\"/product/%s\"]", name));
        product.shouldBe(visible);
        //cardProductList.shouldHave(CollectionCondition.texts(name));
    }

    public void deleteProduct(String name) {
        cardProductList.shouldHave(CollectionCondition.texts(name));
    }

}
