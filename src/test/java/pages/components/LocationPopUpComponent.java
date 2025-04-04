package pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class LocationPopUpComponent {

    private final SelenideElement anotherCityButton = $x("//span[contains(text(),'Нет, другой')]");

    public void openChooseAddressDrawer() {
        anotherCityButton.shouldBe(visible);
        anotherCityButton.click();
    }
}
