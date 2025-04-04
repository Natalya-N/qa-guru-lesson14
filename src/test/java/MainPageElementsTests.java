import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;

@Epic("Главная страница")
@Tag("regress")
public class MainPageElementsTests extends TestBase {

    MainPage mainPage = new MainPage();

    @Story("Отображение хедера страницы")
    @Tag("smoke")
    @DisplayName("Проверить элементы в хедере страницы")
    @Test
    void checkHeaderComponentTest() {
        mainPage.openPage();
        mainPage.checkHeaderMenu();
    }

    @Story("Отображение бокового меню страницы")
    @Tag("smoke")
    @DisplayName("Проверить элементы в боковом меню страницы")
    @Test
    void checkSideMenuComponentTest() {
        mainPage.openPage();
        mainPage.checkSideMenu();
    }

    @Story("Отображение основных разделов страницы")
    @Tag("smoke")
    @DisplayName("Проверить основные разделы страницы")
    @Test
    void checkMainChaptersTest() {
        mainPage.openPage();
        mainPage.checkMainChapters();
    }

    @Story("Отображение футера страницы")
    @DisplayName("Проверить элементы в футере страницы")
    @Test
    void checkFooterComponentTest() {
        mainPage.openPage();
        mainPage.checkSocialIcons();
        mainPage.checkStoreIcons();
    }

}
