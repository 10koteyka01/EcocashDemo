package uiDemo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pageObjects.pages.MainPage;
import pageObjects.pages.aboutUs.DownloadsPage;

import static com.codeborne.selenide.Condition.text;
import static io.qameta.allure.Allure.step;
import static pageObjects.pages.BasePage.getPageTitle;

public class HeaderMenuTest extends BaseUITest{
    @ParameterizedTest
    @ValueSource(strings = {"Privacy Policy", "Downloads", "Terms & Conditions"})
    void redirectTest(String menuItem) {
        MainPage mainPage = new MainPage();
        mainPage.openPage();

        mainPage.header.selectMenuItem(menuItem);

        step("Redirect checks", () -> {
            getPageTitle().shouldHave(text(menuItem));
        });
    }

    void blahTest() {
        DownloadsPage downloadsPage = new DownloadsPage();

        downloadsPage.openPage();

//        downloadsPage
    }
}
