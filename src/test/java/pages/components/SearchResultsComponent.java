package pages.components;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchResultsComponent {

    private final ElementsCollection searchResultsList = $$("div[class*='ProductsList_productList'] div[class*='ProductCard_name']");
    private final SelenideElement searchResultsElement = $("div[class*='InlineSearch_content']");


    public void checkSearchResultPageOpened() {
        searchResultsElement.shouldBe(visible);
    }

    public void checkSearchResults(String query) {
       searchResultsList.texts().contains(query);

    }
}
