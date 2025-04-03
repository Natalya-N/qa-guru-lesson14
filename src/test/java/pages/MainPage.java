package pages;

import io.qameta.allure.Step;
import pages.components.*;

import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    HeaderMenuComponent headerMenuComponent = new HeaderMenuComponent();
    SideMenuComponent sideMenuComponent = new SideMenuComponent();
    LoginDrawerComponent loginDrawerComponent = new LoginDrawerComponent();
    ChaptersComponent chaptersComponent = new ChaptersComponent();
    FooterMenuComponent footerMenuComponent = new FooterMenuComponent();


    @Step("Открыть главную страницу")
    public MainPage openPage() {
        open("/");
        return this;
    }

    @Step("Проверить, что в хедере отображаются: иконка Самоката, меню поиска, \" +\n" +
            "                \"кнопка логина и кнопка открытия чата с поддержкой ")
    public MainPage checkHeaderMenu() {
        headerMenuComponent.checkHeaderMenu();
        return this;
    }

    @Step("Проверить, что в боковом меню отображается список разделов с продуктами")
    public MainPage checkSideMenu() {
        sideMenuComponent.checkSideMenu();
        return this;
    }

    @Step("Проверить иконки соц. сетей в футере страницы")
    public MainPage checkSocialIcons() {
        footerMenuComponent.checkSocialIcons();
        return this;
    }

    @Step("Проверить иконки магазинов приложений в футере страницы")
    public MainPage checkStoreIcons() {
        footerMenuComponent.checkStoreIcons();
        return this;
    }

    @Step("Проверить, что в теле главной страницы отображаются разделы сайта")
    public MainPage checkMainChapters() {
        chaptersComponent.checkMainChapters();
        return this;
    }

    @Step("Выполнить поиск по продукту")
    public MainPage searchForProduct(String query) {
        headerMenuComponent.clickOnSearchMenu();
        headerMenuComponent.textSearchStringAndPressEnter(query);
        return this;
    }

    @Step("Открыть дровер логина и проверить элементы")
    public MainPage openLoginDrawer() {
        headerMenuComponent.clickOnLoginMenu();
        loginDrawerComponent.checkLoginDrawer();
        return this;
    }

    @Step("Закрыть дровер логина")
    public MainPage closeLoginDrawer() {
        loginDrawerComponent.closeLoginDrawer();
        return this;
    }

}
