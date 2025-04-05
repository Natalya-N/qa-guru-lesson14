package pages.components;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class CartComponent {
    private final SelenideElement emptyCartGreeting = $("div[class*=CartGreeting]");

    private final String product = "[href='/product/%s']",
            productName = "span[class*=ProductItem_name]",
            deleteButton = "div[aria-label*=Удалить]";

    public void checkProduct(String id, String name) {
        SelenideElement nameSelector = $(String.format(product, id) + " " + productName);
        nameSelector.shouldBe(visible);
        nameSelector.shouldHave(text(name));
    }

    public void deleteProduct(String id) {
        SelenideElement deleteButtonSelect = $(String.format(product, id) + " " + deleteButton);
        deleteButtonSelect.click();
    }

    public void checkCartIsEmpty() {
        emptyCartGreeting.shouldHave(text("Соберите корзину,\n" +
                "а мы всё быстро привезём"));
    }

}
