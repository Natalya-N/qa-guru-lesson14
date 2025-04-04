import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pages.MainPage;
import pages.SearchResultsPage;

@Epic("Функциональность поиска")
@Tag("regress")
public class SearchTests extends TestBase {

    MainPage mainPage = new MainPage();
    SearchResultsPage searchResultsPage = new SearchResultsPage();

    @Feature("Проверка поиска продуктов")
    @Story("Функциональность поиска продуктов с помощью поисковой строки в хедере")
    @ValueSource(strings = {
            "Хлеб",
            "Молоко",
            "Сыр"
    })
    @ParameterizedTest(name = "Для поискового запроса {0} должен возвращаться не пустой список найденных продуктов")
    void searchForProductTest(String query) {
        mainPage.openPage();
        mainPage.searchForProduct(query);
        searchResultsPage.openSearchResultsPage();
        searchResultsPage.checkSearchResults(query);
    }

}
