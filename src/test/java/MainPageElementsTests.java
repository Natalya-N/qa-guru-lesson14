import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;

@Tag("regress")
public class MainPageElementsTests extends TestBase {

    MainPage mainPage = new MainPage();

    @Tag("smoke")
    @DisplayName("Проверить элементы в хедере страницы")
    @Test
    void checkHeaderComponentTest() {
        mainPage.openPage();
        mainPage.checkHeaderMenu();
    }

    @Tag("smoke")
    @DisplayName("Проверить элементы в боковом меню страницы")
    @Test
    void checkSideMenuComponentTest() {
        mainPage.openPage();
        mainPage.checkSideMenu();
    }

    @Tag("smoke")
    @DisplayName("Проверить основные разделы страницы")
    @Test
    void checkMainChaptersTest() {
        mainPage.openPage();
        mainPage.checkMainChapters();
    }

    @DisplayName("Проверить элементы в футере страницы")
    @Test
    void checkFooterComponentTest() {
        mainPage.openPage();
        mainPage.checkSocialIcons();
        mainPage.checkStoreIcons();
    }

}
