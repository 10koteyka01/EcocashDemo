package util;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;
import java.time.Duration;

import static io.qameta.allure.Allure.step;

public class Driver {
    public static AndroidDriver driver;
    private static Device device;

    /**
     * Find element by ID
     * Driver would be set up automatically
     */
    public static WebElement byId(String locator) {
        if (driver == null) setUpDriver();
        return driver.findElement(By.id(locator));
    }

    public static void waitForScreenToLoad(WebElement element, String text){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.textToBePresentInElement(element, text));
    }
    private static DesiredCapabilities getCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", device.getDeviceName());
        capabilities.setCapability("platformName", device.getPlatformName());
        capabilities.setCapability("platformVersion", device.getPlatformVersion());
        capabilities.setCapability("udid", device.getUdid());
        capabilities.setCapability("appPackage", "com.example.myapplication");
        capabilities.setCapability("appActivity", "com.demo.myapplication.MainActivity");
        capabilities.setCapability("autoGrantPermissions", true);

        return capabilities;
    }

    public static void setUpDriver() {
        quit();

        String deviceName = System.getenv("deviceName");

        if (deviceName == null)
            device = Device.HONOR;
        else
            device = Device.valueOf(deviceName);

        step("Open USSD test app", () -> {
            driver = new AndroidDriver(new URL(device.getUrl()), getCapabilities());
        });
    }

    /**
     * Close driver
     */
    public static void quit() {
        if (driver != null)
            driver.quit();
    }
}
