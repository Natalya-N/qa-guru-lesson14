import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;

import static io.qameta.allure.Allure.step;

@Tag("regress")
public class MainPageElementsTests extends TestBase {

    MainPage mainPage = new MainPage();


    // ПЕРЕПИСАТЬ НА СТЕПЫ
    // добавить тегов на разные запуски
    @Tag("smoke")
    @DisplayName("Проверить элементы в хедере страницы")
    @Test
    void checkHeaderComponentTest() {
        step("Открыть главную страницу", () -> {
            mainPage.openPage();
        });
        step("Проверить, что в хедере отображаются: иконка Самоката, меню поиска, " +
                "кнопка логина и кнопка открытия чата с поддержкой ", () -> {
            mainPage.checkHeaderMenu();
        });
    }

    @Tag("smoke")
    @DisplayName("Проверить элементы в боковом меню страницы")
    @Test
    void checkSideMenuComponentTest() {
        step("Открыть главную страницу", () -> {
            mainPage.openPage();
        });
        step("Проверить, что в боковом меню отображается список разделов с продуктами", () -> {
            mainPage.checkSideMenu();
        });
    }

    @Tag("smoke")
    @DisplayName("Проверить основные разделы страницы")
    @Test
    void checkMainChaptersTest() {
        step("Открыть главную страницу", () -> {
            mainPage.openPage();
        });
        step("Проверить, что в теле главной страницы отображаются разделы сайта", () -> {
            mainPage.checkMainChapters();
        });
    }

    @DisplayName("Проверить элементы в футере страницы")
    @Test
    void checkFooterComponentTest() {
        step("Открыть главную страницу", () -> {
            mainPage.openPage();
        });
        step("Проверить, что отображаются иконки соц сетей", () -> {
            mainPage.checkSocialIcons();
        });
        step("Проверить, что отображаются иконки магазинов приложений", () -> {
            mainPage.checkStoreIcons();
        });
    }

}
