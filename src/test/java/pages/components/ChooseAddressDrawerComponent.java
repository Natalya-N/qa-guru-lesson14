package pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class ChooseAddressDrawerComponent {

    private final SelenideElement chooseAddressDrawer = $("div[class*=AddressCreation]"),
            addressInput = $("div[class*=AddressSuggest_addressSuggest] input[class*=RoundedInput]"),
            cityInput = $("input[class*=RoundedInput_input]"),
            suggestedAddress = $("div[class*=Suggest_suggestItems]"),
            saveAddressButton = $("div[class*=AddressCreation_button]");


    public void checkAddressDrawerAppears() {
        chooseAddressDrawer.shouldBe(visible);
    }

    public void chooseAddress(String city, String address) {
        cityInput.setValue(city).pressEnter();
        addressInput.setValue(address).pressEnter();
        suggestedAddress.click();
        saveAddressButton.click();
        chooseAddressDrawer.shouldBe(disappear);
    }


}
