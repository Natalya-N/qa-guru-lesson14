package pages.components;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ProductCardDrawerComponent {

    private final SelenideElement productName = $("div[class*='ProductTitle_title']");
    private final ElementsCollection productInfo = $$("div[class*='AnimatedDropdownText_content']");

    public void checkProductInformation(String name, String compound, String bestBefore) {
        productName.shouldBe(visible);
        productName.shouldHave(text(name));
        productInfo.get(0).shouldHave(text(compound));
        productInfo.get(1).shouldHave(text(bestBefore));


    }


}
