import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;


@Tag("regress")
public class LoginTests extends TestBase {

    MainPage mainPage = new MainPage();

    @Tag("smoke")
    @DisplayName("Открыть \"Войти\" и проверить отображение способов залогиниться")
    @Test
    void checkSignInDrawerTest() {
        mainPage.openPage();
        mainPage.openLoginDrawer();
        mainPage.closeLoginDrawer();
    }

}
