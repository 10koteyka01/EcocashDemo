package webPageObjects.pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

/**
 * Base page for UI tests.
 * @param <T> - generic type for different headers. By default, it should be {@link webPageObjects.menu.HeaderMenuPage}
 */
public class BasePage<T> {
    public T header;
    protected String pagePath;
    protected String host;
    Properties properties = new Properties();

    {
        try {
            properties.load(new FileReader("src/main/resources/test.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        host = properties.getProperty("host");
    }

    public void openPage() {
        String url = host.concat(pagePath);

        step("Open page ".concat(url), () -> open(url));
    }

    public static SelenideElement getPageTitle() {
        return $(".pagetitle");
    }

    public static String getUrl() {
        return WebDriverRunner.getWebDriver().getCurrentUrl();
    }
}
