package webPageObjects.menu;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

/**
 * Main menu with references to web app sections
 */
public class HeaderMenuPage {
    @Step("Select main menu item {menuItemName}")
    public void selectMenuItem(String menuItemName) {
        System.out.println(menuItemName);
        $(".parent").hover();
        $$(withText(menuItemName)).get(1).click();
    }
}
