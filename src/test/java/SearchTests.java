import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pages.MainPage;

import static io.qameta.allure.Allure.step;

@Tag("regress")
public class SearchTests extends TestBase {

    MainPage mainPage = new MainPage();

    @ValueSource(strings = {
            "Хлеб",
            "Молоко",
            "Сыр"
    })
    @ParameterizedTest(name = "Для поискового запроса {0} должен возвращаться не пустой список найденных продуктов")
    void searchForProductTest(String query) {
        step("Открыть главную страницу", () -> {
            mainPage.openPage();
        });
        step("Выполнить поиск по продукту", () -> {
            mainPage.searchForProduct(query);
        });
    }

}
