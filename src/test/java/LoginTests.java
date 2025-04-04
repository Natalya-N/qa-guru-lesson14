import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;

@Epic("Логин в систему")
@Tag("regress")
public class LoginTests extends TestBase {

    MainPage mainPage = new MainPage();

    @Story("Дровер со способами логина")
    @Tag("smoke")
    @DisplayName("Открыть \"Войти\" и проверить отображение способов залогиниться")
    @Test
    void checkSignInDrawerTest() {
        mainPage.openPage();
        mainPage.openLoginDrawer();
        mainPage.closeLoginDrawer();
    }

}
