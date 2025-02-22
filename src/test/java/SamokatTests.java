import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pages.MainPage;

import static io.qameta.allure.Allure.step;

@Tag("simple")
public class SamokatTests extends TestBase {

    MainPage mainPage = new MainPage();

    @Tag("smoke")
    @Test
    void checkMainPage() {
        step("Open page", () -> {
            mainPage.openPage();
        });
        step("Check header menu elements", () -> {
            mainPage.checkHeaderMenu();
        });
        step("Check side menu elements", () -> {
            mainPage.checkSideMenu();
        });
    }

    @ValueSource(strings = {
            "Хлеб",
            "Молоко",
            "Сыр"
    })
    @ParameterizedTest(name = "Для поискового запроса {0} должен возвращаться не пустой список найденных продуктов")
    @Tag("simple")
    void searchForProduct(String query) {
        step("Open page", () -> {
            mainPage.openPage();
        });
        step("Search for product", () -> {
            mainPage.searchForProduct(query);
        });
    }

}
