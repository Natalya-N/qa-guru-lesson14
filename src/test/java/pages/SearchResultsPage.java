package pages;

import io.qameta.allure.Step;
import pages.components.SearchResultsComponent;

import static com.codeborne.selenide.Selenide.$$;

public class SearchResultsPage {

    SearchResultsComponent searchResultsComponent = new SearchResultsComponent();

    @Step("Проверить, что открыта страница с результатами поиска")
    public SearchResultsPage openSearchResultsPage() {
        searchResultsComponent.checkSearchResultPageOpened();
        return this;
    }

    @Step("Проверить результаты поиска: каждый найденный товар содержит в названии подстроку поиска")
    public SearchResultsPage checkSearchResults(String query) {
        searchResultsComponent.checkSearchResultPageOpened();
        searchResultsComponent.checkSearchResults(query);
        return this;
    }
}
