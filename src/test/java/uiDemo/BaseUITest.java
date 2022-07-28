package uiDemo;

import com.codeborne.selenide.Configuration;

/**
 * Base class for web ui tests with common configuration
 */
public class BaseUITest {
    {
        Configuration.browserSize = "1920x1080";
    }
}
