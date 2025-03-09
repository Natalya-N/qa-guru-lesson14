import org.junit.jupiter.api.DisplayName;
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
    @DisplayName("Проверить элементы в хедере страницы")
    @Test
    void checkHeaderComponentTest() {
        step("Открыть главную страницу", () -> {
            mainPage.openPage();
        });
        step("Check header menu elements", () -> {
            mainPage.checkHeaderMenu();
        });
    }

    @Tag("smoke")
    @DisplayName("Проверить элементы в боковом меню страницы")
    @Test
    void checkSideMenuComponentTest() {
        step("Open page", () -> {
            mainPage.openPage();
        });
        step("Check side menu elements", () -> {
            mainPage.checkSideMenu();
        });
    }

    @Tag("smoke")
    @DisplayName("Проверить основные разделы страницы")
    @Test
    void checkMainChaptersTest() {
        step("Open page", () -> {
            mainPage.openPage();
        });
        step("Check main page chapters", () -> {
            mainPage.checkMainChapters();
        });
    }

    @Tag("smoke")
    @DisplayName("Проверить элементы в футере страницы")
    @Test
    void checkFooterComponentTest() {
        step("Open page", () -> {
            mainPage.openPage();
        });
        step("Check social media icons", () -> {
            mainPage.checkSocialIcons();
        });
        step("Check store icons", () -> {
            mainPage.checkStoreIcons();
        });
    }

    @ValueSource(strings = {
            "Хлеб",
            "Молоко",
            "Сыр"
    })
    @ParameterizedTest(name = "Для поискового запроса {0} должен возвращаться не пустой список найденных продуктов")
    @Tag("simple")
    void searchForProductTest(String query) {
        step("Open page", () -> {
            mainPage.openPage();
        });
        step("Search for product", () -> {
            mainPage.searchForProduct(query);
        });
    }

    @Tag("simple")
    @DisplayName("Открыть \"Войти\" и проверить способы залогиниться")
    @Test
    void checkSignInDrawerTest() {
        step("Open page", () -> {
            mainPage.openPage();
        });
        step("Open sign in drawer and check elements", () -> {
            mainPage.openLoginDrawer();
        });
        step("Close drawer", () -> {
            mainPage.closeLoginDrawer();
        });
    }

}
