package ussdQueryDemo;

import mobilePageObjects.MobileMainPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;
import static org.junit.jupiter.api.Assertions.*;
import static util.Driver.*;

public class USSDTest {

    @Test
    @Tag("ussd")
    @DisplayName("USSD query test")
    void test() {
        MobileMainPage mainPage = new MobileMainPage();

        step("Click button to send USSD query *100# - check balance", () -> {
            mainPage.nextButton().click();
        });

        step("Check USSD - response from mobile operator", () -> {
            waitForScreenToLoad(mainPage.textFragment(), "Спасибо за обращение! Мы направим ответ на Ваш запрос в SMS");
            assertFalse(mainPage.textFragment().getText().contains("-1"), "Unsuccessful USSD query");
        });

    }

    @AfterAll
    static void afterAll() {
        quit();
    }
}
