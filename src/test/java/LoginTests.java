import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;

import static io.qameta.allure.Allure.step;

@Tag("regress")
public class LoginTests extends TestBase{

    MainPage mainPage = new MainPage();

    @Tag("smoke")
    @DisplayName("Открыть \"Войти\" и проверить способы залогиниться")
    @Test
    void checkSignInDrawerTest() {
        step("Открыть главную страницу", () -> {
            mainPage.openPage();
        });
        step("Открыть дровер и проверить, что отображаются элементы для логина", () -> {
            mainPage.openLoginDrawer();
        });
        step("Закрыть дровер", () -> {
            mainPage.closeLoginDrawer();
        });
    }

}
