package uiDemo;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import webPageObjects.pages.MainPage;
import webPageObjects.pages.aboutUs.DownloadsPage;

import static com.codeborne.selenide.Condition.text;
import static io.qameta.allure.Allure.step;
import static webPageObjects.pages.BasePage.getPageTitle;

public class HeaderMenuTest extends BaseUITest{
    @ParameterizedTest
    @ValueSource(strings = {"Privacy Policy", "Downloads", "Terms & Conditions"})
    @Tag("ui")
    void redirectTest(String menuItem) {
        MainPage mainPage = new MainPage();
        mainPage.openPage();

        mainPage.header.selectMenuItem(menuItem);

        step("Redirect checks", () -> {
            getPageTitle().shouldHave(text(menuItem));
        });
    }
}
