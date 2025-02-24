package pages;

import pages.components.HeaderMenuComponent;
import pages.components.LoginDrawerComponent;
import pages.components.SideMenuComponent;

import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    HeaderMenuComponent headerMenuComponent = new HeaderMenuComponent();
    SideMenuComponent sideMenuComponent = new SideMenuComponent();
    LoginDrawerComponent loginDrawerComponent = new LoginDrawerComponent();

    public MainPage openPage() {
        open("/");
        return this;
    }

    public MainPage checkHeaderMenu() {
        headerMenuComponent.checkHeaderMenu();
        return this;
    }

    public MainPage checkSideMenu() {
        sideMenuComponent.checkSideMenu();
        return this;
    }

    public MainPage searchForProduct(String query) {
        headerMenuComponent.clickOnSearchMenu();
        headerMenuComponent.textSearchStringAndPressEnter(query);
        return this;
    }

    public MainPage openLoginDrawer() {
        headerMenuComponent.clickOnLoginMenu();
        loginDrawerComponent.checkLoginDrawer();
        return this;
    }

    public MainPage closeLoginDrawer() {
        loginDrawerComponent.closeLoginDrawer();
        return this;
    }

}
